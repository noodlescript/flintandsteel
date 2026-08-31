package cc.cassian.flintandsteel;

import cc.cassian.flintandsteel.cobblemon.items.FlintSteelBallRegistry;
import cc.cassian.flintandsteel.cobblemon.items.FlintSteelPokedexRegistry;
import cc.cassian.flintandsteel.registry.FlintSteelComponentTypes;
import cc.cassian.flintandsteel.registry.FlintSteelItems;
import cc.cassian.flintandsteel.registry.FlintSteelSoundEvents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.registries.RegisterEvent;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;

@Mod(FlintSteelCore.MODID)
@EventBusSubscriber(modid = FlintSteelCore.MODID)
public class FlintSteelCore {
    public static final String MODID = "flintsteel_core";
    public static final Logger LOGGER = LogUtils.getLogger();

    public FlintSteelCore(IEventBus modEventBus, ModContainer modContainer) {

    }

    public static ResourceLocation of(String name) {
        return ResourceLocation.fromNamespaceAndPath(MODID, name);
    }

    @SubscribeEvent
    static void register(RegisterEvent event) {
        if (event.getRegistryKey().equals(Registries.ITEM)) {
            FlintSteelBallRegistry.INSTANCE.registerItems();
            FlintSteelItems.touch();
        }
        if (event.getRegistryKey().equals(Registries.DATA_COMPONENT_TYPE)) {
            FlintSteelComponentTypes.touch();
        }
        if (event.getRegistryKey().equals(Registries.SOUND_EVENT)) {
            FlintSteelSoundEvents.touch();
        }

    }
    public static void  onRegister(RegisterEvent event) {
        // event.register(BuiltInRegistries.ITEM.key(), FlintSteelPokedexRegistry::registerItems);
        // event.register(BuiltInRegistries.BLOCK.key(), FlintSteelCampfirePotRegistry::registerBlocks);
        // event.register(BuiltInRegistries.ITEM.key(), FlintSteelCampfirePotRegistry::registerItems);

    }
    public static ResourceLocation location(String path) {
        return ResourceLocation.fromNamespaceAndPath(MODID, path);
    }
}
