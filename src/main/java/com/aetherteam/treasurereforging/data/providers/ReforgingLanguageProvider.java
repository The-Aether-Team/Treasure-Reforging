package com.aetherteam.treasurereforging.data.providers;

import com.aetherteam.nitrogen.data.providers.NitrogenLanguageProvider;
import com.aetherteam.treasurereforging.TreasureReforging;
import net.minecraft.data.PackOutput;

public abstract class ReforgingLanguageProvider extends NitrogenLanguageProvider {
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
