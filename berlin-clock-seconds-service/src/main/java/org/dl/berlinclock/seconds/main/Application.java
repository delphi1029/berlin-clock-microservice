package org.dl.berlinclock.seconds.main;

import org.dl.berlinclock.seconds.service.BerlinClockSecondsDisplayService;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class Application extends ResourceConfig {

	public Application() {
		register(BerlinClockSecondsDisplayService.class);
	}
}

