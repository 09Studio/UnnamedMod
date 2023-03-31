package com.o9studio.unnamedmod.util.datageneration;

import com.o9studio.unnamedmod.core.ModBlocks;
import com.o9studio.unnamedmod.core.ModItems;
import com.o9studio.unnamedmod.custom.blocks.BlueBerryCropBlock;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    protected ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.NOP_BLOCK.get());


        add(ModBlocks.AMBER_ROCKS.get(),
                (block) -> createOreDrop(ModBlocks.AMBER_ROCKS.get(), ModItems.AMBER_FRAGMENT.get()));
        dropSelf(ModBlocks.AMBER_BLOCK.get());

        dropSelf(ModBlocks.BRONZE_BLOCK.get());
        dropSelf(ModBlocks.CUT_BRONZE.get());

        add(ModBlocks.PERIDOT_ORE.get(),
                (block) -> createOreDrop(ModBlocks.PERIDOT_ORE.get(), ModItems.RAW_PERIDOT.get()));
        add(ModBlocks.DEEPSLATE_PERIDOT_ORE.get(),
                (block) -> createOreDrop(ModBlocks.DEEPSLATE_PERIDOT_ORE.get(), ModItems.RAW_PERIDOT.get()));
        dropSelf(ModBlocks.PERIDOT_BLOCK.get());

        add(ModBlocks.RQ_ORE.get(),
                (block) -> createOreDrop(ModBlocks.RQ_ORE.get(), ModItems.RAW_RQ.get()));
        dropSelf(ModBlocks.RQ_BLOCK.get());

        add(ModBlocks.RUBY_ORE.get(),
                (block) -> createOreDrop(ModBlocks.RUBY_ORE.get(), ModItems.RAW_RUBY.get()));
        add(ModBlocks.DEEPSLATE_RUBY_ORE.get(),
                (block) -> createOreDrop(ModBlocks.DEEPSLATE_RUBY_ORE.get(), ModItems.RAW_RUBY.get()));
        dropSelf(ModBlocks.RUBY_BLOCK.get());

        add(ModBlocks.SAPPHIRE_ORE.get(),
                (block) -> createOreDrop(ModBlocks.SAPPHIRE_ORE.get(), ModItems.RAW_SAPPHIRE.get()));
        add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(),
                (block) -> createOreDrop(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(), ModItems.RAW_SAPPHIRE.get()));
        dropSelf(ModBlocks.SAPPHIRE_BLOCK.get());

        add(ModBlocks.TOPAZ_ORE.get(),
                (block) -> createOreDrop(ModBlocks.TOPAZ_ORE.get(), ModItems.RAW_TOPAZ.get()));
        add(ModBlocks.DEEPSLATE_TOPAZ_ORE.get(),
                (block) -> createOreDrop(ModBlocks.DEEPSLATE_TOPAZ_ORE.get(), ModItems.RAW_TOPAZ.get()));
        dropSelf(ModBlocks.TOPAZ_BLOCK.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
