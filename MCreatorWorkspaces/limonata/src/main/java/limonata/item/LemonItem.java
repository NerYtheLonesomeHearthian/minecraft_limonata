package limonata.item;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

public class LemonItem extends Item {
	public LemonItem() {
		super(new Item.Properties().food((new FoodProperties.Builder()).nutrition(5).saturationModifier(0.6f).build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack, LivingEntity livingEntity) {
		return 25;
	}
}