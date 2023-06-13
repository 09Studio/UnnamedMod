package com.o9studio.unnamedmod.custom.entities;

import com.o9studio.unnamedmod.core.ModEntityBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class SignsBlockEntities extends SignBlockEntity {
    public SignsBlockEntities(BlockPos pos, BlockState blockState) {
        super(pos, blockState);
    }

    @Override
    public BlockEntityType<?> getType() {
        return ModEntityBlocks.SIGN_BLOCK_ENTITIES.get();
    }
}