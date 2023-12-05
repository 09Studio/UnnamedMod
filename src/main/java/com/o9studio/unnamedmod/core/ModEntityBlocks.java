package com.o9studio.unnamedmod.core;

import com.o9studio.unnamedmod.UnnamedMod;
import com.o9studio.unnamedmod.custom.entities.CrystalTableEntity;
import com.o9studio.unnamedmod.custom.entities.HangingSignsBlockEntities;
import com.o9studio.unnamedmod.custom.entities.SignsBlockEntities;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityBlocks {
        public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, UnnamedMod.MOD_ID);

        //BLOCK ENTITIES
        public static final RegistryObject<BlockEntityType<SignsBlockEntities>> MOD_SIGN =
                BLOCK_ENTITIES.register("mod_sign", () ->
                        BlockEntityType.Builder.of(SignsBlockEntities::new,
                                ModBlocks.DUSKY_WALL_SIGN.get(), ModBlocks.DUSKY_SIGN.get(),
                                ModBlocks.VERA_WALL_SIGN.get(), ModBlocks.VERA_SIGN.get()).build(null));

        public static final RegistryObject<BlockEntityType<HangingSignsBlockEntities>> MOD_HANGING_SIGN =
                BLOCK_ENTITIES.register("mod_hanging_sign", () ->
                        BlockEntityType.Builder.of(HangingSignsBlockEntities::new,
                                ModBlocks.DUSKY_WALL_HANGING_SIGN.get(), ModBlocks.DUSKY_HANGING_SIGN.get(),
                                ModBlocks.VERA_WALL_HANGING_SIGN.get(), ModBlocks.VERA_HANGING_SIGN.get()).build(null));

        public static final RegistryObject<BlockEntityType<CrystalTableEntity>> CRYSTAL_TABLE =
                BLOCK_ENTITIES.register("crystal_table", () ->
                        BlockEntityType.Builder.of(CrystalTableEntity::new,
                                ModBlocks.CRYSTAL_TABLE.get()).build(null));

        public static void register(IEventBus eventBus) {
            BLOCK_ENTITIES.register(eventBus);
        }
}