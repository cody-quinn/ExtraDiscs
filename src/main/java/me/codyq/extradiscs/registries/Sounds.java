package me.codyq.extradiscs.registries;

import me.codyq.extradiscs.ExtraDiscs;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Sounds {

    public static final SoundEvent SOUND_CLIFFSIDE_HINSON = register("music_disc.cliffside_hinson");

    public static SoundEvent register(String name) {
        Identifier id = new Identifier(ExtraDiscs.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }

    public static void init() { }

}
