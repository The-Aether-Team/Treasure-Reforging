//package com.aetherteam.treasure_reforging.data.providers;
//
//import com.aetherteam.aether.block.miscellaneous.FacingPillarBlock;
//import com.aetherteam.nitrogen.data.providers.NitrogenBlockStateProvider;
//import net.minecraft.core.Direction;
//import net.minecraft.data.PackOutput;
//import net.minecraft.resources.ResourceLocation;
//import net.neoforged.neoforge.client.model.generators.ModelFile;
//import net.neoforged.neoforge.common.data.ExistingFileHelper;
//
//public abstract class ReforgingBlockStateProvider extends NitrogenBlockStateProvider {
//    public ReforgingBlockStateProvider(PackOutput output, String id, ExistingFileHelper helper) {
//        super(output, id, helper);
//    }
//
//    public void pillarTop(FacingPillarBlock block) {
//        ResourceLocation side = this.texture(this.name(block), "construction/");
//        ResourceLocation end = this.texture(this.name(block) + "_top", "construction/");
//        ModelFile vertical = this.models().cubeColumn(this.name(block), side, end);
//        ModelFile horizontal = this.models().cubeColumnHorizontal(this.name(block) + "_horizontal", side, end);
//        this.getVariantBuilder(block)
//                .partialState().with(FacingPillarBlock.FACING, Direction.DOWN).modelForState().modelFile(vertical).rotationX(180).addModel()
//                .partialState().with(FacingPillarBlock.FACING, Direction.EAST).modelForState().modelFile(horizontal).rotationX(90).rotationY(90).addModel()
//                .partialState().with(FacingPillarBlock.FACING, Direction.NORTH).modelForState().modelFile(horizontal).rotationX(90).addModel()
//                .partialState().with(FacingPillarBlock.FACING, Direction.SOUTH).modelForState().modelFile(horizontal).rotationX(90).rotationY(180).addModel()
//                .partialState().with(FacingPillarBlock.FACING, Direction.UP).modelForState().modelFile(vertical).addModel()
//                .partialState().with(FacingPillarBlock.FACING, Direction.WEST).modelForState().modelFile(horizontal).rotationX(90).rotationY(270).addModel();
//    }
//}
