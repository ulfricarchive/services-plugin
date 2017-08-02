package com.ulfric.servix.services.teleport;

import org.bukkit.Location;
import org.bukkit.entity.Entity;

import com.ulfric.palpatine.Task;
import com.ulfric.servix.Service;

import java.time.Duration;

public interface TeleportService extends Service<TeleportService> {

	static TeleportService get() {
		return Service.get(TeleportService.class);
	}

	Task teleport(Entity entity, Location location);

	Task teleport(Entity entity, Location location, Duration when);

	Task getPending(Entity entity);

}