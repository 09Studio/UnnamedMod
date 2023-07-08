package com.o9studio.unnamedmod.custom.items;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class FoodItems {
    public static final FoodProperties BLUEBERRIES = new FoodProperties.Builder().nutrition(2).saturationMod(0.1F).build();

    public static final FoodProperties BLUEBERRY_PIE = new FoodProperties.Builder().nutrition(8).saturationMod(0.3F).build();

    public static final FoodProperties BLUEBERRY_SMOOTHIE = new FoodProperties.Builder().nutrition(5).saturationMod(0.8F).alwaysEat().build();

    public static final FoodProperties CHOCOLATE = new FoodProperties.Builder().nutrition(5).saturationMod(0.9F)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200, 1), 0.7F)
            .effect(() -> new MobEffectInstance(MobEffects.JUMP, 100, 0), 0.5F)
            .effect(() -> new MobEffectInstance(MobEffects.HARM, 10, 0), 0.1f).build();

    public static final FoodProperties CHOCOLATE_SMOOTHIE = new FoodProperties.Builder().nutrition(5).saturationMod(0.8F).alwaysEat().build();

    public static final FoodProperties COOKED_TROPICAL_FISH = new FoodProperties.Builder().nutrition(5).saturationMod(0.6F).build();

    public static final FoodProperties DARKBERRIES = new FoodProperties.Builder().nutrition(2).saturationMod(0.2F)
            .effect(() -> new MobEffectInstance(MobEffects.DARKNESS, 100, 0), 0.3F).build();

    public static final FoodProperties DARKBERRY_SMOOTHIE = new FoodProperties.Builder().nutrition(5).saturationMod(0.8F).alwaysEat().build();

    public static final FoodProperties JADE_VINE_FRUIT = new FoodProperties.Builder().nutrition(5).saturationMod(0.4F).build();

    public static final FoodProperties JADE_VINE_SMOOTHIE = new FoodProperties.Builder().nutrition(5).saturationMod(0.8F).alwaysEat().build();

    public static final FoodProperties LETTUCE = new FoodProperties.Builder().nutrition(2).saturationMod(0.3F).build();

    public static final FoodProperties MOON_FRUIT = new FoodProperties.Builder().nutrition(4).saturationMod(0.5F)
            .effect(() -> new MobEffectInstance(MobEffects.LEVITATION, 100, 0), 0.6F).build();

    public static final FoodProperties MOON_SMOOTHIE = new FoodProperties.Builder().nutrition(5).saturationMod(0.8F).alwaysEat().build();

    public static final FoodProperties RED_BELL_PEPPER = new FoodProperties.Builder().nutrition(2).saturationMod(0.3F)
            .effect(() -> new MobEffectInstance(MobEffects.HARM, 10, 0), 0.2F).build();

    public static final FoodProperties SALAD = new FoodProperties.Builder().nutrition(6).saturationMod(0.5F).build();

    public static final FoodProperties STRAWBERRY = new FoodProperties.Builder().nutrition(3).saturationMod(0.3F).build();

    public static final FoodProperties STRAWBERRY_SMOOTHIE = new FoodProperties.Builder().nutrition(5).saturationMod(0.8F).alwaysEat().build();

    public static final FoodProperties STRAWBERRIES_WITH_MILK = new FoodProperties.Builder().nutrition(6).saturationMod(0.6F).build();

    public static final FoodProperties SWEET_BERRY_PIE = new FoodProperties.Builder().nutrition(8).saturationMod(0.3F).build();

    public static final FoodProperties SWEET_BERRY_SMOOTHIE = new FoodProperties.Builder().nutrition(5).saturationMod(0.8F).alwaysEat().build();

    public static final FoodProperties TACO = new FoodProperties.Builder().nutrition(8).saturationMod(0.8F).build();

    public static final FoodProperties TOMATO = new FoodProperties.Builder().nutrition(4).saturationMod(0.2F).build();

    public static final FoodProperties ROASTED_RED_BELL_PEPPER = new FoodProperties.Builder().nutrition(4).saturationMod(0.4F).build();

    public static final FoodProperties ROTTEN_TOMATO = new FoodProperties.Builder().nutrition(1).saturationMod(0.3F)
            .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 50, 0), 0.8f).build();

    public static final FoodProperties VANILLA_COOKIE = new FoodProperties.Builder().nutrition(2).saturationMod(0.1F).build();

    public static final FoodProperties VANILLA_SMOOTHIE = new FoodProperties.Builder().nutrition(5).saturationMod(0.8F).alwaysEat().build();

    public static final FoodProperties VEGETABLE_SOUP = buildStew().build();


    private static FoodProperties.Builder buildStew() {
        return (new FoodProperties.Builder()).nutrition(7).saturationMod(0.6F);
    }
}
