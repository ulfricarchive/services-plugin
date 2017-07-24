package com.ulfric.servix.services.lifecycle;

import java.time.Duration;

public interface Stage {

	String getName();

	Duration timeRemaining();

}