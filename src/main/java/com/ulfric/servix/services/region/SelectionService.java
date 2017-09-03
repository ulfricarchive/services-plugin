package com.ulfric.servix.services.region;

import com.ulfric.servix.Service;

import java.util.UUID;

public interface SelectionService extends Service<SelectionService> {

	public static SelectionService get() {
		return Service.get(SelectionService.class);
	}

	public Selection getSelection(UUID uniqueId);

}