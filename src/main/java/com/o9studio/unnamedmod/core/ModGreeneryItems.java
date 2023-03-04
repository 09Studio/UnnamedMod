package com.o9studio.unnamedmod.core;

import com.o9studio.unnamedmod.UnnamedMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModGreeneryItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, UnnamedMod.MOD_ID);

    //SPECIAL ITEMS
    public static final RegistryObject<Item> WHAT_ITEM = ITEMS.register("what_item", () -> new Item(new Item.Properties()));


    //FOOD ITEMS


    public static void register(IEventBus bus){
        ITEMS.register(bus);
    }
}
