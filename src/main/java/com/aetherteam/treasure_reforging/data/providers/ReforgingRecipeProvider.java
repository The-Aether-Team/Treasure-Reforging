package com.aetherteam.treasure_reforging.data.providers;

//import com.aetherteam.aether.block.AetherBlocks;
//import com.aetherteam.nitrogen.data.providers.NitrogenRecipeProvider;
//import com.aetherteam.treasure_reforging.TreasureReforging;
//import net.minecraft.data.PackOutput;
//import net.minecraft.data.recipes.FinishedRecipe;
//import net.minecraft.data.recipes.RecipeCategory;
//import net.minecraft.data.recipes.ShapedRecipeBuilder;
//import net.minecraft.world.level.ItemLike;
//
//import java.util.function.Consumer;
//
//public abstract class ReforgingRecipeProvider extends NitrogenRecipeProvider {
//    public ReforgingRecipeProvider(PackOutput output) {
//        super(output, TreasureReforging.MODID);
//    }
//
//    public void copyDungeonSmithingTemplate(Consumer<FinishedRecipe> finishedRecipeConsumer, ItemLike result, ItemLike baseItem) {
//        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, result, 2)
//                .define('#', AetherBlocks.ENCHANTED_GRAVITITE.get())
//                .define('C', baseItem)
//                .define('S', result)
//                .pattern("#S#")
//                .pattern("#C#")
//                .pattern("###")
//                .unlockedBy(getHasName(result), has(result))
//                .save(finishedRecipeConsumer);
//    }
//}
