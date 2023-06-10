package com.o9studio.unnamedmod.core;

import com.o9studio.unnamedmod.UnnamedMod;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPotions {

    public static final DeferredRegister<Potion> POTIONS
            = DeferredRegister.create(ForgeRegistries.POTIONS, UnnamedMod.MOD_ID);

    public static final RegistryObject<Potion> DECAY = POTIONS.register("decay",
            () -> new Potion(new MobEffectInstance(MobEffects.WITHER, 800, 1)));

    public static final RegistryObject<Potion> GLOW = POTIONS.register("glow",
            () -> new Potion(new MobEffectInstance(MobEffects.GLOWING, 3600, 0)));

    public static final RegistryObject<Potion> LONG_GLOW = POTIONS.register("long_glow",
            () -> new Potion(new MobEffectInstance(MobEffects.GLOWING, 9600, 0)));

    public static final RegistryObject<Potion> DARKNESS = POTIONS.register("darkness",
            () -> new Potion(new MobEffectInstance(MobEffects.DARKNESS, 3600, 0)));

    public static final RegistryObject<Potion> LONG_DARKNESS = POTIONS.register("long_darkness",
            () -> new Potion(new MobEffectInstance(MobEffects.DARKNESS, 9600, 0)));


    public static void register(IEventBus eventBus) {
        POTIONS.register(eventBus);
    }
}
