//package com.aetherteam.treasure_reforging.data.generators;
//
//import com.aetherteam.treasure_reforging.block.ReforgingBlocks;
//import com.aetherteam.treasure_reforging.data.providers.ReforgingLanguageProvider;
//import com.aetherteam.treasure_reforging.item.ReforgingItems;
//import net.minecraft.data.PackOutput;
//
//public class ReforgingLanguageData extends ReforgingLanguageProvider {
//    public ReforgingLanguageData(PackOutput output) {
//        super(output);
//    }
//
//    @Override
//    protected void addTranslations() {
//        this.addBlock(ReforgingBlocks.VALKYRUM_BLOCK, "Block of Valkyrum");
//        this.addBlock(ReforgingBlocks.PYRAL_BLOCK, "Block of Pyral");
//
//        this.addItem(ReforgingItems.NEPTUNE_MESH, "Neptune Mesh");
//        this.addItem(ReforgingItems.VALKYRUM_INGOT, "Valkyrum Ingot");
//        this.addItem(ReforgingItems.PYRAL_SHARD, "Pyral Shard");
//        this.addItem(ReforgingItems.PYRAL_INGOT, "Pyral Ingot");
//        this.addItem(ReforgingItems.NEPTUNE_UPGRADE_SMITHING_TEMPLATE, "Smithing Template");
//        this.addItem(ReforgingItems.VALKYRIE_UPGRADE_SMITHING_TEMPLATE, "Smithing Template");
//        this.addItem(ReforgingItems.PHOENIX_UPGRADE_SMITHING_TEMPLATE, "Smithing Template");
//
//        this.addTrim("neptune", "Neptune");
//        this.addTrim("valkyrie", "Valkyrie");
//        this.addTrim("phoenix", "Phoenix");
//
//        this.addUpgrade("neptune_upgrade", "Neptune Upgrade");
//        this.addSmithingTemplateDescription("neptune_upgrade", "additions_slot_description", "Add Neptune Mesh");
//        this.addSmithingTemplateDescription("neptune_upgrade", "applies_to", "Zanite Armor");
//        this.addSmithingTemplateDescription("neptune_upgrade", "base_slot_description", "Add a piece of zanite armor");
//        this.addSmithingTemplateDescription("neptune_upgrade", "ingredients", "Neptune Mesh");
//
//        this.addUpgrade("valkyrie_upgrade", "Valkyrie Upgrade");
//        this.addSmithingTemplateDescription("valkyrie_upgrade", "additions_slot_description", "Add Valkyrum Ingot");
//        this.addSmithingTemplateDescription("valkyrie_upgrade", "applies_to", "Gravitite Equipment");
//        this.addSmithingTemplateDescription("valkyrie_upgrade", "base_slot_description", "Add gravitite armor, weapon, or tool");
//        this.addSmithingTemplateDescription("valkyrie_upgrade", "ingredients", "Valkyrum Ingot");
//
//        this.addUpgrade("phoenix_upgrade", "Phoenix Upgrade");
//        this.addSmithingTemplateDescription("phoenix_upgrade", "additions_slot_description", "Add Pyral Ingot");
//        this.addSmithingTemplateDescription("phoenix_upgrade", "applies_to", "Gravitite Armor");
//        this.addSmithingTemplateDescription("phoenix_upgrade", "base_slot_description", "Add a piece of gravitite armor");
//        this.addSmithingTemplateDescription("phoenix_upgrade", "ingredients", "Pyral Ingot");
//
//        this.addLore(ReforgingItems.NEPTUNE_MESH, "A mesh of interwoven blue metallic links. With the respective template, it can be used in a Smithing Table to forge Neptune armor.");
//        this.addLore(ReforgingItems.VALKYRUM_INGOT, "A rare metal utilized by the Valkyries. With the respective template, it can be used in a Smithing Table to forge Valkyrie equipment.");
//        this.addLore(ReforgingItems.PYRAL_SHARD, "When combined with obsidian, fragments of Pyral material can be used to craft Pyral Ingots. The shard can also function as a long-lasting fuel.");
//        this.addLore(ReforgingItems.PYRAL_INGOT, "A hardened and fire-resistant ingot. With the respective template, it can be used in a Smithing Table to forge Phoenix armor.");
//        this.addLore(ReforgingBlocks.VALKYRUM_BLOCK, "A solid block made from Valkyrum Ingots. They can power beacons and be used as decorative accenting.");
//        this.addLore(ReforgingBlocks.PYRAL_BLOCK, "A solid block made from Pyral Ingots. They can power beacons and have a fiery look to them.");
//        this.addLoreUnique("item.aether_treasure_reforging." + ReforgingItems.NEPTUNE_UPGRADE_SMITHING_TEMPLATE.getKey().location().getPath(), "A smithing template that can be used in the creation of Neptune Armor, using both Neptune Mesh and Zanite Armor.");
//        this.addLoreUnique("item.aether_treasure_reforging." + ReforgingItems.VALKYRIE_UPGRADE_SMITHING_TEMPLATE.getKey().location().getPath(), "A smithing template that can be used in the creation of Valkyrie equipment, using both Valkyrum Ingots and Gravitite equipment.");
//        this.addLoreUnique("item.aether_treasure_reforging." + ReforgingItems.PHOENIX_UPGRADE_SMITHING_TEMPLATE.getKey().location().getPath(), "A smithing template that can be used in the creation of Phoenix Armor, using both Pyral Ingots and Gravitite Armor.");
//
//        this.addPackDescription("mod", "The Aether: Treasure Reforging Resources");
//    }
//}
