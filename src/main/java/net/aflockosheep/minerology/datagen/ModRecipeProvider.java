package net.aflockosheep.minerology.datagen;

import net.aflockosheep.minerology.Minerology;
import net.aflockosheep.minerology.block.ModBlocks;
import net.aflockosheep.minerology.item.ModItems;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.client.Minecraft;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> RUBY_SMELTABLES = List.of(ModBlocks.RUBY_ORE.get());
    private static final List<ItemLike> DWELLER_COOKABLES = List.of(ModItems.DWELLER_TAIL.get());
    private static final List<ItemLike> PRIMED_LEMON_JUICE = List.of(ModItems.BUCKET_OF_PRIMED_LEMON_JUICE.get());
    private static final List<ItemLike> LIME = List.of(Items.DRIPSTONE_BLOCK);


    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        oreSmelting(pWriter, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.RUBY_LQ.get(), 0.25f, 200, "ruby_lq");
        oreBlasting(pWriter, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.RUBY_LQ.get(), 0.25f, 100, "ruby_lq");

        foodSmoking(pWriter, DWELLER_COOKABLES, RecipeCategory.FOOD, ModItems.ROASTED_DWELLER_TAIL.get(), 0.35f, 200, "roasted_dweller_tail");
        oreSmelting(pWriter, DWELLER_COOKABLES, RecipeCategory.FOOD, ModItems.ROASTED_DWELLER_TAIL.get(), 0.35f, 200, "roasted_dweller_tail");
        foodCampfire(pWriter, DWELLER_COOKABLES, RecipeCategory.FOOD, ModItems.ROASTED_DWELLER_TAIL.get(), 0.35f, 200, "roasted_dweller_tail");

        oreSmelting(pWriter, PRIMED_LEMON_JUICE, RecipeCategory.FOOD, ModItems.BUCKET_OF_CITRIC_ACID.get(), 0.35f, 200, "bucket_of_citric_acid");
        oreSmelting(pWriter, LIME, RecipeCategory.FOOD, ModItems.LIME.get(), 0.35f, 200, "lime");

        genericBlockRecipe(ModBlocks.SHALE_BLOCK, ModItems.SHALE_PLATE, pWriter);

        genericBrickWithItemRecipe(ModBlocks.SHALE_PLATE_BRICK, ModItems.SHALE_PLATE, pWriter);
        generateStoneProductRecipes(ModBlocks.SHALE_PLATE_BRICK, ModBlocks.SHALE_PLATE_BRICK_STAIRS, ModBlocks.SHALE_PLATE_BRICK_SLAB,
                ModBlocks.SHALE_PLATE_BRICK_BUTTON, ModBlocks.SHALE_PLATE_BRICK_PRESSURE_PLATE,
                ModBlocks.SHALE_PLATE_BRICK_WALL, pWriter);
        generateStonecuttingRecipes("shale_plate_brick", "shale_plate_brick", ModBlocks.SHALE_PLATE_BRICK, ModBlocks.SHALE_PLATE_BRICK_STAIRS,
                ModBlocks.SHALE_PLATE_BRICK_SLAB, ModBlocks.SHALE_PLATE_BRICK_WALL, pWriter);

        
        genericBrickWithBlockRecipe(ModBlocks.POLISHED_MARBLE_BLOCK, ModBlocks.MARBLE_BLOCK, pWriter);
        generateStonecuttingRecipes("marble_from_marble","marble_block", ModBlocks.MARBLE_BLOCK, ModBlocks.MARBLE_STAIRS,
                ModBlocks.MARBLE_SLAB, ModBlocks.MARBLE_WALL, pWriter);
        generateStonecuttingRecipes("polished_marble_from_marble","marble_block", ModBlocks.MARBLE_BLOCK, ModBlocks.POLISHED_MARBLE_STAIRS,
                ModBlocks.POLISHED_MARBLE_SLAB, ModBlocks.POLISHED_MARBLE_WALL, pWriter);
        generateStonecuttingRecipes("polished_marble_brick_from_marble", "marble_block", ModBlocks.MARBLE_BLOCK, ModBlocks.POLISHED_MARBLE_BRICK_STAIRS,
                ModBlocks.POLISHED_MARBLE_BRICK_SLAB, ModBlocks.POLISHED_MARBLE_BRICK_WALL, pWriter);
        addBrickStonecuttingRecipe("polished_marble_from_marble",
                "marble_block", ModBlocks.MARBLE_BLOCK, ModBlocks.POLISHED_MARBLE_BLOCK, pWriter);
        addBrickStonecuttingRecipe("polished_marble_brick_from_marble",
                "marble_block", ModBlocks.MARBLE_BLOCK, ModBlocks.POLISHED_MARBLE_BRICK, pWriter);


        generateStoneProductRecipes(ModBlocks.POLISHED_MARBLE_BLOCK, ModBlocks.POLISHED_MARBLE_STAIRS, ModBlocks.POLISHED_MARBLE_SLAB,
                ModBlocks.POLISHED_MARBLE_BUTTON, ModBlocks.POLISHED_MARBLE_PRESSURE_PLATE,
                ModBlocks.POLISHED_MARBLE_WALL, pWriter);
        generateStonecuttingRecipes("polished_marble_from_polished_marble", "polished_marble_block", ModBlocks.POLISHED_MARBLE_BLOCK, ModBlocks.POLISHED_MARBLE_STAIRS,
                ModBlocks.POLISHED_MARBLE_SLAB, ModBlocks.POLISHED_MARBLE_WALL, pWriter);
        generateStonecuttingRecipes("polished_marble_brick_from_polished_marble", "polished_marble_block", ModBlocks.POLISHED_MARBLE_BLOCK, ModBlocks.POLISHED_MARBLE_BRICK_STAIRS,
                ModBlocks.POLISHED_MARBLE_BRICK_SLAB, ModBlocks.POLISHED_MARBLE_BRICK_WALL, pWriter);
        addBrickStonecuttingRecipe("polished_marble_brick_from_polished_marble",
                "polished_marble_block", ModBlocks.POLISHED_MARBLE_BLOCK, ModBlocks.POLISHED_MARBLE_BRICK, pWriter);

        
        genericBrickWithBlockRecipe(ModBlocks.POLISHED_MARBLE_BRICK, ModBlocks.POLISHED_MARBLE_BLOCK, pWriter);
        generateStoneProductRecipes(ModBlocks.POLISHED_MARBLE_BRICK, ModBlocks.POLISHED_MARBLE_BRICK_STAIRS, ModBlocks.POLISHED_MARBLE_BRICK_SLAB,
                ModBlocks.POLISHED_MARBLE_BRICK_BUTTON, ModBlocks.POLISHED_MARBLE_BRICK_PRESSURE_PLATE,
                ModBlocks.POLISHED_MARBLE_BRICK_WALL, pWriter);
        generateStonecuttingRecipes("polished_marble_brick_from_polished_marble_brick", "polished_marble_brick", ModBlocks.POLISHED_MARBLE_BRICK, ModBlocks.POLISHED_MARBLE_BRICK_STAIRS,
                ModBlocks.POLISHED_MARBLE_BRICK_SLAB, ModBlocks.POLISHED_MARBLE_BRICK_WALL, pWriter);

        generateStoneProductRecipes(ModBlocks.QUARTZITE_BLOCK, ModBlocks.QUARTZITE_STAIRS, ModBlocks.QUARTZITE_SLAB, ModBlocks.QUARTZITE_BUTTON,
                ModBlocks.QUARTZITE_PRESSURE_PLATE, ModBlocks.QUARTZITE_WALL, pWriter);
        generateStonecuttingRecipes("quartzite_from_quartzite", "quartzite_block", ModBlocks.QUARTZITE_BLOCK, ModBlocks.QUARTZITE_STAIRS,
                ModBlocks.QUARTZITE_SLAB, ModBlocks.QUARTZITE_WALL, pWriter);

        generateStoneProductRecipes(ModBlocks.BANDED_GNEISS_BLOCK, ModBlocks.BANDED_GNEISS_STAIRS, ModBlocks.BANDED_GNEISS_SLAB, ModBlocks.BANDED_GNEISS_BUTTON,
                ModBlocks.BANDED_GNEISS_PRESSURE_PLATE, ModBlocks.BANDED_GNEISS_WALL, pWriter);
        generateStonecuttingRecipes("banded_gneiss_from_banded_gneiss", "banded_gneiss_block", ModBlocks.BANDED_GNEISS_BLOCK, ModBlocks.BANDED_GNEISS_STAIRS,
                ModBlocks.BANDED_GNEISS_SLAB, ModBlocks.BANDED_GNEISS_WALL, pWriter);
        generateStonecuttingRecipes("gneiss_brick_from_banded_gneiss", "banded_gneiss_block", ModBlocks.BANDED_GNEISS_BLOCK, ModBlocks.GNEISS_BRICK_STAIRS,
                ModBlocks.GNEISS_BRICK_SLAB, ModBlocks.GNEISS_BRICK_WALL, pWriter);

        generateStoneProductRecipes(ModBlocks.GNEISS_BLOCK, ModBlocks.GNEISS_STAIRS, ModBlocks.GNEISS_SLAB, ModBlocks.GNEISS_BUTTON,
                ModBlocks.GNEISS_PRESSURE_PLATE, ModBlocks.GNEISS_WALL, pWriter);
        generateStonecuttingRecipes("gneiss_from_gneiss", "gneiss_block", ModBlocks.GNEISS_BLOCK, ModBlocks.GNEISS_STAIRS,
                ModBlocks.GNEISS_SLAB, ModBlocks.GNEISS_WALL, pWriter);
        generateStonecuttingRecipes("polished_gneiss_from_gneiss", "gneiss_block", ModBlocks.GNEISS_BLOCK, ModBlocks.POLISHED_GNEISS_STAIRS,
                ModBlocks.POLISHED_GNEISS_SLAB, ModBlocks.POLISHED_GNEISS_WALL, pWriter);

        generateStoneProductRecipes(ModBlocks.POLISHED_GNEISS_BLOCK, ModBlocks.POLISHED_GNEISS_STAIRS, ModBlocks.POLISHED_GNEISS_SLAB, ModBlocks.POLISHED_GNEISS_BUTTON,
                ModBlocks.POLISHED_GNEISS_PRESSURE_PLATE, ModBlocks.POLISHED_GNEISS_WALL, pWriter);
        generateStonecuttingRecipes("polished_gneiss_from_polished_gneiss", "polished_gneiss_block", ModBlocks.POLISHED_GNEISS_BLOCK, ModBlocks.POLISHED_GNEISS_STAIRS,
                ModBlocks.POLISHED_GNEISS_SLAB, ModBlocks.POLISHED_GNEISS_WALL, pWriter);

        generateStoneProductRecipes(ModBlocks.GNEISS_BRICK, ModBlocks.GNEISS_BRICK_STAIRS, ModBlocks.GNEISS_BRICK_SLAB, ModBlocks.GNEISS_BRICK_BUTTON,
                ModBlocks.GNEISS_BRICK_PRESSURE_PLATE, ModBlocks.GNEISS_BRICK_WALL, pWriter);
        generateStonecuttingRecipes("gneiss_brick_from_gneiss_brick", "gneiss_brick", ModBlocks.GNEISS_BRICK, ModBlocks.GNEISS_BRICK_STAIRS,
                ModBlocks.GNEISS_BRICK_SLAB, ModBlocks.GNEISS_BRICK_WALL, pWriter);



    }


    protected void generateStonecuttingRecipes(String blockType, String baseBlock, RegistryObject<Block> base, RegistryObject<Block> stair,
                                               RegistryObject<Block> slab, RegistryObject<Block> wall, Consumer<FinishedRecipe> pWriter) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(base.get()), RecipeCategory.MISC, stair.get())
                .unlockedBy("has_" + baseBlock, inventoryTrigger(ItemPredicate.Builder.item().
                        of(base.get()).build()))
                .save(pWriter, "stonecutting_stair_" + blockType);
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(base.get()), RecipeCategory.MISC, slab.get(), 2)
                .unlockedBy("has_" + baseBlock, inventoryTrigger(ItemPredicate.Builder.item().
                        of(base.get()).build()))
                .save(pWriter, "stonecutting_slab_" + blockType);
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(base.get()), RecipeCategory.MISC, wall.get())
                .unlockedBy("has_" + baseBlock, inventoryTrigger(ItemPredicate.Builder.item().
                        of(base.get()).build()))
                .save(pWriter, "stonecutting_wall_" + blockType);
    }
    protected void addBrickStonecuttingRecipe(String blockType, String baseBlock, RegistryObject<Block> base, RegistryObject<Block> brick, Consumer<FinishedRecipe> pWriter) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(base.get()), RecipeCategory.MISC, brick.get())
                .unlockedBy("has_" + baseBlock, inventoryTrigger(ItemPredicate.Builder.item().
                        of(base.get()).build()))
                .save(pWriter, "stonecutting_" + blockType);
    }

    protected void generateStoneProductRecipes(RegistryObject<Block> base, RegistryObject<Block> stairs, RegistryObject<Block> slab,
                                           RegistryObject<Block> button, RegistryObject<Block>  pressurePlate,
                                           RegistryObject<Block> wall, Consumer<FinishedRecipe> pWriter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, stairs.get(), 4)
                .pattern("S  ")
                .pattern("SS ")
                .pattern("SSS")
                .define('S', base.get())
                .unlockedBy(getHasName(base.get()), has(base.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, slab.get(), 6)
                .pattern("SSS")
                .define('S', base.get())
                .unlockedBy(getHasName(base.get()), has(base.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, button.get(), 1)
                .unlockedBy(getHasName(base.get()), has(base.get()))
                .requires(Ingredient.of(base.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, pressurePlate.get(), 1)
                .pattern("SS")
                .define('S', base.get())
                .unlockedBy(getHasName(base.get()), has(base.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, wall.get(), 6)
                .pattern("SSS")
                .pattern("SSS")
                .define('S', base.get())
                .unlockedBy(getHasName(base.get()), has(base.get()))
                .save(pWriter);
    }



    protected void genericBrickWithItemRecipe(@NotNull RegistryObject<Block> block, @NotNull RegistryObject<Item> brick, Consumer<FinishedRecipe> pWriter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, block.get(), 1)
                .pattern("SS")
                .pattern("SS")
                .define('S', brick.get())
                .unlockedBy(getHasName(brick.get()), has(brick.get()))

                .save(pWriter);
    }

    protected void genericBrickWithBlockRecipe(@NotNull RegistryObject<Block> block, @NotNull RegistryObject<Block> material, Consumer<FinishedRecipe> pWriter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, block.get(), 4)
                .pattern("SS")
                .pattern("SS")
                .define('S', material.get())
                .unlockedBy(getHasName(material.get()), has(material.get()))
                .save(pWriter);
    }
    protected void genericBlockRecipe(@NotNull RegistryObject<Block> block, @NotNull RegistryObject<Item> material, Consumer<FinishedRecipe> pWriter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, block.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', material.get())
                .unlockedBy(getHasName(material.get()), has(material.get()))
                .save(pWriter);
    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void foodSmoking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMOKING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_smoking");
    }

    protected static void foodCampfire(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.CAMPFIRE_COOKING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_campfire_cooking");
    }


    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        Iterator var9 = pIngredients.iterator();

        while(var9.hasNext()) {
            ItemLike itemlike = (ItemLike)var9.next();
            SimpleCookingRecipeBuilder.generic(Ingredient.of(new ItemLike[]{itemlike}), pCategory, pResult,
                            pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer, Minerology.MOD_ID + ":" + (pResult) + pRecipeName + "_" + getItemName(itemlike));
        }

    }

}
