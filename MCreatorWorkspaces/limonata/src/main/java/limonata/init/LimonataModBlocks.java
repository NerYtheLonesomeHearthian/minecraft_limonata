/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package limonata.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import limonata.block.LemonCrop2Block;
import limonata.block.LemonCrop1Block;
import limonata.block.LemonCrop0Block;

import limonata.LimonataMod;

public class LimonataModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(LimonataMod.MODID);
	public static final DeferredBlock<Block> LEMON_CROP_0 = REGISTRY.register("lemon_crop_0", LemonCrop0Block::new);
	public static final DeferredBlock<Block> LEMON_CROP_2 = REGISTRY.register("lemon_crop_2", LemonCrop2Block::new);
	public static final DeferredBlock<Block> LEMON_CROP_1 = REGISTRY.register("lemon_crop_1", LemonCrop1Block::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}