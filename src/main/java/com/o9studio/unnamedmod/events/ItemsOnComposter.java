package com.o9studio.unnamedmod.events;

import com.o9studio.unnamedmod.core.ModBlocks;
import com.o9studio.unnamedmod.core.ModItems;
import net.minecraft.world.level.block.ComposterBlock;

public class ItemsOnComposter {

    public static void register(){
        ComposterBlock.COMPOSTABLES.put(ModItems.BLUEBERRIES.get(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(ModItems.BLUEBERRY_PIE.get(), 1.0F);
        ComposterBlock.COMPOSTABLES.put(ModItems.CHOCOLATE.get(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(ModBlocks.CHOCOLATE_CAKE.get().asItem(), 1.0F);
        ComposterBlock.COMPOSTABLES.put(ModItems.DARKBERRIES.get(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(ModItems.JADE_VINE_FRUIT.get(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(ModItems.LETTUCE_SEEDS.get(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(ModItems.LETTUCE.get(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(ModItems.MOON_FRUIT.get(), 0.5F);
        ComposterBlock.COMPOSTABLES.put(ModItems.RED_BELL_PEPPER_SEEDS.get(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(ModItems.RED_BELL_PEPPER.get(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(ModItems.STRAWBERRY.get(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(ModBlocks.STRAWBERRY_CAKE.get().asItem(), 1.0F);
        ComposterBlock.COMPOSTABLES.put(ModItems.SWEET_BERRY_PIE.get(), 1.0F);
        ComposterBlock.COMPOSTABLES.put(ModItems.TOMATO_SEEDS.get(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(ModItems.TOMATO.get(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(ModItems.VANILLA_BEANS.get(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(ModItems.VANILLA_COOKIE.get(), 0.85F);
        ComposterBlock.COMPOSTABLES.put(ModBlocks.VANILLA_CAKE.get().asItem(), 1.0F);

        ComposterBlock.COMPOSTABLES.put(ModBlocks.DUSKY_SAPLING.get().asItem(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(ModBlocks.DUSKY_LEAVES.get().asItem(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(ModBlocks.VERA_SAPLING.get().asItem(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(ModBlocks.VERA_LEAVES.get().asItem(), 0.3F);

        ComposterBlock.COMPOSTABLES.put(ModBlocks.AFRICAN_DAISY.get().asItem(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(ModBlocks.BLACK_IRIS.get().asItem(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(ModBlocks.BLUE_JASMIN.get().asItem(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(ModBlocks.BROWN_DAYLILY.get().asItem(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(ModBlocks.CLOVER.get().asItem(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(ModBlocks.CYCLAMEN.get().asItem(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(ModBlocks.DIRE_MOLD.get().asItem(), 0.50F);
        ComposterBlock.COMPOSTABLES.put(ModBlocks.FLOWERING_LILY_PAD.get().asItem(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(ModBlocks.GLOOMY_SPROUT.get().asItem(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(ModBlocks.GLOOMLIGHT.get().asItem(), 0.85F);
        ComposterBlock.COMPOSTABLES.put(ModBlocks.GREEN_DAYLILY.get().asItem(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(ModBlocks.HIBISCUS.get().asItem(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(ModBlocks.LAVENDER.get().asItem(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(ModBlocks.JACARANDAS.get().asItem(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(ModBlocks.MYCELIUM_GRASS.get().asItem(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(ModBlocks.PURPLE_ORCHID.get().asItem(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(ModBlocks.ROSE.get().asItem(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(ModBlocks.SUNDROP.get().asItem(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(ModBlocks.VANILLA.get().asItem(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(ModBlocks.WHITE_ROSE.get().asItem(), 0.65F);

        ComposterBlock.COMPOSTABLES.put(ModItems.PAPER_FLOWER.get(), 0.2F);
        ComposterBlock.COMPOSTABLES.put(ModBlocks.WHITE_FLOWERED_VINES.get().asItem(), 0.5F);
        ComposterBlock.COMPOSTABLES.put(ModBlocks.ORANGE_FLOWERED_VINES.get().asItem(), 0.5F);
        ComposterBlock.COMPOSTABLES.put(ModBlocks.MAGENTA_FLOWERED_VINES.get().asItem(), 0.5F);
        ComposterBlock.COMPOSTABLES.put(ModBlocks.LIGHT_BLUE_FLOWERED_VINES.get().asItem(), 0.5F);
        ComposterBlock.COMPOSTABLES.put(ModBlocks.YELLOW_FLOWERED_VINES.get().asItem(), 0.5F);
        ComposterBlock.COMPOSTABLES.put(ModBlocks.LIME_FLOWERED_VINES.get().asItem(), 0.5F);
        ComposterBlock.COMPOSTABLES.put(ModBlocks.PINK_FLOWERED_VINES.get().asItem(), 0.5F);
        ComposterBlock.COMPOSTABLES.put(ModBlocks.GRAY_FLOWERED_VINES.get().asItem(), 0.5F);
        ComposterBlock.COMPOSTABLES.put(ModBlocks.LIGHT_GRAY_FLOWERED_VINES.get().asItem(), 0.5F);
        ComposterBlock.COMPOSTABLES.put(ModBlocks.CYAN_FLOWERED_VINES.get().asItem(), 0.5F);
        ComposterBlock.COMPOSTABLES.put(ModBlocks.PURPLE_FLOWERED_VINES.get().asItem(), 0.5F);
        ComposterBlock.COMPOSTABLES.put(ModBlocks.BLUE_FLOWERED_VINES.get().asItem(), 0.5F);
        ComposterBlock.COMPOSTABLES.put(ModBlocks.BROWN_FLOWERED_VINES.get().asItem(), 0.5F);
        ComposterBlock.COMPOSTABLES.put(ModBlocks.GREEN_FLOWERED_VINES.get().asItem(), 0.5F);
        ComposterBlock.COMPOSTABLES.put(ModBlocks.RED_FLOWERED_VINES.get().asItem(), 0.5F);
        ComposterBlock.COMPOSTABLES.put(ModBlocks.BLACK_FLOWERED_VINES.get().asItem(), 0.5F);
    }
}
