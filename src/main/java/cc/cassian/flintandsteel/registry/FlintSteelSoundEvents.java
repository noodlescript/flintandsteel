package cc.cassian.flintandsteel.registry;

import cc.cassian.flintandsteel.FlintSteelCore;
import net.minecraft.sounds.SoundEvent;

import java.util.function.Supplier;

public class FlintSteelSoundEvents {
    public static final Supplier<SoundEvent> ARIDLAND_BATTLE = CommonRegistry.registerSoundEvent(
            "music.battle.aridland",
            () -> SoundEvent.createVariableRangeEvent(FlintSteelCore.location("music.battle.aridland")));
    public static final Supplier<SoundEvent> HIGHLANDS_BATTLE = CommonRegistry.registerSoundEvent(
            "music.battle.highlands",
            () -> SoundEvent.createVariableRangeEvent(FlintSteelCore.location("music.semiarid.desert")));
    public static final Supplier<SoundEvent> SCULK_BATTLE = CommonRegistry.registerSoundEvent(
            "music.battle.sculk",
            () -> SoundEvent.createVariableRangeEvent(FlintSteelCore.location("music.semiarid.desert")));
    public static final Supplier<SoundEvent> SEMIARID_BATTLE = CommonRegistry.registerSoundEvent(
            "music.battle.semiarid",
            () -> SoundEvent.createVariableRangeEvent(FlintSteelCore.location("music.semiarid.desert")));
    public static final Supplier<SoundEvent> TROPICAL_BATTLE = CommonRegistry.registerSoundEvent(
            "music.battle.tropical",
            () -> SoundEvent.createVariableRangeEvent(FlintSteelCore.location("music.semiarid.desert")));
    public static final Supplier<SoundEvent> NETHER_BATTLE = CommonRegistry.registerSoundEvent(
            "music.battle.nether",
            () -> SoundEvent.createVariableRangeEvent(FlintSteelCore.location("music.battle.nether")));

    public static void touch() {

    }
}
