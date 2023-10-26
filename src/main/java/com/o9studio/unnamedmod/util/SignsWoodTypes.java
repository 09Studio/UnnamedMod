package com.o9studio.unnamedmod.util;

import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

import java.util.Set;
import java.util.stream.Stream;

public record SignsWoodTypes(String name, BlockSetType setType, SoundType soundType, SoundType hangingSignSoundType, SoundEvent fenceGateClose, SoundEvent fenceGateOpen) {
    private static final Set<WoodType> VALUES = new ObjectArraySet<>();

    public static final WoodType DUSKY = register(new WoodType("dusky", ModBlockSetTypes.DUSKY, SoundType.WOOD, SoundType.HANGING_SIGN, SoundEvents.FENCE_GATE_CLOSE, SoundEvents.FENCE_GATE_OPEN));
    public static final WoodType VERA = register(new WoodType("vera", ModBlockSetTypes.VERA, SoundType.WOOD, SoundType.HANGING_SIGN, SoundEvents.FENCE_GATE_CLOSE, SoundEvents.FENCE_GATE_OPEN));


    public static WoodType register(WoodType p_61845_) {
        VALUES.add(p_61845_);
        return p_61845_;
    }

    public static Stream<WoodType> values() {
        return VALUES.stream();
    }
}
