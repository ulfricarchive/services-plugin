package com.ulfric.servix.services.locale;

import org.bukkit.command.CommandSender;

import com.ulfric.andrew.Sender;
import com.ulfric.i18n.content.Details;
import com.ulfric.servix.Service;

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

	static void sendMessage(CommandSender target, String message) {
		TellService tell = TellService.get();

		if (tell != null) {
			tell.send(target, message);
		}
	}

	static void sendMessage(Sender target, String message, Details details) {
		TellService tell = TellService.get();

		if (tell != null) {
			tell.send(target, message, details);
		}
	}

	static void sendMessage(CommandSender target, String message, Details details) {
		TellService tell = TellService.get();

		if (tell != null) {
			tell.send(target, message, details);
		}
	}

	void send(Sender target, String message);

	void send(CommandSender target, String message);

	void send(Sender target, String message, Details details);

	void send(CommandSender target, String message, Details details);

}
