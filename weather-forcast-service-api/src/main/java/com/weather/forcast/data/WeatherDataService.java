package com.weather.forcast.data;

/**
 * Service to get weather data. 
 * @author Deepak Lamba
 *
 */
public interface WeatherDataService {

	public RawWeatherData getWeatherData(String zipCode);
	
}
