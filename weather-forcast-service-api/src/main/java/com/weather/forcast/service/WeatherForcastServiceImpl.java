/**
 * 
 */
package com.weather.forcast.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.weather.forcast.data.RawWeatherData;
import com.weather.forcast.data.WeatherDataService;
import com.weather.forcast.entity.TimeAndTemperature;

/**
 * @author deepaklamba
 *
 */
@Component
public class WeatherForcastServiceImpl implements WeatherForcastService {

	@Autowired
	private WeatherDataService weatherDataService;

	@Override
	public TimeAndTemperature getPredictedTemperatureByZipCode(String zipCode) {
		RawWeatherData weatherData = weatherDataService.getWeatherData(zipCode);
		TimeAndTemperature result = new TimeAndTemperature(zipCode,weatherData.getData());
		return result;
	}

}
