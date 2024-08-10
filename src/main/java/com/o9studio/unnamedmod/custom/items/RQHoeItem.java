package com.o9studio.unnamedmod.custom.items;

import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;

public class RQHoeItem extends HoeItem {
    public RQHoeItem(Tier tier, int v, float v1, Properties properties) {
        super(tier, v, v1, properties);
    }

    @Override
    public boolean isFoil(ItemStack itemStack) {
        return true;
    }
}
