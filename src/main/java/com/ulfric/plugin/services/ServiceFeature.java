package com.ulfric.plugin.services;

import com.ulfric.dragoon.ObjectFactory;
import com.ulfric.dragoon.application.Application;
import com.ulfric.dragoon.application.Feature;
import com.ulfric.dragoon.extension.inject.Inject;

public class ServiceFeature extends Feature {

	@Inject
	private ObjectFactory factory;

	@Override
	public Application apply(Object service) {
		return service instanceof Service ? factory.request(ServiceApplication.class, service) : null;
	}

}