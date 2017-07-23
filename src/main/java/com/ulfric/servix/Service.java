package com.ulfric.servix;

public interface Service {

	static <S extends Service> S get(Class<S> service) {
		return Services.get(service);
	}

	Class<? extends Service> getService();

}