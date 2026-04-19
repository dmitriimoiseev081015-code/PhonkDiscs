package com.dimon.phonkdiscs.phonkdiscs;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PhonkDiscsMod implements ModInitializer {

    public static final String MOD_ID = "phonkdiscs";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItemGroup.registerItemGroups();
        ModItems.registerModItems();
        ModSounds.registerSounds();

        // Ничего не регистрируем вручную, доверяем игре

        LOGGER.info("Phonk Discs Mod has been initialized!");
    }
}