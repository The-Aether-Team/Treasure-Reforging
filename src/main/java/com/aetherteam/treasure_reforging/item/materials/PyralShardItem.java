package com.aetherteam.treasure_reforging.item.materials;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import org.jetbrains.annotations.Nullable;

public class PyralShardItem extends Item {
    public PyralShardItem(Properties properties) {
        super(properties);

        FuelRegistry.INSTANCE.add(this, 20000);
    }

//    @Override
//    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
//        return 20000;
//    }
}
