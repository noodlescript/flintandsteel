package cc.cassian.flintandsteel;

import cc.cassian.flintandsteel.registry.FlintAndSteelComponentTypes;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.ItemTooltipEvent;
import net.neoforged.neoforge.registries.RegisterEvent;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

@Mod(FlintandSteelCore.MODID)
@EventBusSubscriber(modid = FlintandSteelCore.MODID)
public class FlintandSteelCore {
    public static final String MODID = "flintandsteel";
    public static final Logger LOGGER = LogUtils.getLogger();

    public FlintandSteelCore(IEventBus modEventBus, ModContainer modContainer) {

    }

    public static ResourceLocation of(String name) {
        return ResourceLocation.fromNamespaceAndPath(MODID, name);
    }

    @SubscribeEvent
    static void register(RegisterEvent event) {
        if (event.getRegistryKey().equals(Registries.DATA_COMPONENT_TYPE)) {
            FlintAndSteelComponentTypes.touch();
        }
    }
}
