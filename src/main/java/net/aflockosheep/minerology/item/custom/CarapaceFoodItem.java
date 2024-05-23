package net.aflockosheep.minerology.item.custom;
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import net.aflockosheep.minerology.item.ModItems;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;

public class CarapaceFoodItem extends Item {
    public CarapaceFoodItem(Item.Properties pProperties) {
        super(pProperties);
    }

    public ItemStack finishUsingItem(ItemStack pStack, Level pLevel, LivingEntity pEntityLiving) {
        ItemStack $$3 = super.finishUsingItem(pStack, pLevel, pEntityLiving);
        return pEntityLiving instanceof Player && ((Player)pEntityLiving).getAbilities().instabuild ? $$3 : new ItemStack(ModItems.DWELLER_TAIL_CARAPACE.get());
    }
}
