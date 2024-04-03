package com.aetherteam.treasurereforging.data.generators.tags;

import com.aetherteam.treasurereforging.TreasureReforging;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ReforgingBlockTagData extends BlockTagsProvider {
    public ReforgingBlockTagData(PackOutput output, CompletableFuture<HolderLookup.Provider> registries, @Nullable ExistingFileHelper helper) {
        super(output, registries, TreasureReforging.MODID, helper);
    }

    @Override
    public void addTags(HolderLookup.Provider provider) {

    }
}
