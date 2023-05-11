package com.o9studio.unnamedmod.custom.blocks;

import com.o9studio.unnamedmod.core.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.shapes.VoxelShape;

public interface JadeVines {
    VoxelShape SHAPE = Block.box(1.0D, 0.0D, 1.0D, 15.0D, 16.0D, 15.0D);
    BooleanProperty BERRIES = BlockStateProperties.BERRIES;

    static InteractionResult use(BlockState blockState, Level level, BlockPos pos) {
        if (blockState.getValue(BERRIES)) {
            Block.popResource(level, pos, new ItemStack(ModItems.JADE_VINE_FRUIT.get(), 1));
            float f = Mth.randomBetween(level.random, 0.8F, 1.2F);
            level.playSound((Player)null, pos, SoundEvents.CAVE_VINES_PICK_BERRIES, SoundSource.BLOCKS, 1.0F, f);
            level.setBlock(pos, blockState.setValue(BERRIES, Boolean.valueOf(false)), 2);
            return InteractionResult.sidedSuccess(level.isClientSide);
        } else {
            return InteractionResult.PASS;
        }
    }

    static boolean hasJadeVineFruit(BlockState blockState) {
        return blockState.hasProperty(BERRIES) && blockState.getValue(BERRIES);
    }
}
