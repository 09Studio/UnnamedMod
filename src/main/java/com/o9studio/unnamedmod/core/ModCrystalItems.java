package com.o9studio.unnamedmod.core;

import com.o9studio.unnamedmod.UnnamedMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModCrystalItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, UnnamedMod.MOD_ID);

    //POLISHERS ITEMS



    //CRYSTALS ITEMS

    public static final RegistryObject<Item> AMBER_FRAGMENT = ITEMS.register("amber_fragment", () -> new Item(new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> AMBER = ITEMS.register("amber", () -> new Item(new Item.Properties().fireResistant()));



    public static void register(IEventBus bus){
        ITEMS.register(bus);
    }
}
