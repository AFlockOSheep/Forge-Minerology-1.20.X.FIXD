package net.aflockosheep.minerology.util;

import net.aflockosheep.minerology.Minerology;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> CHISELABLE = tag("chiselable");
        public static final TagKey<Block> NEEDS_SLEDGEHAMMER = tag("needs_sledgehammer");



        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(Minerology.MOD_ID, name));
        }
    }
    public static class Items {

    }
}
