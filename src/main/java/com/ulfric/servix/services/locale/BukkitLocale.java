package com.ulfric.servix.services.locale;

import org.bukkit.command.CommandSender;

import com.ulfric.i18n.content.Details;
import com.ulfric.i18n.locale.Locale;

public interface BukkitLocale extends Locale {

	String getMessage(CommandSender target, String key);

	String getMessage(CommandSender target, String key, Details details);

}