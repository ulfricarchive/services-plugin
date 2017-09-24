package com.ulfric.plugin.services;

public interface Service<S extends Service<S>> {

	static <S extends Service<S>> S get(Class<S> service) {
		return ServiceRegistry.get(service);
	}

	Class<S> getService();

}