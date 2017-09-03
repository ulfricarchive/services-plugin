package com.ulfric.servix.services.security;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import com.google.gson.JsonObject;

import com.ulfric.commons.json.Jsonable;
import com.ulfric.commons.time.TemporalHelper;
import com.ulfric.dragoon.reflect.Classes;

import java.time.Instant;

public class AuditEvent extends Event implements Jsonable {

	private static final HandlerList HANDLERS = new HandlerList();

	public static HandlerList getHandlerList() {
		return HANDLERS;
	}

	private final CommandSender sender;
	private final Instant time = TemporalHelper.instantNow();

	public AuditEvent(CommandSender sender) {
		this.sender = sender;
	}

	@Override
	public HandlerList getHandlers() {
		return HANDLERS;
	}

	@Override
	public JsonObject toJson() {
		JsonObject json = new JsonObject();
		json.addProperty("sender", senderString());
		json.addProperty("time", time.toString());
		json.addProperty("type", Classes.getNonDynamic(getClass()).getSimpleName());
		return json;
	}

	public String senderString() {
		if (sender instanceof Entity) {
			return ((Entity) sender).getUniqueId().toString();
		}

		return sender.getName();
	}

	public AuditCallResult callAuditEvent() {
		return AuditService.call(this);
	}

}
