package com.o9studio.unnamedmod.util.datageneration;

import com.o9studio.unnamedmod.core.ModBlocks;
import com.o9studio.unnamedmod.core.ModItems;
import com.o9studio.unnamedmod.custom.blocks.JadeVines;
import com.o9studio.unnamedmod.custom.blocks.LettuceCropBlock;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    protected ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    protected static LootTable.Builder createJadeVinesDrop(Block block) {
        return LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(ModItems.JADE_VINE_FRUIT.get()))
                .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(block).setProperties(StatePropertiesPredicate
                        .Builder.properties().hasProperty(JadeVines.BERRIES, true))));
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.NOP_BLOCK.get());

        dropSelf(ModBlocks.GLOOMLIGHT.get());

        dropSelf(ModBlocks.DUSKY_SAPLING.get());
        dropSelf(ModBlocks.DUSKY_LOG.get());
        dropSelf(ModBlocks.STRIPPED_DUSKY_LOG.get());
        dropSelf(ModBlocks.DUSKY_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_DUSKY_WOOD.get());
        dropSelf(ModBlocks.DUSKY_PLANKS.get());
        add(ModBlocks.DUSKY_LEAVES.get(), (block) -> createLeavesDrops(block, ModBlocks.DUSKY_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        dropSelf(ModBlocks.ACACIA_LEAVES_WALL.get());
        dropSelf(ModBlocks.AZALEA_LEAVES_WALL.get());
        dropSelf(ModBlocks.BIRCH_LEAVES_WALL.get());
        dropSelf(ModBlocks.DARK_OAK_LEAVES_WALL.get());
        dropSelf(ModBlocks.DUSKY_LEAVES_WALL.get());
        dropSelf(ModBlocks.FLOWERING_AZALEA_LEAVES_WALL.get());
        dropSelf(ModBlocks.JUNGLE_LEAVES_WALL.get());
        dropSelf(ModBlocks.MANGROVE_LEAVES_WALL.get());
        dropSelf(ModBlocks.OAK_LEAVES_WALL.get());
        dropSelf(ModBlocks.SPRUCE_LEAVES_WALL.get());
        dropSelf(ModBlocks.NETHER_WART_WALL.get());
        dropSelf(ModBlocks.WARPED_WART_WALL.get());

        LootItemCondition.Builder lettucebuilder = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(ModBlocks.LETTUCE_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(LettuceCropBlock.AGE, 4));
        this.add(ModBlocks.LETTUCE_CROP.get(), createCropDrops(ModBlocks.LETTUCE_CROP.get(), ModItems.LETTUCE.get(),
                ModItems.LETTUCE_SEEDS.get(), lettucebuilder));

        add(ModBlocks.JADE_VINE.get(),
                (block) -> createJadeVinesDrop(ModBlocks.JADE_VINE.get()));

        add(ModBlocks.JADE_VINE_PLANT.get(),
                (block) -> createJadeVinesDrop(ModBlocks.JADE_VINE_PLANT.get()));

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
