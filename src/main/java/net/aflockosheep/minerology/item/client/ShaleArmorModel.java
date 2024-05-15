package net.aflockosheep.minerology.item.client;

import net.aflockosheep.minerology.Minerology;
import net.aflockosheep.minerology.item.custom.ShaleArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class ShaleArmorModel extends GeoModel<ShaleArmorItem> {
    @Override
    public ResourceLocation getModelResource(ShaleArmorItem shaleArmorItem) {
        return new ResourceLocation(Minerology.MOD_ID, "geo/shale_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ShaleArmorItem shaleArmorItem) {
        return new ResourceLocation(Minerology.MOD_ID, "textures/armor/shale_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ShaleArmorItem shaleArmorItem) {
        return new ResourceLocation(Minerology.MOD_ID, "animations/shale_armor.animation.json");
    }
}
