package com.ulfric.servix.services.lifecycle;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import java.util.Objects;

public class LifecycleStageEvent extends Event {

	private static final HandlerList HANDLERS = new HandlerList();

	public static HandlerList getHandlerList() {
		return HANDLERS;
	}

	private final LifecycleService lifecycle;
	private final Stage newStage;

	public LifecycleStageEvent(LifecycleService lifecycle, Stage newStage) {
		Objects.requireNonNull(lifecycle, "lifecycle");
		Objects.requireNonNull(newStage, "newStage");

		this.lifecycle = lifecycle;
		this.newStage = newStage;
	}

	public final LifecycleService getLifecycle() {
		return lifecycle;
	}

	public Stage getNewStage() {
		return newStage;
	}

	@Override
	public HandlerList getHandlers() {
		return HANDLERS;
	}

}