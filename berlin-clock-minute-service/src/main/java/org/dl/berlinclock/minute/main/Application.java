package org.dl.berlinclock.minute.main;

import org.dl.berlinclock.minute.service.BerlinClockMinuteDisplayService;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class Application extends ResourceConfig {

	public Application() {
		register(BerlinClockMinuteDisplayService.class);
	}
}

