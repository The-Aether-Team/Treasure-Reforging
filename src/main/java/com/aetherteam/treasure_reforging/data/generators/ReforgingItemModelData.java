//package com.aetherteam.treasure_reforging.data.generators;
//
//import com.aetherteam.nitrogen.data.providers.NitrogenItemModelProvider;
//import com.aetherteam.treasure_reforging.TreasureReforging;
//import com.aetherteam.treasure_reforging.block.ReforgingBlocks;
//import com.aetherteam.treasure_reforging.item.ReforgingItems;
//import net.minecraft.data.PackOutput;
//import net.neoforged.neoforge.common.data.ExistingFileHelper;
//
//public class ReforgingItemModelData extends NitrogenItemModelProvider {
//    public ReforgingItemModelData(PackOutput output, ExistingFileHelper helper) {
//        super(output, TreasureReforging.MODID, helper);
//    }
//
//    @Override
//    protected void registerModels() {
//        this.item(ReforgingItems.NEPTUNE_MESH.get(), "materials/");
//        this.item(ReforgingItems.VALKYRUM_INGOT.get(), "materials/");
//        this.item(ReforgingItems.PYRAL_SHARD.get(), "materials/");
//        this.item(ReforgingItems.PYRAL_INGOT.get(), "materials/");
//        this.item(ReforgingItems.NEPTUNE_UPGRADE_SMITHING_TEMPLATE.get(), "upgrades/");
//        this.item(ReforgingItems.VALKYRIE_UPGRADE_SMITHING_TEMPLATE.get(), "upgrades/");
//        this.item(ReforgingItems.PHOENIX_UPGRADE_SMITHING_TEMPLATE.get(), "upgrades/");
//
//        this.itemBlock(ReforgingBlocks.VALKYRUM_BLOCK.get());
//        this.itemBlock(ReforgingBlocks.PYRAL_BLOCK.get());
//    }
//}
