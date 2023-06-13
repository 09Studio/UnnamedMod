package com.o9studio.unnamedmod.custom.blocks;

import com.o9studio.unnamedmod.custom.entities.SignsBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

public class WallSignsBlocks extends WallSignBlock {
    public WallSignsBlocks(Properties properties, WoodType woodType) {
        super(properties, woodType);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState blockState) {
        return new SignsBlockEntities(pos, blockState);
    }
}