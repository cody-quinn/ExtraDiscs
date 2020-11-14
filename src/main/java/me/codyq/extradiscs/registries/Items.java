package me.codyq.extradiscs.registries;

import me.codyq.extradiscs.ExtraDiscs;
import me.codyq.extradiscs.items.AbstractDiscItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class Items {

    public static final Item DISC_0x10C = register("music_disc_0x10c", Sounds.SOUND_0x10C);
    public static final Item DISC_CLIFFSIDE_HINSON = register("music_disc_cliffside_hinson", Sounds.SOUND_CLIFFSIDE_HINSON);
    public static final Item DISC_I_JATE_MY_HOB = register("music_disc_i_jate_my_hob", Sounds.SOUND_I_JATE_MY_HOB);
    public static final Item DISC_PEANUTS = register("music_disc_peanuts", Sounds.SOUND_PEANUTS);
    public static final Item DISC_REPETITION = register("music_disc_repetition", Sounds.SOUND_REPETITION);
    public static final Item DISC_SOMETIMES_I_MAKE_VIDEO_GAME_MUSIC = register("music_disc_sometimes_i_make_video_game_music",
            Sounds.SOUND_SOMETIMES_I_MAKE_VIDEO_GAME_MUSIC);

    public static Item register(String id, SoundEvent sound) {
        Item.Settings settings = new Item.Settings().rarity(Rarity.RARE).maxCount(1).group(ItemGroup.MISC);
        return Registry.register(Registry.ITEM, new Identifier(ExtraDiscs.MOD_ID, id), new AbstractDiscItem(14, sound, settings));
    }

    public static void init() { }

}
