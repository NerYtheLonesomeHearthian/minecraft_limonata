package limonata.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;

public class LemonCrop0CanBoneMealBeUsedOnThisBlockBLOCKSTATESProcedure {
	public static boolean execute(BlockState blockstate) {
		if (!((getPropertyByName(blockstate, "age") instanceof IntegerProperty _getip1 ? blockstate.getValue(_getip1) : -1) == 7)) {
			return true;
		}
		return false;
	}

	private static Property<?> getPropertyByName(BlockState state, String name) {
		for (Property<?> property : state.getProperties()) {
			if (property.getName().equals(name)) {
				return property;
			}
		}
		return null;
	}
}