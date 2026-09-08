package cc.cassian.flintandsteel.cobblemon.blocks;

import com.cobblemon.mod.common.CobblemonSounds;
import com.cobblemon.mod.common.block.campfirepot.CampfirePotBlock;
import com.cobblemon.mod.common.block.campfirepot.CampfirePotColor;
import com.cobblemon.mod.common.item.CampfirePotItem;
import cc.cassian.flintandsteel.FlintSteelCore;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.neoforge.registries.RegisterEvent.RegisterHelper;

public final class FlintSteelCampfirePotRegistry {
    public static final ResourceLocation GRAY_CAMPFIRE_POT_ID = ResourceLocation.fromNamespaceAndPath("cobblemon", "campfire_pot_gray");
    public static final ResourceLocation BROWN_CAMPFIRE_POT_ID = ResourceLocation.fromNamespaceAndPath("cobblemon", "campfire_pot_brown");
    public static final ResourceLocation ORANGE_CAMPFIRE_POT_ID = ResourceLocation.fromNamespaceAndPath("cobblemon", "campfire_pot_orange");
    public static final ResourceLocation LIME_CAMPFIRE_POT_ID = ResourceLocation.fromNamespaceAndPath("cobblemon", "campfire_pot_lime");
    public static final ResourceLocation CYAN_CAMPFIRE_POT_ID = ResourceLocation.fromNamespaceAndPath("cobblemon", "campfire_pot_cyan");
    public static final ResourceLocation LIGHT_BLUE_CAMPFIRE_POT_ID = ResourceLocation.fromNamespaceAndPath("cobblemon", "campfire_pot_light_blue");
    public static final ResourceLocation PURPLE_CAMPFIRE_POT_ID = ResourceLocation.fromNamespaceAndPath("cobblemon", "campfire_pot_purple");
    public static final ResourceLocation MAGENTA_CAMPFIRE_POT_ID = ResourceLocation.fromNamespaceAndPath("cobblemon", "campfire_pot_magenta");

    private static final BlockBehaviour.Properties GRAY_PROPERTIES = BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_GRAY)
            .sound(CobblemonSounds.CAMPFIRE_POT_SOUNDS)
            .strength(0.5f)
            .pushReaction(PushReaction.BLOCK)
            .noOcclusion();
    private static final BlockBehaviour.Properties BROWN_PROPERTIES = BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_BROWN)
            .sound(CobblemonSounds.CAMPFIRE_POT_SOUNDS)
            .strength(0.5f)
            .pushReaction(PushReaction.BLOCK)
            .noOcclusion();
    private static final BlockBehaviour.Properties ORANGE_PROPERTIES = BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_ORANGE)
            .sound(CobblemonSounds.CAMPFIRE_POT_SOUNDS)
            .strength(0.5f)
            .pushReaction(PushReaction.BLOCK)
            .noOcclusion();
    private static final BlockBehaviour.Properties LIME_PROPERTIES = BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_LIGHT_GREEN)
            .sound(CobblemonSounds.CAMPFIRE_POT_SOUNDS)
            .strength(0.5f)
            .pushReaction(PushReaction.BLOCK)
            .noOcclusion();
    private static final BlockBehaviour.Properties CYAN_PROPERTIES = BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_CYAN)
            .sound(CobblemonSounds.CAMPFIRE_POT_SOUNDS)
            .strength(0.5f)
            .pushReaction(PushReaction.BLOCK)
            .noOcclusion();
    private static final BlockBehaviour.Properties LIGHT_BLUE_PROPERTIES = BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_LIGHT_BLUE)
            .sound(CobblemonSounds.CAMPFIRE_POT_SOUNDS)
            .strength(0.5f)
            .pushReaction(PushReaction.BLOCK)
            .noOcclusion();
    private static final BlockBehaviour.Properties PURPLE_PROPERTIES = BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_PURPLE)
            .sound(CobblemonSounds.CAMPFIRE_POT_SOUNDS)
            .strength(0.5f)
            .pushReaction(PushReaction.BLOCK)
            .noOcclusion();
    private static final BlockBehaviour.Properties MAGENTA_PROPERTIES = BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_MAGENTA)
            .sound(CobblemonSounds.CAMPFIRE_POT_SOUNDS)
            .strength(0.5f)
            .pushReaction(PushReaction.BLOCK)
            .noOcclusion();


    public static final CampfirePotBlock GRAY_CAMPFIRE_POT_BLOCK = new CampfirePotBlock(GRAY_PROPERTIES);
    public static final CampfirePotBlock BROWN_CAMPFIRE_POT_BLOCK = new CampfirePotBlock(BROWN_PROPERTIES);
    public static final CampfirePotBlock ORANGE_CAMPFIRE_POT_BLOCK = new CampfirePotBlock(ORANGE_PROPERTIES);
    public static final CampfirePotBlock LIME_CAMPFIRE_POT_BLOCK = new CampfirePotBlock(LIME_PROPERTIES);
    public static final CampfirePotBlock CYAN_CAMPFIRE_POT_BLOCK = new CampfirePotBlock(CYAN_PROPERTIES);
    public static final CampfirePotBlock LIGHT_BLUE_CAMPFIRE_POT_BLOCK = new CampfirePotBlock(LIGHT_BLUE_PROPERTIES);
    public static final CampfirePotBlock PURPLE_CAMPFIRE_POT_BLOCK = new CampfirePotBlock(PURPLE_PROPERTIES);
    public static final CampfirePotBlock MAGENTA_CAMPFIRE_POT_BLOCK = new CampfirePotBlock(MAGENTA_PROPERTIES);

    public static final Item GRAY_CAMPFIRE_POT_ITEM = new CampfirePotItem(GRAY_CAMPFIRE_POT_BLOCK, findColor("GRAY", CampfirePotColor.BLACK));
    public static final Item BROWN_CAMPFIRE_POT_ITEM = new CampfirePotItem(BROWN_CAMPFIRE_POT_BLOCK, findColor("BROWN", CampfirePotColor.YELLOW));
    public static final Item ORANGE_CAMPFIRE_POT_ITEM = new CampfirePotItem(ORANGE_CAMPFIRE_POT_BLOCK, findColor("ORANGE", CampfirePotColor.YELLOW));
    public static final Item LIME_CAMPFIRE_POT_ITEM = new CampfirePotItem(LIME_CAMPFIRE_POT_BLOCK, findColor("LIME", CampfirePotColor.GREEN));
    public static final Item CYAN_CAMPFIRE_POT_ITEM = new CampfirePotItem(CYAN_CAMPFIRE_POT_BLOCK, findColor("CYAN", CampfirePotColor.BLUE));
    public static final Item LIGHT_BLUE_CAMPFIRE_POT_ITEM = new CampfirePotItem(LIGHT_BLUE_CAMPFIRE_POT_BLOCK, findColor("LIGHT_BLUE", CampfirePotColor.BLUE));
    public static final Item PURPLE_CAMPFIRE_POT_ITEM = new CampfirePotItem(PURPLE_CAMPFIRE_POT_BLOCK, findColor("PURPLE", CampfirePotColor.PINK));
    public static final Item MAGENTA_CAMPFIRE_POT_ITEM = new CampfirePotItem(MAGENTA_CAMPFIRE_POT_BLOCK, findColor("MAGENTA", CampfirePotColor.PINK));

    private FlintSteelCampfirePotRegistry() {
    }

    public static void registerBlocks(RegisterHelper<Block> helper) {
        registerBlock(helper, GRAY_CAMPFIRE_POT_ID, GRAY_CAMPFIRE_POT_BLOCK);
        registerBlock(helper, BROWN_CAMPFIRE_POT_ID, BROWN_CAMPFIRE_POT_BLOCK);
        registerBlock(helper, ORANGE_CAMPFIRE_POT_ID, ORANGE_CAMPFIRE_POT_BLOCK);
        registerBlock(helper, LIME_CAMPFIRE_POT_ID, LIME_CAMPFIRE_POT_BLOCK);
        registerBlock(helper, CYAN_CAMPFIRE_POT_ID, CYAN_CAMPFIRE_POT_BLOCK);
        registerBlock(helper, LIGHT_BLUE_CAMPFIRE_POT_ID, LIGHT_BLUE_CAMPFIRE_POT_BLOCK);
        registerBlock(helper, PURPLE_CAMPFIRE_POT_ID, PURPLE_CAMPFIRE_POT_BLOCK);
        registerBlock(helper, MAGENTA_CAMPFIRE_POT_ID, MAGENTA_CAMPFIRE_POT_BLOCK);
    }

    public static void registerItems(RegisterHelper<Item> helper) {
        registerItem(helper, GRAY_CAMPFIRE_POT_ID, GRAY_CAMPFIRE_POT_ITEM);
        registerItem(helper, BROWN_CAMPFIRE_POT_ID, BROWN_CAMPFIRE_POT_ITEM);
        registerItem(helper, ORANGE_CAMPFIRE_POT_ID, ORANGE_CAMPFIRE_POT_ITEM);
        registerItem(helper, LIME_CAMPFIRE_POT_ID, LIME_CAMPFIRE_POT_ITEM);
        registerItem(helper, CYAN_CAMPFIRE_POT_ID, CYAN_CAMPFIRE_POT_ITEM);
        registerItem(helper, LIGHT_BLUE_CAMPFIRE_POT_ID, LIGHT_BLUE_CAMPFIRE_POT_ITEM);
        registerItem(helper, PURPLE_CAMPFIRE_POT_ID, PURPLE_CAMPFIRE_POT_ITEM);
        registerItem(helper, MAGENTA_CAMPFIRE_POT_ID, MAGENTA_CAMPFIRE_POT_ITEM);
    }

    private static void registerBlock(RegisterHelper<Block> helper, ResourceLocation id, Block block) {
        if (BuiltInRegistries.BLOCK.containsKey(id)) {
            FlintSteelCore.LOGGER.warn("Block id already registered; skipping {}", id);
            return;
        }
        helper.register(id, block);
    }

    private static void registerItem(RegisterHelper<Item> helper, ResourceLocation id, Item item) {
        if (BuiltInRegistries.ITEM.containsKey(id)) {
            FlintSteelCore.LOGGER.warn("Item id already registered; skipping {}", id);
            return;
        }
        helper.register(id, item);
    }

    private static CampfirePotColor findColor(String name, CampfirePotColor fallback) {
        try {
            return CampfirePotColor.valueOf(name);
        } catch (IllegalArgumentException ex) {
            return fallback;
        }
    }
}