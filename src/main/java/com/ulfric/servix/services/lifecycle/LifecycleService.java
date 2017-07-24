package com.ulfric.servix.services.lifecycle;

import com.ulfric.servix.Service;

public interface LifecycleService extends Service {

	static LifecycleService get() {
		return Service.get(LifecycleService.class);
	}

	void begin();

	void nextStage();

	Stage currentStage();

}