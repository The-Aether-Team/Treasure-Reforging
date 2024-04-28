package com.aetherteam.treasurereforging.data.generators;

import com.aetherteam.aether.block.AetherBlocks;
import com.aetherteam.nitrogen.data.providers.NitrogenItemModelProvider;
import com.aetherteam.treasurereforging.TreasureReforging;
import com.aetherteam.treasurereforging.block.ReforgingBlocks;
import com.aetherteam.treasurereforging.item.ReforgingItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ReforgingItemModelData extends NitrogenItemModelProvider {
    public ReforgingItemModelData(PackOutput output, ExistingFileHelper helper) {
        super(output, TreasureReforging.MODID, helper);
    }

    @Override
    protected void registerModels() {
        this.item(ReforgingItems.NEPTUNE_MESH.get(), "materials/");
        this.item(ReforgingItems.VALKYRUM_INGOT.get(), "materials/");
        this.item(ReforgingItems.PYRAL_INGOT.get(), "materials/");
        this.item(ReforgingItems.NEPTUNE_UPGRADE_SMITHING_TEMPLATE.get(), "upgrades/");
        this.item(ReforgingItems.VALKYRIE_UPGRADE_SMITHING_TEMPLATE.get(), "upgrades/");
        this.item(ReforgingItems.PHOENIX_UPGRADE_SMITHING_TEMPLATE.get(), "upgrades/");

        this.itemBlock(ReforgingBlocks.VALKYRUM_BLOCK.get());
        this.itemBlock(ReforgingBlocks.PYRAL_BLOCK.get());
    }
}
