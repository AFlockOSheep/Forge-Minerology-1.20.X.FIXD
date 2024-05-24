package net.aflockosheep.minerology.item;

import net.aflockosheep.minerology.Minerology;
import net.aflockosheep.minerology.item.custom.*;
import net.minecraft.world.item.ArmorItem;
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
            () -> new RockChiselItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> SHALE_PLATE = ITEMS.register("shale_plate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUBY_HQ = ITEMS.register("ruby_hq",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUBY_LQ = ITEMS.register("ruby_lq",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GARNET_ALMANDINE = ITEMS.register("garnet_almandine",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROCK_PICK = ITEMS.register("rock_pick",
            () -> new RockPickItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> SLEDGEHAMMER = ITEMS.register("sledgehammer",
            () -> new PickaxeItem(ModToolTiers.SLEDGE, 5, 1, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> LEMON = ITEMS.register("lemon",
            () -> new Item(new Item.Properties().food(ModFoods.LEMON)));
    public static final RegistryObject<Item> LEMON_SEEDS = ITEMS.register("lemon_seeds",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DWELLER_TAIL = ITEMS.register("dweller_tail",
            () -> new RawDwellerTailItem(new Item.Properties().food(ModFoods.DWELLER_TAIL)));
    public static final RegistryObject<Item> ROASTED_DWELLER_TAIL = ITEMS.register("roasted_dweller_tail",
            () -> new CarapaceFoodItem(new Item.Properties().food(ModFoods.ROASTED_DWELLER_TAIL).stacksTo(1)));
    public static final RegistryObject<Item> DWELLER_TAIL_CARAPACE = ITEMS.register("dweller_tail_carapace",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DWELLER_CHITIN = ITEMS.register("dweller_chitin",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BUCKET_OF_LEMON_JUICE = ITEMS.register("bucket_of_lemon_juice",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BUCKET_OF_PRIMED_LEMON_JUICE = ITEMS.register("bucket_of_primed_lemon_juice",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BUCKET_OF_CITRIC_ACID = ITEMS.register("bucket_of_citric_acid",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LIME = ITEMS.register("lime",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
            () -> new MetalDetectorItem(new Item.Properties().durability(100)));

    public static final RegistryObject<Item> SHALE_HELMET = ITEMS.register("shale_helmet",
            () -> new ShaleArmorItem(ModArmorMaterials.SHALE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> SHALE_CHESTPLATE = ITEMS.register("shale_chestplate",
            () -> new ShaleArmorItem(ModArmorMaterials.SHALE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> SHALE_LEGGINGS = ITEMS.register("shale_leggings",
            () -> new ShaleArmorItem(ModArmorMaterials.SHALE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> SHALE_BOOTS = ITEMS.register("shale_boots",
            () -> new ShaleArmorItem(ModArmorMaterials.SHALE, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> HARDHAT = ITEMS.register("hardhat",
            () -> new HardhatArmorItem(ModArmorMaterials.HARDHAT, ArmorItem.Type.HELMET, new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
