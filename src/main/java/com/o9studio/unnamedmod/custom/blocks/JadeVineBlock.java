package com.o9studio.unnamedmod.custom.blocks;

import com.o9studio.unnamedmod.core.ModBlocks;
import com.o9studio.unnamedmod.core.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.phys.BlockHitResult;

public class JadeVineBlock extends GrowingPlantHeadBlock implements BonemealableBlock, JadeVines {
    private static final float CHANCE_OF_BERRIES_ON_GROWTH = 0.11F;

    public JadeVineBlock(BlockBehaviour.Properties properties) {
        super(properties, Direction.DOWN, SHAPE, false, 0.1D);
        this.registerDefaultState(this.stateDefinition.any().setValue(AGE, Integer.valueOf(0)).setValue(BERRIES, Boolean.valueOf(false)));
    }

    protected int getBlocksToGrowWhenBonemealed(RandomSource source) {
        return 1;
    }

    protected boolean canGrowInto(BlockState blockState) {
        return blockState.isAir();
    }

    protected Block getBodyBlock() {
        return ModBlocks.JADE_VINE_PLANT.get();
    }

    protected BlockState updateBodyAfterConvertedFromHead(BlockState blockState, BlockState blockState1) {
        return blockState1.setValue(BERRIES, blockState.getValue(BERRIES));
    }

    protected BlockState getGrowIntoState(BlockState blockState, RandomSource source) {
        return super.getGrowIntoState(blockState, source).setValue(BERRIES, Boolean.valueOf(source.nextFloat() < 0.11F));
    }

    public ItemStack getCloneItemStack(BlockGetter blockGetter, BlockPos pos, BlockState blockState) {
        return new ItemStack(ModItems.JADE_VINE_FRUIT.get());
    }

    public InteractionResult use(BlockState blockState, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hitResult) {
        return JadeVines.use(blockState, level, pos);
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(BERRIES);
    }

    public boolean isValidBonemealTarget(LevelReader reader, BlockPos pos, BlockState blockState, boolean b) {
        return !blockState.getValue(BERRIES);
    }

    public boolean isBonemealSuccess(Level level, RandomSource randomSource, BlockPos pos, BlockState blockState) {
        return true;
    }

    public void performBonemeal(ServerLevel serverLevel, RandomSource randomSource, BlockPos pos, BlockState blockState) {
        serverLevel.setBlock(pos, blockState.setValue(BERRIES, Boolean.valueOf(true)), 2);
    }

    @Override
    public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
        return true;
    }

    @Override
    public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
        return 15;
    }

    @Override
    public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
        return 60;
    }
}
