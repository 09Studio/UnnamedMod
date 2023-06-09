package com.o9studio.unnamedmod.core;

import com.o9studio.unnamedmod.UnnamedMod;
import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPaintings {
    public static final DeferredRegister<PaintingVariant> PAINTING_VARIANTS = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS , UnnamedMod.MOD_ID);

    //SMALL PAINTINGS


    //MEDIUM PAINTINGS
    public static final RegistryObject<PaintingVariant> FAILED = PAINTING_VARIANTS.register("failed",
            () -> new PaintingVariant(16, 32));

    public static final RegistryObject<PaintingVariant> KBY = PAINTING_VARIANTS.register("kby",
            () -> new PaintingVariant(32, 16));

    public static final RegistryObject<PaintingVariant> LISTC = PAINTING_VARIANTS.register("listc",
            () -> new PaintingVariant(32, 16));


    //LARGE PAINTINGS



    public static void register(IEventBus eventBus) { PAINTING_VARIANTS.register(eventBus); }
}
