package net.aflockosheep.minerology.datagen.loot;

import net.aflockosheep.minerology.block.ModBlocks;
import net.aflockosheep.minerology.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.SOUND_BLOCK.get());

        this.add(ModBlocks.SHALE_BLOCK.get(),
                block -> createGlowstoneLikeOreDrops(ModBlocks.SHALE_BLOCK.get(), ModItems.SHALE_PLATE.get()));
        this.add(ModBlocks.SHALE_BLOCK_NODULE.get(),
                block -> createGlowstoneLikeOreDrops(ModBlocks.SHALE_BLOCK_NODULE.get(), ModItems.SHALE_PLATE.get()));
        this.add(ModBlocks.RUBY_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.RUBY_ORE.get(), ModItems.RUBY_LQ.get()));

        generateStoneBlockDrops(ModBlocks.MARBLE_BLOCK, ModBlocks.MARBLE_STAIRS, ModBlocks.MARBLE_SLAB, ModBlocks.MARBLE_BUTTON,
                ModBlocks.MARBLE_PRESSURE_PLATE, ModBlocks.MARBLE_WALL);

        generateStoneBlockDrops(ModBlocks.POLISHED_MARBLE_BLOCK, ModBlocks.POLISHED_MARBLE_STAIRS, ModBlocks.POLISHED_MARBLE_SLAB, ModBlocks.POLISHED_MARBLE_BUTTON,
                ModBlocks.POLISHED_MARBLE_PRESSURE_PLATE, ModBlocks.POLISHED_MARBLE_WALL);

        generateStoneBlockDrops(ModBlocks.POLISHED_MARBLE_BRICK, ModBlocks.POLISHED_MARBLE_BRICK_STAIRS, ModBlocks.POLISHED_MARBLE_BRICK_SLAB, ModBlocks.POLISHED_MARBLE_BRICK_BUTTON,
                ModBlocks.POLISHED_MARBLE_BRICK_PRESSURE_PLATE, ModBlocks.POLISHED_MARBLE_BRICK_WALL);

        generateStoneBlockDrops(ModBlocks.SHALE_PLATE_BRICK, ModBlocks.SHALE_PLATE_BRICK_STAIRS, ModBlocks.SHALE_PLATE_BRICK_SLAB, ModBlocks.SHALE_PLATE_BRICK_BUTTON,
                ModBlocks.SHALE_PLATE_BRICK_PRESSURE_PLATE, ModBlocks.SHALE_PLATE_BRICK_WALL);

        generateStoneBlockDrops(ModBlocks.QUARTZITE_BLOCK, ModBlocks.QUARTZITE_STAIRS, ModBlocks.QUARTZITE_SLAB, ModBlocks.QUARTZITE_BUTTON,
                ModBlocks.QUARTZITE_PRESSURE_PLATE, ModBlocks.QUARTZITE_WALL);

        generateStoneBlockDrops(ModBlocks.BANDED_GNEISS_BLOCK, ModBlocks.BANDED_GNEISS_STAIRS, ModBlocks.BANDED_GNEISS_SLAB, ModBlocks.BANDED_GNEISS_BUTTON,
                ModBlocks.BANDED_GNEISS_PRESSURE_PLATE, ModBlocks.BANDED_GNEISS_WALL);

        generateStoneBlockDrops(ModBlocks.GNEISS_BLOCK, ModBlocks.GNEISS_STAIRS, ModBlocks.GNEISS_SLAB, ModBlocks.GNEISS_BUTTON,
                ModBlocks.GNEISS_PRESSURE_PLATE, ModBlocks.GNEISS_WALL);

        generateStoneBlockDrops(ModBlocks.POLISHED_GNEISS_BLOCK, ModBlocks.POLISHED_GNEISS_STAIRS, ModBlocks.POLISHED_GNEISS_SLAB, ModBlocks.POLISHED_GNEISS_BUTTON,
                ModBlocks.POLISHED_GNEISS_PRESSURE_PLATE, ModBlocks.POLISHED_GNEISS_WALL);

        generateStoneBlockDrops(ModBlocks.GNEISS_BRICK, ModBlocks.GNEISS_BRICK_STAIRS, ModBlocks.GNEISS_BRICK_SLAB, ModBlocks.GNEISS_BRICK_BUTTON,
                ModBlocks.GNEISS_BRICK_PRESSURE_PLATE, ModBlocks.GNEISS_BRICK_WALL);
    }

    protected void generateStoneBlockDrops(RegistryObject<Block> baseBlock,
                                           RegistryObject<Block> stairBlock,
                                           RegistryObject<Block> slabBlock,
                                           RegistryObject<Block> buttonBlock,
                                           RegistryObject<Block> pressurePlateBlock,
                                           RegistryObject<Block> wallBlock) {
        this.dropSelf(baseBlock.get());
        this.dropSelf(stairBlock.get());
        this.add(slabBlock.get(),
                block -> createSlabItemTable(slabBlock.get()));
        this.dropSelf(buttonBlock.get());
        this.dropSelf(pressurePlateBlock.get());
        this.dropSelf(wallBlock.get());
    }

    protected LootTable.Builder createCopperLikeOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 2.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));

    }
    protected LootTable.Builder createGlowstoneLikeOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 4.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }



    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
