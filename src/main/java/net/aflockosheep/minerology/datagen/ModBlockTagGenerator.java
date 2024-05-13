package net.aflockosheep.minerology.datagen;

import net.aflockosheep.minerology.Minerology;
import net.aflockosheep.minerology.block.ModBlocks;
import net.aflockosheep.minerology.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import org.jetbrains.annotations.Nullable;

import javax.swing.text.html.HTML;
import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Minerology.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ModTags.Blocks.CHISELABLE)
                .add(ModBlocks.RUBY_ORE.get())
                .add(ModBlocks.SHALE_BLOCK_NODULE.get());
        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.GNEISS_BLOCK.get())
                .add(ModBlocks.QUARTZITE_BLOCK.get())
                .add(ModBlocks.RUBY_ORE.get()).addTag(Tags.Blocks.ORES);
        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.MARBLE_BLOCK.get());
        this.tag(BlockTags.NEEDS_DIAMOND_TOOL);

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.SHALE_BLOCK.get())
                .add(ModBlocks.SHALE_BLOCK_NODULE.get())
                .add(ModBlocks.RUBY_ORE.get())
                .add(ModBlocks.MARBLE_BLOCK.get())
                .add(ModBlocks.GNEISS_BLOCK.get())
                .add(ModBlocks.QUARTZITE_BLOCK.get());

        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL);

        this.tag(ModTags.Blocks.NEEDS_SLEDGEHAMMER)
                .add(ModBlocks.SHALE_BLOCK.get());

        this.tag(BlockTags.WALLS)
                .add(ModBlocks.MARBLE_WALL.get())
                .add(ModBlocks.POLISHED_MARBLE_WALL.get())
                .add(ModBlocks.POLISHED_MARBLE_BRICK_WALL.get())
                .add(ModBlocks.SHALE_PLATE_BRICK_WALL.get())
                .add(ModBlocks.QUARTZITE_WALL.get())
                .add(ModBlocks.GNEISS_WALL.get());

    }
}
