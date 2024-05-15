package net.aflockosheep.minerology.item.client;

import net.aflockosheep.minerology.item.custom.ShaleArmorItem;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class ShaleArmorRenderer extends GeoArmorRenderer<ShaleArmorItem> {
    public ShaleArmorRenderer() {
        super(new ShaleArmorModel());
    }
}
