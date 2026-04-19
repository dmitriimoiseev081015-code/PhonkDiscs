package com.dimon.phonkdiscs.phonkdiscs;

import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {

    public static final SoundEvent MUSIC_DISC_PHONK_1_SOUND_EVENT = registerSoundEvent("music_disc.phonk_1");
    public static final SoundEvent MUSIC_DISC_PHONK_2_SOUND_EVENT = registerSoundEvent("music_disc.phonk_2");
    public static final SoundEvent MUSIC_DISC_PHONK_3_SOUND_EVENT = registerSoundEvent("music_disc.phonk_3");
    public static final SoundEvent MUSIC_DISC_PHONK_4_SOUND_EVENT = registerSoundEvent("music_disc.phonk_4");
    public static final SoundEvent MUSIC_DISC_PHONK_5_SOUND_EVENT = registerSoundEvent("music_disc.phonk_5");
    public static final SoundEvent MUSIC_DISC_PHONK_6_SOUND_EVENT = registerSoundEvent("music_disc.phonk_6");
    public static final SoundEvent MUSIC_DISC_PHONK_7_SOUND_EVENT = registerSoundEvent("music_disc.phonk_7");
    public static final SoundEvent MUSIC_DISC_PHONK_8_SOUND_EVENT = registerSoundEvent("music_disc.phonk_8");
    public static final SoundEvent MUSIC_DISC_PHONK_9_SOUND_EVENT = registerSoundEvent("music_disc.phonk_9");
    public static final SoundEvent MUSIC_DISC_PHONK_10_SOUND_EVENT = registerSoundEvent("music_disc.phonk_10");
    public static final SoundEvent MUSIC_DISC_PHONK_11_SOUND_EVENT = registerSoundEvent("music_disc.phonk_11");

    public static final RegistryKey<JukeboxSong> PHONK_1_JUKEBOX_SONG_KEY = createJukeboxSongKey("phonk_1");
    public static final RegistryKey<JukeboxSong> PHONK_2_JUKEBOX_SONG_KEY = createJukeboxSongKey("phonk_2");
    public static final RegistryKey<JukeboxSong> PHONK_3_JUKEBOX_SONG_KEY = createJukeboxSongKey("phonk_3");
    public static final RegistryKey<JukeboxSong> PHONK_4_JUKEBOX_SONG_KEY = createJukeboxSongKey("phonk_4");
    public static final RegistryKey<JukeboxSong> PHONK_5_JUKEBOX_SONG_KEY = createJukeboxSongKey("phonk_5");
    public static final RegistryKey<JukeboxSong> PHONK_6_JUKEBOX_SONG_KEY = createJukeboxSongKey("phonk_6");
    public static final RegistryKey<JukeboxSong> PHONK_7_JUKEBOX_SONG_KEY = createJukeboxSongKey("phonk_7");
    public static final RegistryKey<JukeboxSong> PHONK_8_JUKEBOX_SONG_KEY = createJukeboxSongKey("phonk_8");
    public static final RegistryKey<JukeboxSong> PHONK_9_JUKEBOX_SONG_KEY = createJukeboxSongKey("phonk_9");
    public static final RegistryKey<JukeboxSong> PHONK_10_JUKEBOX_SONG_KEY = createJukeboxSongKey("phonk_10");
    public static final RegistryKey<JukeboxSong> PHONK_11_JUKEBOX_SONG_KEY = createJukeboxSongKey("phonk_11");

    public static void registerSounds() {
        PhonkDiscsMod.LOGGER.info("Waking up Mod Sounds...");
    }

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of(PhonkDiscsMod.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    private static RegistryKey<JukeboxSong> createJukeboxSongKey(String name) {
        return RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(PhonkDiscsMod.MOD_ID, name));
    }
}