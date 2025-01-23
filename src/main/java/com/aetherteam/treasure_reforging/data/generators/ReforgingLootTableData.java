//package com.aetherteam.treasure_reforging.data.generators;
//
//import com.aetherteam.treasure_reforging.data.generators.loot.ReforgingBlockLoot;
//import com.aetherteam.treasure_reforging.loot.ReforgingLoot;
//import net.minecraft.core.HolderLookup;
//import net.minecraft.data.PackOutput;
//import net.minecraft.data.loot.LootTableProvider;
//import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
//
//import java.util.List;
//import java.util.concurrent.CompletableFuture;
//
//public class ReforgingLootTableData {
//    public static LootTableProvider create(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
//        return new LootTableProvider(output, ReforgingLoot.IMMUTABLE_LOOT_TABLES, List.of(
//                new LootTableProvider.SubProviderEntry(ReforgingBlockLoot::new, LootContextParamSets.BLOCK)
//        ), registries);
//    }
//}
