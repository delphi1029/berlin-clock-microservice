package org.dl.berlinclock.display;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.dl.berlinclock.exception.TimeFormatException;
import org.dl.berlinclock.utility.TimeFormatVerifier;
import org.dl.berlinclock.utility.TimeFormatVerifier24Hours;
import org.dl.berlinclock.utility.TimeStringSplitter;
import org.springframework.stereotype.Component;

@Component
@Path("berlinclock")

public class BerlinClock implements TimeConverter {

	BerlinClockClient client;
	private TimeFormatVerifier timeformatVerifier;
	private TimeStringSplitter timeStringSplitter;

	private String hour;
	private String minute;
	private String seconds;
	
	
	
	public BerlinClock() {
		this.timeformatVerifier = new TimeFormatVerifier24Hours();
		this.timeStringSplitter = new TimeStringSplitter();
		
	}
	
	@GET
	@Path("/{time}")
	@Produces (MediaType.TEXT_PLAIN)
	public String convertTime(@PathParam("time") String time) {
		return client.displayBerlinClock(time);
	}

	private void verifyTimeString(String timeStr) {
		if(!timeformatVerifier.isVerified(timeStr)) {
			throw new TimeFormatException("Time not in hh:mm:ss format");
		}
	}
	
	private void setTime(String[] time) {
		 hour = time[0];
		 minute = time[1];
		 seconds = time[2];
	}

	public String displayBerlinClock(String time) {
		verifyTimeString(time);
		String[] timeSplit = timeStringSplitter.splitTimeString(time);
		setTime(timeSplit);
		
		StringBuilder convertedTime = new StringBuilder();
		convertedTime.append(client.displayHour());
		convertedTime.append("/n");
		convertedTime.append(client.displayMinute());
		convertedTime.append("/n");
		convertedTime.append(client.displaySeconds());
		
		return convertedTime.toString();
	}	

}
