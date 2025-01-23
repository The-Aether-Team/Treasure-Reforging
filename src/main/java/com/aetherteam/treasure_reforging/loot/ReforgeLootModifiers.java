package com.aetherteam.treasure_reforging.loot;

import com.aetherteam.aether.loot.modifiers.AetherLootTableModifications;
import com.aetherteam.aether.loot.modifiers.RemoveSeedsModifier;
import com.aetherteam.aetherfabric.common.loot.IGlobalLootModifier;
import com.aetherteam.treasure_reforging.item.ReforgingItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.random.Weight;
import net.minecraft.util.random.WeightedEntry;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.predicates.*;

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class ReforgeLootModifiers {
    public static void initLootModifiers() {
        register("neptune_upgrade_treasure", () -> {
            return new AddDungeonLootModifier(
                    new LootItemCondition[]{
                            AetherLootTableModifications.LootTableCondition.builder(
                                    ResourceLocation.fromNamespaceAndPath("aether", "chests/dungeon/bronze/bronze_dungeon_reward")
                            ).build()
                    },
                    List.of(
                            new WeightedEntry.Wrapper<>(ReforgingItems.NEPTUNE_UPGRADE_SMITHING_TEMPLATE.toStack(1), Weight.of(2))
                    ),
                    UniformInt.of(1, 1)
            );
        });
        register("valkyrie_upgrade_treasure", () -> {
            return new AddDungeonLootModifier(
                    new LootItemCondition[]{
                            AetherLootTableModifications.LootTableCondition.builder(
                                    ResourceLocation.fromNamespaceAndPath("aether", "chests/dungeon/silver/silver_dungeon_reward")
                            ).build()
                    },
                    List.of(
                            new WeightedEntry.Wrapper<>(ReforgingItems.VALKYRIE_UPGRADE_SMITHING_TEMPLATE.toStack(1), Weight.of(2))
                    ),
                    UniformInt.of(1, 1)
            );
        });
        register("phoenix_upgrade_treasure", () -> {
            return new AddDungeonLootModifier(
                    new LootItemCondition[]{
                            AetherLootTableModifications.LootTableCondition.builder(
                                    ResourceLocation.fromNamespaceAndPath("aether", "chests/dungeon/gold/gold_dungeon_reward")
                            ).build()
                    },
                    List.of(
                            new WeightedEntry.Wrapper<>(ReforgingItems.PHOENIX_UPGRADE_SMITHING_TEMPLATE.toStack(1), Weight.of(2))
                    ),
                    UniformInt.of(1, 1)
            );
        });
    }

    public static void register(String path, Supplier<IGlobalLootModifier> modifier) {
        register(path, (provider) -> modifier.get());
    }

    public static void register(String path, Function<HolderLookup.Provider, IGlobalLootModifier> modifier) {
        AetherLootTableModifications.LOOT_MODIFIERS.put(ResourceLocation.fromNamespaceAndPath("aether_treasure_reforging", path), modifier);
    }
}
