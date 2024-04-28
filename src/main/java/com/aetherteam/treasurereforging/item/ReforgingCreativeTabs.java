package com.aetherteam.treasurereforging.item;

import com.aetherteam.aether.block.AetherBlocks;
import com.aetherteam.aether.item.AetherCreativeTabs;
import com.aetherteam.aether.item.AetherItems;
import com.aetherteam.treasurereforging.TreasureReforging;
import com.aetherteam.treasurereforging.block.ReforgingBlocks;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = TreasureReforging.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ReforgingCreativeTabs {
    @SubscribeEvent
    public static void buildCreativeModeTabs(BuildCreativeModeTabContentsEvent event) {
        ResourceKey<CreativeModeTab> tab = event.getTabKey();
        if (tab == AetherCreativeTabs.AETHER_BUILDING_BLOCKS.getKey()) {
            event.getEntries().putAfter(new ItemStack(AetherBlocks.ENCHANTED_GRAVITITE.get()), new ItemStack(ReforgingBlocks.VALKYRUM_BLOCK.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(ReforgingBlocks.VALKYRUM_BLOCK.get()), new ItemStack(ReforgingBlocks.PYRAL_BLOCK.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }
        if (tab == AetherCreativeTabs.AETHER_EQUIPMENT_AND_UTILITIES.getKey()) {
            event.getEntries().putAfter(new ItemStack(AetherItems.VICTORY_MEDAL.get()), new ItemStack(ReforgingItems.NEPTUNE_UPGRADE_SMITHING_TEMPLATE.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(ReforgingItems.NEPTUNE_UPGRADE_SMITHING_TEMPLATE.get()), new ItemStack(ReforgingItems.VALKYRIE_UPGRADE_SMITHING_TEMPLATE.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(ReforgingItems.VALKYRIE_UPGRADE_SMITHING_TEMPLATE.get()), new ItemStack(ReforgingItems.PHOENIX_UPGRADE_SMITHING_TEMPLATE.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }
        if (tab == AetherCreativeTabs.AETHER_INGREDIENTS.getKey()) {
            event.getEntries().putAfter(new ItemStack(AetherBlocks.ENCHANTED_GRAVITITE.get()), new ItemStack(ReforgingItems.NEPTUNE_MESH.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(ReforgingItems.NEPTUNE_MESH.get()), new ItemStack(ReforgingItems.VALKYRUM_INGOT.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(ReforgingItems.VALKYRUM_INGOT.get()), new ItemStack(ReforgingItems.PYRAL_INGOT.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }
    }
}
