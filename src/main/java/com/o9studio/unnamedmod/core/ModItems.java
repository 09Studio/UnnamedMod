package com.o9studio.unnamedmod.core;

import com.o9studio.unnamedmod.UnnamedMod;
import com.o9studio.unnamedmod.custom.items.FoodItems;
import com.o9studio.unnamedmod.custom.items.GlassJarItem;
import net.minecraft.world.item.*;
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


    //GREENERY ITEMS
    public static final RegistryObject<Item> GLASS_JAR = ITEMS.register("glass_jar", () -> new Item(new Item.Properties()));


    //FOOD & SEEDS ITEMS
    public static final RegistryObject<Item> BLUEBERRIES = ITEMS.register("blueberries", () -> new ItemNameBlockItem(ModBlocks.BLUEBERRY_BUSH.get(),
            new Item.Properties().food(FoodItems.BLUEBERRIES)));

    public static final RegistryObject<Item> BLUEBERRY_PIE = ITEMS.register("blueberry_pie", () -> new Item(new Item.Properties().food(FoodItems.BLUEBERRY_PIE)));

    public static final RegistryObject<Item> BLUEBERRY_SMOOTHIE = ITEMS.register("blueberry_smoothie", () -> new GlassJarItem(new Item.Properties().food(FoodItems.BLUEBERRY_SMOOTHIE)));

    public static final RegistryObject<Item> CHOCOLATE = ITEMS.register("chocolate", () -> new Item(new Item.Properties().food(FoodItems.CHOCOLATE)));

    public static final RegistryObject<Item> CHOCOLATE_SMOOTHIE = ITEMS.register("chocolate_smoothie", () -> new GlassJarItem(new Item.Properties().food(FoodItems.CHOCOLATE_SMOOTHIE)));

    public static final RegistryObject<Item> COOKED_TROPICAL_FISH = ITEMS.register("cooked_tropical_fish", () -> new Item(new Item.Properties().food(FoodItems.COOKED_TROPICAL_FISH)));

    public static final RegistryObject<Item> DARKBERRIES = ITEMS.register("darkberries", () -> new ItemNameBlockItem(ModBlocks.DARKBERRY_BUSH.get(),
            new Item.Properties().food(FoodItems.DARKBERRIES)));

    public static final RegistryObject<Item> DARKBERRY_SMOOTHIE = ITEMS.register("darkberry_smoothie", () -> new GlassJarItem(new Item.Properties().food(FoodItems.DARKBERRY_SMOOTHIE)));

    public static final RegistryObject<Item> JADE_VINE_FRUIT = ITEMS.register("jade_vine_fruit", () -> new ItemNameBlockItem(ModBlocks.JADE_VINE.get(),
            new Item.Properties().food(FoodItems.JADE_VINE_FRUIT)));

    public static final RegistryObject<Item> JADE_VINE_SMOOTHIE = ITEMS.register("jade_vine_smoothie", () -> new GlassJarItem(new Item.Properties().food(FoodItems.JADE_VINE_SMOOTHIE)));

    public static final RegistryObject<Item> LETTUCE_SEEDS = ITEMS.register("lettuce_seeds", () -> new ItemNameBlockItem(ModBlocks.LETTUCE_CROP.get(),
            new Item.Properties()));

    public static final RegistryObject<Item> LETTUCE = ITEMS.register("lettuce", () -> new Item(new Item.Properties().food(FoodItems.LETTUCE)));

    public static final RegistryObject<Item> RED_BELL_PEPPER_SEEDS = ITEMS.register("red_bell_pepper_seeds", () -> new ItemNameBlockItem(ModBlocks.RED_BELL_PEPPER_CROP.get(),
            new Item.Properties()));

    public static final RegistryObject<Item> RED_BELL_PEPPER = ITEMS.register("red_bell_pepper", () -> new Item(new Item.Properties().food(FoodItems.RED_BELL_PEPPER)));

    public static final RegistryObject<Item> ROASTED_RED_BELL_PEPPER = ITEMS.register("roasted_red_bell_pepper", () -> new Item(new Item.Properties().food(FoodItems.ROASTED_RED_BELL_PEPPER)));

    public static final RegistryObject<Item> SALAD = ITEMS.register("salad", () -> new BowlFoodItem(new Item.Properties().food(FoodItems.SALAD)));

    public static final RegistryObject<Item> STRAWBERRY = ITEMS.register("strawberry", () -> new ItemNameBlockItem(ModBlocks.STRAWBERRY_BUSH.get(),
            new Item.Properties().food(FoodItems.STRAWBERRY)));

    public static final RegistryObject<Item> STRAWBERRY_SMOOTHIE = ITEMS.register("strawberry_smoothie", () -> new GlassJarItem(new Item.Properties().food(FoodItems.STRAWBERRY_SMOOTHIE)));

    public static final RegistryObject<Item> STRAWBERRIES_WITH_MILK = ITEMS.register("strawberries_with_milk", () -> new BowlFoodItem(new Item.Properties().food(FoodItems.STRAWBERRIES_WITH_MILK)));

    public static final RegistryObject<Item> SWEET_BERRY_PIE = ITEMS.register("sweet_berry_pie", () -> new Item(new Item.Properties().food(FoodItems.SWEET_BERRY_PIE)));

    public static final RegistryObject<Item> SWEET_BERRY_SMOOTHIE = ITEMS.register("sweet_berry_smoothie", () -> new GlassJarItem(new Item.Properties().food(FoodItems.SWEET_BERRY_SMOOTHIE)));

    public static final RegistryObject<Item> TACO = ITEMS.register("taco", () -> new Item(new Item.Properties().food(FoodItems.TACO)));

    public static final RegistryObject<Item> TOMATO_SEEDS = ITEMS.register("tomato_seeds", () -> new ItemNameBlockItem(ModBlocks.TOMATO_CROP.get(),
            new Item.Properties()));

    public static final RegistryObject<Item> TOMATO = ITEMS.register("tomato", () -> new Item(new Item.Properties().food(FoodItems.TOMATO)));

    public static final RegistryObject<Item> ROTTEN_TOMATO = ITEMS.register("rotten_tomato", () -> new Item(new Item.Properties().food(FoodItems.ROTTEN_TOMATO)));

    public static final RegistryObject<Item> VANILLA_BEANS = ITEMS.register("vanilla_beans", () -> new ItemNameBlockItem(ModBlocks.VANILLA_CROP.get(),
            new Item.Properties()));

    public static final RegistryObject<Item> VANILLA_COOKIE = ITEMS.register("vanilla_cookie", () -> new Item(new Item.Properties().food(FoodItems.VANILLA_COOKIE)));

    public static final RegistryObject<Item> VANILLA_SMOOTHIE = ITEMS.register("vanilla_smoothie", () -> new GlassJarItem(new Item.Properties().food(FoodItems.VANILLA_SMOOTHIE)));

    public static final RegistryObject<Item> VEGETABLE_SOUP = ITEMS.register("vegetable_soup", () -> new BowlFoodItem(new Item.Properties().food(FoodItems.VEGETABLE_SOUP)));


    //BLOCK ITEMS
    public static final RegistryObject<BlockItem> AMBER_BLOCK = ITEMS.register("amber_block", () -> new BlockItem(
            ModBlocks.AMBER_BLOCK.get(), new Item.Properties().fireResistant()));

    public static final RegistryObject<BlockItem> AMBER_ROCKS = ITEMS.register("amber_rocks", () -> new BlockItem(
            ModBlocks.AMBER_ROCKS.get(), new Item.Properties().fireResistant()));

    public static final RegistryObject<BlockItem> CHOCOLATE_CAKE = ITEMS.register("chocolate_cake", () -> new BlockItem(
            ModBlocks.CHOCOLATE_CAKE.get(), new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> DUSKY_SIGN = ITEMS.register("dusky_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.DUSKY_SIGN.get(), ModBlocks.DUSKY_WALL_SIGN.get()));

    public static final RegistryObject<BlockItem> FLOWERING_LILY_PAD = ITEMS.register("flowering_lily_pad", () -> new PlaceOnWaterBlockItem(
            ModBlocks.FLOWERING_LILY_PAD.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> STRAWBERRY_CAKE = ITEMS.register("strawberry_cake", () -> new BlockItem(
            ModBlocks.STRAWBERRY_CAKE.get(), new Item.Properties().stacksTo(1)));

    public static final RegistryObject<BlockItem> VANILLA_CAKE = ITEMS.register("vanilla_cake", () -> new BlockItem(
            ModBlocks.VANILLA_CAKE.get(), new Item.Properties().stacksTo(1)));



    public static void register(IEventBus bus){
        ITEMS.register(bus);
    }
}
