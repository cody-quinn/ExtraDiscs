package me.codyq.extradiscs.registries;

import me.codyq.extradiscs.ExtraDiscs;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Sounds {

    public static final SoundEvent SOUND_0x10C = register("music_disc.0x10c");
    public static final SoundEvent SOUND_CLIFFSIDE_HINSON = register("music_disc.cliffside_hinson");
    public static final SoundEvent SOUND_I_JATE_MY_HOB = register("music_disc.i_jate_my_hob");
    public static final SoundEvent SOUND_PEANUTS = register("music_disc.peanuts");
    public static final SoundEvent SOUND_REPETITION = register("music_disc.repetition");
    public static final SoundEvent SOUND_SOMETIMES_I_MAKE_VIDEO_GAME_MUSIC = register("music_disc.sometimes_i_make_video_game_music");

    public static SoundEvent register(String name) {
        Identifier id = new Identifier(ExtraDiscs.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }

    public static void init() { }

}
