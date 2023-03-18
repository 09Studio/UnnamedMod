package com.o9studio.unnamedmod.core;

import com.o9studio.unnamedmod.UnnamedMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, UnnamedMod.MOD_ID);

    //SPECIAL ITEMS
    public static final RegistryObject<Item> WHAT_ITEM = ITEMS.register("what_item", () -> new Item(new Item.Properties()));


    //POLISHERS ITEMS
    public static final RegistryObject<Item> COPPER_POLISHER = ITEMS.register("copper_polisher", () -> new Item(new Item.Properties().stacksTo(1).durability(25)));

    public static final RegistryObject<Item> IRON_POLISHER = ITEMS.register("iron_polisher", () -> new Item(new Item.Properties().stacksTo(1).durability(50)));

    public static final RegistryObject<Item> DIAMOND_POLISHER = ITEMS.register("diamond_polisher", () -> new Item(new Item.Properties().stacksTo(1).durability(100)));



    //CRYSTALS ITEMS
    public static final RegistryObject<Item> AMBER_FRAGMENT = ITEMS.register("amber_fragment", () -> new Item(new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> AMBER = ITEMS.register("amber", () -> new Item(new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> BRONZE_NUGGET = ITEMS.register("bronze_nugget", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BRONZE_ROD = ITEMS.register("bronze_rod", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_EMERALD = ITEMS.register("raw_emerald", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_DIAMOND = ITEMS.register("raw_diamond", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_PERIDOT = ITEMS.register("raw_peridot", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PERIDOT = ITEMS.register("peridot", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_RQ = ITEMS.register("raw_rq", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RQ = ITEMS.register("rq", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_RUBY = ITEMS.register("raw_ruby", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_SAPPHIRE = ITEMS.register("raw_sapphire", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_TOPAZ = ITEMS.register("raw_topaz", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TOPAZ = ITEMS.register("topaz", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_QUARTZ = ITEMS.register("raw_quartz", () -> new Item(new Item.Properties()));


    //FOOD ITEMS


    //BLOCK ITEMS
    public static final RegistryObject<BlockItem> AMBER_BLOCK = ITEMS.register("amber_block", () -> new BlockItem(
            ModBlocks.AMBER_BLOCK.get(), new Item.Properties().fireResistant()));



    public static void register(IEventBus bus){
        ITEMS.register(bus);
    }
}
