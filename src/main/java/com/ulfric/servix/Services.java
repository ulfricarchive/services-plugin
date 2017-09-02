package com.ulfric.servix;

import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

class Services {

	private static final Map<Class<? extends Service<?>>, List<Service<?>>> SERVICES = new HashMap<>();

	public static <S extends Service<S>> S get(Class<S> service) {
		List<Service<?>> services = SERVICES.get(service);
		return CollectionUtils.isEmpty(services) ? null : service.cast(services.get(0));
	}

	public static void register(Service<?> service) {
		Objects.requireNonNull(service, "service");
		Objects.requireNonNull(service.getService(), "service.getService");

		List<Service<?>> services = SERVICES.computeIfAbsent(service.getService(), ignore -> new ArrayList<>());
		if (services.contains(service)) {
			return;
		}
		services.add(service);
	}

	public static void unregister(Service<?> service) {
		Objects.requireNonNull(service, "service");

		SERVICES.values().forEach(services -> services.remove(service));
	}

	private Services() {
	}

}