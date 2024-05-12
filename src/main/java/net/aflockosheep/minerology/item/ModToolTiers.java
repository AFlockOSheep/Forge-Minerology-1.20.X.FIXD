package net.aflockosheep.minerology.item;

import net.aflockosheep.minerology.Minerology;
import net.aflockosheep.minerology.util.ModTags;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier SLEDGE = TierSortingRegistry.registerTier(
            new ForgeTier(2, 250, 1.0F, 2.0F,14,
                    ModTags.Blocks.NEEDS_SLEDGEHAMMER, () -> Ingredient.of(ModItems.ROCK_PICK.get())),
            new ResourceLocation(Minerology.MOD_ID, "shale_plate"), List.of(Tiers.STONE), List.of(Tiers.DIAMOND));

}
