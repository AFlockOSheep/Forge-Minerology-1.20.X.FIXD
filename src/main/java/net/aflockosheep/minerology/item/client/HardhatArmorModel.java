package net.aflockosheep.minerology.item.client;

import net.aflockosheep.minerology.Minerology;
import net.aflockosheep.minerology.item.custom.HardhatArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class HardhatArmorModel extends GeoModel<HardhatArmorItem> {
    @Override
    public ResourceLocation getModelResource(HardhatArmorItem hardhatArmorItem) {
        return new ResourceLocation(Minerology.MOD_ID, "geo/hardhat.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(HardhatArmorItem hardhatArmorItem) {
        return new ResourceLocation(Minerology.MOD_ID, "textures/armor/hardhat.png");
    }

    @Override
    public ResourceLocation getAnimationResource(HardhatArmorItem hardhatArmorItem) {
        return new ResourceLocation(Minerology.MOD_ID, "animations/hardhat.animation.json");
    }
}
