package com.aetherteam.treasure_reforging.block;

import com.aetherteam.aether.Aether;
import com.aetherteam.aether.block.miscellaneous.FacingPillarBlock;
import com.aetherteam.treasure_reforging.item.ReforgingItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;

public class ReforgingBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Aether.MODID);

    public static final DeferredBlock<FacingPillarBlock> VALKYRUM_BLOCK = register("valkyrum_block", () -> new FacingPillarBlock(Block.Properties.of().mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.CHIME).strength(50.0F, 1200.0F).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final DeferredBlock<Block> PYRAL_BLOCK = register("pyral_block", () -> new Block(Block.Properties.of().mapColor(MapColor.COLOR_ORANGE).instrument(NoteBlockInstrument.DIDGERIDOO).strength(50.0F, 1200.0F).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    private static <T extends Block> DeferredBlock<T> baseRegister(String name, Supplier<? extends T> block, Function<DeferredBlock<T>, Supplier<? extends Item>> item) {
        DeferredBlock<T> register = BLOCKS.register(name, block);
        ReforgingItems.ITEMS.register(name, item.apply(register));
        return register;
    }

    @SuppressWarnings("unchecked")
    private static <B extends Block> DeferredBlock<B> register(String name, Supplier<? extends Block> block) {
        return (DeferredBlock<B>) baseRegister(name, block, ReforgingBlocks::registerBlockItem);
    }

    private static <B extends Block> Supplier<BlockItem> registerBlockItem(final DeferredBlock< B> blockRegistryObject) {
        return () -> {
            B block = Objects.requireNonNull(blockRegistryObject.get());
            if (block == PYRAL_BLOCK.get()) {
                return new BlockItem(block, new Item.Properties().fireResistant());
            } else {
                return new BlockItem(block, new Item.Properties());
            }
        };
    }
}
