package org.dl.berlinclock.main;

import org.dl.berlinclock.display.BerlinClock;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class Application extends ResourceConfig {

	public Application() {
		register(BerlinClock.class);
	}
}

