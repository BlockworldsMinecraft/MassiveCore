package com.massivecraft.massivecore.nms;

import org.bukkit.inventory.PlayerInventory;

import com.massivecraft.massivecore.mixin.Mixin;

public class NmsPlayerInventoryCreate extends Nms
{
	// -------------------------------------------- //
	// DEFAULT
	// -------------------------------------------- //
	
	private static NmsPlayerInventoryCreate d = new NmsPlayerInventoryCreate().setAlternatives(
		NmsPlayerInventoryCreate17R4P.class
	);
	
	// -------------------------------------------- //
	// INSTANCE & CONSTRUCT
	// -------------------------------------------- //
	
	private static NmsPlayerInventoryCreate i = d;
	public static NmsPlayerInventoryCreate get() { return i; }
	
	// -------------------------------------------- //
	// CREATE
	// -------------------------------------------- //
	
	public PlayerInventory create()
	{
		throw notImplemented();
	}
	
}
