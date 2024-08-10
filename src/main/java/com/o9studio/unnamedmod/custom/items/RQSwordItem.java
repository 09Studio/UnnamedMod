package com.o9studio.unnamedmod.custom.items;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class RQSwordItem extends SwordItem {
    public RQSwordItem(Tier tier, int v, float v1, Properties properties) {
        super(tier, v, v1, properties);
    }

    @Override
    public boolean isFoil(ItemStack itemStack) {
        return true;
    }
}
