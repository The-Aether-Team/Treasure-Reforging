package com.aetherteam.treasure_reforging.data;

import com.aetherteam.treasure_reforging.data.generators.ReforgingBlockStateData;
import com.aetherteam.treasure_reforging.data.generators.ReforgingItemModelData;
import com.aetherteam.treasure_reforging.data.generators.ReforgingLanguageData;
import com.aetherteam.treasure_reforging.data.generators.ReforgingRecipeData;
import com.aetherteam.treasure_reforging.data.generators.tags.ReforgingBlockTagData;
import com.aetherteam.treasure_reforging.data.generators.tags.ReforgingItemTagData;
import net.minecraft.SharedConstants;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.metadata.PackMetadataGenerator;
import net.minecraft.network.chat.Component;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.metadata.pack.PackMetadataSection;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;

import java.util.Map;
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
        generator.addProvider(event.includeServer(), new ReforgingRecipeData(packOutput));
        ReforgingBlockTagData blockTags = new ReforgingBlockTagData(packOutput, lookupProvider, fileHelper);
        generator.addProvider(event.includeServer(), blockTags);
        generator.addProvider(event.includeServer(), new ReforgingItemTagData(packOutput, lookupProvider, blockTags.contentsGetter(), fileHelper));

        // pack.mcmeta
        PackMetadataGenerator packMeta = new PackMetadataGenerator(packOutput);
        Map<PackType, Integer> packTypes = Map.of(PackType.SERVER_DATA, SharedConstants.getCurrentVersion().getPackVersion(PackType.SERVER_DATA));
        packMeta.add(PackMetadataSection.TYPE, new PackMetadataSection(Component.translatable("pack.aether_treasure_reforging.mod.description"), SharedConstants.getCurrentVersion().getPackVersion(PackType.CLIENT_RESOURCES), packTypes));
        generator.addProvider(true, packMeta);
    }
}
