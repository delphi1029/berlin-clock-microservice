package org.dl.berlinclock.seconds.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.dl.berlinclock.seconds.row.Seconds;
import org.springframework.stereotype.Component;

@Component
@Path("/rest/seconds/")
public class BerlinClockSecondsDisplayService {
	
	
	@GET
	@Path("/{seconds}")
	@Produces (MediaType.TEXT_PLAIN)
	public String getBerlinClockHour(@PathParam("seconds") String seconds) {
		Seconds row = new Seconds();
		row.setSecond(seconds);
		return row.display();
	}

}
