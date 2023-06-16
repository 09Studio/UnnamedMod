package com.o9studio.unnamedmod.world.features;

import com.o9studio.unnamedmod.UnnamedMod;
import com.o9studio.unnamedmod.core.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.ForkingTrunkPlacer;

public class ModConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> DUSKY_KEY = registerKey("dusky");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {

        register(context, DUSKY_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.DUSKY_LOG.get()),
                new ForkingTrunkPlacer(4, 1, 2),
                BlockStateProvider.simple(ModBlocks.DUSKY_LEAVES.get()), new BlobFoliagePlacer(ConstantInt.of(1), ConstantInt.of(1), 2),
                new TwoLayersFeatureSize(1, 0, 1)).build());
    }


    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(UnnamedMod.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}