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

    public static final Item DISC_CLIFFSIDE_HINSON = register("music_disc_cliffside_hinson", Sounds.SOUND_CLIFFSIDE_HINSON);

    public static Item register(String id, SoundEvent sound) {
        Item.Settings settings = new Item.Settings().rarity(Rarity.RARE).maxCount(1).group(ItemGroup.MISC);
        return Registry.register(Registry.ITEM, new Identifier(ExtraDiscs.MOD_ID, id), new AbstractDiscItem(14, sound, settings));
    }

    public static void init() { }

}
