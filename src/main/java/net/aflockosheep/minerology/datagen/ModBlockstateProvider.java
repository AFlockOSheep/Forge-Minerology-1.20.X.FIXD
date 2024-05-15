package net.aflockosheep.minerology.datagen;

import net.aflockosheep.minerology.Minerology;
import net.aflockosheep.minerology.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockstateProvider extends BlockStateProvider {
    public ModBlockstateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Minerology.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.RUBY_ORE);
        blockWithItem(ModBlocks.MARBLE_BLOCK);
        blockWithItem(ModBlocks.POLISHED_MARBLE_BLOCK);
        blockWithItem(ModBlocks.POLISHED_MARBLE_BRICK);
        blockWithItem(ModBlocks.SHALE_PLATE_BRICK);
        blockWithItem(ModBlocks.QUARTZITE_BLOCK);

        blockWithItem(ModBlocks.POLISHED_GNEISS_BLOCK);
        blockWithItem(ModBlocks.GNEISS_BRICK);


        blockWithItem(ModBlocks.SOUND_BLOCK);



        createCubeBottomTopWithItem(ModBlocks.SHALE_BLOCK, "shale");
        createCubeBottomTopWithItem(ModBlocks.SHALE_BLOCK_NODULE, "shale_nodule");

        generateStoneBlocks(ModBlocks.MARBLE_BLOCK, ModBlocks.MARBLE_STAIRS, ModBlocks.MARBLE_SLAB, ModBlocks.MARBLE_BUTTON,
                ModBlocks.MARBLE_PRESSURE_PLATE, ModBlocks.MARBLE_WALL);
        generateStoneBlocks(ModBlocks.POLISHED_MARBLE_BLOCK, ModBlocks.POLISHED_MARBLE_STAIRS, ModBlocks.POLISHED_MARBLE_SLAB, ModBlocks.POLISHED_MARBLE_BUTTON,
                ModBlocks.POLISHED_MARBLE_PRESSURE_PLATE, ModBlocks.POLISHED_MARBLE_WALL);
        generateStoneBlocks(ModBlocks.POLISHED_MARBLE_BRICK, ModBlocks.POLISHED_MARBLE_BRICK_STAIRS, ModBlocks.POLISHED_MARBLE_BRICK_SLAB, ModBlocks.POLISHED_MARBLE_BRICK_BUTTON,
                ModBlocks.POLISHED_MARBLE_BRICK_PRESSURE_PLATE, ModBlocks.POLISHED_MARBLE_BRICK_WALL);
        generateStoneBlocks(ModBlocks.SHALE_PLATE_BRICK, ModBlocks.SHALE_PLATE_BRICK_STAIRS, ModBlocks.SHALE_PLATE_BRICK_SLAB, ModBlocks.SHALE_PLATE_BRICK_BUTTON,
                ModBlocks.SHALE_PLATE_BRICK_PRESSURE_PLATE, ModBlocks.SHALE_PLATE_BRICK_WALL);
        generateStoneBlocks(ModBlocks.QUARTZITE_BLOCK, ModBlocks.QUARTZITE_STAIRS, ModBlocks.QUARTZITE_SLAB, ModBlocks.QUARTZITE_BUTTON,
                ModBlocks.QUARTZITE_PRESSURE_PLATE, ModBlocks.QUARTZITE_WALL);
        generateStoneBlocks(ModBlocks.BANDED_GNEISS_BLOCK, ModBlocks.BANDED_GNEISS_STAIRS, ModBlocks.BANDED_GNEISS_SLAB, ModBlocks.BANDED_GNEISS_BUTTON,
                ModBlocks.BANDED_GNEISS_PRESSURE_PLATE, ModBlocks.BANDED_GNEISS_WALL);
        generateStoneBlocks(ModBlocks.GNEISS_BLOCK, ModBlocks.GNEISS_STAIRS, ModBlocks.GNEISS_SLAB, ModBlocks.GNEISS_BUTTON,
                ModBlocks.GNEISS_PRESSURE_PLATE, ModBlocks.GNEISS_WALL);
        generateStoneBlocks(ModBlocks.POLISHED_GNEISS_BLOCK, ModBlocks.POLISHED_GNEISS_STAIRS, ModBlocks.POLISHED_GNEISS_SLAB, ModBlocks.POLISHED_GNEISS_BUTTON,
                ModBlocks.POLISHED_GNEISS_PRESSURE_PLATE, ModBlocks.POLISHED_GNEISS_WALL);
        generateStoneBlocks(ModBlocks.GNEISS_BRICK, ModBlocks.GNEISS_BRICK_STAIRS, ModBlocks.GNEISS_BRICK_SLAB, ModBlocks.GNEISS_BRICK_BUTTON,
                ModBlocks.GNEISS_BRICK_PRESSURE_PLATE, ModBlocks.GNEISS_BRICK_WALL);

    }

    private void generateStoneBlocks(RegistryObject<Block> baseBlock,
                                     RegistryObject<Block> stairBlock,
                                     RegistryObject<Block> slabBlock,
                                     RegistryObject<Block> buttonBlock,
                                     RegistryObject<Block> pressurePlateBlock,
                                     RegistryObject<Block> wall) {

        stairsBlock(((StairBlock) stairBlock.get()), blockTexture(baseBlock.get()));
        slabBlock(((SlabBlock) slabBlock.get()), blockTexture(baseBlock.get()), blockTexture(baseBlock.get()));

        buttonBlock(((ButtonBlock) buttonBlock.get()), blockTexture(baseBlock.get()));
        pressurePlateBlock(((PressurePlateBlock) pressurePlateBlock.get()), blockTexture(baseBlock.get()));

        wallBlock(((WallBlock) wall.get()), blockTexture(baseBlock.get()));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
    private void createCubeBottomTopWithItem(RegistryObject<Block> blockRegistryObject, String blockName) {

        simpleBlockWithItem(blockRegistryObject.get(), models().cubeBottomTop(blockName,
                modLoc("block/" + blockName + "_side"),
                modLoc("block/" + blockName + "_bottom"),
                modLoc("block/" + blockName + "_top")));
    }

}
