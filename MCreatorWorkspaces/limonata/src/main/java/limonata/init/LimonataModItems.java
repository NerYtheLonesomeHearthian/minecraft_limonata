/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package limonata.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

import limonata.item.MusicDiscLimonataChiamataItem;
import limonata.item.LimonataglassItem;
import limonata.item.LemonseedsItem;
import limonata.item.LemonItem;
import limonata.item.GlassItem;
import limonata.item.CutlemonItem;

import limonata.LimonataMod;

public class LimonataModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(LimonataMod.MODID);
	public static final DeferredItem<Item> MUSIC_DISC_LIMONATA_CHIAMATA = REGISTRY.register("music_disc_limonata_chiamata", MusicDiscLimonataChiamataItem::new);
	public static final DeferredItem<Item> GLASS = REGISTRY.register("glass", GlassItem::new);
	public static final DeferredItem<Item> GLASS_OF_LEMONADE = REGISTRY.register("glass_of_lemonade", LimonataglassItem::new);
	public static final DeferredItem<Item> LEMON = REGISTRY.register("lemon", LemonItem::new);
	public static final DeferredItem<Item> CUTLEMON = REGISTRY.register("cutlemon", CutlemonItem::new);
	public static final DeferredItem<Item> LEMONSEEDS = REGISTRY.register("lemonseeds", LemonseedsItem::new);
	// Start of user code block custom items
	// End of user code block custom items
}