package cc.cassian.flintandsteel.registry;

import cc.cassian.flintandsteel.FlintSteelCore;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class FlintSteelSoundEvents {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(BuiltInRegistries.SOUND_EVENT, FlintSteelCore.MODID);

    // Battle Music
    public static final Supplier<SoundEvent> DESERT_BATTLE = SOUND_EVENTS.register("music.wild_battle.desert",
            () -> SoundEvent.createVariableRangeEvent(FlintSteelCore.location("music.wild_battle.desert")));
    public static final Supplier<SoundEvent> NETHER_BATTLE = SOUND_EVENTS.register("music.wild_battle.nether",
            () -> SoundEvent.createVariableRangeEvent(FlintSteelCore.location("music.wild_battle.nether")));

    public static void touch() {

    }
}
