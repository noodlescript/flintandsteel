package cc.cassian.flintandsteel.mixin;

import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.SmithingScreen;
import net.minecraft.world.entity.LivingEntity;
import org.joml.Quaternionf;
import org.joml.Vector3f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(SmithingScreen.class)
class SmithingTableMixin {
    @Redirect(method = "renderBg", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/screens/inventory/InventoryScreen;renderEntityInInventory(Lnet/minecraft/client/gui/GuiGraphics;FFFLorg/joml/Vector3f;Lorg/joml/Quaternionf;Lorg/joml/Quaternionf;Lnet/minecraft/world/entity/LivingEntity;)V"))
    void RenderEntity(GuiGraphics p_282665_, float p_296361_, float p_294489_, float p_319934_, Vector3f p_295026_, Quaternionf p_281880_, Quaternionf p_282882_, LivingEntity p_282466_) {
        // ASOF YOU GODSEND..
    }
}