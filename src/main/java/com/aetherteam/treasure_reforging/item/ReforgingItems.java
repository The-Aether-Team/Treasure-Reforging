package com.aetherteam.treasure_reforging.item;

import com.aetherteam.treasure_reforging.TreasureReforging;
import com.aetherteam.treasure_reforging.item.materials.PyralShardItem;
import net.minecraft.ChatFormatting;
import net.minecraft.Util;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SmithingTemplateItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ReforgingItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TreasureReforging.MODID);

    public static final RegistryObject<Item> NEPTUNE_MESH = ITEMS.register("neptune_mesh", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VALKYRUM_INGOT = ITEMS.register("valkyrum_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PYRAL_SHARD = ITEMS.register("pyral_shard", () -> new PyralShardItem(new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> PYRAL_INGOT = ITEMS.register("pyral_ingot", () -> new Item(new Item.Properties().fireResistant()));
}
