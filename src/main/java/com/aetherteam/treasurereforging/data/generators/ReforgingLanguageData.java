package com.aetherteam.treasurereforging.data.generators;

import com.aetherteam.treasurereforging.data.providers.ReforgingLanguageProvider;
import com.aetherteam.treasurereforging.item.ReforgingItems;
import net.minecraft.data.PackOutput;

public class ReforgingLanguageData extends ReforgingLanguageProvider {
    public ReforgingLanguageData(PackOutput output) {
        super(output);
    }

    @Override
    protected void addTranslations() {
        this.addItem(ReforgingItems.NEPTUNE_MESH, "Neptune Mesh");
        this.addItem(ReforgingItems.VALKYRUM_INGOT, "Valkyrum Ingot");
        this.addItem(ReforgingItems.PYRAL_INGOT, "Pyral Ingot");

        this.addTrim("neptune", "Neptune");
        this.addTrim("valkyrie", "Valkyrie");
        this.addTrim("phoenix", "Phoenix");

        this.addUpgrade("neptune_upgrade", "Neptune Upgrade");
        this.addSmithingTemplateDescription("neptune_upgrade", "additions_slot_description", "Add Neptune Mesh");
        this.addSmithingTemplateDescription("neptune_upgrade", "applies_to", "Zanite Armor");
        this.addSmithingTemplateDescription("neptune_upgrade", "base_slot_description", "Add a piece of zanite armor");
        this.addSmithingTemplateDescription("neptune_upgrade", "ingredients", "Neptune Mesh");

        this.addUpgrade("valkyrie_upgrade", "Valkyrie Upgrade");
        this.addSmithingTemplateDescription("valkyrie_upgrade", "additions_slot_description", "Add Valkyrum Ingot");
        this.addSmithingTemplateDescription("valkyrie_upgrade", "applies_to", "Gravitite Equipment");
        this.addSmithingTemplateDescription("valkyrie_upgrade", "base_slot_description", "Add gravitite armor, weapon, or tool");
        this.addSmithingTemplateDescription("valkyrie_upgrade", "ingredients", "Valkyrum Ingot");

        this.addUpgrade("phoenix_upgrade", "Phoenix Upgrade");
        this.addSmithingTemplateDescription("phoenix_upgrade", "additions_slot_description", "Add Pyral Ingot");
        this.addSmithingTemplateDescription("phoenix_upgrade", "applies_to", "Gravitite Armor");
        this.addSmithingTemplateDescription("phoenix_upgrade", "base_slot_description", "Add a piece of gravitite armor");
        this.addSmithingTemplateDescription("phoenix_upgrade", "ingredients", "Pyral Ingot");

        this.addPackDescription("mod", "The Aether: Treasure Reforging Resources");
    }
}
