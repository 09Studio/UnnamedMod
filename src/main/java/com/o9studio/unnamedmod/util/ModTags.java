package com.o9studio.unnamedmod.util;

import com.o9studio.unnamedmod.UnnamedMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static final TagKey<Block> VERA_LOGS_GO_THROUGH = TagKey.create(Registries.BLOCK, new ResourceLocation(UnnamedMod.MOD_ID, "vera_logs_go_through"));
    public static final TagKey<Block> NEEDS_RQ_TOOL = TagKey.create(Registries.BLOCK, new ResourceLocation(UnnamedMod.MOD_ID, "needs_rq_tool"));

    public static final TagKey<Item> POLISHERS = TagKey.create(Registries.ITEM, new ResourceLocation(UnnamedMod.MOD_ID, "polishers"));

}
