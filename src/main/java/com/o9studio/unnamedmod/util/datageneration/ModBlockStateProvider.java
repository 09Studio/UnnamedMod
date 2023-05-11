package com.o9studio.unnamedmod.util.datageneration;

import com.o9studio.unnamedmod.UnnamedMod;
import com.o9studio.unnamedmod.core.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, UnnamedMod.MOD_ID, existingFileHelper);
    }


    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.NOP_BLOCK);
        blockWithItem(ModBlocks.GLOOMLIGHT);

        saplingBlock(ModBlocks.DUSKY_SAPLING);
        logBlock(((RotatedPillarBlock) ModBlocks.DUSKY_LOG.get()));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_DUSKY_LOG.get(), new ResourceLocation(UnnamedMod.MOD_ID, "block/stripped_dusky_log"),
                new ResourceLocation(UnnamedMod.MOD_ID, "block/stripped_dusky_log_top"));
        axisBlock((RotatedPillarBlock) ModBlocks.DUSKY_WOOD.get(), blockTexture(ModBlocks.DUSKY_LOG.get()), blockTexture(ModBlocks.DUSKY_LOG.get()));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_DUSKY_WOOD.get(), new ResourceLocation(UnnamedMod.MOD_ID, "block/stripped_dusky_log"),
                new ResourceLocation(UnnamedMod.MOD_ID, "block/stripped_dusky_log"));
        blockWithItem(ModBlocks.DUSKY_LEAVES);
        blockWithItem(ModBlocks.DUSKY_PLANKS);

        simpleBlockItem(ModBlocks.DUSKY_LOG.get(), models().withExistingParent("unnamedmod:dusky_log", "minecraft:block/cube_column"));
        simpleBlockItem(ModBlocks.STRIPPED_DUSKY_LOG.get(), models().withExistingParent("unnamedmod:stripped_dusky_log", "minecraft:block/cube_column"));
        simpleBlockItem(ModBlocks.DUSKY_WOOD.get(), models().withExistingParent("unnamedmod:dusky_wood", "minecraft:block/cube_column"));
        simpleBlockItem(ModBlocks.STRIPPED_DUSKY_WOOD.get(), models().withExistingParent("unnamedmod:stripped_dusky_wood", "minecraft:block/cube_column"));


        blockWithItem(ModBlocks.AMBER_BLOCK);
        blockWithItem(ModBlocks.CUT_BRONZE);
        blockWithItem(ModBlocks.PERIDOT_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_PERIDOT_ORE);
        blockWithItem(ModBlocks.PERIDOT_BLOCK);
        blockWithItem(ModBlocks.RQ_ORE);
        blockWithItem(ModBlocks.RUBY_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_RUBY_ORE);
        blockWithItem(ModBlocks.RUBY_BLOCK);
        blockWithItem(ModBlocks.SAPPHIRE_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_SAPPHIRE_ORE);
        blockWithItem(ModBlocks.SAPPHIRE_BLOCK);
        blockWithItem(ModBlocks.TOPAZ_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_TOPAZ_ORE);
        blockWithItem(ModBlocks.TOPAZ_BLOCK);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

    private void saplingBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(),
                models().cross(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }
}
