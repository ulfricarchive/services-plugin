package com.ulfric.servix.services.lifecycle;

import java.time.temporal.TemporalAmount;

public interface Stage {

	String getName();

	TemporalAmount timeRemaining();

}