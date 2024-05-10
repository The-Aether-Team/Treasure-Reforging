package com.aetherteam.treasure_reforging.item;

import com.aetherteam.aether.block.AetherBlocks;
import com.aetherteam.aether.item.AetherCreativeTabs;
import com.aetherteam.treasure_reforging.TreasureReforging;
import com.aetherteam.treasure_reforging.block.ReforgingBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = TreasureReforging.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ReforgingCreativeTabs {
    @SubscribeEvent
    public static void buildCreativeModeTabs(CreativeModeTabEvent.BuildContents event) {
        CreativeModeTab tab = event.getTab();
        if (tab == AetherCreativeTabs.AETHER_BUILDING_BLOCKS) {
            event.getEntries().putAfter(new ItemStack(AetherBlocks.ENCHANTED_GRAVITITE.get()), new ItemStack(ReforgingBlocks.VALKYRUM_BLOCK.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(ReforgingBlocks.VALKYRUM_BLOCK.get()), new ItemStack(ReforgingBlocks.PYRAL_BLOCK.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }
        if (tab == AetherCreativeTabs.AETHER_INGREDIENTS) {
            event.getEntries().putAfter(new ItemStack(AetherBlocks.ENCHANTED_GRAVITITE.get()), new ItemStack(ReforgingItems.NEPTUNE_MESH.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(ReforgingItems.NEPTUNE_MESH.get()), new ItemStack(ReforgingItems.VALKYRUM_INGOT.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(ReforgingItems.VALKYRUM_INGOT.get()), new ItemStack(ReforgingItems.PYRAL_SHARD.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(ReforgingItems.PYRAL_SHARD.get()), new ItemStack(ReforgingItems.PYRAL_INGOT.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }
    }
}