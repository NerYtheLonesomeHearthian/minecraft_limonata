package limonata.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class LemonshroomblockBlock extends Block {
	public LemonshroomblockBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.FUNGUS).strength(1f, 0.2f).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).ignitedByLava().instrument(NoteBlockInstrument.BASS));
	}
}