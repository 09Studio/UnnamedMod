package com.o9studio.unnamedmod;

import com.mojang.logging.LogUtils;
import com.o9studio.unnamedmod.core.*;
import com.o9studio.unnamedmod.custom.ModTabs;
import com.o9studio.unnamedmod.custom.screens.CrystalTableScreen;
import com.o9studio.unnamedmod.events.ItemsOnComposter;
import com.o9studio.unnamedmod.util.BetterBrewingRecipe;
import com.o9studio.unnamedmod.util.ModWoodTypes;
import com.o9studio.unnamedmod.util.renderers.BoatsRenderer;
import com.o9studio.unnamedmod.world.ModLootModifier;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.client.renderer.blockentity.SignRenderer;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import software.bernie.geckolib.GeckoLib;

@Mod(UnnamedMod.MOD_ID)
public class UnnamedMod
{
    public static final String MOD_ID = "unnamedmod";
    private static final Logger LOGGER = LogUtils.getLogger();

    public UnnamedMod()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModTabs.register(modEventBus);
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModPaintings.PAINTING_VARIANTS.register(modEventBus);
        ModPotions.register(modEventBus);
        ModEntities.register(modEventBus);
        ModEntityBlocks.register(modEventBus);
        ModMenus.register(modEventBus);
        ModRecipes.register(modEventBus);
        ModVillagers.register(modEventBus);
        ModLootModifier.register(modEventBus);

        GeckoLib.initialize();

        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        ItemsOnComposter.register();

        event.enqueueWork(() -> {
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.AFRICAN_DAISY.getId(), ModBlocks.POTTED_AFRICAN_DAISY);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.BLACK_IRIS.getId(), ModBlocks.POTTED_BLACK_IRIS);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.BLUE_JASMIN.getId(), ModBlocks.POTTED_BLUE_JASMIN);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.BROWN_DAYLILY.getId(), ModBlocks.POTTED_BROWN_DAYLILY);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.CYCLAMEN.getId(), ModBlocks.POTTED_CYCLAMEN);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.GLOOMY_SPROUT.getId(), ModBlocks.POTTED_GLOOMY_SPROUT);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.GREEN_DAYLILY.getId(), ModBlocks.POTTED_GREEN_DAYLILY);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.HIBISCUS.getId(), ModBlocks.POTTED_HIBISCUS);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.PURPLE_ORCHID.getId(), ModBlocks.POTTED_PURPLE_ORCHID);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.ROSE.getId(), ModBlocks.POTTED_ROSE);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.SUNDROP.getId(), ModBlocks.POTTED_SUNDROP);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.VANILLA.getId(), ModBlocks.POTTED_VANILLA);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.WHITE_ROSE.getId(), ModBlocks.POTTED_WHITE_ROSE);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.DUSKY_SAPLING.getId(), ModBlocks.POTTED_DUSKY_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.VERA_SAPLING.getId(), ModBlocks.POTTED_VERA_SAPLING);

            BrewingRecipeRegistry.addRecipe(new BetterBrewingRecipe(Potions.THICK,
                    Items.WITHER_ROSE, ModPotions.DECAY.get()));

            BrewingRecipeRegistry.addRecipe(new BetterBrewingRecipe(Potions.AWKWARD,
                    Items.GLOW_BERRIES, ModPotions.GLOW.get()));

            BrewingRecipeRegistry.addRecipe(new BetterBrewingRecipe(ModPotions.GLOW.get(),
                    Items.REDSTONE, ModPotions.LONG_GLOW.get()));

            BrewingRecipeRegistry.addRecipe(new BetterBrewingRecipe(Potions.AWKWARD,
                    ModItems.DARKBERRIES.get(), ModPotions.DARKNESS.get()));

            BrewingRecipeRegistry.addRecipe(new BetterBrewingRecipe(ModPotions.DARKNESS.get(),
                    Items.REDSTONE, ModPotions.LONG_DARKNESS.get()));

            BrewingRecipeRegistry.addRecipe(new BetterBrewingRecipe(Potions.AWKWARD,
                    ModItems.MOON_FRUIT.get(), ModPotions.LEVITATION.get()));

            BrewingRecipeRegistry.addRecipe(new BetterBrewingRecipe(ModPotions.LEVITATION.get(),
                    Items.REDSTONE, ModPotions.LONG_LEVITATION.get()));

            BrewingRecipeRegistry.addRecipe(new BetterBrewingRecipe(ModPotions.LEVITATION.get(),
                    Items.GLOWSTONE_DUST, ModPotions.STRONG_LEVITATION.get()));
        });
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {
        if (event.getTab() == ModTabs.GREENERY_TAB.get()){
            event.accept(ModItems.WHAT_ITEM);
            event.accept(ModBlocks.NOP_BLOCK);
            event.accept(ModBlocks.COPPER_BARS);
            event.accept(ModBlocks.GOLD_BARS);
            event.accept(ModItems.GLASS_JAR);
            event.accept(ModItems.BLUEBERRIES);
            event.accept(ModItems.BLUEBERRY_PIE);
            event.accept(ModItems.BLUEBERRY_SMOOTHIE);
            event.accept(ModItems.CHOCOLATE);
            event.accept(ModItems.CHOCOLATE_SMOOTHIE);
            event.accept(ModBlocks.CHOCOLATE_CAKE);
            event.accept(ModItems.COOKED_TROPICAL_FISH);
            event.accept(ModItems.DARKBERRIES);
            event.accept(ModItems.DARKBERRY_SMOOTHIE);
            event.accept(ModItems.JADE_VINE_FRUIT);
            event.accept(ModItems.JADE_VINE_SMOOTHIE);
            event.accept(ModItems.LETTUCE_SEEDS);
            event.accept(ModItems.LETTUCE);
            event.accept(ModItems.MOON_FRUIT);
            event.accept(ModItems.MOON_SMOOTHIE);
            event.accept(ModItems.RED_BELL_PEPPER_SEEDS);
            event.accept(ModItems.RED_BELL_PEPPER);
            event.accept(ModItems.ROASTED_RED_BELL_PEPPER);
            event.accept(ModItems.SALAD);
            event.accept(ModItems.STRAWBERRY);
            event.accept(ModItems.STRAWBERRY_SMOOTHIE);
            event.accept(ModItems.STRAWBERRIES_WITH_MILK);
            event.accept(ModBlocks.STRAWBERRY_CAKE);
            event.accept(ModItems.SWEET_BERRY_PIE);
            event.accept(ModItems.SWEET_BERRY_SMOOTHIE);
            event.accept(ModItems.TACO);
            event.accept(ModItems.TOMATO_SEEDS);
            event.accept(ModItems.TOMATO);
            event.accept(ModItems.ROTTEN_TOMATO);
            event.accept(ModItems.VANILLA_BEANS);
            event.accept(ModItems.VANILLA_COOKIE);
            event.accept(ModItems.VANILLA_SMOOTHIE);
            event.accept(ModBlocks.VANILLA_CAKE);
            event.accept(ModItems.VEGETABLE_SOUP);
            event.accept(ModBlocks.DUSKY_SAPLING);
            event.accept(ModBlocks.DUSKY_LOG);
            event.accept(ModBlocks.STRIPPED_DUSKY_LOG);
            event.accept(ModBlocks.DUSKY_WOOD);
            event.accept(ModBlocks.STRIPPED_DUSKY_WOOD);
            event.accept(ModBlocks.DUSKY_LEAVES);
            event.accept(ModBlocks.DUSKY_PLANKS);
            event.accept(ModBlocks.DUSKY_STAIRS);
            event.accept(ModBlocks.DUSKY_SLAB);
            event.accept(ModBlocks.DUSKY_FENCE);
            event.accept(ModBlocks.DUSKY_FENCE_GATE);
            event.accept(ModBlocks.DUSKY_DOOR);
            event.accept(ModBlocks.DUSKY_TRAPDOOR);
            event.accept(ModBlocks.DUSKY_PRESSURE_PLATE);
            event.accept(ModBlocks.DUSKY_BUTTON);
            event.accept(ModItems.DUSKY_SIGN);
            event.accept(ModItems.DUSKY_HANGING_SIGN);
            event.accept(ModItems.DUSKY_BOAT);
            event.accept(ModItems.DUSKY_CHEST_BOAT);
            event.accept(ModBlocks.VERA_SAPLING);
            event.accept(ModBlocks.VERA_LOG);
            event.accept(ModBlocks.STRIPPED_VERA_LOG);
            event.accept(ModBlocks.VERA_WOOD);
            event.accept(ModBlocks.STRIPPED_VERA_WOOD);
            event.accept(ModBlocks.VERA_LEAVES);
            event.accept(ModBlocks.VERA_PLANKS);
            event.accept(ModBlocks.VERA_STAIRS);
            event.accept(ModBlocks.VERA_SLAB);
            event.accept(ModBlocks.VERA_FENCE);
            event.accept(ModBlocks.VERA_FENCE_GATE);
            event.accept(ModBlocks.VERA_DOOR);
            event.accept(ModBlocks.VERA_TRAPDOOR);
            event.accept(ModBlocks.VERA_PRESSURE_PLATE);
            event.accept(ModBlocks.VERA_BUTTON);
            event.accept(ModItems.VERA_SIGN);
            event.accept(ModItems.VERA_HANGING_SIGN);
            event.accept(ModItems.VERA_BOAT);
            event.accept(ModItems.VERA_CHEST_BOAT);
            event.accept(ModBlocks.AFRICAN_DAISY);
            event.accept(ModBlocks.BLACK_IRIS);
            event.accept(ModBlocks.BLUE_JASMIN);
            event.accept(ModBlocks.BROWN_DAYLILY);
            event.accept(ModBlocks.CLOVER);
            event.accept(ModBlocks.CYCLAMEN);
            event.accept(ModBlocks.FLOWERING_LILY_PAD);
            event.accept(ModBlocks.GLOOMY_SPROUT);
            event.accept(ModBlocks.GLOOMLIGHT);
            event.accept(ModBlocks.GREEN_DAYLILY);
            event.accept(ModBlocks.HIBISCUS);
            event.accept(ModBlocks.LAVENDER);
            event.accept(ModBlocks.MYCELIUM_GRASS);
            event.accept(ModBlocks.PURPLE_ORCHID);
            event.accept(ModBlocks.ROSE);
            event.accept(ModBlocks.SUNDROP);
            event.accept(ModBlocks.VANILLA);
            event.accept(ModBlocks.WHITE_ROSE);
            event.accept(ModBlocks.SOUL_JACK_O_LANTERN);
            event.accept(ModBlocks.DIRE_MOLD);
            event.accept(ModBlocks.MOLDY_END_STONE_BRICKS);
            event.accept(ModBlocks.MOLDY_END_STONE_BRICK_STAIRS);
            event.accept(ModBlocks.MOLDY_END_STONE_BRICK_SLAB);
            event.accept(ModBlocks.MOLDY_END_STONE_BRICK_WALL);
            event.accept(ModItems.PAPER_FLOWER);
            event.accept(ModBlocks.WHITE_FLOWERED_VINES);
            event.accept(ModBlocks.LIGHT_GRAY_FLOWERED_VINES);
            event.accept(ModBlocks.GRAY_FLOWERED_VINES);
            event.accept(ModBlocks.BLACK_FLOWERED_VINES);
            event.accept(ModBlocks.BROWN_FLOWERED_VINES);
            event.accept(ModBlocks.RED_FLOWERED_VINES);
            event.accept(ModBlocks.ORANGE_FLOWERED_VINES);
            event.accept(ModBlocks.YELLOW_FLOWERED_VINES);
            event.accept(ModBlocks.LIME_FLOWERED_VINES);
            event.accept(ModBlocks.GREEN_FLOWERED_VINES);
            event.accept(ModBlocks.CYAN_FLOWERED_VINES);
            event.accept(ModBlocks.LIGHT_BLUE_FLOWERED_VINES);
            event.accept(ModBlocks.BLUE_FLOWERED_VINES);
            event.accept(ModBlocks.PURPLE_FLOWERED_VINES);
            event.accept(ModBlocks.MAGENTA_FLOWERED_VINES);
            event.accept(ModBlocks.PINK_FLOWERED_VINES);
            event.accept(ModBlocks.ACACIA_LEAVES_WALL);
            event.accept(ModBlocks.AZALEA_LEAVES_WALL);
            event.accept(ModBlocks.BIRCH_LEAVES_WALL);
            event.accept(ModBlocks.DARK_OAK_LEAVES_WALL);
            event.accept(ModBlocks.DUSKY_LEAVES_WALL);
            event.accept(ModBlocks.FLOWERING_AZALEA_LEAVES_WALL);
            event.accept(ModBlocks.JUNGLE_LEAVES_WALL);
            event.accept(ModBlocks.MANGROVE_LEAVES_WALL);
            event.accept(ModBlocks.OAK_LEAVES_WALL);
            event.accept(ModBlocks.SPRUCE_LEAVES_WALL);
            event.accept(ModBlocks.VERA_LEAVES_WALL);
            event.accept(ModBlocks.NETHER_WART_WALL);
            event.accept(ModBlocks.WARPED_WART_WALL);
        }

        if (event.getTab() == ModTabs.CRYSTALS_TAB.get()){
            event.accept(ModBlocks.CRYSTAL_TABLE);
            event.accept(ModItems.COPPER_POLISHER);
            event.accept(ModItems.IRON_POLISHER);
            event.accept(ModItems.DIAMOND_POLISHER);
            event.accept(ModBlocks.AMBER_ROCKS);
            event.accept(ModItems.AMBER_FRAGMENT);
            event.accept(ModItems.AMBER);
            event.accept(ModBlocks.AMBER_BLOCK);
            event.accept(ModItems.BRONZE_NUGGET);
            event.accept(ModItems.BRONZE_INGOT);
            event.accept(ModItems.BRONZE_ROD);
            event.accept(ModBlocks.BRONZE_BLOCK);
            event.accept(ModBlocks.BRONZE_BARS);
            event.accept(ModBlocks.CUT_BRONZE);
            event.accept(ModBlocks.CUT_BRONZE_SLAB);
            event.accept(ModBlocks.CUT_BRONZE_STAIRS);
            event.accept(ModItems.RAW_EMERALD);
            event.accept(ModItems.RAW_DIAMOND);
            event.accept(ModBlocks.PERIDOT_ORE);
            event.accept(ModItems.RAW_PERIDOT);
            event.accept(ModItems.PERIDOT);
            event.accept(ModBlocks.PERIDOT_BLOCK);
            event.accept(ModBlocks.RUBY_ORE);
            event.accept(ModItems.RAW_RUBY);
            event.accept(ModItems.RUBY);
            event.accept(ModBlocks.RUBY_BLOCK);
            event.accept(ModBlocks.SAPPHIRE_ORE);
            event.accept(ModItems.RAW_SAPPHIRE);
            event.accept(ModItems.SAPPHIRE);
            event.accept(ModBlocks.SAPPHIRE_BLOCK);
            event.accept(ModBlocks.TOPAZ_ORE);
            event.accept(ModItems.RAW_TOPAZ);
            event.accept(ModItems.TOPAZ);
            event.accept(ModBlocks.TOPAZ_BLOCK);
            event.accept(ModItems.RAW_QUARTZ);
            event.accept(ModBlocks.LARVIKITE);
            event.accept(ModBlocks.LARVIKITE_BRICKS);
            event.accept(ModBlocks.LARVIKITE_BRICK_SLAB);
            event.accept(ModBlocks.LARVIKITE_BRICK_STAIRS);
            event.accept(ModBlocks.LARVIKITE_BRICK_WALL);
            event.accept(ModItems.RAW_RQ);
            event.accept(ModItems.RQ);
            event.accept(ModBlocks.RQ_BLOCK);
        }
    }


    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            Sheets.addWoodType(ModWoodTypes.VERA);
            Sheets.addWoodType(ModWoodTypes.DUSKY);
            EntityRenderers.register(ModEntities.MOD_BOAT.get(), p_174010_ -> new BoatsRenderer(p_174010_, false));
            EntityRenderers.register(ModEntities.MOD_CHEST_BOAT.get(), p_174010_ -> new BoatsRenderer(p_174010_, true));

            MenuScreens.register(ModMenus.CRYSTAL_TABLE_MENU.get(), CrystalTableScreen::new);
        }
    }
}
