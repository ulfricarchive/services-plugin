package com.ulfric.servix.services.locale;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;

import org.apache.commons.lang3.StringUtils;

import java.util.Objects;
import java.util.function.Consumer;

public final class RunCommandCallback implements Consumer<String[]> {

	private final CommandSender executor;
	private final String command;

	public RunCommandCallback(CommandSender executor, String command) {
		Objects.requireNonNull(executor);

		this.executor = executor;
		this.command = command.endsWith(" ") ? command : command + ' ';
	}

	@Override
	public void accept(String[] lines) {
		String line = lines[0];
		if (StringUtils.isBlank(line)) {
			return;
		}
		Bukkit.dispatchCommand(executor, command + line.trim());
	}

}