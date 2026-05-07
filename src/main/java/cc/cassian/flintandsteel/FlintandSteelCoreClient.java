package cc.cassian.flintandsteel;

import cc.cassian.flintandsteel.registry.FlintAndSteelComponentTypes;
import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.gui.ConfigurationScreen;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;
import net.neoforged.neoforge.event.entity.player.ItemTooltipEvent;
import org.apache.commons.lang3.text.WordUtils;

@Mod(value = FlintandSteelCore.MODID, dist = Dist.CLIENT)
@EventBusSubscriber(modid = FlintandSteelCore.MODID, value = Dist.CLIENT)
public class FlintandSteelCoreClient {
    public FlintandSteelCoreClient(ModContainer container) {

    }

    @SubscribeEvent
    static void onClientSetup(FMLClientSetupEvent event) {



    }

    @SubscribeEvent
    static void addTooltip(ItemTooltipEvent event) {
        if (event.getItemStack().has(FlintAndSteelComponentTypes.BATTLE_THEME)) {
            var b = event.getItemStack().get(FlintAndSteelComponentTypes.BATTLE_THEME).value().getLocation();
            event.getToolTip().add(Component.literal("Battle Music: ").withStyle(ChatFormatting.DARK_GRAY).append(Component.translatableWithFallback(b.toLanguageKey(), WordUtils.capitalizeFully(b.getPath().replaceAll("_"," ").replace(".", " "))).withStyle(ChatFormatting.YELLOW)));
        }
    }
}
