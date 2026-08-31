package cc.cassian.flintandsteel.mixin;

import java.util.Arrays;

import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.gen.Invoker;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import com.cobblemon.mod.common.block.campfirepot.CampfirePotColor;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

@Mixin(CampfirePotColor.class)
public abstract class CampfirePotColorMixin {
    @Shadow
    @Final
    @Mutable
    private static CampfirePotColor[] $VALUES;

    @Shadow
    @Final
    @Mutable
    private static EnumEntries<CampfirePotColor> $ENTRIES;

    @Invoker("<init>")
    private static CampfirePotColor flintsteel$invokeInit(String name, int ordinal, String suffix) {
        throw new AssertionError();
    }

    @Inject(method = "<clinit>", at = @At("TAIL"))
    private static void flintsteel$addColors(CallbackInfo ci) {
        if (flintsteel$hasColor("GRAY")) {
            return;
        }

        int base = $VALUES.length;
        CampfirePotColor gray = flintsteel$invokeInit("GRAY", base, "gray");
        CampfirePotColor brown = flintsteel$invokeInit("BROWN", base + 1, "brown");
        CampfirePotColor orange = flintsteel$invokeInit("ORANGE", base + 2, "orange");
        CampfirePotColor lime = flintsteel$invokeInit("LIME", base + 3, "lime");
        CampfirePotColor cyan = flintsteel$invokeInit("CYAN", base + 4, "cyan");
        CampfirePotColor light_blue = flintsteel$invokeInit("LIGHT_BLUE", base + 5, "light_blue");
        CampfirePotColor purple = flintsteel$invokeInit("PURPLE", base + 6, "purple");
        CampfirePotColor magenta = flintsteel$invokeInit("MAGENTA", base + 7, "magenta");

        CampfirePotColor[] values = Arrays.copyOf($VALUES, base + 8);
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
    private static boolean flintsteel$hasColor(String name) {
        for (CampfirePotColor color : $VALUES) {
            if (color.name().equals(name)) {
                return true;
            }
        }
        return false;
    }
}