package com.weather.forcast.controller;

import static org.junit.Assert.assertEquals;

import org.json.JSONException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Intergation test class for weather forcast application
 * 
 * @author Deepak Lamba
 *
 */

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TestWeatherForcastServiceController {
	
	@LocalServerPort
	private int port;
	
	TestRestTemplate restTemplate = new TestRestTemplate();
	HttpHeaders headers = new HttpHeaders();

	@Test
	public void testRetrieveWeatherData() throws JSONException {
		HttpEntity<String> entity = new HttpEntity<String>(null, headers);

		ResponseEntity<String> response = restTemplate.exchange(
				createURLWithPort("/temperatures/json/90213"),
				HttpMethod.GET, entity, String.class);
		String expected = "{\"zipCode\":\"90213\",\"temperatures\":[{\"time\":\"03:00:00\",\"temperature\":4},{\"time\":\"02:00:00\",\"temperature\":3}]}";
		JSONAssert.assertEquals(expected, response.getBody(), false);
	}
	
	@Test
	public void testRetrieveWeatherDataException() throws JSONException {
		HttpEntity<String> entity = new HttpEntity<String>(null, headers);

		ResponseEntity<String> response = restTemplate.exchange(
				createURLWithPort("/temperatures/json/98765"),
				HttpMethod.GET, entity, String.class);
		
		assertEquals(HttpStatus.NOT_FOUND , response.getStatusCode());
	}
	
	private String createURLWithPort(String uri) {
		return "http://localhost:" + port + uri;
	}
}
