package com.ulfric.servix;

public interface Service<S extends Service<S>> {

	static <S extends Service<S>> S get(Class<S> service) {
		return Services.get(service);
	}

	Class<S> getService();

}