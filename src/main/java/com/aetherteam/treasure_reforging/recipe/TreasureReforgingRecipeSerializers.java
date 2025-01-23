package com.aetherteam.treasure_reforging.recipe;

import com.aetherteam.aetherfabric.registries.DeferredHolder;
import com.aetherteam.aetherfabric.registries.DeferredRegister;
import com.aetherteam.treasure_reforging.TreasureReforging;
import com.aetherteam.treasure_reforging.recipe.recipes.PhoenixArmorRecipe;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.SimpleCraftingRecipeSerializer;

public class TreasureReforgingRecipeSerializers {
    public static final DeferredRegister<RecipeSerializer<?>> RECIPE_SERIALIZERS = DeferredRegister.create(Registries.RECIPE_SERIALIZER, TreasureReforging.MODID);

    public static final DeferredHolder<RecipeSerializer<?>, RecipeSerializer<PhoenixArmorRecipe>> PHOENIX_ARMOR = RECIPE_SERIALIZERS.register("phoenix_armor", ()-> new SimpleCraftingRecipeSerializer<>(PhoenixArmorRecipe::new));
}
