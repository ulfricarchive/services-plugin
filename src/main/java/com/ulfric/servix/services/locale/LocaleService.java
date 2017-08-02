package com.ulfric.servix.services.locale;

import org.bukkit.entity.Player;

import com.ulfric.servix.Service;

import java.util.Map;

public interface LocaleService extends Service<LocaleService> {

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

	static Locale getLocale(Player player) {
		LocaleService service = get();

		if (service == null) {
			return null;
		}

		return service.getLocale(player.getLocale());
	}

	static String getMessage(Player target, String key, Map<String, String> context) {
		Locale locale = getLocale(target);

		if (locale == null) {
			return null;
		}

		return locale.getMessage(target, key, context);
	}

	static String getMessage(Player target, String key) {
		Locale locale = getLocale(target);

		if (locale == null) {
			return null;
		}

		return locale.getMessage(target, key);
	}

	Locale getLocale(String code);

	Locale defaultLocale();

}