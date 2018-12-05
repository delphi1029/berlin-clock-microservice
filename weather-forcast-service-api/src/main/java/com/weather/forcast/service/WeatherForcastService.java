package com.weather.forcast.service;

import com.weather.forcast.entity.TimeAndTemperature;

public interface WeatherForcastService {
	
	public TimeAndTemperature getPredictedTemperatureByZipCode(String zipCode);

}
