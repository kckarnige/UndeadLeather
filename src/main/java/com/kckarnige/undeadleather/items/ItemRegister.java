package com.kckarnige.undeadleather.items;

import com.kckarnige.undeadleather.Undeadleather;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;


public class ItemRegister {
    public static Item ROTTEN_LEATHER = registerItem("rotten_leather", new Item.Settings());

    private static Item registerItem (String id, Item.Settings item) {
        // This is why plan ahead (don't ask why it took 2 commits to finish this thought)
        // Idk why tf I'm talking, I didn't plan shit 💀
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Undeadleather.MOD_ID, id));
        return Registry.register(Registries.ITEM, key, new Item(item.registryKey(key)));
    }

    public static void registerModItems () {
        Undeadleather.LOGGER.info("Peeling skin..");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {
            content.addBefore(Items.LEATHER,
                    ROTTEN_LEATHER);
        });
    }
}
