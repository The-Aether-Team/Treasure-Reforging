package com.aetherteam.treasure_reforging.recipe;

import com.aetherteam.treasure_reforging.TreasureReforging;
import com.aetherteam.treasure_reforging.recipe.recipes.PhoenixArmorRecipe;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.SimpleCraftingRecipeSerializer;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class TreasureReforgingRecipeSerializers {
    public static final DeferredRegister<RecipeSerializer<?>> RECIPE_SERIALIZERS = DeferredRegister.create(Registries.RECIPE_SERIALIZER, TreasureReforging.MODID);

    public static final DeferredHolder<RecipeSerializer<?>, RecipeSerializer<PhoenixArmorRecipe>> PHOENIX_ARMOR = RECIPE_SERIALIZERS.register("phoenix_armor", ()-> new SimpleCraftingRecipeSerializer<>(PhoenixArmorRecipe::new));
}
