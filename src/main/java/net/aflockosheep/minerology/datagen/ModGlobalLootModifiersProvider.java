package net.aflockosheep.minerology.datagen;

import net.aflockosheep.minerology.Minerology;
import net.aflockosheep.minerology.item.ModItems;
import net.aflockosheep.minerology.loot.AddItemModifier;
import net.aflockosheep.minerology.loot.AddSusSandItemModifier;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifiersProvider(PackOutput output) {
        super(output, Minerology.MOD_ID);
    }

    @Override
    protected void start() {
        add("garnet_from_gravel", new AddItemModifier(new LootItemCondition[]{
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.GRAVEL).build(),
                LootItemRandomChanceCondition.randomChance(0.05f).build()}, ModItems.GARNET_ALMANDINE.get()));
        add("garnet_from_wandering_trader", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/wandering_trader")).build()},
                ModItems.GARNET_ALMANDINE.get()));
        add("garnet_from_desert_temple", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("chests/desert_pyramid")).build()},
                ModItems.GARNET_ALMANDINE.get()));
        add("garnet_from_suspicious_gravel", new AddSusSandItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("archaeology/ocean_ruin_cold")).build()},
                ModItems.GARNET_ALMANDINE.get()));


    }
}
