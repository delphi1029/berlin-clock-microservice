package org.dl.berlinclock.hour.main;

import org.dl.berlinclock.hour.service.BerlinClockHourDisplayService;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class Application extends ResourceConfig {

	public Application() {
		register(BerlinClockHourDisplayService.class);
	}
}

