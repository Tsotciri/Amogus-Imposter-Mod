package net.tsotciri.amogusimp.sound;


import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.tsotciri.amogusimp.AmogusImposter;

public class ModSounds {
    public static SoundEvent IMPOSTER_WALK = registerSoundEvent("imposter_walk_sound");
    public static SoundEvent IMPOSTER_AMBIENT = registerSoundEvent("imposter_ambient_sound");
    public static SoundEvent IMPOSTER_HURT = registerSoundEvent("imposter_hurt_sound");
    public static SoundEvent IMPOSTER_DEATH = registerSoundEvent("imposter_death_sound");

    public static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(AmogusImposter.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));

    }

    public static void registerSounds() {
        System.out.println("Registering Sounds for Mod:" + AmogusImposter.MOD_ID);
    }
}
