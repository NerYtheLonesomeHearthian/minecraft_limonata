/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package limonata.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import limonata.block.LemonadeStandBlock;
import limonata.block.LemonLeavesLemonBlock;
import limonata.block.LemonLeavesBlock;
import limonata.block.LemonCrop6Block;
import limonata.block.LemonCrop5Block;
import limonata.block.LemonCrop55Block;
import limonata.block.LemonCrop4Block;
import limonata.block.LemonCrop3Block;
import limonata.block.LemonCrop2Block;
import limonata.block.LemonCrop1Block;
import limonata.block.LemonCrop0Block;

import limonata.LimonataMod;

public class LimonataModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(LimonataMod.MODID);
	public static final DeferredBlock<Block> LEMON_CROP_0 = REGISTRY.register("lemon_crop_0", LemonCrop0Block::new);
	public static final DeferredBlock<Block> LEMON_CROP_2 = REGISTRY.register("lemon_crop_2", LemonCrop2Block::new);
	public static final DeferredBlock<Block> LEMON_CROP_1 = REGISTRY.register("lemon_crop_1", LemonCrop1Block::new);
	public static final DeferredBlock<Block> LEMON_CROP_3 = REGISTRY.register("lemon_crop_3", LemonCrop3Block::new);
	public static final DeferredBlock<Block> LEMON_CROP_4 = REGISTRY.register("lemon_crop_4", LemonCrop4Block::new);
	public static final DeferredBlock<Block> LEMON_CROP_5 = REGISTRY.register("lemon_crop_5", LemonCrop5Block::new);
	public static final DeferredBlock<Block> LEMON_CROP_6 = REGISTRY.register("lemon_crop_6", LemonCrop6Block::new);
	public static final DeferredBlock<Block> LEMON_CROP_5_5 = REGISTRY.register("lemon_crop_5_5", LemonCrop55Block::new);
	public static final DeferredBlock<Block> LEMON_LEAVES = REGISTRY.register("lemon_leaves", LemonLeavesBlock::new);
	public static final DeferredBlock<Block> LEMON_LEAVES_LEMON = REGISTRY.register("lemon_leaves_lemon", LemonLeavesLemonBlock::new);
	public static final DeferredBlock<Block> LEMONADE_STAND = REGISTRY.register("lemonade_stand", LemonadeStandBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}