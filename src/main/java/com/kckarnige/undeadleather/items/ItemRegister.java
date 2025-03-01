package com.kckarnige.undeadleather.items;

import com.kckarnige.undeadleather.Undeadleather;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ItemRegister {
    public static Item ROTTEN_LEATHER = registerItem("rotten_leather", new Item(new Item.Settings()));

    private static Item registerItem (String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Undeadleather.MOD_ID, name), item);
    }

    public static void registerModItems () {
        Undeadleather.LOGGER.info("Peeling skin..");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {
            content.addBefore(Items.LEATHER,
                    ROTTEN_LEATHER);
        });
    }
}
