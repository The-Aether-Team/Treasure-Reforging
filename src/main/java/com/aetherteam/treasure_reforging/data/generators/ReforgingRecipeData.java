//package com.aetherteam.treasure_reforging.data.generators;
//
//import com.aetherteam.aether.block.AetherBlocks;
//import com.aetherteam.aether.item.AetherItems;
//import com.aetherteam.treasure_reforging.block.ReforgingBlocks;
//import com.aetherteam.treasure_reforging.data.providers.ReforgingRecipeProvider;
//import com.aetherteam.treasure_reforging.item.ReforgingItems;
//import com.aetherteam.treasure_reforging.recipe.recipes.PhoenixArmorRecipe;
//import net.minecraft.core.HolderLookup;
//import net.minecraft.data.PackOutput;
//import net.minecraft.data.recipes.*;
//import net.minecraft.world.item.crafting.Ingredient;
//import net.minecraft.world.level.block.Blocks;
//
//import java.util.concurrent.CompletableFuture;
//
//public class ReforgingRecipeData extends ReforgingRecipeProvider {
//    public ReforgingRecipeData(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
//        super(output, registries);
//    }
//
//    @Override
//    protected void buildRecipes(RecipeOutput recipeOutput) {
//        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ReforgingItems.PYRAL_INGOT.get())
//                .requires(ReforgingItems.PYRAL_SHARD.get(), 4)
//                .requires(Blocks.OBSIDIAN, 2)
//                .unlockedBy("has_pyral_shard", has(ReforgingItems.PYRAL_SHARD.get()))
//                .save(recipeOutput);
//
//        SpecialRecipeBuilder.special(PhoenixArmorRecipe::new).save(recipeOutput, "phoenix_armor_reigniting");
//
//        this.oreBlockStorageRecipesRecipesWithCustomUnpacking(recipeOutput, RecipeCategory.MISC, ReforgingItems.VALKYRUM_INGOT.get(), RecipeCategory.BUILDING_BLOCKS, ReforgingBlocks.VALKYRUM_BLOCK.get(), "valkyrum_ingot_from_valkyrum_block", "valkyrum_ingot");
//        this.oreBlockStorageRecipesRecipesWithCustomUnpacking(recipeOutput, RecipeCategory.MISC, ReforgingItems.PYRAL_INGOT.get(), RecipeCategory.BUILDING_BLOCKS, ReforgingBlocks.PYRAL_BLOCK.get(), "pyral_ingot_from_pyral_block", "pyral_ingot");
//
//        this.copyDungeonSmithingTemplate(recipeOutput, ReforgingItems.NEPTUNE_UPGRADE_SMITHING_TEMPLATE.get(), AetherBlocks.CARVED_STONE.get());
//        this.copyDungeonSmithingTemplate(recipeOutput, ReforgingItems.VALKYRIE_UPGRADE_SMITHING_TEMPLATE.get(), AetherBlocks.ANGELIC_STONE.get());
//        this.copyDungeonSmithingTemplate(recipeOutput, ReforgingItems.PHOENIX_UPGRADE_SMITHING_TEMPLATE.get(), AetherBlocks.HELLFIRE_STONE.get());
//
//        SimpleCookingRecipeBuilder.smelting(
//                        Ingredient.of(AetherItems.NEPTUNE_BOOTS.get(), AetherItems.NEPTUNE_LEGGINGS.get(), AetherItems.NEPTUNE_CHESTPLATE.get(), AetherItems.NEPTUNE_HELMET.get(), AetherItems.NEPTUNE_GLOVES.get()),
//                        RecipeCategory.MISC,
//                        ReforgingItems.NEPTUNE_MESH.get(),
//                        0.1F,
//                        200)
//                .unlockedBy("has_boots", has(AetherItems.NEPTUNE_BOOTS.get()))
//                .unlockedBy("has_leggings", has(AetherItems.NEPTUNE_LEGGINGS.get()))
//                .unlockedBy("has_chestplate", has(AetherItems.NEPTUNE_CHESTPLATE.get()))
//                .unlockedBy("has_helmet", has(AetherItems.NEPTUNE_HELMET.get()))
//                .unlockedBy("has_gloves", has(AetherItems.NEPTUNE_GLOVES.get()))
//                .group(getSmeltingRecipeName(ReforgingItems.NEPTUNE_MESH.get()))
//                .save(recipeOutput, this.name(getSmeltingRecipeName(ReforgingItems.NEPTUNE_MESH.get())));
//        SimpleCookingRecipeBuilder.smelting(
//                        Ingredient.of(AetherItems.VALKYRIE_BOOTS.get(), AetherItems.VALKYRIE_LEGGINGS.get(), AetherItems.VALKYRIE_CHESTPLATE.get(), AetherItems.VALKYRIE_HELMET.get(), AetherItems.VALKYRIE_GLOVES.get(),
//                                AetherItems.VALKYRIE_LANCE.get(), AetherItems.VALKYRIE_PICKAXE.get(), AetherItems.VALKYRIE_AXE.get(), AetherItems.VALKYRIE_SHOVEL.get(), AetherItems.VALKYRIE_HOE.get()),
//                        RecipeCategory.MISC,
//                        ReforgingItems.VALKYRUM_INGOT.get(),
//                        0.1F,
//                        200)
//                .unlockedBy("has_boots", has(AetherItems.VALKYRIE_BOOTS.get()))
//                .unlockedBy("has_leggings", has(AetherItems.VALKYRIE_LEGGINGS.get()))
//                .unlockedBy("has_chestplate", has(AetherItems.VALKYRIE_CHESTPLATE.get()))
//                .unlockedBy("has_helmet", has(AetherItems.VALKYRIE_HELMET.get()))
//                .unlockedBy("has_gloves", has(AetherItems.VALKYRIE_GLOVES.get()))
//                .unlockedBy("has_sword", has(AetherItems.VALKYRIE_LANCE.get()))
//                .unlockedBy("has_pickaxe", has(AetherItems.VALKYRIE_PICKAXE.get()))
//                .unlockedBy("has_axe", has(AetherItems.VALKYRIE_AXE.get()))
//                .unlockedBy("has_shovel", has(AetherItems.VALKYRIE_SHOVEL.get()))
//                .unlockedBy("has_hoe", has(AetherItems.VALKYRIE_HOE.get()))
//                .group(getSmeltingRecipeName(ReforgingItems.VALKYRUM_INGOT.get()))
//                .save(recipeOutput, this.name(getSmeltingRecipeName(ReforgingItems.VALKYRUM_INGOT.get())));
//        SimpleCookingRecipeBuilder.smelting(
//                        Ingredient.of(AetherItems.PHOENIX_BOOTS.get(), AetherItems.PHOENIX_LEGGINGS.get(), AetherItems.PHOENIX_CHESTPLATE.get(), AetherItems.PHOENIX_HELMET.get(), AetherItems.PHOENIX_GLOVES.get()),
//                        RecipeCategory.MISC,
//                        ReforgingItems.PYRAL_INGOT.get(),
//                        0.1F,
//                        200)
//                .unlockedBy("has_boots", has(AetherItems.PHOENIX_BOOTS.get()))
//                .unlockedBy("has_leggings", has(AetherItems.PHOENIX_LEGGINGS.get()))
//                .unlockedBy("has_chestplate", has(AetherItems.PHOENIX_CHESTPLATE.get()))
//                .unlockedBy("has_helmet", has(AetherItems.PHOENIX_HELMET.get()))
//                .unlockedBy("has_gloves", has(AetherItems.PHOENIX_GLOVES.get()))
//                .group(getSmeltingRecipeName(ReforgingItems.PYRAL_INGOT.get()))
//                .save(recipeOutput, this.name(getSmeltingRecipeName(ReforgingItems.PYRAL_INGOT.get())));
//        SimpleCookingRecipeBuilder.smelting(
//                        Ingredient.of(AetherBlocks.SUN_ALTAR.get()),
//                        RecipeCategory.MISC,
//                        ReforgingItems.PYRAL_SHARD.get(),
//                        0.1F,
//                        200)
//                .unlockedBy("has_sun_altar", has(AetherBlocks.SUN_ALTAR.get()))
//                .group(getSmeltingRecipeName(ReforgingItems.PYRAL_SHARD.get()))
//                .save(recipeOutput, this.name(getSmeltingRecipeName(ReforgingItems.PYRAL_SHARD.get())));
//
//        SmithingTransformRecipeBuilder.smithing(
//                    Ingredient.of(ReforgingItems.NEPTUNE_UPGRADE_SMITHING_TEMPLATE.get()),
//                    Ingredient.of(AetherItems.ZANITE_BOOTS.get()),
//                    Ingredient.of(ReforgingItems.NEPTUNE_MESH.get()),
//                    RecipeCategory.COMBAT,
//                    AetherItems.NEPTUNE_BOOTS.get())
//                .unlocks("has_neptune_mesh", has(ReforgingItems.NEPTUNE_MESH.get()))
//                .save(recipeOutput, this.name(getItemName(AetherItems.NEPTUNE_BOOTS.get()) + "_smithing"));
//        SmithingTransformRecipeBuilder.smithing(
//                        Ingredient.of(ReforgingItems.NEPTUNE_UPGRADE_SMITHING_TEMPLATE.get()),
//                        Ingredient.of(AetherItems.ZANITE_LEGGINGS.get()),
//                        Ingredient.of(ReforgingItems.NEPTUNE_MESH.get()),
//                        RecipeCategory.COMBAT,
//                        AetherItems.NEPTUNE_LEGGINGS.get())
//                .unlocks("has_neptune_mesh", has(ReforgingItems.NEPTUNE_MESH.get()))
//                .save(recipeOutput, this.name(getItemName(AetherItems.NEPTUNE_LEGGINGS.get()) + "_smithing"));
//        SmithingTransformRecipeBuilder.smithing(
//                        Ingredient.of(ReforgingItems.NEPTUNE_UPGRADE_SMITHING_TEMPLATE.get()),
//                        Ingredient.of(AetherItems.ZANITE_CHESTPLATE.get()),
//                        Ingredient.of(ReforgingItems.NEPTUNE_MESH.get()),
//                        RecipeCategory.COMBAT,
//                        AetherItems.NEPTUNE_CHESTPLATE.get())
//                .unlocks("has_neptune_mesh", has(ReforgingItems.NEPTUNE_MESH.get()))
//                .save(recipeOutput, this.name(getItemName(AetherItems.NEPTUNE_CHESTPLATE.get()) + "_smithing"));
//        SmithingTransformRecipeBuilder.smithing(
//                        Ingredient.of(ReforgingItems.NEPTUNE_UPGRADE_SMITHING_TEMPLATE.get()),
//                        Ingredient.of(AetherItems.ZANITE_HELMET.get()),
//                        Ingredient.of(ReforgingItems.NEPTUNE_MESH.get()),
//                        RecipeCategory.COMBAT,
//                        AetherItems.NEPTUNE_HELMET.get())
//                .unlocks("has_neptune_mesh", has(ReforgingItems.NEPTUNE_MESH.get()))
//                .save(recipeOutput, this.name(getItemName(AetherItems.NEPTUNE_HELMET.get()) + "_smithing"));
//        SmithingTransformRecipeBuilder.smithing(
//                        Ingredient.of(ReforgingItems.NEPTUNE_UPGRADE_SMITHING_TEMPLATE.get()),
//                        Ingredient.of(AetherItems.ZANITE_GLOVES.get()),
//                        Ingredient.of(ReforgingItems.NEPTUNE_MESH.get()),
//                        RecipeCategory.COMBAT,
//                        AetherItems. NEPTUNE_GLOVES.get())
//                .unlocks("has_neptune_mesh", has(ReforgingItems.NEPTUNE_MESH.get()))
//                .save(recipeOutput, this.name(getItemName(AetherItems.NEPTUNE_GLOVES.get()) + "_smithing"));
//
//        SmithingTransformRecipeBuilder.smithing(
//                        Ingredient.of(ReforgingItems.VALKYRIE_UPGRADE_SMITHING_TEMPLATE.get()),
//                        Ingredient.of(AetherItems.GRAVITITE_BOOTS.get()),
//                        Ingredient.of(ReforgingItems.VALKYRUM_INGOT.get()),
//                        RecipeCategory.COMBAT,
//                        AetherItems.VALKYRIE_BOOTS.get())
//                .unlocks("has_valkyrum_ingot", has(ReforgingItems.VALKYRUM_INGOT.get()))
//                .save(recipeOutput, this.name(getItemName(AetherItems.VALKYRIE_BOOTS.get()) + "_smithing"));
//        SmithingTransformRecipeBuilder.smithing(
//                        Ingredient.of(ReforgingItems.VALKYRIE_UPGRADE_SMITHING_TEMPLATE.get()),
//                        Ingredient.of(AetherItems.GRAVITITE_LEGGINGS.get()),
//                        Ingredient.of(ReforgingItems.VALKYRUM_INGOT.get()),
//                        RecipeCategory.COMBAT,
//                        AetherItems.VALKYRIE_LEGGINGS.get())
//                .unlocks("has_valkyrum_ingot", has(ReforgingItems.VALKYRUM_INGOT.get()))
//                .save(recipeOutput, this.name(getItemName(AetherItems.VALKYRIE_LEGGINGS.get()) + "_smithing"));
//        SmithingTransformRecipeBuilder.smithing(
//                        Ingredient.of(ReforgingItems.VALKYRIE_UPGRADE_SMITHING_TEMPLATE.get()),
//                        Ingredient.of(AetherItems.GRAVITITE_CHESTPLATE.get()),
//                        Ingredient.of(ReforgingItems.VALKYRUM_INGOT.get()),
//                        RecipeCategory.COMBAT,
//                        AetherItems.VALKYRIE_CHESTPLATE.get())
//                .unlocks("has_valkyrum_ingot", has(ReforgingItems.VALKYRUM_INGOT.get()))
//                .save(recipeOutput, this.name(getItemName(AetherItems.VALKYRIE_CHESTPLATE.get()) + "_smithing"));
//        SmithingTransformRecipeBuilder.smithing(
//                        Ingredient.of(ReforgingItems.VALKYRIE_UPGRADE_SMITHING_TEMPLATE.get()),
//                        Ingredient.of(AetherItems.GRAVITITE_HELMET.get()),
//                        Ingredient.of(ReforgingItems.VALKYRUM_INGOT.get()),
//                        RecipeCategory.COMBAT,
//                        AetherItems.VALKYRIE_HELMET.get())
//                .unlocks("has_valkyrum_ingot", has(ReforgingItems.VALKYRUM_INGOT.get()))
//                .save(recipeOutput, this.name(getItemName(AetherItems.VALKYRIE_HELMET.get()) + "_smithing"));
//        SmithingTransformRecipeBuilder.smithing(
//                        Ingredient.of(ReforgingItems.VALKYRIE_UPGRADE_SMITHING_TEMPLATE.get()),
//                        Ingredient.of(AetherItems.GRAVITITE_GLOVES.get()),
//                        Ingredient.of(ReforgingItems.VALKYRUM_INGOT.get()),
//                        RecipeCategory.COMBAT,
//                        AetherItems. VALKYRIE_GLOVES.get())
//                .unlocks("has_valkyrum_ingot", has(ReforgingItems.VALKYRUM_INGOT.get()))
//                .save(recipeOutput, this.name(getItemName(AetherItems.VALKYRIE_GLOVES.get()) + "_smithing"));
//        SmithingTransformRecipeBuilder.smithing(
//                        Ingredient.of(ReforgingItems.VALKYRIE_UPGRADE_SMITHING_TEMPLATE.get()),
//                        Ingredient.of(AetherItems.GRAVITITE_SWORD.get()),
//                        Ingredient.of(ReforgingItems.VALKYRUM_INGOT.get()),
//                        RecipeCategory.COMBAT,
//                        AetherItems. VALKYRIE_LANCE.get())
//                .unlocks("has_valkyrum_ingot", has(ReforgingItems.VALKYRUM_INGOT.get()))
//                .save(recipeOutput, this.name(getItemName(AetherItems.VALKYRIE_LANCE.get()) + "_smithing"));
//        SmithingTransformRecipeBuilder.smithing(
//                        Ingredient.of(ReforgingItems.VALKYRIE_UPGRADE_SMITHING_TEMPLATE.get()),
//                        Ingredient.of(AetherItems.GRAVITITE_PICKAXE.get()),
//                        Ingredient.of(ReforgingItems.VALKYRUM_INGOT.get()),
//                        RecipeCategory.COMBAT,
//                        AetherItems. VALKYRIE_PICKAXE.get())
//                .unlocks("has_valkyrum_ingot", has(ReforgingItems.VALKYRUM_INGOT.get()))
//                .save(recipeOutput, this.name(getItemName(AetherItems.VALKYRIE_PICKAXE.get()) + "_smithing"));
//        SmithingTransformRecipeBuilder.smithing(
//                        Ingredient.of(ReforgingItems.VALKYRIE_UPGRADE_SMITHING_TEMPLATE.get()),
//                        Ingredient.of(AetherItems.GRAVITITE_AXE.get()),
//                        Ingredient.of(ReforgingItems.VALKYRUM_INGOT.get()),
//                        RecipeCategory.COMBAT,
//                        AetherItems. VALKYRIE_AXE.get())
//                .unlocks("has_valkyrum_ingot", has(ReforgingItems.VALKYRUM_INGOT.get()))
//                .save(recipeOutput, this.name(getItemName(AetherItems.VALKYRIE_AXE.get()) + "_smithing"));
//        SmithingTransformRecipeBuilder.smithing(
//                        Ingredient.of(ReforgingItems.VALKYRIE_UPGRADE_SMITHING_TEMPLATE.get()),
//                        Ingredient.of(AetherItems.GRAVITITE_SHOVEL.get()),
//                        Ingredient.of(ReforgingItems.VALKYRUM_INGOT.get()),
//                        RecipeCategory.COMBAT,
//                        AetherItems. VALKYRIE_SHOVEL.get())
//                .unlocks("has_valkyrum_ingot", has(ReforgingItems.VALKYRUM_INGOT.get()))
//                .save(recipeOutput, this.name(getItemName(AetherItems.VALKYRIE_SHOVEL.get()) + "_smithing"));
//        SmithingTransformRecipeBuilder.smithing(
//                        Ingredient.of(ReforgingItems.VALKYRIE_UPGRADE_SMITHING_TEMPLATE.get()),
//                        Ingredient.of(AetherItems.GRAVITITE_HOE.get()),
//                        Ingredient.of(ReforgingItems.VALKYRUM_INGOT.get()),
//                        RecipeCategory.COMBAT,
//                        AetherItems. VALKYRIE_HOE.get())
//                .unlocks("has_valkyrum_ingot", has(ReforgingItems.VALKYRUM_INGOT.get()))
//                .save(recipeOutput, this.name(getItemName(AetherItems.VALKYRIE_HOE.get()) + "_smithing"));
//
//        SmithingTransformRecipeBuilder.smithing(
//                        Ingredient.of(ReforgingItems.PHOENIX_UPGRADE_SMITHING_TEMPLATE.get()),
//                        Ingredient.of(AetherItems.GRAVITITE_BOOTS.get()),
//                            Ingredient.of(ReforgingItems.PYRAL_INGOT.get()),
//                        RecipeCategory.COMBAT,
//                        AetherItems.PHOENIX_BOOTS.get())
//                .unlocks("has_pyral_ingot", has(ReforgingItems.PYRAL_INGOT.get()))
//                .save(recipeOutput, this.name(getItemName(AetherItems.PHOENIX_BOOTS.get()) + "_smithing"));
//        SmithingTransformRecipeBuilder.smithing(
//                        Ingredient.of(ReforgingItems.PHOENIX_UPGRADE_SMITHING_TEMPLATE.get()),
//                        Ingredient.of(AetherItems.GRAVITITE_LEGGINGS.get()),
//                        Ingredient.of(ReforgingItems.PYRAL_INGOT.get()),
//                        RecipeCategory.COMBAT,
//                        AetherItems.PHOENIX_LEGGINGS.get())
//                .unlocks("has_pyral_ingot", has(ReforgingItems.PYRAL_INGOT.get()))
//                .save(recipeOutput, this.name(getItemName(AetherItems.PHOENIX_LEGGINGS.get()) + "_smithing"));
//        SmithingTransformRecipeBuilder.smithing(
//                        Ingredient.of(ReforgingItems.PHOENIX_UPGRADE_SMITHING_TEMPLATE.get()),
//                        Ingredient.of(AetherItems.GRAVITITE_CHESTPLATE.get()),
//                        Ingredient.of(ReforgingItems.PYRAL_INGOT.get()),
//                        RecipeCategory.COMBAT,
//                        AetherItems.PHOENIX_CHESTPLATE.get())
//                .unlocks("has_pyral_ingot", has(ReforgingItems.PYRAL_INGOT.get()))
//                .save(recipeOutput, this.name(getItemName(AetherItems.PHOENIX_CHESTPLATE.get()) + "_smithing"));
//        SmithingTransformRecipeBuilder.smithing(
//                        Ingredient.of(ReforgingItems.PHOENIX_UPGRADE_SMITHING_TEMPLATE.get()),
//                        Ingredient.of(AetherItems.GRAVITITE_HELMET.get()),
//                        Ingredient.of(ReforgingItems.PYRAL_INGOT.get()),
//                        RecipeCategory.COMBAT,
//                        AetherItems.PHOENIX_HELMET.get())
//                .unlocks("has_pyral_ingot", has(ReforgingItems.PYRAL_INGOT.get()))
//                .save(recipeOutput, this.name(getItemName(AetherItems.PHOENIX_HELMET.get()) + "_smithing"));
//        SmithingTransformRecipeBuilder.smithing(
//                        Ingredient.of(ReforgingItems.PHOENIX_UPGRADE_SMITHING_TEMPLATE.get()),
//                        Ingredient.of(AetherItems.GRAVITITE_GLOVES.get()),
//                        Ingredient.of(ReforgingItems.PYRAL_INGOT.get()),
//                        RecipeCategory.COMBAT,
//                        AetherItems. PHOENIX_GLOVES.get())
//                .unlocks("has_pyral_ingot", has(ReforgingItems.PYRAL_INGOT.get()))
//                .save(recipeOutput, this.name(getItemName(AetherItems.PHOENIX_GLOVES.get()) + "_smithing"));
//    }
//}
