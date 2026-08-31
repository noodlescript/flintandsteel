package cc.cassian.flintandsteel.mixin;

import java.util.Arrays;
import java.util.Locale;

import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.gen.Invoker;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import com.cobblemon.mod.common.client.pokedex.PokedexType;
import cc.cassian.flintandsteel.FlintSteelCore;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import net.minecraft.resources.ResourceLocation;

@Mixin(PokedexType.class)
public abstract class PokedexTypeMixin {
    @Shadow
    @Final
    @Mutable
    private static PokedexType[] $VALUES;

    @Shadow
    @Final
    @Mutable
    private static EnumEntries<PokedexType> $ENTRIES;

    @Shadow
    public static @NotNull PokedexType @NotNull [] values() {
        throw new UnsupportedOperationException("Implemented via mixin");
    }

    @Invoker("<init>")
    private static PokedexType flintsteel$invokeInit(String name, int ordinal) {
        throw new AssertionError();
    }

    @Inject(method = "<clinit>", at = @At("TAIL"))
    private static void flintsteel$addTypes(CallbackInfo ci) {
        if (flintsteel$hasType("MAGENTA")) {
            return;
        }

        int base = $VALUES.length;
        PokedexType gray = flintsteel$invokeInit("GRAY", base);
        PokedexType brown = flintsteel$invokeInit("BROWN", base + 1);
        PokedexType orange = flintsteel$invokeInit("ORANGE", base + 2);
        PokedexType lime = flintsteel$invokeInit("LIME", base + 3);
        PokedexType cyan = flintsteel$invokeInit("CYAN", base + 4);
        PokedexType light_blue = flintsteel$invokeInit("LIGHT_BLUE", base + 5);
        PokedexType purple = flintsteel$invokeInit("PURPLE", base + 6);
        PokedexType magenta = flintsteel$invokeInit("MAGENTA", base + 7);

        PokedexType[] values = Arrays.copyOf($VALUES, base + 8);
        values[base] = gray;
        values[base + 1] = brown;
        values[base + 2] = orange;
        values[base + 3] = lime;
        values[base + 4] = cyan;
        values[base + 5] = light_blue;
        values[base + 6] = purple;
        values[base + 7] = magenta;
        $VALUES = values;
        $ENTRIES = EnumEntriesKt.enumEntries(values);
    }

    @Unique
    private static boolean flintsteel$hasType(String name) {
        for (PokedexType type : $VALUES) {
            if (type.name().equals(name)) {
                return true;
            }
        }
        return false;
    }

    @Inject(method = "getItemSpritePath", at = @At("HEAD"), cancellable = true)
    private void flintsteel$overrideItemSpritePath(CallbackInfoReturnable<ResourceLocation> cir) {
        String name = ((Enum<?>) (Object) this).name();
        for (PokedexType type : $VALUES) {
            if (!type.name().equals(name)) {
                return;
            }
        }
        String path = "pokedex_" + name.toLowerCase(Locale.ROOT);
        cir.setReturnValue(ResourceLocation.fromNamespaceAndPath(FlintSteelCore.MODID, path));
    }

    @Inject(method = "getItemModelPath", at = @At("HEAD"), cancellable = true)
    private void flintsteel$overrideItemModelPath(String suffix, CallbackInfoReturnable<ResourceLocation> cir) {
        String name = ((Enum<?>) (Object) this).name();
        for (PokedexType type : $VALUES) {
            if (!type.name().equals(name)) {
                return;
            }
        }
        String base = "pokedex_" + name.toLowerCase(Locale.ROOT) + "_model";
        String path = (suffix == null || suffix.isEmpty()) ? base : base + "_" + suffix;
        cir.setReturnValue(ResourceLocation.fromNamespaceAndPath(FlintSteelCore.MODID, path));
    }
}