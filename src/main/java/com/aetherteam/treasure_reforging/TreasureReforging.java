package com.aetherteam.treasure_reforging;

import com.aetherteam.treasure_reforging.block.ReforgingBlocks;
import com.aetherteam.treasure_reforging.data.ReforgingData;
import com.aetherteam.treasure_reforging.item.ReforgingItems;
import com.aetherteam.treasure_reforging.recipe.TreasureReforgingRecipeSerializers;
import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.javafmlmod.FMLJavaModLoadingContext;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.slf4j.Logger;

@Mod(TreasureReforging.MODID)
public class TreasureReforging {
    public static final String MODID = "aether_treasure_reforging";
    public static final Logger LOGGER = LogUtils.getLogger();

    public TreasureReforging() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(ReforgingData::dataSetup);

        DeferredRegister<?>[] registers = {
                ReforgingBlocks.BLOCKS,
                ReforgingItems.ITEMS,
                TreasureReforgingRecipeSerializers.RECIPE_SERIALIZERS
        };

        for (DeferredRegister<?> register : registers) {
            register.register(modEventBus);
        }
    }
}
