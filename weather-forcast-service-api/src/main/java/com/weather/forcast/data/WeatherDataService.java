package com.weather.forcast.data;

public interface WeatherDataService {

	public RawWeatherData getWeatherData(String zipCode);
	
}
