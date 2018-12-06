package com.weather.forcast.data;

import org.springframework.stereotype.Component;

import com.weather.forcast.data.factory.RawWeatherDataFactory;

/**
 * Service implementaton to get weather data. 
 * This is a mock service that generates weather data.
 * 
 * @author Deepak Lamba
 *
 */

@Component
public class MockWeatherDataServiceImpl implements WeatherDataService {

	@Override
	public RawWeatherData getWeatherData(String zipCode) {
		return RawWeatherDataFactory.getData(zipCode);
	}

}
