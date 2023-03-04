package com.o9studio.unnamedmod;

import com.mojang.logging.LogUtils;
import com.o9studio.unnamedmod.core.ModCrystalBlocks;
import com.o9studio.unnamedmod.core.ModCrystalItems;
import com.o9studio.unnamedmod.core.ModGreeneryBlocks;
import com.o9studio.unnamedmod.core.ModGreeneryItems;
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

        ModGreeneryItems.register(modEventBus);
        ModGreeneryBlocks.register(modEventBus);
        ModCrystalItems.register(modEventBus);
        ModCrystalBlocks.register(modEventBus);

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
            event.accept(ModGreeneryItems.WHAT_ITEM);
            event.accept(ModGreeneryBlocks.NOP_BLOCK);
        }

        if (event.getTab() == ModTabs.CRYSTALS_TAB){
            event.accept(ModCrystalItems.AMBER_FRAGMENT);
            event.accept(ModCrystalItems.AMBER);
            event.accept(ModCrystalBlocks.AMBER_BLOCK);
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
