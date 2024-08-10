package com.o9studio.unnamedmod.custom.items;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Tier;

public class RQShovelItem extends ShovelItem {
    public RQShovelItem(Tier tier, float v, float v1, Properties properties) {
        super(tier, v, v1, properties);
    }

    @Override
    public boolean isFoil(ItemStack itemStack) {
        return true;
    }
}
