package com.o9studio.unnamedmod.core;

import com.o9studio.unnamedmod.UnnamedMod;
import com.o9studio.unnamedmod.custom.blocks.*;
import com.o9studio.unnamedmod.util.SignsWoodTypes;
import com.o9studio.unnamedmod.util.ModBlockSetTypes;
import com.o9studio.unnamedmod.world.trees.DuskyTreeGrower;
import com.o9studio.unnamedmod.world.trees.VeraTreeGrower;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.flag.FeatureFlag;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
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
            () -> new CrystalTableBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.5F)
                    .sound(SoundType.WOOD).ignitedByLava()));

    public static final RegistryObject<Block> COPPER_BARS = registerBlock("copper_bars",
            () -> new IronBarsBlock(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL).noOcclusion()));

    public static final RegistryObject<Block> DIRE_MOLD = registerBlock("dire_mold",
            () -> new DireMoldBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_MAGENTA).replaceable().noCollission().strength(0.2F)
                    .sound(SoundType.GLOW_LICHEN).ignitedByLava().pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> GLOOMLIGHT  = registerBlock("gloomlight",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GREEN).strength(0.1F)
                    .sound(SoundType.MOSS).pushReaction(PushReaction.DESTROY).lightLevel((blockState) -> 15)));

    public static final RegistryObject<Block> GOLD_BARS = registerBlock("gold_bars",
            () -> new IronBarsBlock(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL).noOcclusion()));

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

    public static final RegistryObject<Block> SOUL_JACK_O_LANTERN = registerBlock("soul_jack_o_lantern",
            () -> new CarvedPumpkinBlock(BlockBehaviour.Properties.copy(Blocks.JACK_O_LANTERN)));

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
            () -> new DoorBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).instrument(NoteBlockInstrument.BASS).strength(3.0F)
                    .noOcclusion().ignitedByLava().pushReaction(PushReaction.DESTROY), ModBlockSetTypes.DUSKY));

    public static final RegistryObject<Block> DUSKY_TRAPDOOR = registerBlock("dusky_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).instrument(NoteBlockInstrument.BASS).strength(3.0F)
                    .noOcclusion().isValidSpawn(ModBlocks::never).ignitedByLava(), ModBlockSetTypes.DUSKY));

    public static final RegistryObject<Block> DUSKY_PRESSURE_PLATE = registerBlock("dusky_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).forceSolidOn().instrument(NoteBlockInstrument.BASS)
                            .noCollission().strength(0.5F).ignitedByLava().pushReaction(PushReaction.DESTROY), ModBlockSetTypes.DUSKY));

    public static final RegistryObject<Block> DUSKY_BUTTON = registerBlock("dusky_button", () -> woodenButton(ModBlockSetTypes.DUSKY));

    public static final RegistryObject<Block> DUSKY_WALL_SIGN = BLOCKS.register("dusky_wall_sign",
            () -> new WallSignsBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), SignsWoodTypes.DUSKY));

    public static final RegistryObject<Block> DUSKY_SIGN = BLOCKS.register("dusky_sign",
            () -> new StandingSignsBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), SignsWoodTypes.DUSKY));


    //VERA BLOCKS
    public static final RegistryObject<Block> VERA_SAPLING = registerBlock("vera_sapling",
            () -> new SaplingBlock(new VeraTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

    public static final RegistryObject<Block> VERA_LOG = registerBlock("vera_log",
            () -> new FlammableLogsBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));

    public static final RegistryObject<Block> STRIPPED_VERA_LOG = registerBlock("stripped_vera_log",
            () -> new FlammableLogsBlocks(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));

    public static final RegistryObject<Block> VERA_WOOD = registerBlock("vera_wood",
            () -> new FlammableLogsBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));

    public static final RegistryObject<Block> STRIPPED_VERA_WOOD = registerBlock("stripped_vera_wood",
            () -> new FlammableLogsBlocks(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));

    public static final RegistryObject<Block> VERA_LEAVES = registerBlock("vera_leaves",
            () -> new FlammableLeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> VERA_PLANKS = registerBlock("vera_planks",
            () -> new FlammablePlanksBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    public static final RegistryObject<Block> VERA_STAIRS = registerBlock("vera_stairs",
            () -> new FlammableStairsBlock(ModBlocks.VERA_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));

    public static final RegistryObject<Block> VERA_SLAB = registerBlock("vera_slab",
            () -> new FlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));

    public static final RegistryObject<Block> VERA_FENCE = registerBlock("vera_fence",
            () -> new FlammableFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));

    public static final RegistryObject<Block> VERA_FENCE_GATE = registerBlock("vera_fence_gate",
            () -> new FlammableGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE), SoundEvents.FENCE_GATE_CLOSE, SoundEvents.FENCE_GATE_OPEN));

    public static final RegistryObject<Block> VERA_DOOR = registerBlock("vera_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GREEN).instrument(NoteBlockInstrument.BASS).strength(3.0F)
                    .noOcclusion().ignitedByLava().pushReaction(PushReaction.DESTROY), ModBlockSetTypes.VERA));

    public static final RegistryObject<Block> VERA_TRAPDOOR = registerBlock("vera_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GREEN).instrument(NoteBlockInstrument.BASS).strength(3.0F)
                    .noOcclusion().isValidSpawn(ModBlocks::never).ignitedByLava(), ModBlockSetTypes.VERA));

    public static final RegistryObject<Block> VERA_PRESSURE_PLATE = registerBlock("vera_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GREEN).forceSolidOn().instrument(NoteBlockInstrument.BASS)
                            .noCollission().strength(0.5F).ignitedByLava().pushReaction(PushReaction.DESTROY), ModBlockSetTypes.VERA));

    public static final RegistryObject<Block> VERA_BUTTON = registerBlock("vera_button", () -> woodenButton(ModBlockSetTypes.VERA));

    public static final RegistryObject<Block> VERA_WALL_SIGN = BLOCKS.register("vera_wall_sign",
            () -> new WallSignsBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), SignsWoodTypes.VERA));

    public static final RegistryObject<Block> VERA_SIGN = BLOCKS.register("vera_sign",
            () -> new StandingSignsBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), SignsWoodTypes.VERA));


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

    public static final RegistryObject<Block> VERA_LEAVES_WALL = registerBlock("vera_leaves_wall",
            () -> new FlammableWallBlock(BlockBehaviour.Properties.copy(VERA_LEAVES.get())));

    public static final RegistryObject<Block> NETHER_WART_WALL = registerBlock("nether_wart_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_WART_BLOCK)));

    public static final RegistryObject<Block> WARPED_WART_WALL = registerBlock("warped_wart_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_WART_BLOCK)));


    //CRYSTALS BLOCKS
    public static final RegistryObject<Block> AMBER_BLOCK = BLOCKS.register("amber_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.METAL).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));

    public static final RegistryObject<Block> BRONZE_BLOCK = registerBlock("bronze_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.METAL).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));

    public static final RegistryObject<Block> BRONZE_BARS = registerBlock("bronze_bars",
            () -> new IronBarsBlock(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL).noOcclusion()));

    public static final RegistryObject<Block> CUT_BRONZE = registerBlock("cut_bronze",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.METAL).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));

    public static final RegistryObject<Block> CUT_BRONZE_SLAB = registerBlock("cut_bronze_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(CUT_BRONZE.get())));

    public static final RegistryObject<Block> CUT_BRONZE_STAIRS = registerBlock("cut_bronze_stairs",
            () -> new StairBlock(() -> ModBlocks.CUT_BRONZE.get().defaultBlockState(), BlockBehaviour.Properties.copy(CUT_BRONZE.get())));

    public static final RegistryObject<Block> PERIDOT_BLOCK = registerBlock("peridot_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.METAL).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));

    public static final RegistryObject<Block> RQ_BLOCK = registerBlock("rq_block",
            () -> new RQBlock(BlockBehaviour.Properties.of().mapColor(MapColor.METAL).requiresCorrectToolForDrops().strength(50.0F, 1200.0F).sound(SoundType.GLASS).lightLevel(state -> state.getValue(RQBlock.LIT) ? 0 : 15)));

    public static final RegistryObject<Block> RUBY_BLOCK = registerBlock("ruby_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.METAL).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));

    public static final RegistryObject<Block> SAPPHIRE_BLOCK = registerBlock("sapphire_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.METAL).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));

    public static final RegistryObject<Block> TOPAZ_BLOCK = registerBlock("topaz_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.METAL).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));


    //ORE BLOCKS
    public static final RegistryObject<Block> AMBER_ROCKS = BLOCKS.register("amber_rocks",
            () -> new AmberRocks(BlockBehaviour.Properties.of().mapColor(MapColor.METAL).noOcclusion().requiresCorrectToolForDrops()
                    .strength(3.0F, 3.0F).sound(SoundType.METAL), UniformInt.of(3,7)));

    public static final RegistryObject<Block> PERIDOT_ORE = registerBlock("peridot_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()
                    .strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE), UniformInt.of(3, 7)));

    public static final RegistryObject<Block> RQ_ORE = registerBlock("rq_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.NETHER).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()
                    .strength(30.0F, 1200.0F).sound(SoundType.NETHER_ORE).lightLevel((blockState) -> 5 )));

    public static final RegistryObject<Block> RUBY_ORE = registerBlock("ruby_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_BROWN).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()
                    .strength(2.5F, 2.0F).sound(SoundType.DRIPSTONE_BLOCK), UniformInt.of(3, 7)));

    public static final RegistryObject<Block> SAPPHIRE_ORE = registerBlock("sapphire_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()
                    .strength(3.0F, 3.0F).sound(SoundType.STONE), UniformInt.of(3, 7)));

    public static final RegistryObject<Block> TOPAZ_ORE = registerBlock("topaz_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()
                    .strength(1.5F, 1.0F).sound(SoundType.STONE), UniformInt.of(3, 7)));


    //CROP BLOCKS
    public static final RegistryObject<Block> BLUEBERRY_BUSH = BLOCKS.register("blueberry_bush",
            () -> new BlueBerryCropBlock(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH)));

    public static final RegistryObject<Block> DARKBERRY_BUSH = BLOCKS.register("darkberry_bush",
            () -> new DarkBerryCropBlock(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH)));

    public static final RegistryObject<Block> JADE_VINE = BLOCKS.register("jade_vine",
            () -> new JadeVineBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).randomTicks()
                    .noCollission().instabreak().sound(SoundType.CAVE_VINES).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> JADE_VINE_PLANT = BLOCKS.register("jade_vine_plant",
            () -> new JadeVinePlantBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).randomTicks()
                    .noCollission().instabreak().sound(SoundType.CAVE_VINES).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> LETTUCE_CROP = BLOCKS.register("lettuce_crop",
            () -> new LettuceCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));

    public static final RegistryObject<Block> MOON_FLOWER = BLOCKS.register("moon_flower",
            () -> new MoonFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).randomTicks()
                    .noCollission().sound(SoundType.GLOW_LICHEN).pushReaction(PushReaction.DESTROY)));

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
            () -> new FlammableFlowerBlock(() -> MobEffects.BLINDNESS, 3, BlockBehaviour.Properties.copy(Blocks.AZURE_BLUET)));

    public static final RegistryObject<Block> BLUE_JASMIN = registerBlock("blue_jasmin",
            () -> new FlammableFlowerBlock(() -> MobEffects.WATER_BREATHING, 6, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> BROWN_DAYLILY = registerBlock("brown_daylily",
            () -> new SandFlowerBlock(() -> MobEffects.DIG_SPEED, 4, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> CYCLAMEN = registerBlock("cyclamen",
            () -> new CyclamenBlock(() -> MobEffects.INVISIBILITY, 5, BlockBehaviour.Properties.copy(Blocks.PINK_TULIP)));

    public static final RegistryObject<Block> FLOWERING_LILY_PAD = BLOCKS.register("flowering_lily_pad",
            () -> new WaterlilyBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).instabreak().sound(SoundType.LILY_PAD).noOcclusion().pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> GLOOMY_SPROUT = registerBlock("gloomy_sprout",
            () -> new GloomySproutBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).noCollission().randomTicks().instabreak()
                    .sound(SoundType.GRASS).lightLevel((blockState) -> 5).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> GREEN_DAYLILY = registerBlock("green_daylily",
            () -> new FlammableFlowerBlock(() -> MobEffects.LUCK, 5, BlockBehaviour.Properties.copy(Blocks.DANDELION)));

    public static final RegistryObject<Block> HIBISCUS = registerBlock("hibiscus",
            () -> new FlammableFlowerBlock(() -> MobEffects.DAMAGE_RESISTANCE, 4, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> LAVENDER = registerBlock("lavender",
            () -> new FlammableTallFlowerBlock(BlockBehaviour.Properties.copy(Blocks.PEONY)));

    public static final RegistryObject<Block> PURPLE_ORCHID = registerBlock("purple_orchid",
            () -> new FlammableFlowerBlock(() -> MobEffects.REGENERATION, 6, BlockBehaviour.Properties.copy(Blocks.BLUE_ORCHID)));

    public static final RegistryObject<Block> ROSE = registerBlock("rose",
            () -> new FlammableFlowerBlock(() -> MobEffects.DAMAGE_RESISTANCE, 4, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> SUNDROP = registerBlock("sundrop",
            () -> new FlammableFlowerBlock(() -> MobEffects.GLOWING, 5, BlockBehaviour.Properties.copy(Blocks.CORNFLOWER).noOcclusion().lightLevel((blockstate) -> 12)));

    public static final RegistryObject<Block> VANILLA = registerBlock("vanilla",
            () -> new FlammableFlowerBlock(() -> MobEffects.ABSORPTION, 3, BlockBehaviour.Properties.copy(Blocks.CORNFLOWER)));

    public static final RegistryObject<Block> WHITE_ROSE = registerBlock("white_rose",
            () -> new FlammableFlowerBlock(() -> MobEffects.SLOW_FALLING, 5, BlockBehaviour.Properties.copy(Blocks.POPPY)));


    //FLOWERPOT BLOCKS
    public static final RegistryObject<Block> POTTED_AFRICAN_DAISY = BLOCKS.register("potted_african_daisy",
            () -> new FlowerPotBlock(null, ModBlocks.AFRICAN_DAISY, BlockBehaviour.Properties.copy(Blocks.POTTED_OXEYE_DAISY).noOcclusion()));

    public static final RegistryObject<Block> POTTED_BLACK_IRIS = BLOCKS.register("potted_black_iris",
            () -> new FlowerPotBlock(null, ModBlocks.BLACK_IRIS, BlockBehaviour.Properties.copy(Blocks.POTTED_AZURE_BLUET).noOcclusion()));

    public static final RegistryObject<Block> POTTED_BLUE_JASMIN = BLOCKS.register("potted_blue_jasmin",
            () -> new FlowerPotBlock(null, ModBlocks.BLUE_JASMIN, BlockBehaviour.Properties.copy(Blocks.POTTED_POPPY).noOcclusion()));

    public static final RegistryObject<Block> POTTED_BROWN_DAYLILY = BLOCKS.register("potted_brown_daylily",
            () -> new FlowerPotBlock(null, ModBlocks.BROWN_DAYLILY, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));

    public static final RegistryObject<Block> POTTED_CYCLAMEN = BLOCKS.register("potted_cyclamen",
            () -> new FlowerPotBlock(null, ModBlocks.CYCLAMEN, BlockBehaviour.Properties.copy(Blocks.POTTED_PINK_TULIP).noOcclusion()));

    public static final RegistryObject<Block> POTTED_GLOOMY_SPROUT = BLOCKS.register("potted_gloomy_sprout",
            () -> new FlowerPotBlock(null, ModBlocks.GLOOMY_SPROUT, BlockBehaviour.Properties.copy(Blocks.POTTED_BROWN_MUSHROOM).noOcclusion()));

    public static final RegistryObject<Block> POTTED_GREEN_DAYLILY = BLOCKS.register("potted_green_daylily",
            () -> new FlowerPotBlock(null, ModBlocks.GREEN_DAYLILY, BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));

    public static final RegistryObject<Block> POTTED_HIBISCUS = BLOCKS.register("potted_hibiscus",
            () -> new FlowerPotBlock(null, ModBlocks.HIBISCUS, BlockBehaviour.Properties.copy(Blocks.POTTED_POPPY).noOcclusion()));

    public static final RegistryObject<Block> POTTED_PURPLE_ORCHID = BLOCKS.register("potted_purple_orchid",
            () -> new FlowerPotBlock(null, ModBlocks.PURPLE_ORCHID, BlockBehaviour.Properties.copy(Blocks.POTTED_BLUE_ORCHID).noOcclusion()));

    public static final RegistryObject<Block> POTTED_ROSE = BLOCKS.register("potted_rose",
            () -> new FlowerPotBlock(null, ModBlocks.ROSE, BlockBehaviour.Properties.copy(Blocks.POTTED_POPPY).noOcclusion()));

    public static final RegistryObject<Block> POTTED_SUNDROP = BLOCKS.register("potted_sundrop",
            () -> new FlowerPotBlock(null, ModBlocks.SUNDROP, BlockBehaviour.Properties.copy(Blocks.POTTED_CORNFLOWER).noOcclusion().lightLevel((blockstate) -> 6)));

    public static final RegistryObject<Block> POTTED_VANILLA = BLOCKS.register("potted_vanilla",
            () -> new FlowerPotBlock(null, ModBlocks.VANILLA, BlockBehaviour.Properties.copy(Blocks.POTTED_CORNFLOWER).noOcclusion()));

    public static final RegistryObject<Block> POTTED_WHITE_ROSE = BLOCKS.register("potted_white_rose",
            () -> new FlowerPotBlock(null, ModBlocks.WHITE_ROSE, BlockBehaviour.Properties.copy(Blocks.POTTED_POPPY).noOcclusion()));

    public static final RegistryObject<Block> POTTED_DUSKY_SAPLING = BLOCKS.register("potted_dusky_sapling",
            () -> new FlowerPotBlock(null, ModBlocks.DUSKY_SAPLING, BlockBehaviour.Properties.copy(Blocks.POTTED_OAK_SAPLING).noOcclusion()));

    public static final RegistryObject<Block> POTTED_VERA_SAPLING = BLOCKS.register("potted_vera_sapling",
            () -> new FlowerPotBlock(null, ModBlocks.VERA_SAPLING, BlockBehaviour.Properties.copy(Blocks.POTTED_OAK_SAPLING).noOcclusion()));


    //Food Blocks
    public static final RegistryObject<Block> CHOCOLATE_CAKE = BLOCKS.register("chocolate_cake",
            () -> new CakeBlock(BlockBehaviour.Properties.copy(Blocks.CAKE)));

    public static final RegistryObject<Block> STRAWBERRY_CAKE = BLOCKS.register("strawberry_cake",
            () -> new CakeBlock(BlockBehaviour.Properties.copy(Blocks.CAKE)));

    public static final RegistryObject<Block> VANILLA_CAKE = BLOCKS.register("vanilla_cake",
            () -> new CakeBlock(BlockBehaviour.Properties.copy(Blocks.CAKE)));


    //FLOWERED VINES
    public static final RegistryObject<Block> WHITE_FLOWERED_VINES  = registerBlock("white_flowered_vines",
            () -> new FlammableVineBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().randomTicks().strength(0.2F).sound(SoundType.VINE).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> ORANGE_FLOWERED_VINES  = registerBlock("orange_flowered_vines",
            () -> new FlammableVineBlock(BlockBehaviour.Properties.copy(WHITE_FLOWERED_VINES.get())));

    public static final RegistryObject<Block> MAGENTA_FLOWERED_VINES  = registerBlock("magenta_flowered_vines",
            () -> new FlammableVineBlock(BlockBehaviour.Properties.copy(WHITE_FLOWERED_VINES.get())));

    public static final RegistryObject<Block> LIGHT_BLUE_FLOWERED_VINES  = registerBlock("light_blue_flowered_vines",
            () -> new FlammableVineBlock(BlockBehaviour.Properties.copy(WHITE_FLOWERED_VINES.get())));

    public static final RegistryObject<Block> YELLOW_FLOWERED_VINES  = registerBlock("yellow_flowered_vines",
            () -> new FlammableVineBlock(BlockBehaviour.Properties.copy(WHITE_FLOWERED_VINES.get())));

    public static final RegistryObject<Block> LIME_FLOWERED_VINES  = registerBlock("lime_flowered_vines",
            () -> new FlammableVineBlock(BlockBehaviour.Properties.copy(WHITE_FLOWERED_VINES.get())));

    public static final RegistryObject<Block> PINK_FLOWERED_VINES  = registerBlock("pink_flowered_vines",
            () -> new FlammableVineBlock(BlockBehaviour.Properties.copy(WHITE_FLOWERED_VINES.get())));

    public static final RegistryObject<Block> GRAY_FLOWERED_VINES  = registerBlock("gray_flowered_vines",
            () -> new FlammableVineBlock(BlockBehaviour.Properties.copy(WHITE_FLOWERED_VINES.get())));

    public static final RegistryObject<Block> LIGHT_GRAY_FLOWERED_VINES  = registerBlock("light_gray_flowered_vines",
            () -> new FlammableVineBlock(BlockBehaviour.Properties.copy(WHITE_FLOWERED_VINES.get())));

    public static final RegistryObject<Block> CYAN_FLOWERED_VINES  = registerBlock("cyan_flowered_vines",
            () -> new FlammableVineBlock(BlockBehaviour.Properties.copy(WHITE_FLOWERED_VINES.get())));

    public static final RegistryObject<Block> PURPLE_FLOWERED_VINES  = registerBlock("purple_flowered_vines",
            () -> new FlammableVineBlock(BlockBehaviour.Properties.copy(WHITE_FLOWERED_VINES.get())));

    public static final RegistryObject<Block> BLUE_FLOWERED_VINES  = registerBlock("blue_flowered_vines",
            () -> new FlammableVineBlock(BlockBehaviour.Properties.copy(WHITE_FLOWERED_VINES.get())));

    public static final RegistryObject<Block> BROWN_FLOWERED_VINES  = registerBlock("brown_flowered_vines",
            () -> new FlammableVineBlock(BlockBehaviour.Properties.copy(WHITE_FLOWERED_VINES.get())));

    public static final RegistryObject<Block> GREEN_FLOWERED_VINES  = registerBlock("green_flowered_vines",
            () -> new FlammableVineBlock(BlockBehaviour.Properties.copy(WHITE_FLOWERED_VINES.get())));

    public static final RegistryObject<Block> RED_FLOWERED_VINES  = registerBlock("red_flowered_vines",
            () -> new FlammableVineBlock(BlockBehaviour.Properties.copy(WHITE_FLOWERED_VINES.get())));

    public static final RegistryObject<Block> BLACK_FLOWERED_VINES  = registerBlock("black_flowered_vines",
            () -> new FlammableVineBlock(BlockBehaviour.Properties.copy(WHITE_FLOWERED_VINES.get())));



    private static Boolean never(BlockState state, BlockGetter getter, BlockPos pos, EntityType<?> type) {
        return (boolean)false;
    }

    private static ButtonBlock woodenButton(BlockSetType type, FeatureFlag... flags) {
        BlockBehaviour.Properties blockbehaviour$properties = BlockBehaviour.Properties.of().noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY);
        if (flags.length > 0) {
            blockbehaviour$properties = blockbehaviour$properties.requiredFeatures(flags);
        }

        return new ButtonBlock(blockbehaviour$properties, type, 30, true);
    }


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
