package com.aetherteam.treasure_reforging.block;

import com.aetherteam.aether.Aether;
import com.aetherteam.aether.block.miscellaneous.FacingPillarBlock;
import com.aetherteam.aether.item.AetherCreativeTabs;
import com.aetherteam.treasure_reforging.item.ReforgingItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;

public class ReforgingBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Aether.MODID);

    public static final RegistryObject<FacingPillarBlock> VALKYRUM_BLOCK = register("valkyrum_block", () -> new FacingPillarBlock(Block.Properties.of(Material.METAL, MaterialColor.QUARTZ).strength(50.0F, 1200.0F).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final RegistryObject<Block> PYRAL_BLOCK = register("pyral_block", () -> new Block(Block.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).strength(50.0F, 1200.0F).requiresCorrectToolForDrops().sound(SoundType.METAL)));

    private static <T extends Block> RegistryObject<T> baseRegister(String name, Supplier<? extends T> block, Function<RegistryObject<T>, Supplier<? extends Item>> item) {
        RegistryObject<T> register = BLOCKS.register(name, block);
        ReforgingItems.ITEMS.register(name, item.apply(register));
        return register;
    }

    @SuppressWarnings("unchecked")
    private static <B extends Block> RegistryObject<B> register(String name, Supplier<? extends Block> block) {
        return (RegistryObject<B>) baseRegister(name, block, ReforgingBlocks::registerBlockItem);
    }

    private static <B extends Block> Supplier<BlockItem> registerBlockItem(final RegistryObject<B> blockRegistryObject) {
        return () -> {
            B block = Objects.requireNonNull(blockRegistryObject.get());
            if (block == PYRAL_BLOCK.get()) {
                return new BlockItem(block, new Item.Properties().fireResistant().tab(AetherCreativeTabs.AETHER_BLOCKS));
            } else {
                return new BlockItem(block, new Item.Properties().tab(AetherCreativeTabs.AETHER_BLOCKS));
            }
        };
    }
}
