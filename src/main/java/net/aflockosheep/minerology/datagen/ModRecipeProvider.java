package net.aflockosheep.minerology.datagen;

import net.aflockosheep.minerology.Minerology;
import net.aflockosheep.minerology.block.ModBlocks;
import net.aflockosheep.minerology.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import java.rmi.registry.Registry;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> RUBY_SMELTABLES = List.of(ModBlocks.RUBY_ORE.get());

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        oreSmelting(pWriter, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.RUBY_LQ.get(), 0.25f, 200, "ruby_lq");
        oreBlasting(pWriter, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.RUBY_LQ.get(), 0.25f, 100, "ruby_lq");

        genericBlockRecipe(ModBlocks.SHALE_BLOCK, ModItems.SHALE_PLATE, pWriter);

        genericBrickWithItemRecipe(ModBlocks.SHALE_PLATE_BRICK, ModItems.SHALE_PLATE, pWriter);
        genericBrickWithBlockRecipe(ModBlocks.POLISHED_MARBLE_BLOCK, ModBlocks.MARBLE_BLOCK, pWriter);
        genericBrickWithBlockRecipe(ModBlocks.POLISHED_MARBLE_BRICK, ModBlocks.POLISHED_MARBLE_BLOCK, pWriter);


    }

    protected void buildStonecutterRecipes(RegistryObject<Block> base, RegistryObject<Block> stairs, RegistryObject<Block> slab,
                                           RegistryObject<Block> button, RegistryObject<Block>  pressurePlate,
                                           RegistryObject<Block> wall, Consumer<FinishedRecipe> pWriter) {

    }



    protected void genericBrickWithItemRecipe(@NotNull RegistryObject<Block> block, @NotNull RegistryObject<Item> brick, Consumer<FinishedRecipe> pWriter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, block.get())
                .pattern("SS")
                .pattern("SS")
                .define('S', brick.get())
                .unlockedBy(getHasName(brick.get()), has(brick.get()))
                .save(pWriter);
    }

    protected void genericBrickWithBlockRecipe(@NotNull RegistryObject<Block> block, @NotNull RegistryObject<Block> material, Consumer<FinishedRecipe> pWriter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, block.get())
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
