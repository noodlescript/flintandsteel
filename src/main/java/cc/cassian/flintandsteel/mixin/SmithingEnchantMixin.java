package cc.cassian.flintandsteel.mixin;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.SmithingRecipeInput;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import poi.licorice45.shadismith.recipe.SmithingEnchantRecipe;

@Mixin(SmithingEnchantRecipe.class)
public class SmithingEnchantMixin {
    @Inject(method = "isAdditionIngredient", at = @At("HEAD"), cancellable = true)
    private void flintsteel$modifyAdditionRequirement(ItemStack itemStack, CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(itemStack.is(Items.AMETHYST_SHARD));
    }

    @Inject(method = "matches*", at = @At("HEAD"), cancellable = true)
    private void flintsteel$modifyMatchesRequirement(SmithingRecipeInput input, Level level, CallbackInfoReturnable<Boolean> cir) {
        SmithingEnchantRecipe self = (SmithingEnchantRecipe)(Object)this;

        int enchantLevel = EnchantmentHelper.getTagEnchantmentLevel(self.enchantment(), input.base());
        if (enchantLevel == 0) {
            if (!EnchantmentHelper.isEnchantmentCompatible(
                    EnchantmentHelper.getEnchantmentsForCrafting(input.base()).keySet(),
                    self.enchantment())) {
                cir.setReturnValue(false);
                return;
            }
        } else if (self.enchantment().value().getMaxLevel() < enchantLevel + 1) {
            cir.setReturnValue(false);
            return;
        }

        cir.setReturnValue(
            self.template().test(input.template()) &&
            self.base().test(input.base()) &&
            input.addition().is(Items.AMETHYST_SHARD)
        );
    }
}
