package com.aetherteam.treasure_reforging;

import com.aetherteam.treasure_reforging.block.ReforgingBlocks;
import com.aetherteam.treasure_reforging.item.ReforgingItems;
import com.aetherteam.treasure_reforging.recipe.TreasureReforgingRecipeSerializers;
import com.mojang.logging.LogUtils;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import org.slf4j.Logger;

@Mod(TreasureReforging.MODID)
public class TreasureReforging {
    public static final String MODID = "aether_treasure_reforging";
    public static final Logger LOGGER = LogUtils.getLogger();

    public TreasureReforging() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
//        modEventBus.addListener(ReforgingData::dataSetup);

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
