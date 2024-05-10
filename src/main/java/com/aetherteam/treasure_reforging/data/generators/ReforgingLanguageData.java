package com.aetherteam.treasure_reforging.data.generators;

import com.aetherteam.treasure_reforging.block.ReforgingBlocks;
import com.aetherteam.treasure_reforging.data.providers.ReforgingLanguageProvider;
import com.aetherteam.treasure_reforging.item.ReforgingItems;
import net.minecraft.data.PackOutput;

public class ReforgingLanguageData extends ReforgingLanguageProvider {
    public ReforgingLanguageData(PackOutput output) {
        super(output);
    }

    @Override
    protected void addTranslations() {
        this.addBlock(ReforgingBlocks.VALKYRUM_BLOCK, "Block of Valkyrum");
        this.addBlock(ReforgingBlocks.PYRAL_BLOCK, "Block of Pyral");

        this.addItem(ReforgingItems.NEPTUNE_MESH, "Neptune Mesh");
        this.addItem(ReforgingItems.VALKYRUM_INGOT, "Valkyrum Ingot");
        this.addItem(ReforgingItems.PYRAL_SHARD, "Pyral Shard");
        this.addItem(ReforgingItems.PYRAL_INGOT, "Pyral Ingot");

        this.addLore(ReforgingItems.NEPTUNE_MESH, "A mesh of interwoven blue metallic links. With the respective template, it can be used in a Smithing Table to forge Neptune armor.");
        this.addLore(ReforgingItems.VALKYRUM_INGOT, "A rare metal utilized by the Valkyries. With the respective template, it can be used in a Smithing Table to forge Valkyrie equipment.");
        this.addLore(ReforgingItems.PYRAL_SHARD, "When combined with obsidian, fragments of Pyral material can be used to craft Pyral Ingots. The shard can also function as a long-lasting fuel.");
        this.addLore(ReforgingItems.PYRAL_INGOT, "A hardened and fire-resistant ingot. With the respective template, it can be used in a Smithing Table to forge Phoenix armor.");
        this.addLore(ReforgingBlocks.VALKYRUM_BLOCK, "A solid block made from Valkyrum Ingots. They can power beacons and be used as decorative accenting.");
        this.addLore(ReforgingBlocks.PYRAL_BLOCK, "A solid block made from Pyral Ingots. They can power beacons and have a fiery look to them.");

        this.addPackDescription("mod", "The Aether: Treasure Reforging Resources");
    }
}
