package org.dl.berlinclock.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(url="http://localhost:8085", name="localhost")
public interface BerlinClockHourClient {


	@RequestMapping(value ="/rest/hour/{hour}", method = RequestMethod.GET)
	public String displayHour(@PathVariable("hour") String hour);
	
}
