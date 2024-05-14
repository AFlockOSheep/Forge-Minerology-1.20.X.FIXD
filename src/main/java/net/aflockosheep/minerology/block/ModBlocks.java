package net.aflockosheep.minerology.block;

import net.aflockosheep.minerology.Minerology;
import net.aflockosheep.minerology.block.custom.SoundBlock;
import net.aflockosheep.minerology.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Minerology.MOD_ID);


    public static final RegistryObject<Block> SHALE_BLOCK = registerBlock("shale_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.NETHER_BRICKS)));
    public static final RegistryObject<Block> SHALE_BLOCK_NODULE = registerBlock("shale_block_nodule",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.SUSPICIOUS_GRAVEL)));
    
    public static final RegistryObject<Block> RUBY_ORE = registerBlock("ruby_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3,6)));
    //TODO
    /*public static final RegistryObject<Block> SAPPHIRE_ORE = registerBlock("sapphire_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3,6)));
    public static final RegistryObject<Block> CHALCOPYRITE_ORE = registerBlock("chalcopyrite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3,6)));*/

//MARBLE
    public static final RegistryObject<Block> MARBLE_BLOCK = registerBlock("marble_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).sound(SoundType.TUFF)));
    public static final RegistryObject<Block> MARBLE_STAIRS = registerBlock("marble_stairs",
            () -> new StairBlock(() -> ModBlocks.MARBLE_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).sound(SoundType.TUFF)));
    public static final RegistryObject<Block> MARBLE_SLAB = registerBlock("marble_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).sound(SoundType.TUFF)));

    public static final RegistryObject<Block> MARBLE_BUTTON = registerBlock("marble_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).sound(SoundType.TUFF),
                    BlockSetType.IRON, 10, true));
    public static final RegistryObject<Block> MARBLE_PRESSURE_PLATE = registerBlock("marble_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).sound(SoundType.TUFF),
                    BlockSetType.IRON));
    public static final RegistryObject<Block> MARBLE_WALL = registerBlock("marble_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).sound(SoundType.TUFF)));

    /*public static final RegistryObject<Block> MARBLE_FENCE = registerBlock("marble_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).sound(SoundType.TUFF)));
    public static final RegistryObject<Block> MARBLE_FENCE_GATE = registerBlock("marble_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).sound(SoundType.TUFF),
                    SoundEvents.CHAIN_PLACE, SoundEvents.ANVIL_BREAK));*/

//POLISHED_MARBLE
    public static final RegistryObject<Block> POLISHED_MARBLE_BLOCK = registerBlock("polished_marble_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).sound(SoundType.TUFF)));
    public static final RegistryObject<Block> POLISHED_MARBLE_STAIRS = registerBlock("polished_marble_stairs",
            () -> new StairBlock(() -> ModBlocks.POLISHED_MARBLE_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).sound(SoundType.TUFF)));
    public static final RegistryObject<Block> POLISHED_MARBLE_SLAB = registerBlock("polished_marble_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).sound(SoundType.TUFF)));
    public static final RegistryObject<Block> POLISHED_MARBLE_BUTTON = registerBlock("polished_marble_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).sound(SoundType.TUFF),
                    BlockSetType.IRON, 10, true));
    public static final RegistryObject<Block> POLISHED_MARBLE_PRESSURE_PLATE = registerBlock("polished_marble_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).sound(SoundType.TUFF),
                    BlockSetType.IRON));
    public static final RegistryObject<Block> POLISHED_MARBLE_WALL = registerBlock("polished_marble_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).sound(SoundType.TUFF)));

    //POLISHED_MARBLE_BRICK
    public static final RegistryObject<Block> POLISHED_MARBLE_BRICK = registerBlock("polished_marble_brick",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).sound(SoundType.TUFF)));
    public static final RegistryObject<Block> POLISHED_MARBLE_BRICK_STAIRS = registerBlock("polished_marble_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.POLISHED_MARBLE_BRICK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).sound(SoundType.TUFF)));
    public static final RegistryObject<Block> POLISHED_MARBLE_BRICK_SLAB = registerBlock("polished_marble_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).sound(SoundType.TUFF)));
    public static final RegistryObject<Block> POLISHED_MARBLE_BRICK_BUTTON = registerBlock("polished_marble_brick_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).sound(SoundType.TUFF),
                    BlockSetType.IRON, 10, true));
    public static final RegistryObject<Block> POLISHED_MARBLE_BRICK_PRESSURE_PLATE = registerBlock("polished_marble_brick_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).sound(SoundType.TUFF),
                    BlockSetType.IRON));
    public static final RegistryObject<Block> POLISHED_MARBLE_BRICK_WALL = registerBlock("polished_marble_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).sound(SoundType.TUFF)));

    //SHALE_PLATE_BRICK
    public static final RegistryObject<Block> SHALE_PLATE_BRICK = registerBlock("shale_plate_brick",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.NETHER_BRICKS)));
    public static final RegistryObject<Block> SHALE_PLATE_BRICK_STAIRS = registerBlock("shale_plate_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.SHALE_PLATE_BRICK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.NETHER_BRICKS)));
    public static final RegistryObject<Block> SHALE_PLATE_BRICK_SLAB = registerBlock("shale_plate_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.NETHER_BRICKS)));
    public static final RegistryObject<Block> SHALE_PLATE_BRICK_BUTTON = registerBlock("shale_plate_brick_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).sound(SoundType.NETHER_BRICKS),
                    BlockSetType.IRON, 10, true));
    public static final RegistryObject<Block> SHALE_PLATE_BRICK_PRESSURE_PLATE = registerBlock("shale_plate_brick_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.NETHER_BRICKS),
                    BlockSetType.IRON));
    public static final RegistryObject<Block> SHALE_PLATE_BRICK_WALL = registerBlock("shale_plate_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.NETHER_BRICKS)));

    //QUARTZITE
    public static final RegistryObject<Block> QUARTZITE_BLOCK = registerBlock("quartzite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.TUFF)));
    public static final RegistryObject<Block> QUARTZITE_STAIRS = registerBlock("quartzite_stairs",
            () -> new StairBlock(() -> ModBlocks.QUARTZITE_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.TUFF)));
    public static final RegistryObject<Block> QUARTZITE_SLAB = registerBlock("quartzite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.TUFF)));
    public static final RegistryObject<Block> QUARTZITE_BUTTON = registerBlock("quartzite_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.TUFF),
                    BlockSetType.IRON, 10, true));
    public static final RegistryObject<Block> QUARTZITE_PRESSURE_PLATE = registerBlock("quartzite_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.TUFF),
                    BlockSetType.IRON));
    public static final RegistryObject<Block> QUARTZITE_WALL = registerBlock("quartzite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.TUFF)));

    //BANDED GNEISS
    public static final RegistryObject<Block> BANDED_GNEISS_BLOCK = registerBlock("banded_gneiss_block",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.TUFF)));
    public static final RegistryObject<Block> BANDED_GNEISS_STAIRS = registerBlock("banded_gneiss_stairs",
            () -> new StairBlock(() -> ModBlocks.BANDED_GNEISS_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.TUFF)));
    public static final RegistryObject<Block> BANDED_GNEISS_SLAB = registerBlock("banded_gneiss_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.TUFF)));
    public static final RegistryObject<Block> BANDED_GNEISS_BUTTON = registerBlock("banded_gneiss_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.TUFF),
                    BlockSetType.IRON, 10, true));
    public static final RegistryObject<Block> BANDED_GNEISS_PRESSURE_PLATE = registerBlock("banded_gneiss_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.TUFF),
                    BlockSetType.IRON));
    public static final RegistryObject<Block> BANDED_GNEISS_WALL = registerBlock("banded_gneiss_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.TUFF)));
    
    //GNEISS
    public static final RegistryObject<Block> GNEISS_BLOCK = registerBlock("gneiss_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.TUFF)));
    public static final RegistryObject<Block> GNEISS_STAIRS = registerBlock("gneiss_stairs",
            () -> new StairBlock(() -> ModBlocks.GNEISS_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.TUFF)));
    public static final RegistryObject<Block> GNEISS_SLAB = registerBlock("gneiss_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.TUFF)));
    public static final RegistryObject<Block> GNEISS_BUTTON = registerBlock("gneiss_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.TUFF),
                    BlockSetType.IRON, 10, true));
    public static final RegistryObject<Block> GNEISS_PRESSURE_PLATE = registerBlock("gneiss_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.TUFF),
                    BlockSetType.IRON));
    public static final RegistryObject<Block> GNEISS_WALL = registerBlock("gneiss_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.TUFF)));
    
    //Polished Gneiss
    public static final RegistryObject<Block> POLISHED_GNEISS_BLOCK = registerBlock("polished_gneiss_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.TUFF)));
    public static final RegistryObject<Block> POLISHED_GNEISS_STAIRS = registerBlock("polished_gneiss_stairs",
            () -> new StairBlock(() -> ModBlocks.POLISHED_GNEISS_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.TUFF)));
    public static final RegistryObject<Block> POLISHED_GNEISS_SLAB = registerBlock("polished_gneiss_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.TUFF)));
    public static final RegistryObject<Block> POLISHED_GNEISS_BUTTON = registerBlock("polished_gneiss_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.TUFF),
                    BlockSetType.IRON, 10, true));
    public static final RegistryObject<Block> POLISHED_GNEISS_PRESSURE_PLATE = registerBlock("polished_gneiss_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.TUFF),
                    BlockSetType.IRON));
    public static final RegistryObject<Block> POLISHED_GNEISS_WALL = registerBlock("polished_gneiss_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.TUFF)));

    //Gneiss Brick
    public static final RegistryObject<Block> GNEISS_BRICK = registerBlock("gneiss_brick",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.TUFF)));
    public static final RegistryObject<Block> GNEISS_BRICK_STAIRS = registerBlock("gneiss_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.GNEISS_BRICK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.TUFF)));
    public static final RegistryObject<Block> GNEISS_BRICK_SLAB = registerBlock("gneiss_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.TUFF)));
    public static final RegistryObject<Block> GNEISS_BRICK_BUTTON = registerBlock("gneiss_brick_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.TUFF),
                    BlockSetType.IRON, 10, true));
    public static final RegistryObject<Block> GNEISS_BRICK_PRESSURE_PLATE = registerBlock("gneiss_brick_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.TUFF),
                    BlockSetType.IRON));
    public static final RegistryObject<Block> GNEISS_BRICK_WALL = registerBlock("gneiss_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.TUFF)));


    public static final RegistryObject<Block> SOUND_BLOCK = registerBlock("sound_block",
            () -> new SoundBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    private static<T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
