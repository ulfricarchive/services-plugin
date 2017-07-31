package com.ulfric.servix.services.locale;

import com.ulfric.servix.Service;

public interface LocaleService extends Service {

	static LocaleService get() {
		return Service.get(LocaleService.class);
	}

	Locale getLocale(String code);

}