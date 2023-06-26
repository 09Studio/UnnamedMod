package com.o9studio.unnamedmod.util;

import com.o9studio.unnamedmod.UnnamedMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static final TagKey<Block> VERA_LOGS_GO_THROUGH = create("vera_logs_go_through");


    private static TagKey<Block> create(String name) {
        return TagKey.create(Registries.BLOCK, new ResourceLocation(UnnamedMod.MOD_ID, name));
    }
}
