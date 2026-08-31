package cc.cassian.flintandsteel.cobblemon.items;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import cc.cassian.flintandsteel.FlintSteelCore;
import org.jetbrains.annotations.Nullable;

import com.cobblemon.mod.common.api.pokeball.PokeBalls;
import com.cobblemon.mod.common.api.pokeball.catching.CatchRateModifier;
import com.cobblemon.mod.common.api.pokeball.catching.CaptureEffect;
import com.cobblemon.mod.common.api.pokeball.catching.modifiers.MultiplierModifier;
import com.cobblemon.mod.common.item.PokeBallItem;
import com.cobblemon.mod.common.pokeball.PokeBall;
import com.cobblemon.mod.common.pokemon.Pokemon;

import kotlin.jvm.functions.Function2;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.LivingEntity;

public class FlintSteelBallRegistry {
    public static final FlintSteelBallRegistry INSTANCE = new FlintSteelBallRegistry();

    private static final float DEFAULT_WATER_DRAG = 0.8f;
    private static final float DEFAULT_THROW_POWER = 1.0f;
    private static final String COBBLEMON_NAMESPACE = "cobblemon";

    private final Map<ResourceLocation, BallEntry> balls = new LinkedHashMap<>();
    private final Map<ResourceLocation, PokeBallItem> items = new LinkedHashMap<>();
    private boolean initialized = false;

    FlintSteelBallRegistry() {
    }

    public void initializeBalls() {
        if (initialized) {
            return;
        }
        initialized = true;

        // Red
        register("ancient_great_carmine_ball", createDefault("ancient_great_carmine_ball", 1.5f));
        register("great_carmine_ball", createDefault("great_carmine_ball", 1.5f));;
        register("ancient_ultra_carmine_ball", createDefault("ancient_ultra_carmine_ball", 2.0f));
        register("ultra_carmine_ball", createDefault("ultra_carmine_ball", 2.0f));

        // White
        register("ancient_great_ivory_ball", createDefault("ancient_great_ivory_ball", 1.5f));
        register("great_ivory_ball", createDefault("great_ivory_ball", 1.5f));;
        register("ancient_ultra_ivory_ball", createDefault("ancient_ultra_ivory_ball", 2.0f));
        register("ultra_ivory_ball", createDefault("ultra_ivory_ball", 2.0f));

        // Gray
        register("ancient_faded_ball", createDefault("ancient_faded_ball"));
        register("faded_ball", createDefault("faded_ball"));
        register("ancient_great_faded_ball", createDefault("ancient_great_faded_ball", 1.5f));
        register("great_faded_ball", createDefault("great_faded_ball", 1.5f));;
        register("ancient_ultra_faded_ball", createDefault("ancient_ultra_faded_ball", 2.0f));
        register("ultra_faded_ball", createDefault("ultra_faded_ball", 2.0f));

        // Black
        register("ancient_great_slate_ball", createDefault("ancient_great_slate_ball", 1.5f));
        register("great_slate_ball", createDefault("great_slate_ball", 1.5f));;
        register("ancient_ultra_slate_ball", createDefault("ancient_ultra_slate_ball", 2.0f));
        register("ultra_slate_ball", createDefault("ultra_slate_ball", 2.0f));

        // Brown
        register("ancient_umber_ball", createDefault("ancient_umber_ball"));
        register("umber_ball", createDefault("umber_ball"));
        register("ancient_great_umber_ball", createDefault("ancient_great_umber_ball", 1.5f));
        register("great_umber_ball", createDefault("great_umber_ball", 1.5f));;
        register("ancient_ultra_umber_ball", createDefault("ancient_ultra_umber_ball", 2.0f));
        register("ultra_umber_ball", createDefault("ultra_umber_ball", 2.0f));

        // Orange
        register("ancient_ochre_ball", createDefault("ancient_ochre_ball"));
        register("ochre_ball", createDefault("ochre_ball"));
        register("ancient_great_ochre_ball", createDefault("ancient_great_ochre_ball", 1.5f));
        register("great_ochre_ball", createDefault("great_ochre_ball", 1.5f));;
        register("ancient_ultra_ochre_ball", createDefault("ancient_ultra_ochre_ball", 2.0f));
        register("ultra_ochre_ball", createDefault("ultra_ochre_ball", 2.0f));

        // Yellow
        register("ancient_great_citrine_ball", createDefault("ancient_great_citrine_ball", 1.5f));
        register("great_citrine_ball", createDefault("great_citrine_ball", 1.5f));;
        register("ancient_ultra_citrine_ball", createDefault("ancient_ultra_citrine_ball", 2.0f));
        register("ultra_citrine_ball", createDefault("ultra_citrine_ball", 2.0f));

        // Lime
        register("ancient_great_verdant_ball", createDefault("ancient_great_verdant_ball", 1.5f));
        register("great_verdant_ball", createDefault("great_verdant_ball", 1.5f));;
        register("ancient_ultra_verdant_ball", createDefault("ancient_ultra_verdant_ball", 2.0f));
        register("ultra_verdant_ball", createDefault("ultra_verdant_ball", 2.0f));

        // Green
        register("ancient_jade_ball", createDefault("ancient_jade_ball"));
        register("jade_ball", createDefault("jade_ball"));
        register("ancient_great_jade_ball", createDefault("ancient_great_jade_ball", 1.5f));
        register("great_jade_ball", createDefault("great_jade_ball", 1.5f));;
        register("ancient_ultra_jade_ball", createDefault("ancient_ultra_jade_ball", 2.0f));
        register("ultra_jade_ball", createDefault("ultra_jade_ball", 2.0f));

        // Cyan
        register("ancient_seafoam_ball", createDefault("ancient_seafoam_ball"));
        register("seafoam_ball", createDefault("seafoam_ball"));
        register("ancient_great_seafoam_ball", createDefault("ancient_great_seafoam_ball", 1.5f));
        register("great_seafoam_ball", createDefault("great_seafoam_ball", 1.5f));;
        register("ancient_ultra_seafoam_ball", createDefault("ancient_ultra_seafoam_ball", 2.0f));
        register("ultra_seafoam_ball", createDefault("ultra_seafoam_ball", 2.0f));

        // Light Blue
        register("ancient_celeste_ball", createDefault("ancient_celeste_ball"));
        register("celeste_ball", createDefault("celeste_ball"));
        register("ancient_great_celeste_ball", createDefault("ancient_great_celeste_ball", 1.5f));
        register("great_celeste_ball", createDefault("great_celeste_ball", 1.5f));;
        register("ancient_ultra_celeste_ball", createDefault("ancient_ultra_celeste_ball", 2.0f));
        register("ultra_celeste_ball", createDefault("ultra_celeste_ball", 2.0f));

        // Blue
        register("ancient_great_azure_ball", createDefault("ancient_great_azure_ball", 1.5f));
        register("great_azure_ball", createDefault("great_azure_ball", 1.5f));;
        register("ancient_ultra_azure_ball", createDefault("ancient_ultra_azure_ball", 2.0f));
        register("ultra_azure_ball", createDefault("ultra_azure_ball", 2.0f));

        // Purple
        register("ancient_mauve_ball", createDefault("ancient_mauve_ball"));
        register("mauve_ball", createDefault("mauve_ball"));
        register("ancient_great_mauve_ball", createDefault("ancient_great_mauve_ball", 1.5f));
        register("great_mauve_ball", createDefault("great_mauve_ball", 1.5f));;
        register("ancient_ultra_mauve_ball", createDefault("ancient_ultra_mauve_ball", 2.0f));
        register("ultra_mauve_ball", createDefault("ultra_mauve_ball", 2.0f));

        // Magenta
        register("ancient_great_roseate_ball", createDefault("ancient_great_roseate_ball", 1.5f));
        register("great_roseate_ball", createDefault("great_roseate_ball", 1.5f));;
        register("ancient_ultra_roseate_ball", createDefault("ancient_ultra_roseate_ball", 2.0f));
        register("ultra_roseate_ball", createDefault("ultra_roseate_ball", 2.0f));

        // Pink
        register("ancient_pastel_ball", createDefault("ancient_pastel_ball"));
        register("pastel_ball", createDefault("pastel_ball"));
        register("ancient_great_pastel_ball", createDefault("ancient_great_pastel_ball", 1.5f));
        register("great_pastel_ball", createDefault("great_pastel_ball", 1.5f));;
        register("ancient_ultra_pastel_ball", createDefault("ancient_ultra_pastel_ball", 2.0f));
        register("ultra_pastel_ball", createDefault("ultra_pastel_ball", 2.0f));
    }

    public void registerItems() {
        initializeBalls();

        Map<ResourceLocation, PokeBall> defaults = getPokeBallMap("defaults");
        Map<ResourceLocation, PokeBall> custom = getPokeBallMap("custom");

        if (defaults == null) {
            FlintSteelCore.LOGGER.error("Failed to access Cobblemon PokeBall defaults registry; skipping ball registration.");
            return;
        }

        for (BallEntry entry : balls.values()) {
            ResourceLocation ballId = entry.ballId();
            ResourceLocation itemId = entry.itemId();

            if ((defaults != null && defaults.containsKey(ballId)) || (custom != null && custom.containsKey(ballId))) {
                FlintSteelCore.LOGGER.warn("PokeBall id already registered; skipping {}", ballId);
                continue;
            }

            if (BuiltInRegistries.ITEM.containsKey(itemId)) {
                FlintSteelCore.LOGGER.warn("Item id already registered; skipping {}", itemId);
                continue;
            }

            PokeBall ball = entry.ball();
            PokeBallItem item = Registry.register(BuiltInRegistries.ITEM, itemId, new PokeBallItem(ball));
            ball.item = item;
            items.put(itemId, item);
            defaults.put(ballId, ball);
        }
    }

    public Collection<PokeBallItem> getBallItemsSorted() {
        if (items.isEmpty()) {
            return Collections.emptyList();
        }

        List<Map.Entry<ResourceLocation, PokeBallItem>> sorted = new ArrayList<>(items.entrySet());
        sorted.sort(Comparator.comparing(e -> e.getKey().toString()));

        List<PokeBallItem> results = new ArrayList<>(sorted.size());
        for (Map.Entry<ResourceLocation, PokeBallItem> entry : sorted) {
            results.add(entry.getValue());
        }
        return results;
    }

    private void register(String id, PokeBall ball) {
        ResourceLocation ballId = ResourceLocation.fromNamespaceAndPath(COBBLEMON_NAMESPACE, id);
        ResourceLocation itemId = ResourceLocation.fromNamespaceAndPath(FlintSteelCore.MODID, id);
        balls.put(ballId, new BallEntry(ballId, itemId, ball));
    }

    private static PokeBall createDefault(String id) {
        return createDefault(id, new MultiplierModifier(1.0f, ALWAYS_TRUE), List.of());
    }

    private static PokeBall createDefault(String id, float multiplier) {
        return createDefault(id, new MultiplierModifier(multiplier, ALWAYS_TRUE), List.of());
    }

    private static PokeBall createDefault(String id, CatchRateModifier modifier) {
        return createDefault(id, modifier, List.of());
    }

    private static PokeBall createDefault(String id, List<? extends CaptureEffect> effects) {
        return createDefault(id, new MultiplierModifier(1.0f, ALWAYS_TRUE), effects);
    }

    private static PokeBall createDefault(String id, CatchRateModifier modifier, List<? extends CaptureEffect> effects) {
        ResourceLocation ballName = ResourceLocation.fromNamespaceAndPath(COBBLEMON_NAMESPACE, id);
        ResourceLocation model2d = ResourceLocation.fromNamespaceAndPath(FlintSteelCore.MODID, id);
        ResourceLocation model3d = ResourceLocation.fromNamespaceAndPath(FlintSteelCore.MODID, id + "_model");
        return new PokeBall(ballName, modifier, effects, DEFAULT_WATER_DRAG, model2d, model3d, DEFAULT_THROW_POWER, false);
    }

    private static final Function2<LivingEntity, Pokemon, Boolean> ALWAYS_TRUE = (thrower, pokemon) -> Boolean.TRUE;



    @Nullable
    @SuppressWarnings("unchecked")
    private static Map<ResourceLocation, PokeBall> getPokeBallMap(String fieldName) {
        try {
            Field field = PokeBalls.class.getDeclaredField(fieldName);
            field.setAccessible(true);
            return (Map<ResourceLocation, PokeBall>) field.get(PokeBalls.INSTANCE);
        } catch (ReflectiveOperationException e) {
            FlintSteelCore.LOGGER.error("Failed to access Cobblemon PokeBall registry field {}", fieldName, e);
            return null;
        }
    }

    private record BallEntry(ResourceLocation ballId, ResourceLocation itemId, PokeBall ball) {

    }
}