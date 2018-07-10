package org.dl.berlinclock.display;

import feign.Param;
import feign.RequestLine;

public interface BerlinClockClient {

    
	@RequestLine("GET /rest/hour/{hour}")
	public String displayHour(@Param("hour") String hour);
	
	@RequestLine("GET /rest/minute/{minute}")
	public String displayMinute(@Param("minute") String minute);
	
	
	@RequestLine("GET /rest/seconds/{seconds}")
	public String displaySeconds(@Param("seconds") String seconds);
}
