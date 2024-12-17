package com.aetherteam.treasure_reforging.data.providers;

import com.aetherteam.aether.block.AetherBlocks;
import com.aetherteam.nitrogen.data.providers.NitrogenRecipeProvider;
import com.aetherteam.treasure_reforging.TreasureReforging;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.level.ItemLike;

import java.util.concurrent.CompletableFuture;

public abstract class ReforgingRecipeProvider extends NitrogenRecipeProvider {
    public ReforgingRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, TreasureReforging.MODID);
    }

    public void copyDungeonSmithingTemplate(RecipeOutput recipeOutput, ItemLike result, ItemLike baseItem) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, result, 2)
                .define('#', AetherBlocks.ENCHANTED_GRAVITITE.get())
                .define('C', baseItem)
                .define('S', result)
                .pattern("#S#")
                .pattern("#C#")
                .pattern("###")
                .unlockedBy(getHasName(result), has(result))
                .save(recipeOutput);
    }
}
