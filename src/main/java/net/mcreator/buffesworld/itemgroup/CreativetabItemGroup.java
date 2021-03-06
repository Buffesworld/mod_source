
package net.mcreator.buffesworld.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.buffesworld.item.RunicshardItem;
import net.mcreator.buffesworld.BuffesWorldModElements;

@BuffesWorldModElements.ModElement.Tag
public class CreativetabItemGroup extends BuffesWorldModElements.ModElement {
	public CreativetabItemGroup(BuffesWorldModElements instance) {
		super(instance, 18);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabcreativetab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(RunicshardItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
