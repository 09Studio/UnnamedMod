package com.o9studio.unnamedmod.events;

import com.o9studio.unnamedmod.core.ModBlocks;
import com.o9studio.unnamedmod.core.ModItems;
import net.minecraft.world.level.block.ComposterBlock;

public class ItemsOnComposter {

    public static void register(){
        ComposterBlock.COMPOSTABLES.put(ModItems.BLUEBERRIES.get(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(ModItems.BLUEBERRY_PIE.get(), 1.0F);
        ComposterBlock.COMPOSTABLES.put(ModItems.CHOCOLATE.get(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(ModItems.DARKBERRIES.get(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(ModBlocks.GLOOMLIGHT.get(), 0.85F);
        ComposterBlock.COMPOSTABLES.put(ModItems.JADE_VINE_FRUIT.get(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(ModItems.LETTUCE_SEEDS.get(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(ModItems.LETTUCE.get(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(ModItems.RED_BELL_PEPPER_SEEDS.get(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(ModItems.RED_BELL_PEPPER.get(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(ModItems.STRAWBERRY.get(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(ModItems.SWEET_BERRY_PIE.get(), 1.0F);
        ComposterBlock.COMPOSTABLES.put(ModItems.TOMATO_SEEDS.get(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(ModItems.TOMATO.get(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(ModItems.VANILLA_BEANS.get(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(ModItems.VANILLA_COOKIE.get(), 0.85F);
    }
}
