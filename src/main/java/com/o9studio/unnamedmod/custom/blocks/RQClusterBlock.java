package com.o9studio.unnamedmod.custom.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;

public class RQClusterBlock extends Block implements SimpleWaterloggedBlock {
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    public static final DirectionProperty FACING = BlockStateProperties.FACING;
    protected final VoxelShape northAabb;
    protected final VoxelShape southAabb;
    protected final VoxelShape eastAabb;
    protected final VoxelShape westAabb;
    protected final VoxelShape upAabb;
    protected final VoxelShape downAabb;

    public RQClusterBlock(int i, int i1, Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState().setValue(WATERLOGGED, Boolean.FALSE).setValue(FACING, Direction.UP));
        this.upAabb = Block.box((double)i1, 0.0D, (double)i1, (double)(16 - i1), (double)i, (double)(16 - i1));
        this.downAabb = Block.box((double)i1, (double)(16 - i), (double)i1, (double)(16 - i1), 16.0D, (double)(16 - i1));
        this.northAabb = Block.box((double)i1, (double)i1, (double)(16 - i), (double)(16 - i1), (double)(16 - i1), 16.0D);
        this.southAabb = Block.box((double)i1, (double)i1, 0.0D, (double)(16 - i1), (double)(16 - i1), (double)i);
        this.eastAabb = Block.box(0.0D, (double)i1, (double)i1, (double)i, (double)(16 - i1), (double)(16 - i1));
        this.westAabb = Block.box((double)(16 - i), (double)i1, (double)i1, 16.0D, (double)(16 - i1), (double)(16 - i1));
    }

    public VoxelShape getShape(BlockState blockState, BlockGetter getter, BlockPos pos, CollisionContext context) {
        Direction direction = blockState.getValue(FACING);
        switch (direction) {
            case NORTH:
                return this.northAabb;
            case SOUTH:
                return this.southAabb;
            case EAST:
                return this.eastAabb;
            case WEST:
                return this.westAabb;
            case DOWN:
                return this.downAabb;
            case UP:
            default:
                return this.upAabb;
        }
    }

    public boolean canSurvive(BlockState blockState, LevelReader reader, BlockPos pos) {
        Direction direction = blockState.getValue(FACING);
        BlockPos blockpos = pos.relative(direction.getOpposite());
        return reader.getBlockState(blockpos).isFaceSturdy(reader, blockpos, direction);
    }

    public BlockState updateShape(BlockState blockState, Direction direction, BlockState blockState1, LevelAccessor accessor, BlockPos pos, BlockPos pos1) {
        if (blockState.getValue(WATERLOGGED)) {
            accessor.scheduleTick(pos, Fluids.WATER, Fluids.WATER.getTickDelay(accessor));
        }

        return direction == blockState.getValue(FACING).getOpposite() && !blockState.canSurvive(accessor, pos) ? Blocks.AIR.defaultBlockState() : super.updateShape(blockState, direction, blockState1, accessor, pos, pos1);
    }

    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        LevelAccessor levelaccessor = context.getLevel();
        BlockPos blockpos = context.getClickedPos();
        return this.defaultBlockState().setValue(WATERLOGGED, Boolean.valueOf(levelaccessor.getFluidState(blockpos).getType() == Fluids.WATER)).setValue(FACING, context.getClickedFace());
    }

    public BlockState rotate(BlockState blockState, Rotation rotation) {
        return blockState.setValue(FACING, rotation.rotate(blockState.getValue(FACING)));
    }

    public BlockState mirror(BlockState blockState, Mirror mirror) {
        return blockState.rotate(mirror.getRotation(blockState.getValue(FACING)));
    }

    public FluidState getFluidState(BlockState blockState) {
        return blockState.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(blockState);
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> stateBuilder) {
        stateBuilder.add(WATERLOGGED, FACING);
    }
}
