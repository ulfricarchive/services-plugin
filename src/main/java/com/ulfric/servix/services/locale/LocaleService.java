package com.ulfric.servix.services.locale;

import com.ulfric.servix.Service;

public interface LocaleService extends Service {

	static LocaleService get() {
		return Service.get(LocaleService.class);
	}

	static String defaultMessage(String code) {
		LocaleService service = get();

		if (service == null) {
			return code;
		}

		return service.defaultLocale().getMessage(code);
	}

	Locale getLocale(String code);

	Locale defaultLocale();

}