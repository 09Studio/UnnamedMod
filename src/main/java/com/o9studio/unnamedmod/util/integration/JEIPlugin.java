package com.o9studio.unnamedmod.util.integration;

import com.o9studio.unnamedmod.UnnamedMod;
import com.o9studio.unnamedmod.custom.recipe.CrystalTableRecipe;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeManager;

import java.util.List;
import java.util.Objects;

@JeiPlugin
public class JEIPlugin implements IModPlugin {
    public static RecipeType<CrystalTableRecipe> CRYSTAL_TABLE_TYPE = new RecipeType<>(CrystalTableCategory.UID, CrystalTableRecipe.class);

    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(UnnamedMod.MOD_ID, "jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(new
                CrystalTableCategory(registration.getJeiHelpers().getGuiHelper()));
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager rm = Objects.requireNonNull(Minecraft.getInstance().level).getRecipeManager();

        List<CrystalTableRecipe> recipesInfusing = rm.getAllRecipesFor(CrystalTableRecipe.Type.INSTANCE);
        registration.addRecipes(CRYSTAL_TABLE_TYPE, recipesInfusing);
    }
}