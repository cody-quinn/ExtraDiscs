package me.codyq.extradiscs;

import me.codyq.extradiscs.registries.Items;
import me.codyq.extradiscs.registries.Sounds;
import net.fabricmc.api.ModInitializer;

public class ExtraDiscs implements ModInitializer {

    public static final String MOD_ID = "extra_discs";
    public static final String MOD_NAME = "Extra Discs";

    @Override
    public void onInitialize() {
        System.out.println("\uD83D\uDC4B Starting Extra Discs!");
        System.out.println("------- ");
        System.out.println("All music in Extra Discs is created by C418, if you like");
        System.out.println("what you hear you can purchase the songs on his bandcamp.");
        System.out.println("https://c418.bandcamp.com/");

        Items.init();
        Sounds.init();
    }

}
