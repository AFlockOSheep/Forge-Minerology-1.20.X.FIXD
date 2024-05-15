package net.aflockosheep.minerology.item;

import net.aflockosheep.minerology.Minerology;
import net.aflockosheep.minerology.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class
ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Minerology.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MINEROLOGY_TAB = CREATIVE_MODE_TABS.register("minerology_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.DATA_CRYSTAL.get()))
                    .title(Component.translatable("creativetab.minerology_tab"))
                    .displayItems((itemDisplayParameters, pOutput) -> {
                        pOutput.accept(ModItems.DATA_CRYSTAL.get());
                        pOutput.accept(ModItems.ROCK_CHISEL.get());
                        pOutput.accept(ModItems.ROCK_PICK.get());
                        pOutput.accept(ModItems.SLEDGEHAMMER.get());
                        pOutput.accept(ModItems.SHALE_PLATE.get());
                        pOutput.accept(ModItems.RUBY_HQ.get());
                        pOutput.accept(ModItems.RUBY_LQ.get());
                        pOutput.accept(ModItems.METAL_DETECTOR.get());
                        pOutput.accept(ModItems.LEMON.get());
                        pOutput.accept(ModItems.LEMON_SEEDS.get());
                        pOutput.accept(ModItems.BUCKET_OF_LEMON_JUICE.get());
                        pOutput.accept(ModItems.BUCKET_OF_CITRIC_ACID.get());

                        pOutput.accept(ModItems.SHALE_HELMET.get());
                        pOutput.accept(ModItems.SHALE_CHESTPLATE.get());
                        pOutput.accept(ModItems.SHALE_LEGGINGS.get());
                        pOutput.accept(ModItems.SHALE_BOOTS.get());

                        pOutput.accept(ModBlocks.SHALE_BLOCK.get());
                        pOutput.accept(ModBlocks.SHALE_BLOCK_NODULE.get());
                        pOutput.accept(ModBlocks.MARBLE_BLOCK.get());
                        pOutput.accept(ModBlocks.MARBLE_STAIRS.get());
                        pOutput.accept(ModBlocks.MARBLE_SLAB.get());
                        pOutput.accept(ModBlocks.MARBLE_BUTTON.get());
                        pOutput.accept(ModBlocks.MARBLE_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.MARBLE_WALL.get());

                        pOutput.accept(ModBlocks.POLISHED_MARBLE_BLOCK.get());
                        pOutput.accept(ModBlocks.POLISHED_MARBLE_STAIRS.get());
                        pOutput.accept(ModBlocks.POLISHED_MARBLE_SLAB.get());
                        pOutput.accept(ModBlocks.POLISHED_MARBLE_BUTTON.get());
                        pOutput.accept(ModBlocks.POLISHED_MARBLE_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.POLISHED_MARBLE_WALL.get());

                        pOutput.accept(ModBlocks.POLISHED_MARBLE_BRICK.get());
                        pOutput.accept(ModBlocks.POLISHED_MARBLE_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.POLISHED_MARBLE_BRICK_SLAB.get());
                        pOutput.accept(ModBlocks.POLISHED_MARBLE_BRICK_BUTTON.get());
                        pOutput.accept(ModBlocks.POLISHED_MARBLE_BRICK_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.POLISHED_MARBLE_BRICK_WALL.get());

                        pOutput.accept(ModBlocks.SHALE_PLATE_BRICK.get());
                        pOutput.accept(ModBlocks.SHALE_PLATE_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.SHALE_PLATE_BRICK_SLAB.get());
                        pOutput.accept(ModBlocks.SHALE_PLATE_BRICK_BUTTON.get());
                        pOutput.accept(ModBlocks.SHALE_PLATE_BRICK_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.SHALE_PLATE_BRICK_WALL.get());

                        pOutput.accept(ModBlocks.QUARTZITE_BLOCK.get());
                        pOutput.accept(ModBlocks.QUARTZITE_STAIRS.get());
                        pOutput.accept(ModBlocks.QUARTZITE_SLAB.get());
                        pOutput.accept(ModBlocks.QUARTZITE_BUTTON.get());
                        pOutput.accept(ModBlocks.QUARTZITE_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.QUARTZITE_WALL.get());

                        pOutput.accept(ModBlocks.BANDED_GNEISS_BLOCK.get());
                        pOutput.accept(ModBlocks.BANDED_GNEISS_STAIRS.get());
                        pOutput.accept(ModBlocks.BANDED_GNEISS_SLAB.get());
                        pOutput.accept(ModBlocks.BANDED_GNEISS_BUTTON.get());
                        pOutput.accept(ModBlocks.BANDED_GNEISS_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.BANDED_GNEISS_WALL.get());

                        pOutput.accept(ModBlocks.GNEISS_BLOCK.get());
                        pOutput.accept(ModBlocks.GNEISS_STAIRS.get());
                        pOutput.accept(ModBlocks.GNEISS_SLAB.get());
                        pOutput.accept(ModBlocks.GNEISS_BUTTON.get());
                        pOutput.accept(ModBlocks.GNEISS_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.GNEISS_WALL.get());

                        pOutput.accept(ModBlocks.POLISHED_GNEISS_BLOCK.get());
                        pOutput.accept(ModBlocks.POLISHED_GNEISS_STAIRS.get());
                        pOutput.accept(ModBlocks.POLISHED_GNEISS_SLAB.get());
                        pOutput.accept(ModBlocks.POLISHED_GNEISS_BUTTON.get());
                        pOutput.accept(ModBlocks.POLISHED_GNEISS_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.POLISHED_GNEISS_WALL.get());

                        pOutput.accept(ModBlocks.GNEISS_BRICK.get());
                        pOutput.accept(ModBlocks.GNEISS_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.GNEISS_BRICK_SLAB.get());
                        pOutput.accept(ModBlocks.GNEISS_BRICK_BUTTON.get());
                        pOutput.accept(ModBlocks.GNEISS_BRICK_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.GNEISS_BRICK_WALL.get());
                        
                        pOutput.accept(ModBlocks.RUBY_ORE.get());
                        pOutput.accept(ModBlocks.SOUND_BLOCK.get());



                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
