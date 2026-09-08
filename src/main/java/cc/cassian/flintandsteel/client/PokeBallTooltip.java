package cc.cassian.flintandsteel.client;

import com.cobblemon.mod.common.api.pokeball.PokeBalls;
import com.cobblemon.mod.common.item.PokeBallItem;
import com.cobblemon.mod.common.pokeball.PokeBall;
import com.google.common.collect.Lists;
import net.minecraft.ChatFormatting;
import net.minecraft.core.Registry;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.network.chat.CommonComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.StringUtil;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import com.mojang.datafixers.util.Pair;

import java.util.Iterator;
import java.util.List;
import java.util.Map;


public class PokeBallTooltip {

    public static void addCatchRateTooltip(ItemStack stack, List<Component> tooltip) {
        if (stack.getItem() instanceof PokeBallItem) {
            buildCatchRateTooltip(stack, tooltip);
        }
    }

    public static void buildCatchRateTooltip(ItemStack stack, List<Component> tooltip) {


    }
}
