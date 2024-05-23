package net.aflockosheep.minerology.item;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraftforge.event.entity.living.MobEffectEvent;

public class ModFoods {
    public static final FoodProperties LEMON = new FoodProperties.Builder().nutrition(2)
            .saturationMod(.2f).effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED,
                    200), 0.1f).build();
    public static final FoodProperties DWELLER_TAIL = new FoodProperties.Builder().nutrition(2)
            .saturationMod(0.1f).effect(() -> new MobEffectInstance(MobEffects.POISON,
                    160, 2), 0.5f).build();
    public static final FoodProperties ROASTED_DWELLER_TAIL = new FoodProperties.Builder().nutrition(12).alwaysEat()
            .saturationMod(2f).effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED,
                    2400), 1f).build();
}
