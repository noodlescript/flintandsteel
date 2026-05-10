package cc.cassian.flintandsteel.mixin;

import cc.cassian.flintandsteel.registry.FlintSteelBiomeTags;
import cc.cassian.flintandsteel.registry.FlintSteelSoundEvents;
import com.cobblemon.mod.common.CobblemonSounds;
import com.cobblemon.mod.common.entity.pokemon.PokemonEntity;
import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(PokemonEntity.class)
public abstract class PokemonEntityMixin {

    @WrapMethod(method = "getBattleTheme")
    private ResourceLocation modifyBattleTheme(Operation<ResourceLocation> original) {
        ResourceLocation theme = original.call();

        if (!theme.equals(CobblemonSounds.PVW_BATTLE.getLocation())) {
            return theme;
        }

        PokemonEntity self = (PokemonEntity) (Object) this;
        Holder<Biome> biome = self.level().getBiome(self.blockPosition());

        if (biome.is(FlintSteelBiomeTags.HAS_ARIDLAND_BATTLE)) {
            return FlintSteelSoundEvents.ARIDLAND_BATTLE.get().getLocation();
        }
        if (biome.is(FlintSteelBiomeTags.HAS_HIGHLANDS_BATTLE)) {
            return FlintSteelSoundEvents.HIGHLANDS_BATTLE.get().getLocation();
        }
        if (biome.is(FlintSteelBiomeTags.HAS_SCULK_BATTLE)) {
            return FlintSteelSoundEvents.SCULK_BATTLE.get().getLocation();
        }
        if (biome.is(FlintSteelBiomeTags.HAS_SEMIARID_BATTLE)) {
            return FlintSteelSoundEvents.SEMIARID_BATTLE.get().getLocation();
        }
        if (biome.is(FlintSteelBiomeTags.HAS_TROPICAL_BATTLE)) {
            return FlintSteelSoundEvents.TROPICAL_BATTLE.get().getLocation();
        }
        if (biome.is(FlintSteelBiomeTags.HAS_NETHER_BATTLE)) {
            return FlintSteelSoundEvents.NETHER_BATTLE.get().getLocation();
        }

        return theme;
    }
}
