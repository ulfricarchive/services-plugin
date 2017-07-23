package com.ulfric.servix.services.vanish;

import com.ulfric.servix.Service;

import java.util.UUID;

public interface VanishService extends Service {

	static VanishService get() {
		return Service.get(VanishService.class);
	}

	void vanish(UUID uniqueId);

	void unvanish(UUID uniqueId);

	boolean isVanished(UUID uniqueId);

}