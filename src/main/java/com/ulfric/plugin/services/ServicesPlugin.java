package com.ulfric.plugin.services;

import com.ulfric.plugin.Plugin;

public class ServicesPlugin extends Plugin {

	public ServicesPlugin() {
		install(ServiceFeature.class);
	}

}
