
package net.mcreator.buffesworld.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.buffesworld.BuffesWorldModElements;

@BuffesWorldModElements.ModElement.Tag
public class RunicPickaxeItem extends BuffesWorldModElements.ModElement {
	@ObjectHolder("buffes_world:runic_pickaxe")
	public static final Item block = null;
	public RunicPickaxeItem(BuffesWorldModElements instance) {
		super(instance, 79);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 250;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 0f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(RuneItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("runic_pickaxe"));
	}
}
