package net.override.revolvedmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.override.revolvedmod.RevolvedMod;

public class ModItems {
    public static final Item SILVER_INGOT = registerItem("silver_ingot", new Item(new Item.Settings()));
    public static final Item SILVER_NUGGET = registerItem("silver_nugget", new Item(new Item.Settings()));
    public static final Item RAW_SILVER = registerItem("raw_silver", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(RevolvedMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        RevolvedMod.LOGGER.info("Registering Mod Items for " + RevolvedMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(RAW_SILVER);
            entries.add(SILVER_NUGGET);
            entries.add(SILVER_INGOT);
        });
    }
}
