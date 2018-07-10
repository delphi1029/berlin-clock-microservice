package org.dl.berlinclock.minute.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.dl.berlinclock.minute.row.Minute;
import org.springframework.stereotype.Component;

@Component
@Path("/rest/minute/")
public class BerlinClockMinuteDisplayService {
	
	
	@GET
	@Path("/{minute}")
	@Produces (MediaType.TEXT_PLAIN)
	public String getBerlinClockHour(@PathParam("minute") String minute) {
		Minute row = new Minute();
		row.setMinutes(minute);
		return row.display();
	}

}
