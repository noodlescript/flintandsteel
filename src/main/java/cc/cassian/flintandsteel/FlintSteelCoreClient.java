package cc.cassian.flintandsteel;

import cc.cassian.flintandsteel.cobblemon.items.FlintSteelCampfirePotRegistry;
import cc.cassian.flintandsteel.registry.FlintSteelComponentTypes;
import com.cobblemon.mod.common.client.tooltips.TooltipManager;
import net.minecraft.ChatFormatting;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.network.chat.Component;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.event.entity.player.ItemTooltipEvent;
import org.apache.commons.lang3.text.WordUtils;

@Mod(value = FlintSteelCore.MODID, dist = Dist.CLIENT)
@EventBusSubscriber(modid = FlintSteelCore.MODID, value = Dist.CLIENT)
public class FlintSteelCoreClient {
    public FlintSteelCoreClient(ModContainer container) {

    }

    @SubscribeEvent
    static void onClientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            ItemBlockRenderTypes.setRenderLayer(FlintSteelCampfirePotRegistry.ORANGE_CAMPFIRE_POT_BLOCK, RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(FlintSteelCampfirePotRegistry.PURPLE_CAMPFIRE_POT_BLOCK, RenderType.cutout());
        });
    }

    @SubscribeEvent
    static void addTooltip(ItemTooltipEvent event) {
        if (event.getItemStack().has(FlintSteelComponentTypes.BATTLE_THEME)) {
            var b = event.getItemStack().get(FlintSteelComponentTypes.BATTLE_THEME).value().getLocation();
            event.getToolTip().add(Component.literal("Battle Music: ").withStyle(ChatFormatting.DARK_GRAY).append(Component.translatableWithFallback(b.toLanguageKey(), WordUtils.capitalizeFully(b.getPath().replaceAll("_"," ").replace(".", " "))).withStyle(ChatFormatting.YELLOW)));
        }
    }
}
