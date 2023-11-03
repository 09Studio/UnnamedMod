package com.o9studio.unnamedmod.util.renderers;

import com.o9studio.unnamedmod.UnnamedMod;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;

public class ModModelLayers {

    public static final ModelLayerLocation DUSKY_BOAT_LAYER = new ModelLayerLocation(
            new ResourceLocation(UnnamedMod.MOD_ID, "boat/dusky"), "main");
    public static final ModelLayerLocation DUSKY_CHEST_BOAT_LAYER = new ModelLayerLocation(
            new ResourceLocation(UnnamedMod.MOD_ID, "chest_boat/dusky"), "main");

    public static final ModelLayerLocation VERA_BOAT_LAYER = new ModelLayerLocation(
            new ResourceLocation(UnnamedMod.MOD_ID, "boat/vera"), "main");
    public static final ModelLayerLocation VERA_CHEST_BOAT_LAYER = new ModelLayerLocation(
            new ResourceLocation(UnnamedMod.MOD_ID, "chest_boat/vera"), "main");

}