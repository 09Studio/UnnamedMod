package com.o9studio.unnamedmod.custom.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

import java.util.function.Supplier;

public class SandFlowerBlock extends FlammableFlowerBlock {

    public SandFlowerBlock(Supplier<MobEffect> effectSupplier, int i, Properties properties) {
        super(effectSupplier, i, properties);
    }

    protected boolean mayPlaceOn(BlockState pState, BlockGetter pLevel, BlockPos pPos) {
        return pState.is(BlockTags.DIRT) || pState.is(Blocks.FARMLAND) || pState.is(Blocks.SAND) || pState.is(Blocks.RED_SAND);
    }
}
