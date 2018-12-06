/**
 * 
 */
package com.weather.forcast.service;

import java.time.LocalTime;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.weather.forcast.data.RawWeatherData;
import com.weather.forcast.data.WeatherDataService;
import com.weather.forcast.entity.TemperatureList;

/**
 * This class is implementation WeatherForcastService to get predicted temperatures
 * 
 * @author Deepak Lamba
 */
@Component
public class WeatherForcastServiceImpl implements WeatherForcastService {

	@Autowired
	private WeatherDataService weatherDataService;

	/**
	 * This method is used to get predicted temperature for a zipcode
	 * @param zipCode
	 * @return TemperatureList
	 * 
	 */
	@Override
	public TemperatureList getPredictedTemperatureByZipCode(String zipCode) {
		
		RawWeatherData weatherData = weatherDataService.getWeatherData(zipCode);
		TemperatureList result = convertRawDataToTemperatureList(zipCode,weatherData);
		return result;
	}

	/**
	 * This method is used to convert raw weather data to formatted data
	 * @param zipCode
	 * @param rawWeatherData
	 * @return TemperatureList
	 * 
	 */
	protected TemperatureList convertRawDataToTemperatureList(String zipCode, RawWeatherData weatherData) {
		TemperatureList temperatureList = new TemperatureList(zipCode);
		
		for(Entry<LocalTime,Integer> e : weatherData.getData().entrySet()) {
			temperatureList.addTemperature(e.getKey(),e.getValue());
		}
		return temperatureList;	
	}

}
