package com.ulfric.servix.services.locale;

import org.bukkit.command.CommandSender;

import com.ulfric.fancymessage.Message;
import com.ulfric.i18n.content.Details;
import com.ulfric.i18n.locale.Locale;

public interface BukkitLocale extends Locale<Message> {

	Message getMessage(CommandSender display, String key);

	Message getMessage(CommandSender display, String key, Details details);

}