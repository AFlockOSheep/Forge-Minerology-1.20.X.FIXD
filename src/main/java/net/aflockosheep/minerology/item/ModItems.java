package net.aflockosheep.minerology.item;

import net.aflockosheep.minerology.Minerology;
import net.aflockosheep.minerology.item.custom.MetalDetectorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Minerology.MOD_ID);

    public static final RegistryObject<Item> DATA_CRYSTAL = ITEMS.register("data_crystal",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROCK_CHISEL = ITEMS.register("rock_chisel",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> SHALE_PLATE = ITEMS.register("shale_plate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUBY_HQ = ITEMS.register("ruby_hq",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUBY_LQ = ITEMS.register("ruby_lq",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROCK_PICK = ITEMS.register("rock_pick",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> SLEDGEHAMMER = ITEMS.register("sledgehammer",
            () -> new PickaxeItem(ModToolTiers.SLEDGE, 5, 1, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> LEMON = ITEMS.register("lemon",
            () -> new Item(new Item.Properties().food(ModFoods.LEMON)));
    public static final RegistryObject<Item> LEMON_SEEDS = ITEMS.register("lemon_seeds",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BUCKET_OF_LEMON_JUICE = ITEMS.register("bucket_of_lemon_juice",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BUCKET_OF_CITRIC_ACID = ITEMS.register("bucket_of_citric_acid",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
            () -> new MetalDetectorItem(new Item.Properties().durability(100)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
