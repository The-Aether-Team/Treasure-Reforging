package com.aetherteam.treasure_reforging.data.generators.tags;

import com.aetherteam.aether.AetherTags;
import com.aetherteam.treasure_reforging.TreasureReforging;
import com.aetherteam.treasure_reforging.block.ReforgingBlocks;
import com.aetherteam.treasure_reforging.item.ReforgingItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ReforgingItemTagData extends ItemTagsProvider {
    public ReforgingItemTagData(PackOutput output, CompletableFuture<HolderLookup.Provider> registries, CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper helper) {
        super(output, registries, blockTags, TreasureReforging.MODID, helper);
    }

    @Override
    public void addTags(HolderLookup.Provider provider) {
        this.tag(AetherTags.Items.NEPTUNE_REPAIRING).add(ReforgingItems.NEPTUNE_MESH.get());
        this.tag(AetherTags.Items.VALKYRIE_REPAIRING).add(ReforgingItems.VALKYRUM_INGOT.get());
        this.tag(AetherTags.Items.PHOENIX_REPAIRING).add(ReforgingItems.PYRAL_INGOT.get());
        this.tag(AetherTags.Items.BRONZE_DUNGEON_LOOT).add(ReforgingItems.NEPTUNE_UPGRADE_SMITHING_TEMPLATE.get());
        this.tag(AetherTags.Items.SILVER_DUNGEON_LOOT).add(ReforgingItems.VALKYRIE_UPGRADE_SMITHING_TEMPLATE.get());
        this.tag(AetherTags.Items.GOLD_DUNGEON_LOOT).add(ReforgingItems.PHOENIX_UPGRADE_SMITHING_TEMPLATE.get());

        this.tag(Tags.Items.STORAGE_BLOCKS).add(
                ReforgingBlocks.VALKYRUM_BLOCK.get().asItem(),
                ReforgingBlocks.PYRAL_BLOCK.get().asItem());

        this.tag(ItemTags.BEACON_PAYMENT_ITEMS).add(
                ReforgingItems.NEPTUNE_MESH.get(),
                ReforgingItems.VALKYRUM_INGOT.get(),
                ReforgingItems.PYRAL_INGOT.get());
        this.tag(ItemTags.TRIM_MATERIALS).add(
                ReforgingItems.NEPTUNE_MESH.get(),
                ReforgingItems.VALKYRUM_INGOT.get(),
                ReforgingItems.PYRAL_INGOT.get());
    }
}
