package cc.cassian.flintandsteel.mixin;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import poi.licorice45.shadismith.recipe.SmithingEnchantRecipe;

@Mixin(SmithingEnchantRecipe.class)
public class SmithingEnchantMixin {
    @Inject(method = "isAdditionIngredient", at = @At("HEAD"), cancellable = true)
    private void flintsteel$modifyAdditionRequirement(ItemStack itemStack, CallbackInfoReturnable<Boolean> cir) {
        if (itemStack.is(Items.AMETHYST_SHARD)) {
            cir.setReturnValue(true);
        }
    }
}
