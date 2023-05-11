package com.o9studio.unnamedmod.util.datageneration;

import com.o9studio.unnamedmod.UnnamedMod;
import com.o9studio.unnamedmod.core.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, UnnamedMod.MOD_ID, existingFileHelper);
    }


    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.NOP_BLOCK);
        blockWithItem(ModBlocks.GLOOMLIGHT);

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
}
