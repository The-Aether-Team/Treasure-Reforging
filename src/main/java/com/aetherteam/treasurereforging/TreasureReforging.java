package com.aetherteam.treasurereforging;

import com.aetherteam.treasurereforging.block.ReforgingBlocks;
import com.aetherteam.treasurereforging.data.ReforgingData;
import com.aetherteam.treasurereforging.item.ReforgingItems;
import com.aetherteam.treasurereforging.recipe.TreasureReforgingRecipeSerializers;
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
