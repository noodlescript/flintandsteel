package cc.cassian.flintandsteel.registry;

import cc.cassian.flintandsteel.FlintSteelCore;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.biome.Biome;

public class FlintSteelBiomeTags {
    public static final TagKey<Biome> HAS_DESERT_BATTLE = TagKey.create(Registries.BIOME, FlintSteelCore.of("has_desert_battle"));
    public static final TagKey<Biome> HAS_NETHER_BATTLE = TagKey.create(Registries.BIOME, FlintSteelCore.of("has_nether_battle"));
}
