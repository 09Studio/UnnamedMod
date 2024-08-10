package com.o9studio.unnamedmod.custom.blocks;

import com.o9studio.unnamedmod.core.ModSounds;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class WindChimesBlock extends Block {
    private static final VoxelShape HANG_SHAPE = Block.box(7, 14, 7, 9, 16, 9);
    private static final VoxelShape BODY_SHAPE = Block.box(3, 1, 3, 13, 14, 13);
    private static final VoxelShape TOTAL_SHAPE = Shapes.or(HANG_SHAPE, BODY_SHAPE);

    public WindChimesBlock(Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getShape(BlockState blockState, BlockGetter getter, BlockPos pos, CollisionContext collisionContext) {
        return TOTAL_SHAPE;
    }
    public boolean canSurvive(BlockState blockState, LevelReader reader, BlockPos pos) {
        return Block.canSupportCenter(reader, pos.above(), Direction.DOWN);
    }

    public BlockState updateShape(BlockState blockState, Direction direction, BlockState blockState1, LevelAccessor accessor, BlockPos pos, BlockPos pos1) {
        return direction == Direction.UP && !this.canSurvive(blockState, accessor, pos) ? Blocks.AIR.defaultBlockState() : super.updateShape(blockState, direction, blockState1, accessor, pos, pos1);
    }

    @Override
    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos,
                                 Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {
        pLevel.playSound(pPlayer, pPos, ModSounds.WIND_CHIMES_HIT.get(), SoundSource.BLOCKS,
                1f, 1f);
        return InteractionResult.SUCCESS;
    }
}
