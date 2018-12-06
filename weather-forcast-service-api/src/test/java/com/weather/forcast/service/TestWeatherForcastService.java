package com.weather.forcast.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.time.LocalTime;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.weather.forcast.data.RawWeatherData;
import com.weather.forcast.data.WeatherDataService;
import com.weather.forcast.entity.TemperatureList;

/**
 * Test class for WeatherForcastService
 * 
 * @author Deepak Lamba
 *
 */

@SpringBootTest
@RunWith(SpringRunner.class)
public class TestWeatherForcastService {
	
	@MockBean
	WeatherDataService mockData;
	
	@Autowired
	WeatherForcastService service;
	
	@Before
	public void init() {
		
	}

	@Test
	public void testGetPredictedTemperatureByZipCode() {
		TemperatureList expected = new TemperatureList("85055");
		expected.addTemperature(LocalTime.parse("00:00"), 2);
		expected.addTemperature(LocalTime.parse("01:00"), 3);
		when(mockData.getWeatherData("85055")).thenReturn(buildMockData());
		assertEquals(expected,service.getPredictedTemperatureByZipCode("85055"));
	}
	
	@Test
	public void testGetPredictedTemperatureByZipCodeEmptyResult() {
		when(mockData.getWeatherData("90213")).thenReturn(new RawWeatherData());
		service.getPredictedTemperatureByZipCode("90213");
	}
	
	private RawWeatherData buildMockData() {
		RawWeatherData rawWeatherData = new RawWeatherData();
		rawWeatherData.addData(LocalTime.parse("00:00"), 2);
		rawWeatherData.addData(LocalTime.parse("01:00"), 3);
		return rawWeatherData;
	}
}
