package cc.cassian.flintandsteel.common.items;


import com.cobblemon.mod.common.item.PokedexItem;
import cc.cassian.flintandsteel.FlintSteelCore;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.RegisterEvent;

public final class FlintSteelPokedexRegistry {
    private static final String POKEDEX_TYPE_CLASS = "com.cobblemon.mod.common.client.pokedex.PokedexType";
    public static final ResourceLocation GRAY_POKEDEX_ID =
            ResourceLocation.fromNamespaceAndPath(FlintSteelCore.MODID, "pokedex_gray");
    public static final ResourceLocation BROWN_POKEDEX_ID =
            ResourceLocation.fromNamespaceAndPath(FlintSteelCore.MODID, "pokedex_brown");
    public static final ResourceLocation ORANGE_POKEDEX_ID =
            ResourceLocation.fromNamespaceAndPath(FlintSteelCore.MODID, "pokedex_orange");
    public static final ResourceLocation LIME_POKEDEX_ID =
            ResourceLocation.fromNamespaceAndPath(FlintSteelCore.MODID, "pokedex_lime");
    public static final ResourceLocation CYAN_POKEDEX_ID =
            ResourceLocation.fromNamespaceAndPath(FlintSteelCore.MODID, "pokedex_cyan");
    public static final ResourceLocation LIGHT_BLUE_POKEDEX_ID =
            ResourceLocation.fromNamespaceAndPath(FlintSteelCore.MODID, "pokedex_light_blue");
    public static final ResourceLocation PURPLE_POKEDEX_ID =
            ResourceLocation.fromNamespaceAndPath(FlintSteelCore.MODID, "pokedex_purple");
    public static final ResourceLocation MAGENTA_POKEDEX_ID =
            ResourceLocation.fromNamespaceAndPath(FlintSteelCore.MODID, "pokedex_magenta");

    public static final Item GRAY_POKEDEX_ITEM = createPokedexItem("GRAY");
    public static final Item BROWN_POKEDEX_ITEM = createPokedexItem("BROWN");
    public static final Item ORANGE_POKEDEX_ITEM = createPokedexItem("ORANGE");
    public static final Item LIME_POKEDEX_ITEM = createPokedexItem("LIME");
    public static final Item CYAN_POKEDEX_ITEM = createPokedexItem("CYAN");
    public static final Item LIGHT_BLUE_POKEDEX_ITEM = createPokedexItem("LIGHT_BLUE");
    public static final Item PURPLE_POKEDEX_ITEM = createPokedexItem("PURPLE");
    public static final Item MAGENTA_POKEDEX_ITEM = createPokedexItem("MAGENTA");

    public static void registerItems(RegisterEvent.RegisterHelper<Item> helper) {
        register(helper, GRAY_POKEDEX_ID, GRAY_POKEDEX_ITEM);
        register(helper, BROWN_POKEDEX_ID, BROWN_POKEDEX_ITEM);
        register(helper, ORANGE_POKEDEX_ID, ORANGE_POKEDEX_ITEM);
        register(helper, LIME_POKEDEX_ID, LIME_POKEDEX_ITEM);
        register(helper, CYAN_POKEDEX_ID, CYAN_POKEDEX_ITEM);
        register(helper, LIGHT_BLUE_POKEDEX_ID, LIGHT_BLUE_POKEDEX_ITEM);
        register(helper, PURPLE_POKEDEX_ID, PURPLE_POKEDEX_ITEM);
        register(helper, MAGENTA_POKEDEX_ID, MAGENTA_POKEDEX_ITEM);
    }

    private static void register(RegisterEvent.RegisterHelper<Item> helper, ResourceLocation id, Item item) {
        if (item == null) {
            FlintSteelCore.LOGGER.error("Pokedex item {} not created; skipping registration.", id);
            return;
        }
        if (BuiltInRegistries.ITEM.containsKey(id)) {
            FlintSteelCore.LOGGER.warn("Item id already registered; skipping {}", id);
            return;
        }
        helper.register(id, item);
    }

    private static Item createPokedexItem(String typeName) {
        try {
            Class<?> typeClass = Class.forName(POKEDEX_TYPE_CLASS);
            @SuppressWarnings("unchecked")
            Class<Enum> enumClass = (Class<Enum>) typeClass.asSubclass(Enum.class);
            Object type = Enum.valueOf(enumClass, typeName);
            return (Item) PokedexItem.class.getConstructor(typeClass).newInstance(type);
        } catch (Exception e) {
            FlintSteelCore.LOGGER.error("Failed to create Cobblemon PokedexItem for type {}.", typeName, e);
            return null;
        }
    }
}