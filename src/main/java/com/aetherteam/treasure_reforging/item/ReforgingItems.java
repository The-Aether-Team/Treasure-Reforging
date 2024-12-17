package com.aetherteam.treasure_reforging.item;

import com.aetherteam.treasure_reforging.TreasureReforging;
import com.aetherteam.treasure_reforging.item.materials.PyralShardItem;
import net.minecraft.ChatFormatting;
import net.minecraft.Util;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SmithingTemplateItem;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;

public class ReforgingItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(TreasureReforging.MODID);

    private static final ChatFormatting TITLE_FORMAT = ChatFormatting.GRAY;
    private static final ChatFormatting DESCRIPTION_FORMAT = ChatFormatting.BLUE;

    private static final Component NEPTUNE_UPGRADE = Component.translatable(Util.makeDescriptionId("upgrade", ResourceLocation.fromNamespaceAndPath(TreasureReforging.MODID, "neptune_upgrade"))).withStyle(TITLE_FORMAT);
    private static final Component NEPTUNE_UPGRADE_APPLIES_TO = Component.translatable(Util.makeDescriptionId("item",
            ResourceLocation.fromNamespaceAndPath(TreasureReforging.MODID, "smithing_template.neptune_upgrade.applies_to"))).withStyle(DESCRIPTION_FORMAT);
    private static final Component NEPTUNE_UPGRADE_INGREDIENTS = Component.translatable(Util.makeDescriptionId("item",
            ResourceLocation.fromNamespaceAndPath(TreasureReforging.MODID, "smithing_template.neptune_upgrade.ingredients"))).withStyle(DESCRIPTION_FORMAT);
    private static final Component NEPTUNE_UPGRADE_BASE_SLOT_DESCRIPTION = Component.translatable(Util.makeDescriptionId("item",
            ResourceLocation.fromNamespaceAndPath(TreasureReforging.MODID, "smithing_template.neptune_upgrade.base_slot_description")));
    private static final Component NEPTUNE_UPGRADE_ADDITIONS_SLOT_DESCRIPTION = Component.translatable(Util.makeDescriptionId("item",
            ResourceLocation.fromNamespaceAndPath(TreasureReforging.MODID, "smithing_template.neptune_upgrade.additions_slot_description")));

    private static final Component VALKYRIE_UPGRADE = Component.translatable(Util.makeDescriptionId("upgrade", ResourceLocation.fromNamespaceAndPath(TreasureReforging.MODID, "valkyrie_upgrade"))).withStyle(TITLE_FORMAT);
    private static final Component VALKYRIE_UPGRADE_APPLIES_TO = Component.translatable(Util.makeDescriptionId("item",
            ResourceLocation.fromNamespaceAndPath(TreasureReforging.MODID, "smithing_template.valkyrie_upgrade.applies_to"))).withStyle(DESCRIPTION_FORMAT);
    private static final Component VALKYRIE_UPGRADE_INGREDIENTS = Component.translatable(Util.makeDescriptionId("item",
            ResourceLocation.fromNamespaceAndPath(TreasureReforging.MODID, "smithing_template.valkyrie_upgrade.ingredients"))).withStyle(DESCRIPTION_FORMAT);
    private static final Component VALKYRIE_UPGRADE_BASE_SLOT_DESCRIPTION = Component.translatable(Util.makeDescriptionId("item",
            ResourceLocation.fromNamespaceAndPath(TreasureReforging.MODID, "smithing_template.valkyrie_upgrade.base_slot_description")));
    private static final Component VALKYRIE_UPGRADE_ADDITIONS_SLOT_DESCRIPTION = Component.translatable(Util.makeDescriptionId("item",
            ResourceLocation.fromNamespaceAndPath(TreasureReforging.MODID, "smithing_template.valkyrie_upgrade.additions_slot_description")));

    private static final Component PHOENIX_UPGRADE = Component.translatable(Util.makeDescriptionId("upgrade", ResourceLocation.fromNamespaceAndPath(TreasureReforging.MODID, "phoenix_upgrade"))).withStyle(TITLE_FORMAT);
    private static final Component PHOENIX_UPGRADE_APPLIES_TO = Component.translatable(Util.makeDescriptionId("item",
            ResourceLocation.fromNamespaceAndPath(TreasureReforging.MODID, "smithing_template.phoenix_upgrade.applies_to"))).withStyle(DESCRIPTION_FORMAT);
    private static final Component PHOENIX_UPGRADE_INGREDIENTS = Component.translatable(Util.makeDescriptionId("item",
            ResourceLocation.fromNamespaceAndPath(TreasureReforging.MODID, "smithing_template.phoenix_upgrade.ingredients"))).withStyle(DESCRIPTION_FORMAT);
    private static final Component PHOENIX_UPGRADE_BASE_SLOT_DESCRIPTION = Component.translatable(Util.makeDescriptionId("item",
            ResourceLocation.fromNamespaceAndPath(TreasureReforging.MODID, "smithing_template.phoenix_upgrade.base_slot_description")));
    private static final Component PHOENIX_UPGRADE_ADDITIONS_SLOT_DESCRIPTION = Component.translatable(Util.makeDescriptionId("item",
            ResourceLocation.fromNamespaceAndPath(TreasureReforging.MODID, "smithing_template.phoenix_upgrade.additions_slot_description")));

    private static final ResourceLocation EMPTY_SLOT_HELMET = ResourceLocation.withDefaultNamespace("item/empty_armor_slot_helmet");
    private static final ResourceLocation EMPTY_SLOT_CHESTPLATE = ResourceLocation.withDefaultNamespace("item/empty_armor_slot_chestplate");
    private static final ResourceLocation EMPTY_SLOT_LEGGINGS = ResourceLocation.withDefaultNamespace("item/empty_armor_slot_leggings");
    private static final ResourceLocation EMPTY_SLOT_BOOTS = ResourceLocation.withDefaultNamespace("item/empty_armor_slot_boots");
    private static final ResourceLocation EMPTY_SLOT_HOE = ResourceLocation.withDefaultNamespace("item/empty_slot_hoe");
    private static final ResourceLocation EMPTY_SLOT_AXE = ResourceLocation.withDefaultNamespace("item/empty_slot_axe");
    private static final ResourceLocation EMPTY_SLOT_SWORD = ResourceLocation.withDefaultNamespace("item/empty_slot_sword");
    private static final ResourceLocation EMPTY_SLOT_SHOVEL = ResourceLocation.withDefaultNamespace("item/empty_slot_shovel");
    private static final ResourceLocation EMPTY_SLOT_PICKAXE = ResourceLocation.withDefaultNamespace("item/empty_slot_pickaxe");
    private static final ResourceLocation EMPTY_SLOT_MESH = ResourceLocation.fromNamespaceAndPath(TreasureReforging.MODID, "item/empty_slot_mesh");
    private static final ResourceLocation EMPTY_SLOT_INGOT = ResourceLocation.withDefaultNamespace("item/empty_slot_ingot");

    public static final DeferredItem<Item> NEPTUNE_MESH = ITEMS.register("neptune_mesh", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> VALKYRUM_INGOT = ITEMS.register("valkyrum_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PYRAL_SHARD = ITEMS.register("pyral_shard", () -> new PyralShardItem(new Item.Properties().fireResistant()));
    public static final DeferredItem<Item> PYRAL_INGOT = ITEMS.register("pyral_ingot", () -> new Item(new Item.Properties().fireResistant()));

    public static final DeferredItem<Item> NEPTUNE_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("neptune_upgrade_smithing_template", ReforgingItems::createNeptuneUpgradeTemplate);
    public static final DeferredItem<Item> VALKYRIE_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("valkyrie_upgrade_smithing_template", ReforgingItems::createValkyrieUpgradeTemplate);
    public static final DeferredItem<Item> PHOENIX_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("phoenix_upgrade_smithing_template", ReforgingItems::createPhoenixUpgradeTemplate);

    public static SmithingTemplateItem createNeptuneUpgradeTemplate() {
        return new SmithingTemplateItem(NEPTUNE_UPGRADE_APPLIES_TO,
                NEPTUNE_UPGRADE_INGREDIENTS,
                NEPTUNE_UPGRADE,
                NEPTUNE_UPGRADE_BASE_SLOT_DESCRIPTION,
                NEPTUNE_UPGRADE_ADDITIONS_SLOT_DESCRIPTION,
                createArmorUpgradeIconList(),
                createMeshUpgradeMaterialList());
    }

    public static SmithingTemplateItem createValkyrieUpgradeTemplate() {
        return new SmithingTemplateItem(VALKYRIE_UPGRADE_APPLIES_TO,
                VALKYRIE_UPGRADE_INGREDIENTS,
                VALKYRIE_UPGRADE,
                VALKYRIE_UPGRADE_BASE_SLOT_DESCRIPTION,
                VALKYRIE_UPGRADE_ADDITIONS_SLOT_DESCRIPTION,
                createAllUpgradeIconList(),
                createIngotUpgradeMaterialList());
    }

    public static SmithingTemplateItem createPhoenixUpgradeTemplate() {
        return new SmithingTemplateItem(PHOENIX_UPGRADE_APPLIES_TO,
                PHOENIX_UPGRADE_INGREDIENTS,
                PHOENIX_UPGRADE,
                PHOENIX_UPGRADE_BASE_SLOT_DESCRIPTION,
                PHOENIX_UPGRADE_ADDITIONS_SLOT_DESCRIPTION,
                createArmorUpgradeIconList(),
                createIngotUpgradeMaterialList());
    }

    private static List<ResourceLocation> createArmorUpgradeIconList() {
        return List.of(EMPTY_SLOT_HELMET, EMPTY_SLOT_CHESTPLATE, EMPTY_SLOT_LEGGINGS, EMPTY_SLOT_BOOTS);
    }

    private static List<ResourceLocation> createAllUpgradeIconList() {
        return List.of(EMPTY_SLOT_HELMET, EMPTY_SLOT_SWORD, EMPTY_SLOT_CHESTPLATE, EMPTY_SLOT_PICKAXE, EMPTY_SLOT_LEGGINGS, EMPTY_SLOT_AXE, EMPTY_SLOT_BOOTS, EMPTY_SLOT_HOE, EMPTY_SLOT_SHOVEL);
    }

    private static List<ResourceLocation> createMeshUpgradeMaterialList() {
        return List.of(EMPTY_SLOT_MESH);
    }

    private static List<ResourceLocation> createIngotUpgradeMaterialList() {
        return List.of(EMPTY_SLOT_INGOT);
    }
}
