package com.aetherteam.treasure_reforging.data.resources.registries;

import com.aetherteam.treasure_reforging.TreasureReforging;
import com.aetherteam.treasure_reforging.item.ReforgingItems;
import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;

import java.util.Map;

public class ReforgingTrimMaterials {
    public static final ResourceKey<TrimMaterial> NEPTUNE = createKey("neptune");
    public static final ResourceKey<TrimMaterial> VALKYRIE = createKey("valkyrie");
    public static final ResourceKey<TrimMaterial> PHOENIX = createKey("phoenix");

    private static ResourceKey<TrimMaterial> createKey(String name) {
        return ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(TreasureReforging.MODID, name));
    }

    public static void bootstrap(BootstrapContext<TrimMaterial> context) {
        register(context, NEPTUNE, ReforgingItems.NEPTUNE_MESH.get(), Style.EMPTY.withColor(4091864), 0.9F);
        register(context, VALKYRIE, ReforgingItems.VALKYRUM_INGOT.get().asItem(), Style.EMPTY.withColor(13886178), 0.2F);
        register(context, PHOENIX, ReforgingItems.PYRAL_INGOT.get().asItem(), Style.EMPTY.withColor(16750107), 0.5F);
    }

    private static void register(BootstrapContext<TrimMaterial> context, ResourceKey<TrimMaterial> materialKey, Item ingredient, Style style, float itemModelIndex) {
        register(context, materialKey, ingredient, style, itemModelIndex, Map.of());
    }

    private static void register(BootstrapContext<TrimMaterial> context, ResourceKey<TrimMaterial> materialKey, Item ingredient, Style style, float itemModelIndex, Map<Holder<ArmorMaterial>, String> overrideArmorMaterials) {
        TrimMaterial trimMaterial = TrimMaterial.create(materialKey.location().getPath(), ingredient, itemModelIndex, Component.translatable(Util.makeDescriptionId("trim_material", materialKey.location())).withStyle(style), overrideArmorMaterials);
        context.register(materialKey, trimMaterial);
    }
}
