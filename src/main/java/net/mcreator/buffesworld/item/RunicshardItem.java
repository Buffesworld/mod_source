
package net.mcreator.buffesworld.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.buffesworld.itemgroup.CreativetabItemGroup;
import net.mcreator.buffesworld.BuffesWorldModElements;

@BuffesWorldModElements.ModElement.Tag
public class RunicshardItem extends BuffesWorldModElements.ModElement {
	@ObjectHolder("buffes_world:runicshard")
	public static final Item block = null;
	public RunicshardItem(BuffesWorldModElements instance) {
		super(instance, 52);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(CreativetabItemGroup.tab).maxStackSize(64).rarity(Rarity.UNCOMMON));
			setRegistryName("runicshard");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
