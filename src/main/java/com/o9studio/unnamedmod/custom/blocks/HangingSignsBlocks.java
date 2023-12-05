package com.o9studio.unnamedmod.custom.blocks;

import com.o9studio.unnamedmod.custom.entities.HangingSignsBlockEntities;
import com.o9studio.unnamedmod.custom.entities.SignsBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.CeilingHangingSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

public class HangingSignsBlocks extends CeilingHangingSignBlock {
    public HangingSignsBlocks(Properties pProperties, WoodType pType) {
        super(pProperties, pType);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new HangingSignsBlockEntities(pPos, pState);
    }
}