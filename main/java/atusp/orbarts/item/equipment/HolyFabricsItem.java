package atusp.orbarts.item.equipment;

import atusp.orbarts.OrbArtsMain;
import net.minecraft.item.Item;

public class HolyFabricsItem extends Item{
	public HolyFabricsItem() 
	{
		super();
		//设定最大堆叠
		this.setMaxStackSize(64);
		//设定标签
		this.setCreativeTab(OrbArtsMain.orbartsTab);
		this.setUnlocalizedName("holyFabrics");
	}
}
