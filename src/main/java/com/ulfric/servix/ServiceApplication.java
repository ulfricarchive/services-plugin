package com.ulfric.servix;

import com.ulfric.dragoon.ObjectFactory;
import com.ulfric.dragoon.application.Application;
import com.ulfric.dragoon.extension.inject.Inject;
import com.ulfric.dragoon.reflect.Classes;

import java.util.Objects;

public class ServiceApplication extends Application {

	private final Service<?> service;

	@Inject
	private ObjectFactory factory;

	public ServiceApplication() {
		if (!(this instanceof Service)) {
			throw new IllegalStateException(this + " is not a service!");
		}

		this.service = (Service<?>) this;
		addHooks();
	}

	public ServiceApplication(Service<?> service) {
		Objects.requireNonNull(service, "service");

		this.service = service;

		addHooks();
	}

	private void addHooks() {
		addBootHook(this::register);
		addShutdownHook(this::unregister);
	}

	private void register() {
		Services.register(service);
		factory.bind(Classes.getNonDynamic(service.getService())).toValue(service);
		factory.bind(Classes.getNonDynamic(service.getClass())).toValue(service);
	}

	private void unregister() { // TODO fix leaking services
		Services.unregister(service);
	}

}