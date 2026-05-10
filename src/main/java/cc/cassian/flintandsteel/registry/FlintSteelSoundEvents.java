package cc.cassian.flintandsteel.registry;

import cc.cassian.flintandsteel.FlintSteelCore;
import net.minecraft.sounds.SoundEvent;

import java.util.function.Supplier;

public class FlintSteelSoundEvents {
    public static final Supplier<SoundEvent> DESERT_BATTLE = CommonRegistry.registerSoundEvent(
            "music.wild_battle.desert",
            () -> SoundEvent.createVariableRangeEvent(FlintSteelCore.location("music.wild_battle.desert")));

    public static final Supplier<SoundEvent> NETHER_BATTLE = CommonRegistry.registerSoundEvent(
            "music.wild_battle.nether",
            () -> SoundEvent.createVariableRangeEvent(FlintSteelCore.location("music.wild_battle.nether")));

    public static void touch() {

    }
}
