package org.dl.berlinclock.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(url="http://localhost:8087", name="localhost")
public interface BerlinClockSecondsClient {
	
	@RequestMapping(value = "/rest/seconds/{seconds}", method = RequestMethod.GET)
	public String displaySeconds(@PathVariable("seconds") String seconds);

}
