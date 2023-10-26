package com.o9studio.unnamedmod.core;

import com.google.common.collect.ImmutableSet;
import com.o9studio.unnamedmod.UnnamedMod;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.util.ObfuscationReflectionHelper;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.lang.reflect.InvocationTargetException;

public class ModVillagers {
    public static final DeferredRegister<PoiType> POI_TYPES =
            DeferredRegister.create(ForgeRegistries.POI_TYPES, UnnamedMod.MOD_ID);
    public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSIONS =
            DeferredRegister.create(ForgeRegistries.VILLAGER_PROFESSIONS, UnnamedMod.MOD_ID);

    public static final RegistryObject<PoiType> CRYSTAL_POI = POI_TYPES.register("crystal_poi",
            () -> new PoiType(ImmutableSet.copyOf(ModBlocks.CRYSTAL_TABLE.get().getStateDefinition().getPossibleStates()),
                    1, 1));

    public static final RegistryObject<VillagerProfession> CRYSTAL_MASTER =
            VILLAGER_PROFESSIONS.register("crystal_master", () -> new VillagerProfession("crystal_master",
                    holder -> holder.get() == CRYSTAL_POI.get(), holder -> holder.get() == CRYSTAL_POI.get(),
                    ImmutableSet.of(), ImmutableSet.of(), SoundEvents.VILLAGER_WORK_ARMORER));

    public static void register(IEventBus eventBus) {
        POI_TYPES.register(eventBus);
        VILLAGER_PROFESSIONS.register(eventBus);
    }
}