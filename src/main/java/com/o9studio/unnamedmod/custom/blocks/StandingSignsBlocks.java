package com.o9studio.unnamedmod.custom.blocks;

import com.o9studio.unnamedmod.custom.entities.SignsBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

public class StandingSignsBlocks extends StandingSignBlock {
    public StandingSignsBlocks(Properties pProperties, WoodType pType) {
        super(pProperties, pType);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new SignsBlockEntities(pPos, pState);
    }
}