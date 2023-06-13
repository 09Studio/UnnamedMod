package com.o9studio.unnamedmod.core;

import com.o9studio.unnamedmod.UnnamedMod;
import com.o9studio.unnamedmod.custom.entities.SignsBlockEntities;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityBlocks {
        public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, UnnamedMod.MOD_ID);

        public static final RegistryObject<BlockEntityType<SignsBlockEntities>> SIGN_BLOCK_ENTITIES =
                BLOCK_ENTITIES.register("sign_block_entity", () ->
                        BlockEntityType.Builder.of(SignsBlockEntities::new,
                                ModBlocks.DUSKY_WALL_SIGN.get(),
                                ModBlocks.DUSKY_SIGN.get()).build(null));

        public static void register(IEventBus eventBus) {
            BLOCK_ENTITIES.register(eventBus);
        }
}