package com.ulfric.servix.services.locale;

import org.bukkit.entity.Player;

import com.ulfric.andrew.Sender;
import com.ulfric.servix.Service;

import java.util.Map;

public interface TellService extends Service<TellService> {

	static TellService get() {
		return Service.get(TellService.class);
	}

	static void sendMessage(Sender target, String message) {
		TellService tell = TellService.get();

		if (tell != null) {
			tell.send(target, message);
		}
	}

	static void sendMessage(Player target, String message) {
		TellService tell = TellService.get();

		if (tell != null) {
			tell.send(target, message);
		}
	}

	static void sendMessage(Sender target, String message, Map<String, String> context) {
		TellService tell = TellService.get();

		if (tell != null) {
			tell.send(target, message, context);
		}
	}

	static void sendMessage(Player target, String message, Map<String, String> context) {
		TellService tell = TellService.get();

		if (tell != null) {
			tell.send(target, message, context);
		}
	}

	void send(Sender target, String message);

	void send(Player target, String message);

	void send(Sender target, String message, Map<String, String> context);

	void send(Player target, String message, Map<String, String> context);

}
