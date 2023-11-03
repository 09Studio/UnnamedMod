package com.o9studio.unnamedmod.util.renderers;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Pair;
import com.o9studio.unnamedmod.UnnamedMod;
import com.o9studio.unnamedmod.custom.entities.BoatsEntities;
import com.o9studio.unnamedmod.custom.entities.ChestsBoatsEntities;
import net.minecraft.client.model.BoatModel;
import net.minecraft.client.model.ChestBoatModel;
import net.minecraft.client.model.ListModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.renderer.entity.BoatRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.vehicle.Boat;

import java.util.Map;
import java.util.stream.Stream;

public class BoatsRenderer extends BoatRenderer {
    private final Map<BoatsEntities.Type, Pair<ResourceLocation, ListModel<Boat>>> boatResources;

    public BoatsRenderer(EntityRendererProvider.Context pContext, boolean pChestBoat) {
        super(pContext, pChestBoat);
        this.boatResources = Stream.of(BoatsEntities.Type.values()).collect(ImmutableMap.toImmutableMap(type -> type,
                type -> Pair.of(new ResourceLocation(UnnamedMod.MOD_ID, getTextureLocation(type, pChestBoat)), this.createBoatModel(pContext, type, pChestBoat))));
    }

    private static String getTextureLocation(BoatsEntities.Type pType, boolean pChestBoat) {
        return pChestBoat ? "textures/entity/chest_boat/" + pType.getName() + ".png" : "textures/entity/boat/" + pType.getName() + ".png";
    }

    private ListModel<Boat> createBoatModel(EntityRendererProvider.Context pContext, BoatsEntities.Type pType, boolean pChestBoat) {
        ModelLayerLocation modellayerlocation = pChestBoat ? BoatsRenderer.createChestBoatModelName(pType) : BoatsRenderer.createBoatModelName(pType);
        ModelPart modelpart = pContext.bakeLayer(modellayerlocation);
        return pChestBoat ? new ChestBoatModel(modelpart) : new BoatModel(modelpart);
    }

    public static ModelLayerLocation createBoatModelName(BoatsEntities.Type pType) {
        return createLocation("boat/" + pType.getName(), "main");
    }

    public static ModelLayerLocation createChestBoatModelName(BoatsEntities.Type pType) {
        return createLocation("chest_boat/" + pType.getName(), "main");
    }

    private static ModelLayerLocation createLocation(String pPath, String pModel) {
        return new ModelLayerLocation(new ResourceLocation(UnnamedMod.MOD_ID, pPath), pModel);
    }

    public Pair<ResourceLocation, ListModel<Boat>> getModelWithLocation(Boat boat) {
        if(boat instanceof BoatsEntities modBoat) {
            return this.boatResources.get(modBoat.getModVariant());
        } else if(boat instanceof ChestsBoatsEntities ChestsBoatsEntities) {
            return this.boatResources.get(ChestsBoatsEntities.getModVariant());
        } else {
            return null;
        }
    }
}