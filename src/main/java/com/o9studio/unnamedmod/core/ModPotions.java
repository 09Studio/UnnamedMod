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

    public static final DeferredRegister<Potion> POTIONS = DeferredRegister.create(ForgeRegistries.POTIONS, UnnamedMod.MOD_ID);

    //NORMAL POTIONS
    public static final RegistryObject<Potion> DECAY = POTIONS.register("decay",
            () -> new Potion(new MobEffectInstance(MobEffects.WITHER, 800, 1)));

    public static final RegistryObject<Potion> GLOW = POTIONS.register("glow",
            () -> new Potion(new MobEffectInstance(MobEffects.GLOWING, 3600, 0)));

    public static final RegistryObject<Potion> DARKNESS = POTIONS.register("darkness",
            () -> new Potion(new MobEffectInstance(MobEffects.DARKNESS, 3600, 0)));

    public static final RegistryObject<Potion> LEVITATION = POTIONS.register("levitation",
            () -> new Potion(new MobEffectInstance(MobEffects.LEVITATION, 3600, 0)));


    //LONG POTIONS
    public static final RegistryObject<Potion> LONG_GLOW = POTIONS.register("long_glow",
            () -> new Potion(new MobEffectInstance(MobEffects.GLOWING, 9600, 0)));

    public static final RegistryObject<Potion> LONG_DARKNESS = POTIONS.register("long_darkness",
            () -> new Potion(new MobEffectInstance(MobEffects.DARKNESS, 9600, 0)));

    public static final RegistryObject<Potion> LONG_LEVITATION = POTIONS.register("long_levitation",
            () -> new Potion(new MobEffectInstance(MobEffects.LEVITATION, 9600, 0)));


    //POTIONS II
    public static final RegistryObject<Potion> STRONG_LEVITATION = POTIONS.register("strong_levitation",
            () -> new Potion(new MobEffectInstance(MobEffects.LEVITATION, 1800, 1)));


    public static void register(IEventBus eventBus) {
        POTIONS.register(eventBus);
    }
}
