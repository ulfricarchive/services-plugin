package com.ulfric.servix.services.security;

import com.ulfric.servix.Service;

public interface AuditService extends Service<AuditService> {

	public static AuditService get() {
		return Service.get(AuditService.class);
	}

	public static AuditCallResult call(AuditEvent event) {
		AuditService audit = get();

		if (audit == null) {
			return AuditCallResult.UNABLE_TO_AUDIT;
		}

		return audit.logAuditEvent(event);
	}

	AuditCallResult logAuditEvent(AuditEvent event);

}