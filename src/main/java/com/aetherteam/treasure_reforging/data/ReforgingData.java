package com.aetherteam.treasure_reforging.data;

import com.aetherteam.treasure_reforging.data.generators.*;
import com.aetherteam.treasure_reforging.data.generators.tags.ReforgingBlockTagData;
import com.aetherteam.treasure_reforging.data.generators.tags.ReforgingItemTagData;
import net.minecraft.DetectedVersion;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.metadata.PackMetadataGenerator;
import net.minecraft.network.chat.Component;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.metadata.pack.PackMetadataSection;
import net.minecraft.util.InclusiveRange;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class ReforgingData {
    public static void dataSetup(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper fileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        PackOutput packOutput = generator.getPackOutput();

        // Client Data
        generator.addProvider(event.includeClient(), new ReforgingBlockStateData(packOutput, fileHelper));
        generator.addProvider(event.includeClient(), new ReforgingItemModelData(packOutput, fileHelper));
        generator.addProvider(event.includeClient(), new ReforgingLanguageData(packOutput));

        // Server Data
        generator.addProvider(event.includeServer(), new ReforgingRegistrySets(packOutput, lookupProvider));
        generator.addProvider(event.includeServer(), new ReforgingRecipeData(packOutput, lookupProvider));
        generator.addProvider(event.includeServer(), ReforgingLootTableData.create(packOutput, lookupProvider));
        generator.addProvider(event.includeServer(), new ReforgingLootModifierData(packOutput, lookupProvider));
        ReforgingBlockTagData blockTags = new ReforgingBlockTagData(packOutput, lookupProvider, fileHelper);
        generator.addProvider(event.includeServer(), blockTags);
        generator.addProvider(event.includeServer(), new ReforgingItemTagData(packOutput, lookupProvider, blockTags.contentsGetter(), fileHelper));

        // pack.mcmeta
        generator.addProvider(true, new PackMetadataGenerator(packOutput).add(PackMetadataSection.TYPE, new PackMetadataSection(
                Component.translatable("pack.aether_treasure_reforging.mod.description"),
                DetectedVersion.BUILT_IN.getPackVersion(PackType.SERVER_DATA),
                Optional.of(new InclusiveRange<>(0, Integer.MAX_VALUE)))));
    }
}
