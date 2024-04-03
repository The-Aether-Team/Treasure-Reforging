package com.aetherteam.treasurereforging.data.generators;

import com.aetherteam.aether.loot.AetherLoot;
import com.aetherteam.nitrogen.loot.AddDungeonLootModifier;
import com.aetherteam.treasurereforging.TreasureReforging;
import com.aetherteam.treasurereforging.item.ReforgingItems;
import net.minecraft.data.PackOutput;
import net.minecraft.util.random.WeightedEntry;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;

import java.util.List;

public class ReforgingLootModifierData extends GlobalLootModifierProvider {
    public ReforgingLootModifierData(PackOutput output) {
        super(output, TreasureReforging.MODID);
    }

    @Override
    protected void start() {
        this.add("neptune_upgrade_treasure", new AddDungeonLootModifier(
                new LootItemCondition[] {
                        LootTableIdCondition.builder(AetherLoot.BRONZE_DUNGEON_REWARD).build()
                },
                List.of(WeightedEntry.wrap(new ItemStack(ReforgingItems.NEPTUNE_UPGRADE_SMITHING_TEMPLATE.get()), 2)),
                UniformInt.of(1, 1))
        );
        this.add("valkyrie_upgrade_treasure", new AddDungeonLootModifier(
                new LootItemCondition[] {
                        LootTableIdCondition.builder(AetherLoot.SILVER_DUNGEON_REWARD).build()
                },
                List.of(WeightedEntry.wrap(new ItemStack(ReforgingItems.VALKYRIE_UPGRADE_SMITHING_TEMPLATE.get()), 2)),
                UniformInt.of(1, 1))
        );
        this.add("phoenix_upgrade_treasure", new AddDungeonLootModifier(
                new LootItemCondition[] {
                        LootTableIdCondition.builder(AetherLoot.GOLD_DUNGEON_REWARD).build()
                },
                List.of(WeightedEntry.wrap(new ItemStack(ReforgingItems.PHOENIX_UPGRADE_SMITHING_TEMPLATE.get()), 2)),
                UniformInt.of(1, 1))
        );
    }
}
