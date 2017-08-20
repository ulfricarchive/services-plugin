package com.ulfric.servix.services.locale;

import org.bukkit.entity.Player;

import com.ulfric.i18n.content.Details;
import com.ulfric.servix.Service;

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

	static BukkitLocale getLocale(Player player) {
		LocaleService service = get();

		if (service == null) {
			return null;
		}

		return service.getLocale(player.getLocale());
	}

	static String getMessage(Player target, String key, Details details) {
		BukkitLocale locale = getLocale(target);

		if (locale == null) {
			return null;
		}

		return locale.getMessage(target, key, details);
	}

	static String getMessage(Player target, String key) {
		BukkitLocale locale = getLocale(target);

		if (locale == null) {
			return null;
		}

		return locale.getMessage(target, key);
	}

	BukkitLocale getLocale(String code);

	BukkitLocale defaultLocale();

}