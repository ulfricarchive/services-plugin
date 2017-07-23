package com.ulfric.servix.services.teleport;

import org.bukkit.Location;
import org.bukkit.entity.Entity;

import com.ulfric.servix.Service;

import java.time.Duration;
import java.util.Optional;

public interface TeleportService extends Service {

	static TeleportService get() {
		return Service.get(TeleportService.class);
	}

	TeleportTask teleport(Entity entity, Location location);

	TeleportTask teleport(Entity entity, Location location, Duration delay);

	Optional<TeleportTask> getPending(Entity entity);

}