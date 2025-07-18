package limonata.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import limonata.LimonataMod;

public class MusicDiscLimonataChiamataItem extends Item {
	public MusicDiscLimonataChiamataItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.RARE).jukeboxPlayable(ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath(LimonataMod.MODID, "music_disc_limonata_chiamata"))));
	}
}