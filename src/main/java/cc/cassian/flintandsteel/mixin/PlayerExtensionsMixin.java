package cc.cassian.flintandsteel.mixin;

import cc.cassian.flintandsteel.registry.FlintAndSteelComponentTypes;
import com.cobblemon.mod.common.util.PlayerExtensionsKt;
import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import io.wispforest.accessories.api.AccessoriesCapability;
import io.wispforest.accessories.api.slot.SlotEntryReference;
import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import org.spongepowered.asm.mixin.Debug;
import org.spongepowered.asm.mixin.Mixin;

import java.util.List;

import static com.mojang.text2speech.Narrator.LOGGER;

@Debug(export = true)
@Mixin(PlayerExtensionsKt.class)
public class PlayerExtensionsMixin {
    @WrapMethod(method = "getBattleTheme")
    private static ResourceLocation mixin(ServerPlayer serverPlayer, Operation<ResourceLocation> original) {
        LOGGER.info("Changing battle theme!");
        final Holder<SoundEvent>[] theme = new Holder[1];
        serverPlayer.getInventory().items.forEach((stack)-> {
            if (stack.has(FlintAndSteelComponentTypes.BATTLE_THEME)) {
                theme[0] = stack.get(FlintAndSteelComponentTypes.BATTLE_THEME);
            }
        });
        if (theme[0] != null) {
            var capability = AccessoriesCapability.get(serverPlayer);
            if (capability != null) {
                List<SlotEntryReference> allEquipped = capability.getAllEquipped();
                for (SlotEntryReference slotEntryReference : allEquipped) {
                    if (slotEntryReference.stack().has(FlintAndSteelComponentTypes.BATTLE_THEME)) {
                        theme[0] = slotEntryReference.stack().get(FlintAndSteelComponentTypes.BATTLE_THEME);
                    }
                }
            }
        }
        if (theme[0] != null) {
            return theme[0].value().getLocation();
        } else {
            return original.call(serverPlayer);
        }
    }
}
