package com.aetherteam.treasure_reforging.client;

import com.aetherteam.aether.inventory.menu.LoreBookMenu;
import com.aetherteam.treasure_reforging.TreasureReforging;
import com.aetherteam.treasure_reforging.item.ReforgingItems;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = TreasureReforging.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ReforgingClient {
    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
        registerLoreOverrides();
    }

    public static void registerLoreOverrides() {
        LoreBookMenu.addLoreEntryOverride(stack -> stack.is(ReforgingItems.NEPTUNE_UPGRADE_SMITHING_TEMPLATE.get()), "lore.item.aether_treasure_reforging.neptune_upgrade_smithing_template");
        LoreBookMenu.addLoreEntryOverride(stack -> stack.is(ReforgingItems.VALKYRIE_UPGRADE_SMITHING_TEMPLATE.get()), "lore.item.aether_treasure_reforging.valkyrie_upgrade_smithing_template");
        LoreBookMenu.addLoreEntryOverride(stack -> stack.is(ReforgingItems.PHOENIX_UPGRADE_SMITHING_TEMPLATE.get()), "lore.item.aether_treasure_reforging.phoenix_upgrade_smithing_template");
    }
}
