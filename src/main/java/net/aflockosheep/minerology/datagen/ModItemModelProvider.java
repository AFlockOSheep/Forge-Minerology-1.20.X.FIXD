package net.aflockosheep.minerology.datagen;

import net.aflockosheep.minerology.Minerology;
import net.aflockosheep.minerology.block.ModBlocks;
import net.aflockosheep.minerology.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Minerology.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.BUCKET_OF_LEMON_JUICE);
        simpleItem(ModItems.BUCKET_OF_CITRIC_ACID);
        simpleItem(ModItems.LEMON);
        simpleItem(ModItems.RUBY_HQ);
         simpleItem(ModItems.RUBY_LQ);
        //simpleItem(ModItems.ROCK_PICK);
        //simpleItem(ModItems.ROCK_CHISEL);
        //handHeldItem(ModItems.SLEDGEHAMMER);

        simpleItem(ModItems.SHALE_PLATE);
        simpleItem(ModItems.METAL_DETECTOR);
        simpleItem(ModItems.DATA_CRYSTAL);
        simpleItem(ModItems.LEMON_SEEDS);

        simpleBlockItem(ModBlocks.MARBLE_STAIRS);
        simpleBlockItem(ModBlocks.MARBLE_SLAB);
        simpleBlockItem(ModBlocks.MARBLE_PRESSURE_PLATE);
        buttonItem(ModBlocks.MARBLE_BUTTON, ModBlocks.MARBLE_BLOCK);
        wallItem(ModBlocks.MARBLE_WALL, ModBlocks.MARBLE_BLOCK);

        simpleBlockItem(ModBlocks.POLISHED_MARBLE_STAIRS);
        simpleBlockItem(ModBlocks.POLISHED_MARBLE_SLAB);
        simpleBlockItem(ModBlocks.POLISHED_MARBLE_PRESSURE_PLATE);
        buttonItem(ModBlocks.POLISHED_MARBLE_BUTTON, ModBlocks.POLISHED_MARBLE_BLOCK);
        wallItem(ModBlocks.POLISHED_MARBLE_WALL, ModBlocks.POLISHED_MARBLE_BLOCK);

        simpleBlockItem(ModBlocks.POLISHED_MARBLE_BRICK_STAIRS);
        simpleBlockItem(ModBlocks.POLISHED_MARBLE_BRICK_SLAB);
        simpleBlockItem(ModBlocks.POLISHED_MARBLE_BRICK_PRESSURE_PLATE);
        buttonItem(ModBlocks.POLISHED_MARBLE_BRICK_BUTTON, ModBlocks.POLISHED_MARBLE_BRICK);
        wallItem(ModBlocks.POLISHED_MARBLE_BRICK_WALL, ModBlocks.POLISHED_MARBLE_BRICK);

        simpleBlockItem(ModBlocks.SHALE_PLATE_BRICK_STAIRS);
        simpleBlockItem(ModBlocks.SHALE_PLATE_BRICK_SLAB);
        simpleBlockItem(ModBlocks.SHALE_PLATE_BRICK_PRESSURE_PLATE);
        buttonItem(ModBlocks.SHALE_PLATE_BRICK_BUTTON, ModBlocks.SHALE_PLATE_BRICK);
        wallItem(ModBlocks.SHALE_PLATE_BRICK_WALL, ModBlocks.SHALE_PLATE_BRICK);
        
        simpleBlockItem(ModBlocks.QUARTZITE_STAIRS);
        simpleBlockItem(ModBlocks.QUARTZITE_SLAB);
        simpleBlockItem(ModBlocks.QUARTZITE_PRESSURE_PLATE);
        buttonItem(ModBlocks.QUARTZITE_BUTTON, ModBlocks.QUARTZITE_BLOCK);
        wallItem(ModBlocks.QUARTZITE_WALL, ModBlocks.QUARTZITE_BLOCK);

        simpleBlockItem(ModBlocks.GNEISS_STAIRS);
        simpleBlockItem(ModBlocks.GNEISS_SLAB);
        simpleBlockItem(ModBlocks.GNEISS_PRESSURE_PLATE);
        buttonItem(ModBlocks.GNEISS_BUTTON, ModBlocks.GNEISS_BLOCK);
        wallItem(ModBlocks.GNEISS_WALL, ModBlocks.GNEISS_BLOCK);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Minerology.MOD_ID, "item/" + item.getId().getPath()));
    }

    public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture", new ResourceLocation(Minerology.MOD_ID,"block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }
    public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  new ResourceLocation(Minerology.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }
    public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  new ResourceLocation(Minerology.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }
    public void simpleBlockItem(RegistryObject<Block> block) {
        this.withExistingParent(Minerology.MOD_ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }

    private ItemModelBuilder handHeldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(Minerology.MOD_ID, "item/" + item.getId().getPath()));
    }



}
