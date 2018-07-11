package org.dl.berlinclock.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(url="http://localhost:8086", name="localhost")
public interface BerlinClockMinuteClient {
	
	@RequestMapping(value ="/rest/minute/{minute}", method = RequestMethod.GET)
	public String displayMinute(@PathVariable("minute") String minute);

}
