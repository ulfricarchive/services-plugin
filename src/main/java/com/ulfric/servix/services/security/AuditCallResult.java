package com.ulfric.servix.services.security;

public enum AuditCallResult {

	ALLOWED,
	DENIED,
	UNABLE_TO_AUDIT;

	public final boolean isAllowed() {
		return this == ALLOWED;
	}

}