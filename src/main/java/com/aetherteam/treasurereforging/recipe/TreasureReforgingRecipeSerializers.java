package com.aetherteam.treasurereforging.recipe;

import com.aetherteam.treasurereforging.TreasureReforging;
import com.aetherteam.treasurereforging.recipe.recipes.PhoenixArmorRecipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.SimpleCraftingRecipeSerializer;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class TreasureReforgingRecipeSerializers {
    public static final DeferredRegister<RecipeSerializer<?>> RECIPE_SERIALIZERS = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, TreasureReforging.MODID);

    public static final RegistryObject<RecipeSerializer<PhoenixArmorRecipe>> PHOENIX_ARMOR = RECIPE_SERIALIZERS.register("phoenix_armor", ()-> new SimpleCraftingRecipeSerializer<>(PhoenixArmorRecipe::new));
}
