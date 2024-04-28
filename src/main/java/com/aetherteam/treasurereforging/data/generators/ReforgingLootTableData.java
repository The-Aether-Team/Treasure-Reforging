package com.aetherteam.treasurereforging.data.generators;

import com.aetherteam.treasurereforging.data.generators.loot.ReforgingBlockLoot;
import com.aetherteam.treasurereforging.loot.ReforgingLoot;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.util.List;

public class ReforgingLootTableData {
    public static LootTableProvider create(PackOutput output) {
        return new LootTableProvider(output, ReforgingLoot.IMMUTABLE_LOOT_TABLES, List.of(
                new LootTableProvider.SubProviderEntry(ReforgingBlockLoot::new, LootContextParamSets.BLOCK)
        ));
    }
}
