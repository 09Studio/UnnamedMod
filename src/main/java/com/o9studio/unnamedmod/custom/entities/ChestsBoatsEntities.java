package com.o9studio.unnamedmod.custom.entities;

import com.o9studio.unnamedmod.core.ModEntities;
import com.o9studio.unnamedmod.core.ModItems;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.entity.vehicle.ChestBoat;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;

public class ChestsBoatsEntities extends ChestBoat {
    private static final EntityDataAccessor<Integer> DATA_ID_TYPE = SynchedEntityData.defineId(Boat.class, EntityDataSerializers.INT);

    public ChestsBoatsEntities(EntityType<? extends ChestBoat> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    public ChestsBoatsEntities(Level pLevel, double pX, double pY, double pZ) {
        this(ModEntities.MOD_CHEST_BOAT.get(), pLevel);
        this.setPos(pX, pY, pZ);
        this.xo = pX;
        this.yo = pY;
        this.zo = pZ;
    }

    @Override
    public Item getDropItem() {
        switch (getModVariant()) {
            case DUSKY -> {
                return ModItems.DUSKY_CHEST_BOAT.get();
            }
            case VERA -> {
                return ModItems.VERA_CHEST_BOAT.get();
            }
        }
        return super.getDropItem();
    }

    public void setVariant(BoatsEntities.Type pVariant) {
        this.entityData.set(DATA_ID_TYPE, pVariant.ordinal());
    }

    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(DATA_ID_TYPE, BoatsEntities.Type.DUSKY.ordinal());
    }

    protected void addAdditionalSaveData(CompoundTag pCompound) {
        pCompound.putString("Type", this.getModVariant().getSerializedName());
    }

    protected void readAdditionalSaveData(CompoundTag pCompound) {
        if (pCompound.contains("Type", 8)) {
            this.setVariant(BoatsEntities.Type.byName(pCompound.getString("Type")));
        }
    }

    public BoatsEntities.Type getModVariant() {
        return BoatsEntities.Type.byId(this.entityData.get(DATA_ID_TYPE));
    }
}
