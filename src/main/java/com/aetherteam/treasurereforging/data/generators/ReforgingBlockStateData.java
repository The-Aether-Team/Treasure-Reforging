package com.aetherteam.treasurereforging.data.generators;

import com.aetherteam.treasurereforging.TreasureReforging;
import com.aetherteam.treasurereforging.block.ReforgingBlocks;
import com.aetherteam.treasurereforging.data.providers.ReforgingBlockStateProvider;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;

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
