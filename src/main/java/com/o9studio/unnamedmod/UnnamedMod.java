package com.o9studio.unnamedmod;

import com.mojang.logging.LogUtils;
import com.o9studio.unnamedmod.core.*;
import com.o9studio.unnamedmod.custom.ModTabs;
import com.o9studio.unnamedmod.custom.entities.SignsWoodTypes;
import com.o9studio.unnamedmod.events.ItemsOnComposter;
import com.o9studio.unnamedmod.util.BetterBrewingRecipe;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.client.renderer.blockentity.SignRenderer;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(UnnamedMod.MOD_ID)
public class UnnamedMod
{
    public static final String MOD_ID = "unnamedmod";
    private static final Logger LOGGER = LogUtils.getLogger();

    public UnnamedMod()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModPaintings.PAINTING_VARIANTS.register(modEventBus);
        ModPotions.register(modEventBus);
        ModEntityBlocks.register(modEventBus);

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
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.GLOOMY_SPROUT.getId(), ModBlocks.POTTED_GLOOMY_SPROUT);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.GREEN_DAYLILY.getId(), ModBlocks.POTTED_GREEN_DAYLILY);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.PURPLE_ORCHID.getId(), ModBlocks.POTTED_PURPLE_ORCHID);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.ROSE.getId(), ModBlocks.POTTED_ROSE);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.VANILLA.getId(), ModBlocks.POTTED_VANILLA);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.WHITE_ROSE.getId(), ModBlocks.POTTED_WHITE_ROSE);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.DUSKY_SAPLING.getId(), ModBlocks.POTTED_DUSKY_SAPLING);

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

            Sheets.addWoodType(SignsWoodTypes.DUSKY);
        });
    }

    private void addCreative(CreativeModeTabEvent.BuildContents event)
    {
        if (event.getTab() == ModTabs.GREENERY_TAB){
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
            event.accept(ModBlocks.AFRICAN_DAISY);
            event.accept(ModBlocks.BLACK_IRIS);
            event.accept(ModBlocks.BLUE_JASMIN);
            event.accept(ModBlocks.BROWN_DAYLILY);
            event.accept(ModBlocks.FLOWERING_LILY_PAD);
            event.accept(ModBlocks.GLOOMY_SPROUT);
            event.accept(ModBlocks.GLOOMLIGHT);
            event.accept(ModBlocks.GREEN_DAYLILY);
            event.accept(ModBlocks.MYCELIUM_GRASS);
            event.accept(ModBlocks.PURPLE_ORCHID);
            event.accept(ModBlocks.ROSE);
            event.accept(ModBlocks.VANILLA);
            event.accept(ModBlocks.WHITE_ROSE);
            event.accept(ModBlocks.DUSKY_SAPLING);
            event.accept(ModBlocks.DUSKY_LOG);
            event.accept(ModBlocks.STRIPPED_DUSKY_LOG);
            event.accept(ModBlocks.DUSKY_WOOD);
            event.accept(ModBlocks.STRIPPED_DUSKY_WOOD);
            event.accept(ModBlocks.DUSKY_LEAVES);
            event.accept(ModBlocks.DUSKY_PLANKS);
            event.accept(ModBlocks.DUSKY_SLAB);
            event.accept(ModBlocks.DUSKY_STAIRS);
            event.accept(ModBlocks.DUSKY_FENCE);
            event.accept(ModBlocks.DUSKY_FENCE_GATE);
            event.accept(ModItems.DUSKY_SIGN);
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
            event.accept(ModBlocks.NETHER_WART_WALL);
            event.accept(ModBlocks.WARPED_WART_WALL);
        }

        if (event.getTab() == ModTabs.CRYSTALS_TAB){
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
            event.accept(ModBlocks.DEEPSLATE_PERIDOT_ORE);
            event.accept(ModItems.RAW_PERIDOT);
            event.accept(ModItems.PERIDOT);
            event.accept(ModBlocks.PERIDOT_BLOCK);
            event.accept(ModBlocks.RQ_ORE);
            event.accept(ModItems.RAW_RQ);
            event.accept(ModItems.RQ);
            event.accept(ModBlocks.RQ_BLOCK);
            event.accept(ModBlocks.RUBY_ORE);
            event.accept(ModBlocks.DEEPSLATE_RUBY_ORE);
            event.accept(ModItems.RAW_RUBY);
            event.accept(ModItems.RUBY);
            event.accept(ModBlocks.RUBY_BLOCK);
            event.accept(ModBlocks.SAPPHIRE_ORE);
            event.accept(ModBlocks.DEEPSLATE_SAPPHIRE_ORE);
            event.accept(ModItems.RAW_SAPPHIRE);
            event.accept(ModItems.SAPPHIRE);
            event.accept(ModBlocks.SAPPHIRE_BLOCK);
            event.accept(ModBlocks.TOPAZ_ORE);
            event.accept(ModBlocks.DEEPSLATE_TOPAZ_ORE);
            event.accept(ModItems.RAW_TOPAZ);
            event.accept(ModItems.TOPAZ);
            event.accept(ModBlocks.TOPAZ_BLOCK);
            event.accept(ModItems.RAW_QUARTZ);
        }
    }


    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            WoodType.register(SignsWoodTypes.DUSKY);
            BlockEntityRenderers.register(ModEntityBlocks.SIGN_BLOCK_ENTITIES.get(), SignRenderer::new);
        }
    }
}
