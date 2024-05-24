package net.aflockosheep.minerology.item.client;

import net.aflockosheep.minerology.item.custom.HardhatArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class HardhatRenderer extends GeoArmorRenderer<HardhatArmorItem> {
    public HardhatRenderer() {
        super(new HardhatArmorModel());
    }
}
