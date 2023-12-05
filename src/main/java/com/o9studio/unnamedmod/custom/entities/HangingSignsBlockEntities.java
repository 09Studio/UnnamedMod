package com.o9studio.unnamedmod.custom.entities;

import com.o9studio.unnamedmod.core.ModEntityBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class HangingSignsBlockEntities extends SignBlockEntity {
    public HangingSignsBlockEntities(BlockPos pPos, BlockState pBlockState) {
        super(ModEntityBlocks.MOD_HANGING_SIGN.get(), pPos, pBlockState);
    }

    @Override
    public BlockEntityType<?> getType() {
        return ModEntityBlocks.MOD_HANGING_SIGN.get();
    }
}