package cc.cassian.flintandsteel.mixin;

// import cc.cassian.flintandsteel.registry.FlintSteelSoundEvents;
import com.cobblemon.mod.common.battles.BattleBuilder;
import com.cobblemon.mod.common.entity.pokemon.PokemonEntity;
import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;
import java.util.UUID;
import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.biome.Biome;
import org.spongepowered.asm.mixin.Debug;
import org.spongepowered.asm.mixin.Mixin;

import java.util.UUID;

import static com.mojang.text2speech.Narrator.LOGGER;
//
//@Debug(export = true)
//@Mixin(BattleBuilder.class)
//public abstract class BattleBuilderMixin {
//    @WrapMethod(method = "pve(Lnet/minecraft/server/level/ServerPlayer;Lcom/cobblemon/mod/common/entity/pokemon/PokemonEntity;Ljava/util/UUID;)Lcom/cobblemon/mod/common/battles/BattleStartResult;")
//    private static ResourceLocation mixin() {
//        LOGGER.info("(PVE) Changing battle theme!");
//        final Holder<SoundEvent>[] theme = new Holder[1];
//        Holder<Biome> biomeHolder = serverPlayer.level().getBiome(serverPlayer.blockPosition());
//
//
//        if (biomeHolder.is(BiomeTags.IS_BADLANDS)) {
//            theme[0] .get(FlintSteelSoundEvents.DESERT_BATTLE);
//        }
//
//        if (theme[0] != null) {
//            return theme[0].value().getLocation();
//        } else {
//            return original.call(serverPlayer);
//        }
//    }
//}
