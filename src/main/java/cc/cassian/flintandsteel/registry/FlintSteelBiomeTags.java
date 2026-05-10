package cc.cassian.flintandsteel.registry;

import cc.cassian.flintandsteel.FlintSteelCore;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.biome.Biome;

public class FlintSteelBiomeTags {

    public static final TagKey<Biome> HAS_ARIDLAND_BATTLE = TagKey.create(Registries.BIOME, FlintSteelCore.of("has_aridland_battle"));
    public static final TagKey<Biome> HAS_HIGHLANDS_BATTLE = TagKey.create(Registries.BIOME, FlintSteelCore.of("has_highlands_battle"));
    public static final TagKey<Biome> HAS_SCULK_BATTLE = TagKey.create(Registries.BIOME, FlintSteelCore.of("has_sculk_battle"));
    public static final TagKey<Biome> HAS_SEMIARID_BATTLE = TagKey.create(Registries.BIOME, FlintSteelCore.of("has_semiarid_battle"));
    public static final TagKey<Biome> HAS_TROPICAL_BATTLE = TagKey.create(Registries.BIOME, FlintSteelCore.of("has_tropical_battle"));
    public static final TagKey<Biome> HAS_NETHER_BATTLE = TagKey.create(Registries.BIOME, FlintSteelCore.of("has_nether_battle"));
}
