package com.o9studio.unnamedmod.custom.items;

import com.o9studio.unnamedmod.core.ModItems;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class GlassJarItem extends Item {
    public GlassJarItem(Item.Properties properties) {
        super(properties);
    }

    public ItemStack finishUsingItem(ItemStack itemStack, Level level, LivingEntity livingEntity) {
        ItemStack itemstack = super.finishUsingItem(itemStack, level, livingEntity);
        return livingEntity instanceof Player && ((Player)livingEntity).getAbilities().instabuild ? itemstack : new ItemStack(ModItems.GLASS_JAR.get());
    }
}