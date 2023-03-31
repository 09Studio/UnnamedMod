package com.o9studio.unnamedmod.core;

import com.o9studio.unnamedmod.UnnamedMod;
import com.o9studio.unnamedmod.custom.blocks.*;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, UnnamedMod.MOD_ID);

    //SPECIAL BLOCKS
    public static final RegistryObject<Block> NOP_BLOCK = registerBlock("nop_block", () -> new Block(
            BlockBehaviour.Properties.copy(Blocks.GLASS)));


    //NORMAL BLOCKS


    //DUSKY BLOCKS


    //CRYSTALS BLOCKS
    public static final RegistryObject<Block> AMBER_BLOCK = BLOCKS.register("amber_block", () -> new Block(
            BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));

    public static final RegistryObject<Block> BRONZE_BLOCK = registerBlock("bronze_block", () -> new Block(
            BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));

    public static final RegistryObject<Block> CUT_BRONZE = registerBlock("cut_bronze", () -> new Block(
            BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));

    public static final RegistryObject<Block> PERIDOT_BLOCK = registerBlock("peridot_block", () -> new Block(
            BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));

    public static final RegistryObject<Block> RQ_BLOCK = registerBlock("rq_block", () -> new RQBlock(
            BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(50.0F, 1200.0F)
                    .sound(SoundType.GLASS).lightLevel(state -> state.getValue(RQBlock.LIT) ? 0 : 15)));

    public static final RegistryObject<Block> RUBY_BLOCK = registerBlock("ruby_block", () -> new Block(
            BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));

    public static final RegistryObject<Block> SAPPHIRE_BLOCK = registerBlock("sapphire_block", () -> new Block(
            BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));

    public static final RegistryObject<Block> TOPAZ_BLOCK = registerBlock("topaz_block", () -> new Block(
            BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));


    //ORE BLOCKS
    public static final RegistryObject<Block> AMBER_ROCKS = BLOCKS.register("amber_rocks", () -> new AmberRocks(
            BlockBehaviour.Properties.of(Material.STONE).noOcclusion().requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.METAL), UniformInt.of(3,7)));

    public static final RegistryObject<Block> PERIDOT_ORE = registerBlock("peridot_ore", () -> new DropExperienceBlock(
            BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.STONE), UniformInt.of(3, 7)));

    public static final RegistryObject<Block> DEEPSLATE_PERIDOT_ORE = registerBlock("deepslate_peridot_ore", () -> new DropExperienceBlock(
            BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE), UniformInt.of(3, 7)));

    public static final RegistryObject<Block> RQ_ORE = registerBlock("rq_ore", () -> new DropExperienceBlock(
            BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(30.0F, 1200.0F).sound(SoundType.NETHER_ORE).lightLevel((blockState) -> 5 )));

    public static final RegistryObject<Block> RUBY_ORE = registerBlock("ruby_ore", () -> new DropExperienceBlock(
            BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.STONE), UniformInt.of(3, 7)));

    public static final RegistryObject<Block> DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore", () -> new DropExperienceBlock(
            BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE), UniformInt.of(3, 7)));

    public static final RegistryObject<Block> SAPPHIRE_ORE = registerBlock("sapphire_ore", () -> new DropExperienceBlock(
            BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.STONE), UniformInt.of(3, 7)));

    public static final RegistryObject<Block> DEEPSLATE_SAPPHIRE_ORE = registerBlock("deepslate_sapphire_ore", () -> new DropExperienceBlock(
            BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE), UniformInt.of(3, 7)));

    public static final RegistryObject<Block> TOPAZ_ORE = registerBlock("topaz_ore", () -> new DropExperienceBlock(
            BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.STONE), UniformInt.of(3, 7)));

    public static final RegistryObject<Block> DEEPSLATE_TOPAZ_ORE = registerBlock("deepslate_topaz_ore", () -> new DropExperienceBlock(
            BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE), UniformInt.of(3, 7)));


    //CROP BLOCKS
    public static final RegistryObject<Block> BLUEBERRY_BUSH = BLOCKS.register("blueberry_bush",
            () -> new BlueBerryCropBlock(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).noLootTable()));

    public static final RegistryObject<Block> DARKBERRY_BUSH = BLOCKS.register("darkberry_bush",
            () -> new DarkBerryCropBlock(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).noLootTable()));

    public static final RegistryObject<Block> STRAWBERRY_BUSH = BLOCKS.register("strawberry_bush",
            () -> new StrawBerryCropBlock(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).noLootTable()));


    //Wall Blocks



    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem (String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus bus){
        BLOCKS.register(bus);
    }
}
