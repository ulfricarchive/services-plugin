package com.ulfric.servix.services.vanish;

import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;

public class PlayerVanishEvent extends PlayerEvent {

	private static final HandlerList HANDLERS = new HandlerList();

	public static HandlerList getHandlerList() {
		return HANDLERS;
	}

	public PlayerVanishEvent(Player who) {
		super(who);
	}

	@Override
	public HandlerList getHandlers() {
		return HANDLERS;
	}

}