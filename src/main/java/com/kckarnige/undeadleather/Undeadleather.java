package com.kckarnige.undeadleather;

import com.kckarnige.undeadleather.items.ItemRegister;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Undeadleather implements ModInitializer {

    public static final String MOD_ID = "undeadleather";
    public static final Logger LOGGER = LoggerFactory.getLogger("Undead Leather");

    @Override
    public void onInitialize() {
        ItemRegister.registerModItems();
    }
}
