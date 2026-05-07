package cc.cassian.flintandsteel.mixin;

import com.cobblemon.mod.common.battles.BattleBuilder;
import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.tags.BiomeTags;
import org.spongepowered.asm.mixin.Debug;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Debug(export = true)
@Mixin(BattleBuilder.class)
public abstract class BattleBuilderMixin {

}
