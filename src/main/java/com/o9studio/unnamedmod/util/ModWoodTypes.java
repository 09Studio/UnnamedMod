package com.o9studio.unnamedmod.util;

import com.o9studio.unnamedmod.UnnamedMod;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

public class ModWoodTypes {
    public static final WoodType VERA = WoodType.register(new WoodType(UnnamedMod.MOD_ID + ":vera", ModBlockSetTypes.VERA));
    public static final WoodType DUSKY = WoodType.register(new WoodType(UnnamedMod.MOD_ID + ":dusky", ModBlockSetTypes.DUSKY));
}