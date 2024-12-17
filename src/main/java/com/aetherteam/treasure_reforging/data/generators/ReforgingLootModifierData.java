package com.aetherteam.treasure_reforging.data.generators;

import com.aetherteam.aether.loot.AetherLoot;
import com.aetherteam.nitrogen.loot.modifiers.AddDungeonLootModifier;
import com.aetherteam.treasure_reforging.TreasureReforging;
import com.aetherteam.treasure_reforging.item.ReforgingItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.util.random.WeightedEntry;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.neoforged.neoforge.common.data.GlobalLootModifierProvider;
import net.neoforged.neoforge.common.loot.LootTableIdCondition;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ReforgingLootModifierData extends GlobalLootModifierProvider {
    public ReforgingLootModifierData(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, TreasureReforging.MODID);
    }

    @Override
    protected void start() {
        this.add("neptune_upgrade_treasure", new AddDungeonLootModifier(
                new LootItemCondition[] {
                        LootTableIdCondition.builder(AetherLoot.BRONZE_DUNGEON_REWARD.location()).build()
                },
                List.of(WeightedEntry.wrap(new ItemStack(ReforgingItems.NEPTUNE_UPGRADE_SMITHING_TEMPLATE.get()), 2)),
                UniformInt.of(1, 1))
        );
        this.add("valkyrie_upgrade_treasure", new AddDungeonLootModifier(
                new LootItemCondition[] {
                        LootTableIdCondition.builder(AetherLoot.SILVER_DUNGEON_REWARD.location()).build()
                },
                List.of(WeightedEntry.wrap(new ItemStack(ReforgingItems.VALKYRIE_UPGRADE_SMITHING_TEMPLATE.get()), 2)),
                UniformInt.of(1, 1))
        );
        this.add("phoenix_upgrade_treasure", new AddDungeonLootModifier(
                new LootItemCondition[] {
                        LootTableIdCondition.builder(AetherLoot.GOLD_DUNGEON_REWARD.location()).build()
                },
                List.of(WeightedEntry.wrap(new ItemStack(ReforgingItems.PHOENIX_UPGRADE_SMITHING_TEMPLATE.get()), 2)),
                UniformInt.of(1, 1))
        );
    }
}
