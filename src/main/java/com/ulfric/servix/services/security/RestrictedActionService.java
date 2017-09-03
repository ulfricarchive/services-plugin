package com.ulfric.servix.services.security;

import com.ulfric.servix.Service;

public interface RestrictedActionService extends Service<RestrictedActionService> {

	public static RestrictedActionService get() {
		return Service.get(RestrictedActionService.class);
	}

	public static void doRestricted(Runnable runnable, String accessCode) {
		RestrictedActionService service = get();

		if (service == null) {
			runnable.run();
			return;
		}

		service.runRestricted(runnable, accessCode);
	}

	void runRestricted(Runnable runnable, String accessCode);

}