package com.o9studio.unnamedmod.core;

import com.o9studio.unnamedmod.UnnamedMod;
import com.o9studio.unnamedmod.custom.blocks.*;
import com.o9studio.unnamedmod.custom.entities.SignsWoodTypes;
import com.o9studio.unnamedmod.world.features.trees.DuskyTreeGrower;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.effect.MobEffects;
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
    public static final RegistryObject<Block> NOP_BLOCK = registerBlock("nop_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GLASS)));


    //NORMAL BLOCKS
    public static final RegistryObject<Block> CRYSTAL_TABLE = registerBlock("crystal_table",
            () -> new CrystalTableBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.5F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> COPPER_BARS = registerBlock("copper_bars",
            () -> new IronBarsBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).requiresCorrectToolForDrops()
                    .strength(5.0F, 6.0F).sound(SoundType.METAL).noOcclusion()));

    public static final RegistryObject<Block> DIRE_MOLD = registerBlock("dire_mold",
            () -> new DireMoldBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT, MaterialColor.COLOR_PURPLE).noCollission().strength(0.2F).sound(SoundType.GLOW_LICHEN)));

    public static final RegistryObject<Block> GLOOMLIGHT  = registerBlock("gloomlight",
            () -> new Block(BlockBehaviour.Properties.of(Material.MOSS, MaterialColor.COLOR_GRAY).strength(1).sound(SoundType.MOSS).lightLevel((blockState) -> 15)));

    public static final RegistryObject<Block> GOLD_BARS = registerBlock("gold_bars",
            () -> new IronBarsBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).requiresCorrectToolForDrops()
                    .strength(5.0F, 6.0F).sound(SoundType.METAL).noOcclusion()));

    public static final RegistryObject<Block> MOLDY_END_STONE_BRICKS  = registerBlock("moldy_end_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.END_STONE_BRICKS)));

    public static final RegistryObject<Block> MOLDY_END_STONE_BRICK_SLAB  = registerBlock("moldy_end_stone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE_BRICK_SLAB)));

    public static final RegistryObject<Block> MOLDY_END_STONE_BRICK_STAIRS  = registerBlock("moldy_end_stone_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.MOLDY_END_STONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.END_STONE_BRICK_STAIRS)));

    public static final RegistryObject<Block> MOLDY_END_STONE_BRICK_WALL  = registerBlock("moldy_end_stone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE_BRICK_WALL)));

    public static final RegistryObject<Block> MYCELIUM_GRASS = registerBlock("mycelium_grass",
            () -> new MyceliumGrassBlock(BlockBehaviour.Properties.copy(Blocks.GRASS)));



    //DUSKY BLOCKS
    public static final RegistryObject<Block> DUSKY_SAPLING = registerBlock("dusky_sapling",
            () -> new SaplingBlock(new DuskyTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

    public static final RegistryObject<Block> DUSKY_LOG = registerBlock("dusky_log",
            () -> new FlammableLogsBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));

    public static final RegistryObject<Block> STRIPPED_DUSKY_LOG = registerBlock("stripped_dusky_log",
            () -> new FlammableLogsBlocks(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));

    public static final RegistryObject<Block> DUSKY_WOOD = registerBlock("dusky_wood",
            () -> new FlammableLogsBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));

    public static final RegistryObject<Block> STRIPPED_DUSKY_WOOD = registerBlock("stripped_dusky_wood",
            () -> new FlammableLogsBlocks(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));

    public static final RegistryObject<Block> DUSKY_LEAVES = registerBlock("dusky_leaves",
            () -> new FlammableLeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> DUSKY_PLANKS = registerBlock("dusky_planks",
            () -> new FlammablePlanksBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    public static final RegistryObject<Block> DUSKY_STAIRS = registerBlock("dusky_stairs",
            () -> new FlammableStairsBlock(ModBlocks.DUSKY_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));

    public static final RegistryObject<Block> DUSKY_SLAB = registerBlock("dusky_slab",
            () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));

    public static final RegistryObject<Block> DUSKY_FENCE = registerBlock("dusky_fence",
            () -> new FlammableFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));

    public static final RegistryObject<Block> DUSKY_FENCE_GATE = registerBlock("dusky_fence_gate",
            () -> new FlammableGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE), SoundEvents.FENCE_GATE_CLOSE, SoundEvents.FENCE_GATE_OPEN));

    public static final RegistryObject<Block> DUSKY_DOOR = registerBlock("dusky_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), SoundEvents.WOODEN_DOOR_CLOSE, SoundEvents.WOODEN_DOOR_OPEN));

    public static final RegistryObject<Block> DUSKY_TRAPDOOR = registerBlock("dusky_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR), SoundEvents.WOODEN_TRAPDOOR_CLOSE, SoundEvents.WOODEN_TRAPDOOR_OPEN));

    public static final RegistryObject<Block> DUSKY_PRESSURE_PLATE = registerBlock("dusky_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE), SoundEvents.WOODEN_PRESSURE_PLATE_CLICK_OFF, SoundEvents.WOODEN_PRESSURE_PLATE_CLICK_ON));

    public static final RegistryObject<Block> DUSKY_BUTTON = registerBlock("dusky_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON),30, true, SoundEvents.WOODEN_BUTTON_CLICK_OFF, SoundEvents.WOODEN_BUTTON_CLICK_ON));

    public static final RegistryObject<Block> DUSKY_WALL_SIGN = BLOCKS.register("dusky_wall_sign",
            () -> new WallSignsBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), SignsWoodTypes.DUSKY));

    public static final RegistryObject<Block> DUSKY_SIGN = BLOCKS.register("dusky_sign",
            () -> new StandingSignsBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), SignsWoodTypes.DUSKY));


    //WALL BLOCKS
    public static final RegistryObject<Block> ACACIA_LEAVES_WALL = registerBlock("acacia_leaves_wall",
            () -> new FlammableWallBlock(BlockBehaviour.Properties.copy(Blocks.AZALEA_LEAVES)));

    public static final RegistryObject<Block> AZALEA_LEAVES_WALL = registerBlock("azalea_leaves_wall",
            () -> new FlammableWallBlock(BlockBehaviour.Properties.copy(Blocks.AZALEA_LEAVES)));

    public static final RegistryObject<Block> BIRCH_LEAVES_WALL = registerBlock("birch_leaves_wall",
            () -> new FlammableWallBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_LEAVES)));

    public static final RegistryObject<Block> DARK_OAK_LEAVES_WALL = registerBlock("dark_oak_leaves_wall",
            () -> new FlammableWallBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_LEAVES)));

    public static final RegistryObject<Block> DUSKY_LEAVES_WALL = registerBlock("dusky_leaves_wall",
            () -> new FlammableWallBlock(BlockBehaviour.Properties.copy(DUSKY_LEAVES.get())));

    public static final RegistryObject<Block> FLOWERING_AZALEA_LEAVES_WALL = registerBlock("flowering_azalea_leaves_wall",
            () -> new FlammableWallBlock(BlockBehaviour.Properties.copy(Blocks.FLOWERING_AZALEA_LEAVES)));

    public static final RegistryObject<Block> JUNGLE_LEAVES_WALL = registerBlock("jungle_leaves_wall",
            () -> new FlammableWallBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_LEAVES)));

    public static final RegistryObject<Block> MANGROVE_LEAVES_WALL = registerBlock("mangrove_leaves_wall",
            () -> new FlammableWallBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_LEAVES)));

    public static final RegistryObject<Block> OAK_LEAVES_WALL = registerBlock("oak_leaves_wall",
            () -> new FlammableWallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> SPRUCE_LEAVES_WALL = registerBlock("spruce_leaves_wall",
            () -> new FlammableWallBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LEAVES)));

    public static final RegistryObject<Block> NETHER_WART_WALL = registerBlock("nether_wart_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_WART_BLOCK)));

    public static final RegistryObject<Block> WARPED_WART_WALL = registerBlock("warped_wart_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_WART_BLOCK)));


    //CRYSTALS BLOCKS
    public static final RegistryObject<Block> AMBER_BLOCK = BLOCKS.register("amber_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));

    public static final RegistryObject<Block> BRONZE_BLOCK = registerBlock("bronze_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));

    public static final RegistryObject<Block> BRONZE_BARS = registerBlock("bronze_bars",
            () -> new IronBarsBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).requiresCorrectToolForDrops()
                    .strength(5.0F, 6.0F).sound(SoundType.METAL).noOcclusion()));

    public static final RegistryObject<Block> CUT_BRONZE = registerBlock("cut_bronze",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));

    public static final RegistryObject<Block> CUT_BRONZE_SLAB = registerBlock("cut_bronze_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(CUT_BRONZE.get())));

    public static final RegistryObject<Block> CUT_BRONZE_STAIRS = registerBlock("cut_bronze_stairs",
            () -> new StairBlock(() -> ModBlocks.CUT_BRONZE.get().defaultBlockState(), BlockBehaviour.Properties.copy(CUT_BRONZE.get())));

    public static final RegistryObject<Block> PERIDOT_BLOCK = registerBlock("peridot_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));

    public static final RegistryObject<Block> RQ_BLOCK = registerBlock("rq_block",
            () -> new RQBlock(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(50.0F, 1200.0F).sound(SoundType.GLASS).lightLevel(state -> state.getValue(RQBlock.LIT) ? 0 : 15)));

    public static final RegistryObject<Block> RUBY_BLOCK = registerBlock("ruby_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));

    public static final RegistryObject<Block> SAPPHIRE_BLOCK = registerBlock("sapphire_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));

    public static final RegistryObject<Block> TOPAZ_BLOCK = registerBlock("topaz_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));


    //ORE BLOCKS
    public static final RegistryObject<Block> AMBER_ROCKS = BLOCKS.register("amber_rocks",
            () -> new AmberRocks(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().requiresCorrectToolForDrops()
                    .strength(3.0F, 3.0F).sound(SoundType.METAL), UniformInt.of(3,7)));

    public static final RegistryObject<Block> PERIDOT_ORE = registerBlock("peridot_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(3.0F, 3.0F).sound(SoundType.STONE), UniformInt.of(3, 7)));

    public static final RegistryObject<Block> DEEPSLATE_PERIDOT_ORE = registerBlock("deepslate_peridot_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE), UniformInt.of(3, 7)));

    public static final RegistryObject<Block> RQ_ORE = registerBlock("rq_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(30.0F, 1200.0F).sound(SoundType.NETHER_ORE).lightLevel((blockState) -> 5 )));

    public static final RegistryObject<Block> RUBY_ORE = registerBlock("ruby_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(3.0F, 3.0F).sound(SoundType.STONE), UniformInt.of(3, 7)));

    public static final RegistryObject<Block> DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE), UniformInt.of(3, 7)));

    public static final RegistryObject<Block> SAPPHIRE_ORE = registerBlock("sapphire_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(3.0F, 3.0F).sound(SoundType.STONE), UniformInt.of(3, 7)));

    public static final RegistryObject<Block> DEEPSLATE_SAPPHIRE_ORE = registerBlock("deepslate_sapphire_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE), UniformInt.of(3, 7)));

    public static final RegistryObject<Block> TOPAZ_ORE = registerBlock("topaz_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(3.0F, 3.0F).sound(SoundType.STONE), UniformInt.of(3, 7)));

    public static final RegistryObject<Block> DEEPSLATE_TOPAZ_ORE = registerBlock("deepslate_topaz_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops()
                    .strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE), UniformInt.of(3, 7)));


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
    public static final RegistryObject<Block> AFRICAN_DAISY = registerBlock("african_daisy",
            () -> new SandFlowerBlock(() -> MobEffects.WEAKNESS, 4, BlockBehaviour.Properties.copy(Blocks.OXEYE_DAISY)));

    public static final RegistryObject<Block> BLACK_IRIS = registerBlock("black_iris",
            () -> new FlowerBlock(MobEffects.BLINDNESS, 3, BlockBehaviour.Properties.copy(Blocks.AZURE_BLUET)));

    public static final RegistryObject<Block> BLUE_JASMIN = registerBlock("blue_jasmin",
            () -> new FlowerBlock(MobEffects.WATER_BREATHING, 6, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> BROWN_DAYLILY = registerBlock("brown_daylily",
            () -> new SandFlowerBlock(() -> MobEffects.DIG_SPEED, 4, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> FLOWERING_LILY_PAD = BLOCKS.register("flowering_lily_pad",
            () -> new WaterlilyBlock(BlockBehaviour.Properties.of(Material.PLANT).instabreak().sound(SoundType.LILY_PAD).noOcclusion()));

    public static final RegistryObject<Block> GLOOMY_SPROUT = registerBlock("gloomy_sprout",
            () -> new GloomySproutBlock(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.COLOR_GRAY).noCollission().randomTicks().instabreak()
                    .sound(SoundType.GRASS).lightLevel((blockState) -> 5)));

    public static final RegistryObject<Block> GREEN_DAYLILY = registerBlock("green_daylily",
            () -> new FlowerBlock(MobEffects.LUCK, 5, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> PURPLE_ORCHID = registerBlock("purple_orchid",
            () -> new FlowerBlock(MobEffects.REGENERATION, 6, BlockBehaviour.Properties.copy(Blocks.BLUE_ORCHID)));

    public static final RegistryObject<Block> ROSE = registerBlock("rose",
            () -> new FlowerBlock(MobEffects.DAMAGE_RESISTANCE, 4, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> VANILLA = registerBlock("vanilla",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 3, BlockBehaviour.Properties.copy(Blocks.CORNFLOWER)));

    public static final RegistryObject<Block> WHITE_ROSE = registerBlock("white_rose",
            () -> new WhiteRoseBlock(() -> MobEffects.SLOW_FALLING, 5, BlockBehaviour.Properties.copy(Blocks.POPPY)));


    //FLOWERPOT BLOCKS
    public static final RegistryObject<Block> POTTED_AFRICAN_DAISY = BLOCKS.register("potted_african_daisy",
            () -> new FlowerPotBlock(null, ModBlocks.AFRICAN_DAISY, BlockBehaviour.Properties.copy(Blocks.POTTED_OXEYE_DAISY).noOcclusion()));

    public static final RegistryObject<Block> POTTED_BLACK_IRIS = BLOCKS.register("potted_black_iris",
            () -> new FlowerPotBlock(null, ModBlocks.BLACK_IRIS, BlockBehaviour.Properties.copy(Blocks.POTTED_AZURE_BLUET).noOcclusion()));

    public static final RegistryObject<Block> POTTED_BLUE_JASMIN = BLOCKS.register("potted_blue_jasmin",
            () -> new FlowerPotBlock(null, ModBlocks.BLUE_JASMIN, BlockBehaviour.Properties.copy(Blocks.POTTED_POPPY).noOcclusion()));

    public static final RegistryObject<Block> POTTED_BROWN_DAYLILY = BLOCKS.register("potted_brown_daylily",
            () -> new FlowerPotBlock(null, ModBlocks.BROWN_DAYLILY, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));

    public static final RegistryObject<Block> POTTED_GLOOMY_SPROUT = BLOCKS.register("potted_gloomy_sprout",
            () -> new FlowerPotBlock(null, ModBlocks.GLOOMY_SPROUT, BlockBehaviour.Properties.copy(Blocks.POTTED_BROWN_MUSHROOM).noOcclusion()));

    public static final RegistryObject<Block> POTTED_GREEN_DAYLILY = BLOCKS.register("potted_green_daylily",
            () -> new FlowerPotBlock(null, ModBlocks.GREEN_DAYLILY, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));

    public static final RegistryObject<Block> POTTED_PURPLE_ORCHID = BLOCKS.register("potted_purple_orchid",
            () -> new FlowerPotBlock(null, ModBlocks.PURPLE_ORCHID, BlockBehaviour.Properties.copy(Blocks.POTTED_BLUE_ORCHID).noOcclusion()));

    public static final RegistryObject<Block> POTTED_ROSE = BLOCKS.register("potted_rose",
            () -> new FlowerPotBlock(null, ModBlocks.ROSE, BlockBehaviour.Properties.copy(Blocks.POTTED_POPPY).noOcclusion()));

    public static final RegistryObject<Block> POTTED_VANILLA = BLOCKS.register("potted_vanilla",
            () -> new FlowerPotBlock(null, ModBlocks.VANILLA, BlockBehaviour.Properties.copy(Blocks.POTTED_CORNFLOWER).noOcclusion()));

    public static final RegistryObject<Block> POTTED_WHITE_ROSE = BLOCKS.register("potted_white_rose",
            () -> new FlowerPotBlock(null, ModBlocks.WHITE_ROSE, BlockBehaviour.Properties.copy(Blocks.POTTED_POPPY).noOcclusion()));

    public static final RegistryObject<Block> POTTED_DUSKY_SAPLING = BLOCKS.register("potted_dusky_sapling",
            () -> new FlowerPotBlock(null, ModBlocks.DUSKY_SAPLING, BlockBehaviour.Properties.copy(Blocks.POTTED_OAK_SAPLING).noOcclusion()));


    //Food Blocks
    public static final RegistryObject<Block> CHOCOLATE_CAKE = BLOCKS.register("chocolate_cake",
            () -> new CakeBlock(BlockBehaviour.Properties.copy(Blocks.CAKE)));

    public static final RegistryObject<Block> STRAWBERRY_CAKE = BLOCKS.register("strawberry_cake",
            () -> new CakeBlock(BlockBehaviour.Properties.copy(Blocks.CAKE)));

    public static final RegistryObject<Block> VANILLA_CAKE = BLOCKS.register("vanilla_cake",
            () -> new CakeBlock(BlockBehaviour.Properties.copy(Blocks.CAKE)));



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
