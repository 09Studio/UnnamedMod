package com.o9studio.unnamedmod.custom;

import com.o9studio.unnamedmod.UnnamedMod;
import com.o9studio.unnamedmod.core.ModCrystalItems;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = UnnamedMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModTabs {
    public static CreativeModeTab GREENERY_TAB;
    public static CreativeModeTab CRYSTALS_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        GREENERY_TAB = event.registerCreativeModeTab(new ResourceLocation(UnnamedMod.MOD_ID, "greenery_tab"),
                builder -> builder.icon(() -> new ItemStack(ModCrystalItems.AMBER.get())).title(Component.translatable("creativemodetab.greenery_tab")));

        CRYSTALS_TAB = event.registerCreativeModeTab(new ResourceLocation(UnnamedMod.MOD_ID, "crystals_tab"),
                builder -> builder.icon(() -> new ItemStack(ModCrystalItems.AMBER.get())).title(Component.translatable("creativemodetab.crystals_tab")));

    }
}
