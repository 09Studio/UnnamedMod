package com.o9studio.unnamedmod.custom.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class FloweringLilyPad extends WaterlilyBlock {
    protected static final VoxelShape SHAPE_BASE = Block.box(0, 0, 0, 16, 1, 16);
    protected static final VoxelShape SHAPE_FLOWER = Block.box(6, 1, 3, 13, 3, 10);
    protected static final VoxelShape TOTAL_SHAPE = Shapes.or(SHAPE_BASE, SHAPE_FLOWER);

    public FloweringLilyPad(Properties properties) {
        super(properties);

    }

    public VoxelShape getShape(BlockState p_58169_, BlockGetter p_58170_, BlockPos p_58171_, CollisionContext p_58172_) {
        return TOTAL_SHAPE;
    }

    public void entityInside(BlockState p_58164_, Level p_58165_, BlockPos p_58166_, Entity p_58167_) {
        super.entityInside(p_58164_, p_58165_, p_58166_, p_58167_);
        if (p_58165_ instanceof ServerLevel && p_58167_ instanceof Boat) {
            p_58165_.destroyBlock(new BlockPos(p_58166_), true, p_58167_);
        }

    }

    protected boolean mayPlaceOn(BlockState p_58174_, BlockGetter p_58175_, BlockPos p_58176_) {
        FluidState fluidstate = p_58175_.getFluidState(p_58176_);
        FluidState fluidstate1 = p_58175_.getFluidState(p_58176_.above());
        return (fluidstate.getType() == Fluids.WATER || p_58174_.getMaterial() == Material.ICE) && fluidstate1.getType() == Fluids.EMPTY;
    }
}
