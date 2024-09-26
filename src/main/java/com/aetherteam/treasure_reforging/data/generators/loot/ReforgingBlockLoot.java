package com.aetherteam.treasure_reforging.data.generators.loot;

import com.aetherteam.nitrogen.data.providers.NitrogenBlockLootSubProvider;
import com.aetherteam.treasure_reforging.block.ReforgingBlocks;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class ReforgingBlockLoot extends NitrogenBlockLootSubProvider {
    private static final Set<Item> EXPLOSION_RESISTANT = Set.of();

    public ReforgingBlockLoot() {
        super(EXPLOSION_RESISTANT, FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    public void generate() {
        this.dropSelf(ReforgingBlocks.VALKYRUM_BLOCK.get());
        this.dropSelf(ReforgingBlocks.PYRAL_BLOCK.get());
    }

    @Override
    public Iterable<Block> getKnownBlocks() {
        return ReforgingBlocks.BLOCKS.getEntries().stream().map(Supplier::get).collect(Collectors.toList());
    }
}
