package com.o9studio.unnamedmod.util.datageneration;

import com.o9studio.unnamedmod.UnnamedMod;
import com.o9studio.unnamedmod.core.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
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
