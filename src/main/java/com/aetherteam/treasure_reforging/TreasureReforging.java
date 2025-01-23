package com.aetherteam.treasure_reforging;

import com.aetherteam.aether.loot.modifiers.RemoveSeedsModifier;
import com.aetherteam.aetherfabric.registries.DeferredRegister;
import com.aetherteam.treasure_reforging.block.ReforgingBlocks;
//import com.aetherteam.treasure_reforging.data.ReforgingData;
import com.aetherteam.treasure_reforging.item.ReforgingCreativeTabs;
import com.aetherteam.treasure_reforging.item.ReforgingItems;
import com.aetherteam.treasure_reforging.loot.ReforgeLootModifiers;
import com.aetherteam.treasure_reforging.recipe.TreasureReforgingRecipeSerializers;
import com.mojang.logging.LogUtils;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.predicates.*;
import org.slf4j.Logger;

public class TreasureReforging implements ModInitializer {
    public static final String MODID = "aether_treasure_reforging";
    public static final Logger LOGGER = LogUtils.getLogger();

    @Override
    public void onInitialize() {
        //bus.addListener(ReforgingData::dataSetup);

        DeferredRegister<?>[] registers = {
                ReforgingBlocks.BLOCKS,
                ReforgingItems.ITEMS,
                TreasureReforgingRecipeSerializers.RECIPE_SERIALIZERS
        };

        for (DeferredRegister<?> register : registers) {
            register.addEntriesToRegistry();
        }

        ItemGroupEvents.MODIFY_ENTRIES_ALL.register(ReforgingCreativeTabs::buildCreativeModeTabs);
        ReforgeLootModifiers.initLootModifiers();
    }
}
