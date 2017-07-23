package com.ulfric.servix.services.teleport;

import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.event.HandlerList;
import org.bukkit.event.entity.EntityTeleportEvent;

public class TeleportCancelEvent extends EntityTeleportEvent {

	private static final HandlerList HANDLERS = new HandlerList();

	public static HandlerList getHandlerList() {
		return HANDLERS;
	}

	public TeleportCancelEvent(Entity what, Location from, Location to) {
		super(what, from, to);
	}

	@Override
	public HandlerList getHandlers() {
		return HANDLERS;
	}

}