package com.dimon.phonkdiscs.phonkdiscs;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {

    public static final Item MUSIC_DISC_PHONK_1 = registerItem("music_disc_phonk_1",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModSounds.PHONK_1_JUKEBOX_SONG_KEY)));
    public static final Item MUSIC_DISC_PHONK_2 = registerItem("music_disc_phonk_2",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModSounds.PHONK_2_JUKEBOX_SONG_KEY)));
    public static final Item MUSIC_DISC_PHONK_3 = registerItem("music_disc_phonk_3",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModSounds.PHONK_3_JUKEBOX_SONG_KEY)));
    public static final Item MUSIC_DISC_PHONK_4 = registerItem("music_disc_phonk_4",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModSounds.PHONK_4_JUKEBOX_SONG_KEY)));
    public static final Item MUSIC_DISC_PHONK_5 = registerItem("music_disc_phonk_5",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModSounds.PHONK_5_JUKEBOX_SONG_KEY)));
    public static final Item MUSIC_DISC_PHONK_6 = registerItem("music_disc_phonk_6",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModSounds.PHONK_6_JUKEBOX_SONG_KEY)));
    public static final Item MUSIC_DISC_PHONK_7 = registerItem("music_disc_phonk_7",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModSounds.PHONK_7_JUKEBOX_SONG_KEY)));
    public static final Item MUSIC_DISC_PHONK_8 = registerItem("music_disc_phonk_8",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModSounds.PHONK_8_JUKEBOX_SONG_KEY)));
    public static final Item MUSIC_DISC_PHONK_9 = registerItem("music_disc_phonk_9",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModSounds.PHONK_9_JUKEBOX_SONG_KEY)));
    public static final Item MUSIC_DISC_PHONK_10 = registerItem("music_disc_phonk_10",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModSounds.PHONK_10_JUKEBOX_SONG_KEY)));
    public static final Item MUSIC_DISC_PHONK_11 = registerItem("music_disc_phonk_11",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModSounds.PHONK_11_JUKEBOX_SONG_KEY)));

    private static Item registerItem(String path, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(PhonkDiscsMod.MOD_ID, path), item);
    }

    public static void registerModItems() {
        PhonkDiscsMod.LOGGER.info("Registering Mod Items for " + PhonkDiscsMod.MOD_ID);
    }
}