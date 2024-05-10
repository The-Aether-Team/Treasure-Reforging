package com.aetherteam.treasure_reforging.recipe;

import com.aetherteam.treasure_reforging.TreasureReforging;
import com.aetherteam.treasure_reforging.recipe.recipes.PhoenixArmorRecipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.SimpleRecipeSerializer;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class TreasureReforgingRecipeSerializers {
    public static final DeferredRegister<RecipeSerializer<?>> RECIPE_SERIALIZERS = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, TreasureReforging.MODID);

    public static final RegistryObject<RecipeSerializer<PhoenixArmorRecipe>> PHOENIX_ARMOR = RECIPE_SERIALIZERS.register("phoenix_armor", ()-> new SimpleRecipeSerializer<>(PhoenixArmorRecipe::new));
}
