package org.dl.berlinclock.hour.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.dl.berlinclock.hour.row.Hour;
import org.springframework.stereotype.Component;

@Component
@Path("/rest/hour/")
public class BerlinClockHourDisplayService {
	
	
	@GET
	@Path("{hour}")
	@Produces (MediaType.TEXT_PLAIN)
	public String getBerlinClockHour(@PathParam("hour") String hour) {
		Hour row = new Hour();
		row.setHour(hour);
		return row.display();
	}

}
