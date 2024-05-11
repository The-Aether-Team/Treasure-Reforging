package com.aetherteam.treasure_reforging.data.generators;

import com.aetherteam.treasure_reforging.TreasureReforging;
import com.aetherteam.treasure_reforging.block.ReforgingBlocks;
import com.aetherteam.treasure_reforging.data.providers.ReforgingBlockStateProvider;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ReforgingBlockStateData extends ReforgingBlockStateProvider {
    public ReforgingBlockStateData(PackOutput output, ExistingFileHelper helper) {
        super(output, TreasureReforging.MODID, helper);
    }

    @Override
    public void registerStatesAndModels() {
        this.pillarTop(ReforgingBlocks.VALKYRUM_BLOCK.get());
        this.block(ReforgingBlocks.PYRAL_BLOCK.get(), "construction/");
    }
}
