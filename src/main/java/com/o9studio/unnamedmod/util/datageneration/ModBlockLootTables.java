package com.o9studio.unnamedmod.util.datageneration;

import com.o9studio.unnamedmod.core.ModBlocks;
import com.o9studio.unnamedmod.core.ModItems;
import com.o9studio.unnamedmod.custom.blocks.BlueBerryCropBlock;
import com.o9studio.unnamedmod.custom.blocks.LettuceCropBlock;
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

        LootItemCondition.Builder lettucebuilder = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(ModBlocks.LETTUCE_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(LettuceCropBlock.AGE, 4));
        this.add(ModBlocks.LETTUCE_CROP.get(), createCropDrops(ModBlocks.LETTUCE_CROP.get(), ModItems.LETTUCE.get(),
                ModItems.LETTUCE_SEEDS.get(), lettucebuilder));

        LootItemCondition.Builder pepperbuilder = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(ModBlocks.RED_BELL_PEPPER_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(LettuceCropBlock.AGE, 5));
        this.add(ModBlocks.RED_BELL_PEPPER_CROP.get(), createCropDrops(ModBlocks.RED_BELL_PEPPER_CROP.get(), ModItems.RED_BELL_PEPPER.get(),
                ModItems.RED_BELL_PEPPER_SEEDS.get(), pepperbuilder));

        LootItemCondition.Builder tomatobuilder = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(ModBlocks.TOMATO_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(LettuceCropBlock.AGE, 4));
        this.add(ModBlocks.TOMATO_CROP.get(), createCropDrops(ModBlocks.TOMATO_CROP.get(), ModItems.TOMATO.get(),
                ModItems.TOMATO_SEEDS.get(), tomatobuilder));

        LootItemCondition.Builder vanillabuilder = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(ModBlocks.VANILLA_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(LettuceCropBlock.AGE, 5));
        this.add(ModBlocks.VANILLA_CROP.get(), createCropDrops(ModBlocks.VANILLA_CROP.get(), ModItems.VANILLA_BEANS.get(),
                ModItems.VANILLA_BEANS.get(), vanillabuilder));


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
