package limonata.item;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import limonata.init.LimonataModFluids;

public class LemonadeItem extends BucketItem {
	public LemonadeItem() {
		super(LimonataModFluids.LEMONADE.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)

		);
	}
}