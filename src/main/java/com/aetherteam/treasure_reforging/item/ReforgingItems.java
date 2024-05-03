package com.aetherteam.treasure_reforging.item;

import com.aetherteam.treasure_reforging.TreasureReforging;
import com.aetherteam.treasure_reforging.item.materials.PyralShardItem;
import net.minecraft.ChatFormatting;
import net.minecraft.Util;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SmithingTemplateItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ReforgingItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TreasureReforging.MODID);

    private static final ChatFormatting TITLE_FORMAT = ChatFormatting.GRAY;
    private static final ChatFormatting DESCRIPTION_FORMAT = ChatFormatting.BLUE;

    private static final Component NEPTUNE_UPGRADE = Component.translatable(Util.makeDescriptionId("upgrade", new ResourceLocation(TreasureReforging.MODID, "neptune_upgrade"))).withStyle(TITLE_FORMAT);
    private static final Component NEPTUNE_UPGRADE_APPLIES_TO = Component.translatable(Util.makeDescriptionId("item",
            new ResourceLocation(TreasureReforging.MODID, "smithing_template.neptune_upgrade.applies_to"))).withStyle(DESCRIPTION_FORMAT);
    private static final Component NEPTUNE_UPGRADE_INGREDIENTS = Component.translatable(Util.makeDescriptionId("item",
            new ResourceLocation(TreasureReforging.MODID, "smithing_template.neptune_upgrade.ingredients"))).withStyle(DESCRIPTION_FORMAT);
    private static final Component NEPTUNE_UPGRADE_BASE_SLOT_DESCRIPTION = Component.translatable(Util.makeDescriptionId("item",
            new ResourceLocation(TreasureReforging.MODID, "smithing_template.neptune_upgrade.base_slot_description")));
    private static final Component NEPTUNE_UPGRADE_ADDITIONS_SLOT_DESCRIPTION = Component.translatable(Util.makeDescriptionId("item",
            new ResourceLocation(TreasureReforging.MODID, "smithing_template.neptune_upgrade.additions_slot_description")));

    private static final Component VALKYRIE_UPGRADE = Component.translatable(Util.makeDescriptionId("upgrade", new ResourceLocation(TreasureReforging.MODID, "valkyrie_upgrade"))).withStyle(TITLE_FORMAT);
    private static final Component VALKYRIE_UPGRADE_APPLIES_TO = Component.translatable(Util.makeDescriptionId("item",
            new ResourceLocation(TreasureReforging.MODID, "smithing_template.valkyrie_upgrade.applies_to"))).withStyle(DESCRIPTION_FORMAT);
    private static final Component VALKYRIE_UPGRADE_INGREDIENTS = Component.translatable(Util.makeDescriptionId("item",
            new ResourceLocation(TreasureReforging.MODID, "smithing_template.valkyrie_upgrade.ingredients"))).withStyle(DESCRIPTION_FORMAT);
    private static final Component VALKYRIE_UPGRADE_BASE_SLOT_DESCRIPTION = Component.translatable(Util.makeDescriptionId("item",
            new ResourceLocation(TreasureReforging.MODID, "smithing_template.valkyrie_upgrade.base_slot_description")));
    private static final Component VALKYRIE_UPGRADE_ADDITIONS_SLOT_DESCRIPTION = Component.translatable(Util.makeDescriptionId("item",
            new ResourceLocation(TreasureReforging.MODID, "smithing_template.valkyrie_upgrade.additions_slot_description")));

    private static final Component PHOENIX_UPGRADE = Component.translatable(Util.makeDescriptionId("upgrade", new ResourceLocation(TreasureReforging.MODID, "phoenix_upgrade"))).withStyle(TITLE_FORMAT);
    private static final Component PHOENIX_UPGRADE_APPLIES_TO = Component.translatable(Util.makeDescriptionId("item",
            new ResourceLocation(TreasureReforging.MODID, "smithing_template.phoenix_upgrade.applies_to"))).withStyle(DESCRIPTION_FORMAT);
    private static final Component PHOENIX_UPGRADE_INGREDIENTS = Component.translatable(Util.makeDescriptionId("item",
            new ResourceLocation(TreasureReforging.MODID, "smithing_template.phoenix_upgrade.ingredients"))).withStyle(DESCRIPTION_FORMAT);
    private static final Component PHOENIX_UPGRADE_BASE_SLOT_DESCRIPTION = Component.translatable(Util.makeDescriptionId("item",
            new ResourceLocation(TreasureReforging.MODID, "smithing_template.phoenix_upgrade.base_slot_description")));
    private static final Component PHOENIX_UPGRADE_ADDITIONS_SLOT_DESCRIPTION = Component.translatable(Util.makeDescriptionId("item",
            new ResourceLocation(TreasureReforging.MODID, "smithing_template.phoenix_upgrade.additions_slot_description")));

    private static final ResourceLocation EMPTY_SLOT_HELMET = new ResourceLocation("item/empty_armor_slot_helmet");
    private static final ResourceLocation EMPTY_SLOT_CHESTPLATE = new ResourceLocation("item/empty_armor_slot_chestplate");
    private static final ResourceLocation EMPTY_SLOT_LEGGINGS = new ResourceLocation("item/empty_armor_slot_leggings");
    private static final ResourceLocation EMPTY_SLOT_BOOTS = new ResourceLocation("item/empty_armor_slot_boots");
    private static final ResourceLocation EMPTY_SLOT_HOE = new ResourceLocation("item/empty_slot_hoe");
    private static final ResourceLocation EMPTY_SLOT_AXE = new ResourceLocation("item/empty_slot_axe");
    private static final ResourceLocation EMPTY_SLOT_SWORD = new ResourceLocation("item/empty_slot_sword");
    private static final ResourceLocation EMPTY_SLOT_SHOVEL = new ResourceLocation("item/empty_slot_shovel");
    private static final ResourceLocation EMPTY_SLOT_PICKAXE = new ResourceLocation("item/empty_slot_pickaxe");
    private static final ResourceLocation EMPTY_SLOT_MESH = new ResourceLocation(TreasureReforging.MODID, "item/empty_slot_mesh");
    private static final ResourceLocation EMPTY_SLOT_INGOT = new ResourceLocation("item/empty_slot_ingot");

    public static final RegistryObject<Item> NEPTUNE_MESH = ITEMS.register("neptune_mesh", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VALKYRUM_INGOT = ITEMS.register("valkyrum_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PYRAL_SHARD = ITEMS.register("pyral_shard", () -> new PyralShardItem(new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> PYRAL_INGOT = ITEMS.register("pyral_ingot", () -> new Item(new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> NEPTUNE_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("neptune_upgrade_smithing_template", ReforgingItems::createNeptuneUpgradeTemplate);
    public static final RegistryObject<Item> VALKYRIE_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("valkyrie_upgrade_smithing_template", ReforgingItems::createValkyrieUpgradeTemplate);
    public static final RegistryObject<Item> PHOENIX_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("phoenix_upgrade_smithing_template", ReforgingItems::createPhoenixUpgradeTemplate);

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
