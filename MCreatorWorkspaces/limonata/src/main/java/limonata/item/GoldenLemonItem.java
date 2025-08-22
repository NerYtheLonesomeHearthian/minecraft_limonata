package limonata.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import limonata.procedures.GoldenLemonEatingEffectsProcedure;

public class GoldenLemonItem extends Item {
	public GoldenLemonItem() {
		super(new Item.Properties().rarity(Rarity.RARE).food((new FoodProperties.Builder()).nutrition(4).saturationModifier(9.6f).alwaysEdible().build()));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		GoldenLemonEatingEffectsProcedure.execute(entity);
		return retval;
	}
}