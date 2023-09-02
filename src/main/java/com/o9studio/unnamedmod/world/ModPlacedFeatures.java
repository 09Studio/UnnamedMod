package com.o9studio.unnamedmod.world;

import com.o9studio.unnamedmod.UnnamedMod;
import com.o9studio.unnamedmod.core.ModBlocks;
import net.minecraft.core.Direction;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class ModPlacedFeatures {

    //KEYS
    public static final ResourceKey<PlacedFeature> DUSKY_PLACED_KEY = createKey("dusky_placed");
    public static final ResourceKey<PlacedFeature> VERA_PLACED_KEY = createKey("vera_placed");

    public static final ResourceKey<PlacedFeature> BLUEBERRY_BUSH_PLACED_KEY = createKey("blueberry_bush_placed");
    public static final ResourceKey<PlacedFeature> JADE_VINES_PLACED_KEY = createKey("jade_vines_placed");
    public static final ResourceKey<PlacedFeature> STRAWBERRY_BUSH_PLACED_KEY = createKey("strawberry_bush_placed");

    public static final ResourceKey<PlacedFeature> MYCELIUM_GRASS_PLACED_KEY = createKey("mycelium_grass_placed");

    public static final ResourceKey<PlacedFeature> AMBER_ROCKS_PLACED_KEY = createKey("amber_rocks_placed");
    public static final ResourceKey<PlacedFeature> PERIDOT_ORE_PLACED_KEY = createKey("peridot_ore_placed");
    public static final ResourceKey<PlacedFeature> RQ_ORE_PLACED_KEY = createKey("rq_ore_placed");
    public static final ResourceKey<PlacedFeature> RUBY_ORE_PLACED_KEY = createKey("ruby_ore_placed");
    public static final ResourceKey<PlacedFeature> SAPPHIRE_ORE_PLACED_KEY = createKey("sapphire_ore_placed");
    public static final ResourceKey<PlacedFeature> TOPAZ_ORE_PLACED_KEY = createKey("topaz_ore_placed");

    public static final ResourceKey<PlacedFeature> AFRICAN_DAISY_PLACED_KEY = createKey("african_daisy_placed");
    public static final ResourceKey<PlacedFeature> BLACK_IRIS_PLACED_KEY = createKey("black_iris_placed");
    public static final ResourceKey<PlacedFeature> BLUE_JASMIN_PLACED_KEY = createKey("blue_jasmin_placed");
    public static final ResourceKey<PlacedFeature> BROWN_DAYLILY_PLACED_KEY = createKey("brown_daylily_placed");
    public static final ResourceKey<PlacedFeature> FLOWERING_LILY_PAD_PLACED_KEY = createKey("flowering_lily_pad_placed");
    public static final ResourceKey<PlacedFeature> GLOOMY_SPROUT_PLACED_KEY = createKey("gloomy_sprout_placed");
    public static final ResourceKey<PlacedFeature> GREEN_DAYLILY_PLACED_KEY = createKey("green_daylily_placed");
    public static final ResourceKey<PlacedFeature> PURPLE_ORCHID_PLACED_KEY = createKey("purple_orchid_placed");
    public static final ResourceKey<PlacedFeature> ROSE_PLACED_KEY = createKey("rose_placed");
    public static final ResourceKey<PlacedFeature> WHITE_ROSE_PLACED_KEY = createKey("white_rose_placed");


    //HELPERS
    public static List<PlacementModifier> orePlacement(PlacementModifier modifier, PlacementModifier modifier1) {
        return List.of(modifier, InSquarePlacement.spread(), modifier1, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonOrePlacement(int veinsPerChunk, PlacementModifier modifier) {
        return orePlacement(CountPlacement.of(veinsPerChunk), modifier);
    }

    public static List<PlacementModifier> rareOrePlacement(int veinsPerChunk, PlacementModifier modifier) {
        return orePlacement(RarityFilter.onAverageOnceEvery(veinsPerChunk), modifier);
    }


    //BOOTSTRAP
    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, DUSKY_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.DUSKY_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.1f, 1)));
        register(context, VERA_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.VERA_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.isEmpty(), ModBlocks.VERA_SAPLING.get()));

        register(context, BLUEBERRY_BUSH_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BLUEBERRY_BUSH_KEY),
                List.of(RarityFilter.onAverageOnceEvery(20), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, JADE_VINES_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.JADE_VINES_KEY), CountPlacement.of(150), InSquarePlacement.spread(),
                PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT, EnvironmentScanPlacement.scanningFor(Direction.UP, BlockPredicate.hasSturdyFace(Direction.DOWN),
                        BlockPredicate.ONLY_IN_AIR_PREDICATE, 12), RandomOffsetPlacement.vertical(ConstantInt.of(-1)), BiomeFilter.biome());
        register(context, STRAWBERRY_BUSH_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.STRAWBERRY_BUSH_KEY),
                List.of(RarityFilter.onAverageOnceEvery(20), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, MYCELIUM_GRASS_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.MYCELIUM_GRASS_KEY),
                List.of(CountPlacement.of(15), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, AMBER_ROCKS_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.AMBER_ROCKS_KEY),
                List.of(RarityFilter.onAverageOnceEvery(5), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, PERIDOT_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.PERIDOT_ORE_KEY),
                commonOrePlacement(10, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(0), VerticalAnchor.belowTop(125))));
        register(context, RQ_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.RQ_ORE_KEY),
                rareOrePlacement(5, HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(100), VerticalAnchor.belowTop(125))));
        register(context, RUBY_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.RUBY_ORE_KEY),
                commonOrePlacement(12, HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-80), VerticalAnchor.belowTop(20))));
        register(context, SAPPHIRE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.SAPPHIRE_ORE_KEY),
                commonOrePlacement(12, HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-80), VerticalAnchor.belowTop(20))));
        register(context, TOPAZ_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.TOPAZ_ORE_KEY),
                commonOrePlacement(10, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-10), VerticalAnchor.belowTop(100))));

        register(context, AFRICAN_DAISY_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.AFRICAN_DAISY_KEY),
                List.of(RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, BLACK_IRIS_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BLACK_IRIS_KEY),
                List.of(RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        register(context, BLUE_JASMIN_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BLUE_JASMIN_KEY),
                List.of(RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        register(context, BROWN_DAYLILY_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BROWN_DAYLILY_KEY),
                List.of(RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, FLOWERING_LILY_PAD_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.FLOWERING_LILY_PAD_KEY),
                List.of(CountPlacement.of(2), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, GLOOMY_SPROUT_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.GLOOMY_SPROUT_KEY),
                List.of(CountPlacement.of(2), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, GREEN_DAYLILY_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.GREEN_DAYLILY_KEY),
                List.of(RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        register(context, PURPLE_ORCHID_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.PURPLE_ORCHID_KEY),
                List.of(RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        register(context, ROSE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ROSE_KEY),
                List.of(RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        register(context, WHITE_ROSE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.WHITE_ROSE_KEY),
                List.of(RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
    }



    private static ResourceKey<PlacedFeature> createKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(UnnamedMod.MOD_ID, name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}
