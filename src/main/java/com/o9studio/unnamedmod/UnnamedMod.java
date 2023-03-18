package com.o9studio.unnamedmod;

import com.mojang.logging.LogUtils;
import com.o9studio.unnamedmod.core.ModBlocks;
import com.o9studio.unnamedmod.core.ModItems;
import com.o9studio.unnamedmod.custom.ModTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
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

        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
    }

    private void addCreative(CreativeModeTabEvent.BuildContents event)
    {
        if (event.getTab() == ModTabs.GREENERY_TAB){
            event.accept(ModItems.WHAT_ITEM);
            event.accept(ModBlocks.NOP_BLOCK);
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
            event.accept(ModBlocks.CUT_BRONZE);
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

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
        }
    }
}
