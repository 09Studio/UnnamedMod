package com.o9studio.unnamedmod.events;

import com.o9studio.unnamedmod.UnnamedMod;
import com.o9studio.unnamedmod.core.ModBlocks;
import com.o9studio.unnamedmod.core.ModItems;
import com.o9studio.unnamedmod.core.ModVillagers;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber(modid = UnnamedMod.MOD_ID)
public class ModEvents {

    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent event) {

        if(event.getType() == ModVillagers.CRYSTAL_MASTER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            //NOVICE
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.COPPER_POLISHER.get(), 1),
                    new ItemStack(ModItems.AMBER.get(), 3),3,4,0.05F));

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.RAW_PERIDOT.get(), 6),
                    new ItemStack(ModItems.AMBER.get(), 3),12,2,0.05F));

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.AMBER.get(), 4),
                    new ItemStack(ModItems.RAW_TOPAZ.get(), 5),16,1,0.05F));

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.AMBER.get(), 3),
                    new ItemStack(ModItems.RAW_SAPPHIRE.get(), 4),3,2,0.05F));

            //APPRENTICE
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.RUBY.get(), 1),
                    new ItemStack(ModItems.AMBER.get(), 4),12,5,0.05F));

            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.AMBER_FRAGMENT.get(), 5),
                    new ItemStack(ModItems.RAW_RUBY.get(), 6),3,5,0.05F));

            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.AMBER.get(), 4),
                    new ItemStack(ModItems.RAW_EMERALD.get(), 6),12,10,0.05F));

            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.AMBER.get(), 4),
                    new ItemStack(ModItems.RAW_QUARTZ.get(), 10),3,10,0.05F));

            //JOURNEYMAN
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.DIAMOND_POLISHER.get(), 1),
                    new ItemStack(ModItems.AMBER.get(), 5),12,7,0.05F));

            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.RAW_DIAMOND.get(), 2),
                    new ItemStack(ModItems.AMBER_FRAGMENT.get(), 4),3,15,0.05F));

            //EXPERT
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.DIAMOND, 3),
                    new ItemStack(ModItems.AMBER.get(), 5),3,7,0.05F));

            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.RAW_TOPAZ.get(), 7),
                    new ItemStack(Items.QUARTZ, 5),8,10,0.05F));

            //MASTER
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.RQ.get(), 1),
                    new ItemStack(ModItems.AMBER_FRAGMENT.get(), 30),3,15,0.05F));

            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModBlocks.SAPPHIRE_BLOCK.get(), 2),
                    new ItemStack(ModItems.AMBER.get(), 5),8,10,0.05F));
        }

        //OTHERS
        if(event.getType() == VillagerProfession.BUTCHER) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            //NOVICE
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(ModItems.BLUEBERRIES.get(), 10),12,30,0.05F));
        }

        if(event.getType() == VillagerProfession.FARMER) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            //NOVICE
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(ModItems.LETTUCE.get(), 20),16,2,0.05F));

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(ModItems.TOMATO.get(), 26),16,2,0.05F));

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(ModItems.RED_BELL_PEPPER.get(), 5),16,2,0.05F));

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(ModItems.VANILLA_BEANS.get(), 20),16,2,0.05F));
        }
    }
}
