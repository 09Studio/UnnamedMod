package com.o9studio.unnamedmod.util.integration;

import com.o9studio.unnamedmod.UnnamedMod;
import com.o9studio.unnamedmod.core.ModBlocks;
import com.o9studio.unnamedmod.custom.recipe.CrystalTableRecipe;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

public class CrystalTableCategory implements IRecipeCategory<CrystalTableRecipe> {
    public final static ResourceLocation UID = new ResourceLocation(UnnamedMod.MOD_ID, "crystal_table_recipe");
    public final static ResourceLocation TEXTURE =
            new ResourceLocation(UnnamedMod.MOD_ID, "textures/gui/crystal_table_gui.png");

    private final IDrawable background;
    private final IDrawable icon;

    public CrystalTableCategory(IGuiHelper helper) {
        this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 85);
        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(ModBlocks.CRYSTAL_TABLE.get()));
    }

    @Override
    public RecipeType<CrystalTableRecipe> getRecipeType() {
        return JEIPlugin.CRYSTAL_TABLE_TYPE;
    }

    @Override
    public Component getTitle() {
        return Component.translatable("container.crystal_table");
    }

    @Override
    public IDrawable getBackground() {
        return this.background;
    }

    @Override
    public IDrawable getIcon() {
        return this.icon;
    }

    @Override
    public void setRecipe(IRecipeLayoutBuilder builder, CrystalTableRecipe recipe, IFocusGroup focuses) {
        builder.addSlot(RecipeIngredientRole.INPUT, 80, 25).addIngredients(recipe.getIngredients().get(0));

        builder.addSlot(RecipeIngredientRole.OUTPUT, 134, 45).addItemStack(recipe.getResultItem());
    }
}