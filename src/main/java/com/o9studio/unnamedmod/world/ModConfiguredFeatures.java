package com.o9studio.unnamedmod.world;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.o9studio.unnamedmod.UnnamedMod;
import com.o9studio.unnamedmod.core.ModBlocks;
import com.o9studio.unnamedmod.custom.blocks.BlueBerryCropBlock;
import com.o9studio.unnamedmod.custom.blocks.JadeVineBlock;
import com.o9studio.unnamedmod.util.JadeVines;
import com.o9studio.unnamedmod.util.ModTags;
import net.minecraft.core.Direction;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.random.SimpleWeightedRandomList;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.util.valueproviders.WeightedListInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.PinkPetalsBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.*;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.RandomSpreadFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.RandomizedIntStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.WeightedStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.ForkingTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.UpwardsBranchingTrunkPlacer;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;

import java.util.List;

public class ModConfiguredFeatures {
    //KEYS
    public static final ResourceKey<ConfiguredFeature<?, ?>> DUSKY_KEY = registerKey("dusky_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> VERA_KEY = registerKey("vera_key");

    public static final ResourceKey<ConfiguredFeature<?, ?>> BLUEBERRY_BUSH_KEY = registerKey("blueberry_bush_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> JADE_VINES_KEY = registerKey("jade_vines_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> STRAWBERRY_BUSH_KEY = registerKey("strawberry_bush_key");

    public static final ResourceKey<ConfiguredFeature<?, ?>> MYCELIUM_GRASS_KEY = registerKey("mycelium_grass_key");

    public static final ResourceKey<ConfiguredFeature<?, ?>> AFRICAN_DAISY_KEY = registerKey("african_daisy_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLACK_IRIS_KEY = registerKey("black_iris_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLUE_JASMIN_KEY = registerKey("blue_jasmin_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BROWN_DAYLILY_KEY = registerKey("brown_daylily_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CLOVER_KEY = registerKey("clover_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CYCLAMEN_KEY = registerKey("cyclamen_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FLOWERING_LILY_PAD_KEY = registerKey("flowering_lily_pad_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GLOOMY_SPROUT_KEY = registerKey("gloomy_sprout_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GREEN_DAYLILY_KEY = registerKey("green_daylily_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LAVENDER_KEY = registerKey("lavender_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> HIBISCUS_KEY = registerKey("hibiscus_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PURPLE_ORCHID_KEY = registerKey("purple_orchid_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ROSE_KEY = registerKey("rose_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SUNDROP_KEY = registerKey("sundrop_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WHITE_ROSE_KEY = registerKey("white_rose_key");


    //HELPERS
    static WeightedStateProvider weightedstateprovider = new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.JADE_VINE_PLANT.get().defaultBlockState(), 4).add(ModBlocks.JADE_VINE_PLANT.get().defaultBlockState().setValue(JadeVines.BERRIES, Boolean.valueOf(true)), 1));
    static RandomizedIntStateProvider randomizedintstateprovider = new RandomizedIntStateProvider(new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.JADE_VINE.get().defaultBlockState(), 4).add(ModBlocks.JADE_VINE.get().defaultBlockState().setValue(JadeVines.BERRIES, Boolean.valueOf(true)), 1)), JadeVineBlock.AGE, UniformInt.of(23, 25));



    //BOOTSTRAP
    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        HolderGetter<Block> holdergetter = context.lookup(Registries.BLOCK);
        HolderGetter<PlacedFeature> placedFeatures = context.lookup(Registries.PLACED_FEATURE);

        register(context, DUSKY_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.DUSKY_LOG.get()),
                new ForkingTrunkPlacer(4, 1, 2),
                BlockStateProvider.simple(ModBlocks.DUSKY_LEAVES.get()), new BlobFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 3),
                new TwoLayersFeatureSize(1, 0, 1)).build());
        register(context, VERA_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.VERA_LOG.get()),
                new UpwardsBranchingTrunkPlacer(4, 3, 5, UniformInt.of(2,3),
                        0.66F, UniformInt.of(3,5), holdergetter.getOrThrow(ModTags.VERA_LOGS_GO_THROUGH)),
                BlockStateProvider.simple(ModBlocks.VERA_LEAVES.get()),
                new RandomSpreadFoliagePlacer(ConstantInt.of(4), ConstantInt.of(4), ConstantInt.of(2), 70),
                new TwoLayersFeatureSize(2, 0, 2)).build());

        register(context, BLUEBERRY_BUSH_KEY, Feature.RANDOM_PATCH,
                FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.BLUEBERRY_BUSH.get().defaultBlockState()
                        .setValue(BlueBerryCropBlock.AGE, Integer.valueOf(3)))), List.of(Blocks.GRASS_BLOCK)));
        register(context,JADE_VINES_KEY, Feature.BLOCK_COLUMN,
                new BlockColumnConfiguration(List.of(BlockColumnConfiguration.layer(new WeightedListInt(SimpleWeightedRandomList.<IntProvider>builder()
                        .add(UniformInt.of(0, 19), 2).add(UniformInt.of(0, 2), 3)
                        .add(UniformInt.of(0, 6), 10).build()), weightedstateprovider),
                        BlockColumnConfiguration.layer(ConstantInt.of(1), randomizedintstateprovider)), Direction.DOWN, BlockPredicate.ONLY_IN_AIR_PREDICATE, true));
        register(context, STRAWBERRY_BUSH_KEY, Feature.RANDOM_PATCH,
                FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.STRAWBERRY_BUSH.get().defaultBlockState()
                        .setValue(BlueBerryCropBlock.AGE, Integer.valueOf(3)))), List.of(Blocks.GRASS_BLOCK)));

        register(context, MYCELIUM_GRASS_KEY, Feature.RANDOM_PATCH,
                FeatureUtils.simpleRandomPatchConfiguration(20, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.MYCELIUM_GRASS.get())))));


        register(context, AFRICAN_DAISY_KEY, Feature.FLOWER,
                new RandomPatchConfiguration(40, 5, 5, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.AFRICAN_DAISY.get())))));
        register(context, BLACK_IRIS_KEY, Feature.FLOWER,
                new RandomPatchConfiguration(50, 6, 6, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.BLACK_IRIS.get())))));
        register(context, BLUE_JASMIN_KEY, Feature.FLOWER,
                new RandomPatchConfiguration(64, 5, 5, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.BLUE_JASMIN.get())))));
        register(context, BROWN_DAYLILY_KEY, Feature.FLOWER,
                new RandomPatchConfiguration(40, 5, 5, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.BROWN_DAYLILY.get())))));
        register(context, CYCLAMEN_KEY, Feature.FLOWER,
                new RandomPatchConfiguration(64, 8, 8, PlacementUtils.inlinePlaced(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.CYCLAMEN.get())))));
        register(context, FLOWERING_LILY_PAD_KEY, Feature.RANDOM_PATCH,
                FeatureUtils.simpleRandomPatchConfiguration(2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.FLOWERING_LILY_PAD.get())))));
        register(context, GLOOMY_SPROUT_KEY, Feature.RANDOM_PATCH,
                FeatureUtils.simpleRandomPatchConfiguration(2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.GLOOMY_SPROUT.get())))));
        register(context, GREEN_DAYLILY_KEY, Feature.FLOWER,
                new RandomPatchConfiguration(40, 4, 4, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.GREEN_DAYLILY.get())))));
        register(context, HIBISCUS_KEY, Feature.FLOWER,
                new RandomPatchConfiguration(64, 5, 5, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HIBISCUS.get())))));
        register(context, LAVENDER_KEY, Feature.FLOWER,
                new RandomPatchConfiguration(50, 4, 4, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.LAVENDER.get())))));
        register(context, PURPLE_ORCHID_KEY, Feature.FLOWER,
                new RandomPatchConfiguration(64, 6, 4, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.PURPLE_ORCHID.get())))));
        register(context, ROSE_KEY, Feature.FLOWER,
                new RandomPatchConfiguration(40, 5, 5, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.ROSE.get())))));
        register(context, SUNDROP_KEY, Feature.FLOWER,
            new RandomPatchConfiguration(64, 6, 6, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.SUNDROP.get())))));
        register(context, WHITE_ROSE_KEY, Feature.FLOWER,
                new RandomPatchConfiguration(40, 6, 4, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.WHITE_ROSE.get())))));

        SimpleWeightedRandomList.Builder<BlockState> cloverBuilder = SimpleWeightedRandomList.builder();
        for(int i = 1; i <= 4; ++i) {
            for(Direction direction : Direction.Plane.HORIZONTAL) {
                cloverBuilder.add(ModBlocks.CLOVER.get().defaultBlockState().setValue(PinkPetalsBlock.AMOUNT, Integer.valueOf(i)).setValue(PinkPetalsBlock.FACING, direction), 1);
            }
        }
        register(context, CLOVER_KEY, Feature.FLOWER,
                new RandomPatchConfiguration(35, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(new WeightedStateProvider(cloverBuilder)))));

    }



    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(UnnamedMod.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
