package com.aetherteam.treasure_reforging.recipe.recipes;

import com.aetherteam.aether.item.AetherItems;
import com.aetherteam.treasure_reforging.item.ReforgingItems;
import com.aetherteam.treasure_reforging.recipe.TreasureReforgingRecipeSerializers;
import net.minecraft.core.RegistryAccess;
import net.minecraft.world.inventory.CraftingContainer;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.CraftingBookCategory;
import net.minecraft.world.item.crafting.CustomRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.level.Level;

import java.util.HashMap;
import java.util.Map;

public class PhoenixArmorRecipe extends CustomRecipe {
    private final Map<Item, Item> conversions = new HashMap<>(Map.of(
            AetherItems.OBSIDIAN_BOOTS.get(), AetherItems.PHOENIX_BOOTS.get(),
            AetherItems.OBSIDIAN_LEGGINGS.get(), AetherItems.PHOENIX_LEGGINGS.get(),
            AetherItems.OBSIDIAN_CHESTPLATE.get(), AetherItems.PHOENIX_CHESTPLATE.get(),
            AetherItems.OBSIDIAN_HELMET.get(), AetherItems.PHOENIX_HELMET.get(),
            AetherItems.OBSIDIAN_GLOVES.get(), AetherItems.PHOENIX_GLOVES.get()
    ));
    private static final Ingredient SHARD_INGREDIENT = Ingredient.of(ReforgingItems.PYRAL_SHARD.get());

    public PhoenixArmorRecipe(CraftingBookCategory category) {
        super(category);
    }

    @Override
    public boolean matches(CraftingContainer container, Level level) {
        int shardCount = 0;
        int equipmentCount = 0;
        for (int i = 0; i < container.getContainerSize(); ++i) {
            ItemStack item = container.getItem(i);
            if (!item.isEmpty()) {
                if (this.conversions.containsKey(item.getItem())) {
                    equipmentCount++;
                } else if (SHARD_INGREDIENT.test(item)) {
                    shardCount++;
                }
            }
        }
        return shardCount == 4 && equipmentCount == 1;
    }

    @Override
    public ItemStack assemble(CraftingContainer container, RegistryAccess registryAccess) {
        ItemStack result = ItemStack.EMPTY;
        for (int i = 0; i < container.getContainerSize(); ++i) {
            ItemStack item = container.getItem(i);
            if (!item.isEmpty()) {
                if (this.conversions.containsKey(item.getItem())) {
                    result = new ItemStack(this.conversions.get(item.getItem()));
                    EnchantmentHelper.setEnchantments(EnchantmentHelper.getEnchantments(item), result);
                    if (item.hasTag()) {
                        result.setTag(item.getTag());
                    }
                }
            }
        }
        return result;
    }

    @Override
    public boolean canCraftInDimensions(int width, int height) {
        return width >= 3 && height >= 3;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return TreasureReforgingRecipeSerializers.PHOENIX_ARMOR.get();
    }
}
