package com.ulfric.servix.services.locale;

import org.bukkit.command.CommandSender;

import java.util.Map;

public interface Locale {

	String getMessage(String key);

	String getMessage(CommandSender target, String key);

	String getMessage(CommandSender target, String key, Map<String, String> context);

}