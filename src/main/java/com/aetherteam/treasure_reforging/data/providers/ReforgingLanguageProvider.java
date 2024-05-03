package com.aetherteam.treasure_reforging.data.providers;

import com.aetherteam.aether.data.providers.AetherLanguageProvider;
import com.aetherteam.treasure_reforging.TreasureReforging;
import net.minecraft.data.PackOutput;

public abstract class ReforgingLanguageProvider extends AetherLanguageProvider {
    public ReforgingLanguageProvider(PackOutput output) {
        super(output, TreasureReforging.MODID);
    }

    public void addUpgrade(String upgrade, String name) {
        this.add("upgrade." + this.id + "." + upgrade, name);
    }

    public void addSmithingTemplateDescription(String upgrade, String suffix, String name) {
        this.add("item." + this.id + ".smithing_template." + upgrade + "." + suffix, name);
    }
}
