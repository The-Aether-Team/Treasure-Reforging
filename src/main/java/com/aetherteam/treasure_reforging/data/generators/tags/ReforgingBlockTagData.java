package com.aetherteam.treasure_reforging.data.generators.tags;

import com.aetherteam.treasure_reforging.TreasureReforging;
import com.aetherteam.treasure_reforging.block.ReforgingBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ReforgingBlockTagData extends BlockTagsProvider {
    public ReforgingBlockTagData(PackOutput output, CompletableFuture<HolderLookup.Provider> registries, @Nullable ExistingFileHelper helper) {
        super(output, registries, TreasureReforging.MODID, helper);
    }

    @Override
    public void addTags(HolderLookup.Provider provider) {
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(
                ReforgingBlocks.VALKYRUM_BLOCK.get(),
                ReforgingBlocks.PYRAL_BLOCK.get());
        this.tag(BlockTags.NEEDS_IRON_TOOL).add(
                ReforgingBlocks.VALKYRUM_BLOCK.get(),
                ReforgingBlocks.PYRAL_BLOCK.get());

        this.tag(Tags.Blocks.STORAGE_BLOCKS).add(
                ReforgingBlocks.VALKYRUM_BLOCK.get(),
                ReforgingBlocks.PYRAL_BLOCK.get());
    }
}
