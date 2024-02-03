package com.o9studio.unnamedmod.custom.blocks;

import com.o9studio.unnamedmod.core.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluids;

public class BuddingBloodstoneRockBlock extends Block {
    public static final int GROWTH_CHANCE = 4;
    private static final Direction[] DIRECTIONS = Direction.values();

    public BuddingBloodstoneRockBlock(Properties properties) {
        super(properties);
    }

    public void randomTick(BlockState blockState, ServerLevel level, BlockPos pos, RandomSource source) {
        if (source.nextInt(4) == 0) {
            Direction direction = DIRECTIONS[source.nextInt(DIRECTIONS.length)];
            BlockPos blockpos = pos.relative(direction);
            BlockState blockstate = level.getBlockState(blockpos);
            Block block = null;
            if (canClusterGrowAtState(blockstate)) {
                block = ModBlocks.SMALL_RQ_CLUSTER.get();
            } else if (blockstate.is(ModBlocks.SMALL_RQ_CLUSTER.get()) && blockstate.getValue(RQClusterBlock.FACING) == direction) {
                block = ModBlocks.MEDIUM_RQ_CLUSTER.get();
            } else if (blockstate.is(ModBlocks.MEDIUM_RQ_CLUSTER.get()) && blockstate.getValue(RQClusterBlock.FACING) == direction) {
                block = ModBlocks.LARGE_RQ_CLUSTER.get();
            } else if (blockstate.is(ModBlocks.LARGE_RQ_CLUSTER.get()) && blockstate.getValue(RQClusterBlock.FACING) == direction) {
                block = ModBlocks.RQ_CLUSTER.get();
            }

            if (block != null) {
                BlockState blockstate1 = block.defaultBlockState().setValue(RQClusterBlock.FACING, direction).setValue(RQClusterBlock.WATERLOGGED, Boolean.valueOf(blockstate.getFluidState().getType() == Fluids.WATER));
                level.setBlockAndUpdate(blockpos, blockstate1);
            }

        }
    }

    public static boolean canClusterGrowAtState(BlockState blockState) {
        return blockState.isAir() || blockState.is(Blocks.WATER) && blockState.getFluidState().getAmount() == 8;
    }
}
