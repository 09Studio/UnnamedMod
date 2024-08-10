package com.o9studio.unnamedmod.core;

import com.o9studio.unnamedmod.UnnamedMod;
import com.o9studio.unnamedmod.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {

    public static final Tier TOPAZ = TierSortingRegistry.registerTier(
            new ForgeTier(1, 200, 5.0F, 1.5F, 9,
                    BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(ModItems.TOPAZ.get())),
            new ResourceLocation(UnnamedMod.MOD_ID, "topaz"), List.of(Tiers.STONE), List.of(Tiers.IRON));

    public static final Tier BRONZE = TierSortingRegistry.registerTier(
            new ForgeTier(2, 550, 6.5F, 2.0F, 11,
                    BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(ModItems.BRONZE_INGOT.get())),
            new ResourceLocation(UnnamedMod.MOD_ID, "bronze"), List.of(Tiers.IRON), List.of(Tiers.DIAMOND));

    public static final Tier PERIDOT = TierSortingRegistry.registerTier(
            new ForgeTier(2, 770, 7.5F, 2.5F, 13,
                    BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(ModItems.PERIDOT.get())),
            new ResourceLocation(UnnamedMod.MOD_ID, "peridot"), List.of(Tiers.IRON), List.of(Tiers.DIAMOND));

    public static final Tier RUBY = TierSortingRegistry.registerTier(
            new ForgeTier(3, 1600, 8.0F, 3.0F, 11,
                    BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ModItems.RUBY.get())),
            new ResourceLocation(UnnamedMod.MOD_ID, "ruby"), List.of(Tiers.DIAMOND), List.of(Tiers.NETHERITE));

    public static final Tier SAPPHIRE = TierSortingRegistry.registerTier(
            new ForgeTier(3, 1850, 8.5F, 3.5F, 12,
                    BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ModItems.SAPPHIRE.get())),
            new ResourceLocation(UnnamedMod.MOD_ID, "sapphire"), List.of(Tiers.DIAMOND), List.of(Tiers.NETHERITE));

    public static final Tier RQ = TierSortingRegistry.registerTier(
            new ForgeTier(5, 2260, 10.5F, 5.5F, 15,
                    ModTags.NEEDS_RQ_TOOL, () -> Ingredient.of(ModItems.RQ.get())),
            new ResourceLocation(UnnamedMod.MOD_ID, "rq"), List.of(Tiers.NETHERITE), List.of());
}
