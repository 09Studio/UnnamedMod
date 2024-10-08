package com.o9studio.unnamedmod.core;

import com.o9studio.unnamedmod.UnnamedMod;
import com.o9studio.unnamedmod.custom.entities.BoatsEntities;
import com.o9studio.unnamedmod.custom.items.*;
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

    public static final RegistryObject<Item> BLOODSTONE = ITEMS.register("bloodstone", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BRONZE_NUGGET = ITEMS.register("bronze_nugget", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BRONZE_ROD = ITEMS.register("bronze_rod", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_EMERALD = ITEMS.register("raw_emerald", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_DIAMOND = ITEMS.register("raw_diamond", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_PERIDOT = ITEMS.register("raw_peridot", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PERIDOT = ITEMS.register("peridot", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAINBOW_FRAGMENTS = ITEMS.register("rainbow_fragments", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_RQ = ITEMS.register("raw_rq", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RQ = ITEMS.register("rq", () -> new Item(new Item.Properties().fireResistant().rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<Item> RAW_RUBY = ITEMS.register("raw_ruby", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_SAPPHIRE = ITEMS.register("raw_sapphire", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_TOPAZ = ITEMS.register("raw_topaz", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TOPAZ = ITEMS.register("topaz", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_QUARTZ = ITEMS.register("raw_quartz", () -> new Item(new Item.Properties()));


    //GREENERY ITEMS
    public static final RegistryObject<Item> GLASS_JAR = ITEMS.register("glass_jar", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PAPER_FLOWER = ITEMS.register("paper_flower", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DUSKY_BOAT = ITEMS.register("dusky_boat",
            () -> new BoatsItems(false, BoatsEntities.Type.DUSKY, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> DUSKY_CHEST_BOAT = ITEMS.register("dusky_chest_boat",
            () -> new BoatsItems(true, BoatsEntities.Type.DUSKY, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> VERA_BOAT = ITEMS.register("vera_boat",
            () -> new BoatsItems(false, BoatsEntities.Type.VERA, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> VERA_CHEST_BOAT = ITEMS.register("vera_chest_boat",
            () -> new BoatsItems(true, BoatsEntities.Type.VERA, new Item.Properties().stacksTo(1)));


    //FOOD & SEEDS ITEMS
    public static final RegistryObject<Item> BLUEBERRIES = ITEMS.register("blueberries", () -> new ItemNameBlockItem(ModBlocks.BLUEBERRY_BUSH.get(),
            new Item.Properties().food(FoodItems.BLUEBERRIES)));

    public static final RegistryObject<Item> BLUEBERRY_PIE = ITEMS.register("blueberry_pie", () -> new Item(new Item.Properties().food(FoodItems.BLUEBERRY_PIE)));

    public static final RegistryObject<Item> BLUEBERRY_SMOOTHIE = ITEMS.register("blueberry_smoothie", () -> new GlassJarItem(new Item.Properties().food(FoodItems.BLUEBERRY_SMOOTHIE).stacksTo(1)));

    public static final RegistryObject<Item> CHOCOLATE = ITEMS.register("chocolate", () -> new Item(new Item.Properties().food(FoodItems.CHOCOLATE)));

    public static final RegistryObject<Item> CHOCOLATE_SMOOTHIE = ITEMS.register("chocolate_smoothie", () -> new GlassJarItem(new Item.Properties().food(FoodItems.CHOCOLATE_SMOOTHIE).stacksTo(1)));

    public static final RegistryObject<Item> COOKED_TROPICAL_FISH = ITEMS.register("cooked_tropical_fish", () -> new Item(new Item.Properties().food(FoodItems.COOKED_TROPICAL_FISH)));

    public static final RegistryObject<Item> DARKBERRIES = ITEMS.register("darkberries", () -> new ItemNameBlockItem(ModBlocks.DARKBERRY_BUSH.get(),
            new Item.Properties().food(FoodItems.DARKBERRIES)));

    public static final RegistryObject<Item> DARKBERRY_SMOOTHIE = ITEMS.register("darkberry_smoothie", () -> new GlassJarItem(new Item.Properties().food(FoodItems.DARKBERRY_SMOOTHIE).stacksTo(1)));

    public static final RegistryObject<Item> JADE_VINE_FRUIT = ITEMS.register("jade_vine_fruit", () -> new ItemNameBlockItem(ModBlocks.JADE_VINE.get(),
            new Item.Properties().food(FoodItems.JADE_VINE_FRUIT)));

    public static final RegistryObject<Item> JADE_VINE_SMOOTHIE = ITEMS.register("jade_vine_smoothie", () -> new GlassJarItem(new Item.Properties().food(FoodItems.JADE_VINE_SMOOTHIE).stacksTo(1)));

    public static final RegistryObject<Item> LETTUCE_SEEDS = ITEMS.register("lettuce_seeds", () -> new ItemNameBlockItem(ModBlocks.LETTUCE_CROP.get(),
            new Item.Properties()));

    public static final RegistryObject<Item> LETTUCE = ITEMS.register("lettuce", () -> new Item(new Item.Properties().food(FoodItems.LETTUCE)));

    public static final RegistryObject<Item> MOON_FRUIT = ITEMS.register("moon_fruit", () -> new ItemNameBlockItem(ModBlocks.MOON_FLOWER.get(),
            new Item.Properties().food(FoodItems.MOON_FRUIT)));

    public static final RegistryObject<Item> MOON_SMOOTHIE = ITEMS.register("moon_smoothie", () -> new GlassJarItem(new Item.Properties().food(FoodItems.MOON_SMOOTHIE).stacksTo(1)));

    public static final RegistryObject<Item> RED_BELL_PEPPER_SEEDS = ITEMS.register("red_bell_pepper_seeds", () -> new ItemNameBlockItem(ModBlocks.RED_BELL_PEPPER_CROP.get(),
            new Item.Properties()));

    public static final RegistryObject<Item> RED_BELL_PEPPER = ITEMS.register("red_bell_pepper", () -> new Item(new Item.Properties().food(FoodItems.RED_BELL_PEPPER)));

    public static final RegistryObject<Item> ROASTED_RED_BELL_PEPPER = ITEMS.register("roasted_red_bell_pepper", () -> new Item(new Item.Properties().food(FoodItems.ROASTED_RED_BELL_PEPPER)));

    public static final RegistryObject<Item> SALAD = ITEMS.register("salad", () -> new BowlFoodItem(new Item.Properties().food(FoodItems.SALAD)));

    public static final RegistryObject<Item> STRAWBERRY = ITEMS.register("strawberry", () -> new ItemNameBlockItem(ModBlocks.STRAWBERRY_BUSH.get(),
            new Item.Properties().food(FoodItems.STRAWBERRY)));

    public static final RegistryObject<Item> STRAWBERRY_SMOOTHIE = ITEMS.register("strawberry_smoothie", () -> new GlassJarItem(new Item.Properties().food(FoodItems.STRAWBERRY_SMOOTHIE).stacksTo(1)));

    public static final RegistryObject<Item> STRAWBERRIES_WITH_MILK = ITEMS.register("strawberries_with_milk", () -> new BowlFoodItem(new Item.Properties().food(FoodItems.STRAWBERRIES_WITH_MILK).stacksTo(1)));

    public static final RegistryObject<Item> SWEET_BERRY_PIE = ITEMS.register("sweet_berry_pie", () -> new Item(new Item.Properties().food(FoodItems.SWEET_BERRY_PIE)));

    public static final RegistryObject<Item> SWEET_BERRY_SMOOTHIE = ITEMS.register("sweet_berry_smoothie", () -> new GlassJarItem(new Item.Properties().food(FoodItems.SWEET_BERRY_SMOOTHIE).stacksTo(1)));

    public static final RegistryObject<Item> TACO = ITEMS.register("taco", () -> new Item(new Item.Properties().food(FoodItems.TACO)));

    public static final RegistryObject<Item> TOMATO_SEEDS = ITEMS.register("tomato_seeds", () -> new ItemNameBlockItem(ModBlocks.TOMATO_CROP.get(),
            new Item.Properties()));

    public static final RegistryObject<Item> TOMATO = ITEMS.register("tomato", () -> new Item(new Item.Properties().food(FoodItems.TOMATO)));

    public static final RegistryObject<Item> ROTTEN_TOMATO = ITEMS.register("rotten_tomato", () -> new Item(new Item.Properties().food(FoodItems.ROTTEN_TOMATO)));

    public static final RegistryObject<Item> VANILLA_BEANS = ITEMS.register("vanilla_beans", () -> new ItemNameBlockItem(ModBlocks.VANILLA_CROP.get(),
            new Item.Properties()));

    public static final RegistryObject<Item> VANILLA_COOKIE = ITEMS.register("vanilla_cookie", () -> new Item(new Item.Properties().food(FoodItems.VANILLA_COOKIE)));

    public static final RegistryObject<Item> VANILLA_SMOOTHIE = ITEMS.register("vanilla_smoothie", () -> new GlassJarItem(new Item.Properties().food(FoodItems.VANILLA_SMOOTHIE).stacksTo(1)));

    public static final RegistryObject<Item> VEGETABLE_SOUP = ITEMS.register("vegetable_soup", () -> new BowlFoodItem(new Item.Properties().food(FoodItems.VEGETABLE_SOUP)));


    //SWORD ITEMS
    public static final RegistryObject<Item> TOPAZ_SWORD = ITEMS.register("topaz_sword",
            () -> new SwordItem(ModToolTiers.TOPAZ, 3, -2.4F, new Item.Properties()));

    public static final RegistryObject<Item> BRONZE_SWORD = ITEMS.register("bronze_sword",
            () -> new SwordItem(ModToolTiers.BRONZE, 3, -2.4F, new Item.Properties()));

    public static final RegistryObject<Item> PERIDOT_SWORD = ITEMS.register("peridot_sword",
            () -> new SwordItem(ModToolTiers.PERIDOT, 3, -2.4F, new Item.Properties()));

    public static final RegistryObject<Item> RUBY_SWORD = ITEMS.register("ruby_sword",
            () -> new SwordItem(ModToolTiers.RUBY, 3, -2.4F, new Item.Properties()));

    public static final RegistryObject<Item> SAPPHIRE_SWORD = ITEMS.register("sapphire_sword",
            () -> new SwordItem(ModToolTiers.SAPPHIRE, 3, -2.4F, new Item.Properties()));

    public static final RegistryObject<Item> RQ_SWORD = ITEMS.register("rq_sword",
            () -> new RQSwordItem(ModToolTiers.RQ, 3, -2.4F, new Item.Properties().fireResistant().rarity(Rarity.RARE)));


    //AXE ITEMS
    public static final RegistryObject<Item> TOPAZ_AXE = ITEMS.register("topaz_axe",
            () -> new AxeItem(ModToolTiers.TOPAZ, 6.0F, -3.1F, new Item.Properties()));

    public static final RegistryObject<Item> BRONZE_AXE = ITEMS.register("bronze_axe",
            () -> new AxeItem(ModToolTiers.BRONZE, 6.0F, -3.1F, new Item.Properties()));

    public static final RegistryObject<Item> PERIDOT_AXE = ITEMS.register("peridot_axe",
            () -> new AxeItem(ModToolTiers.PERIDOT, 6.0F, -3.1F, new Item.Properties()));

    public static final RegistryObject<Item> RUBY_AXE = ITEMS.register("ruby_axe",
            () -> new AxeItem(ModToolTiers.RUBY, 6.0F, -3.0F, new Item.Properties()));

    public static final RegistryObject<Item> SAPPHIRE_AXE = ITEMS.register("sapphire_axe",
            () -> new AxeItem(ModToolTiers.SAPPHIRE, 6.0F, -3.0F, new Item.Properties()));

    public static final RegistryObject<Item> RQ_AXE = ITEMS.register("rq_axe",
            () -> new RQAxeItem(ModToolTiers.RQ, 5.0F, -3.0F, new Item.Properties().fireResistant().rarity(Rarity.RARE)));


    //PICKAXE ITEMS
    public static final RegistryObject<Item> TOPAZ_PICKAXE = ITEMS.register("topaz_pickaxe",
            () -> new PickaxeItem(ModToolTiers.TOPAZ, 1, -2.8F, new Item.Properties()));

    public static final RegistryObject<Item> BRONZE_PICKAXE = ITEMS.register("bronze_pickaxe",
            () -> new PickaxeItem(ModToolTiers.BRONZE, 1, -2.8F, new Item.Properties()));

    public static final RegistryObject<Item> PERIDOT_PICKAXE = ITEMS.register("peridot_pickaxe",
            () -> new PickaxeItem(ModToolTiers.PERIDOT, 1, -2.8F, new Item.Properties()));

    public static final RegistryObject<Item> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe",
            () -> new PickaxeItem(ModToolTiers.RUBY, 1, -2.8F, new Item.Properties()));

    public static final RegistryObject<Item> SAPPHIRE_PICKAXE = ITEMS.register("sapphire_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SAPPHIRE, 1, -2.8F, new Item.Properties()));

    public static final RegistryObject<Item> RQ_PICKAXE = ITEMS.register("rq_pickaxe",
            () -> new RQPickaxeItem(ModToolTiers.RQ, 1, -2.8F, new Item.Properties().fireResistant().rarity(Rarity.RARE)));


    //HOE ITEMS
    public static final RegistryObject<Item> TOPAZ_HOE = ITEMS.register("topaz_hoe",
            () -> new HoeItem(ModToolTiers.TOPAZ, -1, -1.5F, new Item.Properties()));

    public static final RegistryObject<Item> BRONZE_HOE = ITEMS.register("bronze_hoe",
            () -> new HoeItem(ModToolTiers.BRONZE, -2, -1.0F, new Item.Properties()));

    public static final RegistryObject<Item> PERIDOT_HOE = ITEMS.register("peridot_hoe",
            () -> new HoeItem(ModToolTiers.PERIDOT, -3, -0.5F, new Item.Properties()));

    public static final RegistryObject<Item> RUBY_HOE = ITEMS.register("ruby_hoe",
            () -> new HoeItem(ModToolTiers.RUBY, -3, 0.0F, new Item.Properties()));

    public static final RegistryObject<Item> SAPPHIRE_HOE = ITEMS.register("sapphire_hoe",
            () -> new HoeItem(ModToolTiers.SAPPHIRE, -3, 0-0F, new Item.Properties()));

    public static final RegistryObject<Item> RQ_HOE = ITEMS.register("rq_hoe",
            () -> new RQHoeItem(ModToolTiers.RQ, -5, 1.0F, new Item.Properties().fireResistant().rarity(Rarity.RARE)));


    //SHOVEL ITEMS
    public static final RegistryObject<Item> TOPAZ_SHOVEL = ITEMS.register("topaz_shovel",
            () -> new ShovelItem(ModToolTiers.TOPAZ, 1.5F, -3.0F, new Item.Properties()));

    public static final RegistryObject<Item> BRONZE_SHOVEL = ITEMS.register("bronze_shovel",
            () -> new ShovelItem(ModToolTiers.BRONZE, 1.5F, -3.0F, new Item.Properties()));

    public static final RegistryObject<Item> PERIDOT_SHOVEL = ITEMS.register("peridot_shovel",
            () -> new ShovelItem(ModToolTiers.PERIDOT, 1.5F, -3.0F, new Item.Properties()));

    public static final RegistryObject<Item> RUBY_SHOVEL = ITEMS.register("ruby_shovel",
            () -> new ShovelItem(ModToolTiers.RUBY, 1.5F, -3.0F, new Item.Properties()));

    public static final RegistryObject<Item> SAPPHIRE_SHOVEL = ITEMS.register("sapphire_shovel",
            () -> new ShovelItem(ModToolTiers.SAPPHIRE, 1.5F, -3.0F, new Item.Properties()));

    public static final RegistryObject<Item> RQ_SHOVEL = ITEMS.register("rq_shovel",
            () -> new RQShovelItem(ModToolTiers.RQ, 1.5F, -3.0F, new Item.Properties().fireResistant().rarity(Rarity.RARE)));


    //BLOCK ITEMS
    public static final RegistryObject<BlockItem> AMBER_BLOCK = ITEMS.register("amber_block",
            () -> new BlockItem(ModBlocks.AMBER_BLOCK.get(), new Item.Properties().fireResistant()));

    public static final RegistryObject<BlockItem> AMBER_ROCKS = ITEMS.register("amber_rocks",
            () -> new BlockItem(ModBlocks.AMBER_ROCKS.get(), new Item.Properties().fireResistant()));

    public static final RegistryObject<BlockItem> CHOCOLATE_CAKE = ITEMS.register("chocolate_cake",
            () -> new BlockItem(ModBlocks.CHOCOLATE_CAKE.get(), new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> DUSKY_SIGN = ITEMS.register("dusky_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.DUSKY_SIGN.get(), ModBlocks.DUSKY_WALL_SIGN.get()));

    public static final RegistryObject<Item> DUSKY_HANGING_SIGN = ITEMS.register("dusky_hanging_sign",
            () -> new HangingSignItem(ModBlocks.DUSKY_HANGING_SIGN.get(), ModBlocks.DUSKY_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<BlockItem> RQ_BLOCK = ITEMS.register("rq_block",
            () -> new BlockItem(ModBlocks.RQ_BLOCK.get(), new Item.Properties().fireResistant().rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<Item> VERA_SIGN = ITEMS.register("vera_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.VERA_SIGN.get(), ModBlocks.VERA_WALL_SIGN.get()));

    public static final RegistryObject<Item> VERA_HANGING_SIGN = ITEMS.register("vera_hanging_sign",
            () -> new HangingSignItem(ModBlocks.VERA_HANGING_SIGN.get(), ModBlocks.VERA_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<BlockItem> FLOWERING_LILY_PAD = ITEMS.register("flowering_lily_pad",
            () -> new PlaceOnWaterBlockItem(ModBlocks.FLOWERING_LILY_PAD.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> STRAWBERRY_CAKE = ITEMS.register("strawberry_cake",
            () -> new BlockItem(ModBlocks.STRAWBERRY_CAKE.get(), new Item.Properties().stacksTo(1)));

    public static final RegistryObject<BlockItem> VANILLA_CAKE = ITEMS.register("vanilla_cake",
            () -> new BlockItem(ModBlocks.VANILLA_CAKE.get(), new Item.Properties().stacksTo(1)));



    public static void register(IEventBus bus){
        ITEMS.register(bus);
    }
}
