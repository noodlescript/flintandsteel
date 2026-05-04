package cc.cassian.flintandsteel.registry;

import net.minecraft.core.Holder;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;

import java.util.function.Supplier;

import static cc.cassian.flintandsteel.registry.CommonRegistry.registerComponentType;

public class FlintAndSteelComponentTypes {
    public static Supplier<DataComponentType<Holder<SoundEvent>>> BATTLE_THEME = registerComponentType("battle_theme",
            (builder) -> builder.persistent(SoundEvent.CODEC).networkSynchronized(SoundEvent.STREAM_CODEC));

    public static void touch() {

    }
}
