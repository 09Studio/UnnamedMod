package com.o9studio.unnamedmod.util.datageneration;

import com.o9studio.unnamedmod.UnnamedMod;
import com.o9studio.unnamedmod.core.ModBlocks;
import com.o9studio.unnamedmod.core.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, UnnamedMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.WHAT_ITEM);

        simpleItem(ModItems.GLASS_JAR);
        simpleItem(ModItems.BLUEBERRIES);
        simpleItem(ModItems.BLUEBERRY_PIE);
        simpleItem(ModItems.BLUEBERRY_SMOOTHIE);
        simpleItem(ModItems.CHOCOLATE);
        simpleItem(ModItems.CHOCOLATE_SMOOTHIE);
        simpleItem(ModItems.COOKED_TROPICAL_FISH);
        simpleItem(ModItems.DARKBERRIES);
        simpleItem(ModItems.DARKBERRY_SMOOTHIE);
        simpleItem(ModItems.JADE_VINE_FRUIT);
        simpleItem(ModItems.JADE_VINE_SMOOTHIE);
        simpleItem(ModItems.LETTUCE_SEEDS);
        simpleItem(ModItems.RED_BELL_PEPPER_SEEDS);
        simpleItem(ModItems.LETTUCE);
        simpleItem(ModItems.RED_BELL_PEPPER);
        simpleItem(ModItems.ROASTED_RED_BELL_PEPPER);
        simpleItem(ModItems.SALAD);
        simpleItem(ModItems.STRAWBERRY);
        simpleItem(ModItems.STRAWBERRY_SMOOTHIE);
        simpleItem(ModItems.STRAWBERRIES_WITH_MILK);
        simpleItem(ModItems.SWEET_BERRY_PIE);
        simpleItem(ModItems.SWEET_BERRY_SMOOTHIE);
        simpleItem(ModItems.TACO);
        simpleItem(ModItems.TOMATO_SEEDS);
        simpleItem(ModItems.TOMATO);
        simpleItem(ModItems.ROTTEN_TOMATO);
        simpleItem(ModItems.VANILLA_BEANS);
        simpleItem(ModItems.VANILLA_COOKIE);
        simpleItem(ModItems.VANILLA_SMOOTHIE);
        simpleItem(ModItems.VEGETABLE_SOUP);

        saplingItem(ModBlocks.DUSKY_SAPLING);


        simpleItem(ModItems.COPPER_POLISHER);
        simpleItem(ModItems.IRON_POLISHER);
        simpleItem(ModItems.DIAMOND_POLISHER);

        simpleItem(ModItems.AMBER);
        simpleItem(ModItems.AMBER_FRAGMENT);
        simpleItem(ModItems.BRONZE_NUGGET);
        simpleItem(ModItems.BRONZE_INGOT);
        simpleItem(ModItems.BRONZE_ROD);
        simpleItem(ModItems.RAW_EMERALD);
        simpleItem(ModItems.RAW_DIAMOND);
        simpleItem(ModItems.RAW_PERIDOT);
        simpleItem(ModItems.PERIDOT);
        simpleItem(ModItems.RAW_RQ);
        simpleItem(ModItems.RQ);
        simpleItem(ModItems.RAW_RUBY);
        simpleItem(ModItems.RUBY);
        simpleItem(ModItems.RAW_SAPPHIRE);
        simpleItem(ModItems.SAPPHIRE);
        simpleItem(ModItems.RAW_TOPAZ);
        simpleItem(ModItems.TOPAZ);
        simpleItem(ModItems.RAW_QUARTZ);
    }
    private ItemModelBuilder saplingItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(UnnamedMod.MOD_ID,"block/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(UnnamedMod.MOD_ID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(UnnamedMod.MOD_ID,"item/" + item.getId().getPath()));
    }
}
