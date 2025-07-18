/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package limonata.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import limonata.LimonataMod;

public class LimonataModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, LimonataMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> MUSIC_DISC_LIMONATA_CHIAMATA = REGISTRY.register("music_disc_limonata_chiamata",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("limonata", "music_disc_limonata_chiamata")));
}