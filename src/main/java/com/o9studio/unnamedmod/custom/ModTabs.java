package com.o9studio.unnamedmod.custom;

import com.o9studio.unnamedmod.UnnamedMod;
import com.o9studio.unnamedmod.core.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MOD_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, UnnamedMod.MOD_ID);

    public static RegistryObject<CreativeModeTab> GREENERY_TAB = CREATIVE_MOD_TABS.register("greenery_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BLUEBERRY_SMOOTHIE.get()))
                    .title(Component.translatable("creativemodetab.greenery_tab")).build());

    public static RegistryObject<CreativeModeTab> CRYSTALS_TAB = CREATIVE_MOD_TABS.register("crystals_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.AMBER.get()))
                    .title(Component.translatable("creativemodetab.crystals_tab")).build());


    public static void  register(IEventBus eventBus) {
        CREATIVE_MOD_TABS.register(eventBus);
    }
}
