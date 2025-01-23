package com.aetherteam.treasure_reforging.item;

import com.aetherteam.aether.block.AetherBlocks;
import com.aetherteam.aether.item.AetherCreativeTabs;
import com.aetherteam.aether.item.AetherItems;
import com.aetherteam.treasure_reforging.block.ReforgingBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ReforgingCreativeTabs {
    public static void buildCreativeModeTabs(CreativeModeTab tab, FabricItemGroupEntries entries) {
        if (tab == AetherCreativeTabs.AETHER_BUILDING_BLOCKS.get()) {
            entries.addAfter(new ItemStack(AetherBlocks.ENCHANTED_GRAVITITE.get()), new ItemStack(ReforgingBlocks.VALKYRUM_BLOCK.get()));
            entries.addAfter(new ItemStack(ReforgingBlocks.VALKYRUM_BLOCK.get()), new ItemStack(ReforgingBlocks.PYRAL_BLOCK.get()));
        }
        if (tab == AetherCreativeTabs.AETHER_EQUIPMENT_AND_UTILITIES.get()) {
            entries.addAfter(new ItemStack(AetherItems.VICTORY_MEDAL.get()), new ItemStack(ReforgingItems.NEPTUNE_UPGRADE_SMITHING_TEMPLATE.get()));
            entries.addAfter(new ItemStack(ReforgingItems.NEPTUNE_UPGRADE_SMITHING_TEMPLATE.get()), new ItemStack(ReforgingItems.VALKYRIE_UPGRADE_SMITHING_TEMPLATE.get()));
            entries.addAfter(new ItemStack(ReforgingItems.VALKYRIE_UPGRADE_SMITHING_TEMPLATE.get()), new ItemStack(ReforgingItems.PHOENIX_UPGRADE_SMITHING_TEMPLATE.get()));
        }
        if (tab == AetherCreativeTabs.AETHER_INGREDIENTS.get()) {
            entries.addAfter(new ItemStack(AetherBlocks.ENCHANTED_GRAVITITE.get()), new ItemStack(ReforgingItems.NEPTUNE_MESH.get()));
            entries.addAfter(new ItemStack(ReforgingItems.NEPTUNE_MESH.get()), new ItemStack(ReforgingItems.VALKYRUM_INGOT.get()));
            entries.addAfter(new ItemStack(ReforgingItems.VALKYRUM_INGOT.get()), new ItemStack(ReforgingItems.PYRAL_SHARD.get()));
            entries.addAfter(new ItemStack(ReforgingItems.PYRAL_SHARD.get()), new ItemStack(ReforgingItems.PYRAL_INGOT.get()));
        }
    }
}
