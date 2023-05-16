package com.o9studio.unnamedmod.core;

import com.o9studio.unnamedmod.UnnamedMod;
import com.o9studio.unnamedmod.custom.blocks.*;
import com.o9studio.unnamedmod.world.features.trees.DuskyTreeGrower;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
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
    public static final RegistryObject<Block> GLOOMLIGHT  = registerBlock("gloomlight", () -> new Block(BlockBehaviour.Properties.of(
            Material.MOSS, MaterialColor.COLOR_GRAY).strength(1).sound(SoundType.MOSS).lightLevel((p_152663_) -> 15)));


    //DUSKY BLOCKS
    public static final RegistryObject<Block> DUSKY_SAPLING = registerBlock("dusky_sapling", () -> new SaplingBlock(
            new DuskyTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

    public static final RegistryObject<Block> DUSKY_LOG = registerBlock("dusky_log", () -> new FlammableLogsBlocks(
            BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));

    public static final RegistryObject<Block> STRIPPED_DUSKY_LOG = registerBlock("stripped_dusky_log", () -> new FlammableLogsBlocks(
            BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));

    public static final RegistryObject<Block> DUSKY_WOOD = registerBlock("dusky_wood", () -> new FlammableLogsBlocks(
            BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));

    public static final RegistryObject<Block> STRIPPED_DUSKY_WOOD = registerBlock("stripped_dusky_wood", () -> new FlammableLogsBlocks(
            BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));

    public static final RegistryObject<Block> DUSKY_LEAVES = registerBlock("dusky_leaves", () -> new FlammableLeavesBlock(
            BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> DUSKY_PLANKS = registerBlock("dusky_planks", () -> new FlammablePlanksBlock(
            BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));


    //WALL BLOCKS
    public static final RegistryObject<Block> ACACIA_LEAVES_WALL = registerBlock("acacia_leaves_wall", () -> new FlammableWallBlock(
            BlockBehaviour.Properties.copy(Blocks.AZALEA_LEAVES)));

    public static final RegistryObject<Block> AZALEA_LEAVES_WALL = registerBlock("azalea_leaves_wall", () -> new FlammableWallBlock(
            BlockBehaviour.Properties.copy(Blocks.AZALEA_LEAVES)));

    public static final RegistryObject<Block> BIRCH_LEAVES_WALL = registerBlock("birch_leaves_wall", () -> new FlammableWallBlock(
            BlockBehaviour.Properties.copy(Blocks.BIRCH_LEAVES)));

    public static final RegistryObject<Block> DARK_OAK_LEAVES_WALL = registerBlock("dark_oak_leaves_wall", () -> new FlammableWallBlock(
            BlockBehaviour.Properties.copy(Blocks.DARK_OAK_LEAVES)));

    public static final RegistryObject<Block> DUSKY_LEAVES_WALL = registerBlock("dusky_leaves_wall", () -> new FlammableWallBlock(
            BlockBehaviour.Properties.copy(DUSKY_LEAVES.get())));

    public static final RegistryObject<Block> FLOWERING_AZALEA_LEAVES_WALL = registerBlock("flowering_azalea_leaves_wall", () -> new FlammableWallBlock(
            BlockBehaviour.Properties.copy(Blocks.FLOWERING_AZALEA_LEAVES)));

    public static final RegistryObject<Block> JUNGLE_LEAVES_WALL = registerBlock("jungle_leaves_wall", () -> new FlammableWallBlock(
            BlockBehaviour.Properties.copy(Blocks.JUNGLE_LEAVES)));

    public static final RegistryObject<Block> MANGROVE_LEAVES_WALL = registerBlock("mangrove_leaves_wall", () -> new FlammableWallBlock(
            BlockBehaviour.Properties.copy(Blocks.MANGROVE_LEAVES)));

    public static final RegistryObject<Block> OAK_LEAVES_WALL = registerBlock("oak_leaves_wall", () -> new FlammableWallBlock(
            BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> SPRUCE_LEAVES_WALL = registerBlock("spruce_leaves_wall", () -> new FlammableWallBlock(
            BlockBehaviour.Properties.copy(Blocks.SPRUCE_LEAVES)));

    public static final RegistryObject<Block> NETHER_WART_WALL = registerBlock("nether_wart_wall", () -> new WallBlock(
            BlockBehaviour.Properties.copy(Blocks.NETHER_WART_BLOCK)));

    public static final RegistryObject<Block> WARPED_WART_WALL = registerBlock("warped_wart_wall", () -> new WallBlock(
            BlockBehaviour.Properties.copy(Blocks.WARPED_WART_BLOCK)));


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
            () -> new BlueBerryCropBlock(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH)));

    public static final RegistryObject<Block> DARKBERRY_BUSH = BLOCKS.register("darkberry_bush",
            () -> new DarkBerryCropBlock(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH)));

    public static final RegistryObject<Block> JADE_VINE = BLOCKS.register("jade_vine",
            () -> new JadeVineBlock(BlockBehaviour.Properties.of(Material.PLANT)
                    .randomTicks().noCollission().instabreak().sound(SoundType.CAVE_VINES)));

    public static final RegistryObject<Block> JADE_VINE_PLANT = BLOCKS.register("jade_vine_plant",
            () -> new JadeVinePlantBlock(BlockBehaviour.Properties.of(Material.PLANT)
                    .randomTicks().noCollission().instabreak().sound(SoundType.CAVE_VINES)));

    public static final RegistryObject<Block> LETTUCE_CROP = BLOCKS.register("lettuce_crop",
            () -> new LettuceCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block> RED_BELL_PEPPER_CROP = BLOCKS.register("red_bell_pepper_crop",
            () -> new RedBellPepperCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block> STRAWBERRY_BUSH = BLOCKS.register("strawberry_bush",
            () -> new StrawBerryCropBlock(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH)));

    public static final RegistryObject<Block> TOMATO_CROP = BLOCKS.register("tomato_crop",
            () -> new TomatoCropBlock(BlockBehaviour.Properties.copy(Blocks.POTATOES)));

    public static final RegistryObject<Block> VANILLA_CROP = BLOCKS.register("vanilla_crop",
            () -> new VanillaCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));


    //FLOWER BLOCKS
    public static final RegistryObject<Block> FLOWERING_LILY_PAD = registerBlock("flowering_lily_pad", () -> new FloweringLilyPad(
            BlockBehaviour.Properties.copy(Blocks.LILY_PAD)));



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
