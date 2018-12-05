package com.weather.forcast.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.weather.forcast.entity.TimeAndTemperature;
import com.weather.forcast.exception.WeatherDataNotAvailableException;
import com.weather.forcast.service.WeatherForcastService;

@RestController
public class WeatherForcastServiceController {
	
	@Autowired
	WeatherForcastService weatherForcastService;
	
	@GetMapping(path="/temperatures/json/{zipCode}")
	public TimeAndTemperature getPredictedTemperaturesByZipCodeJson(@PathVariable(name="zipCode") String zipCode) {
		TimeAndTemperature result = weatherForcastService.getPredictedTemperatureByZipCode(zipCode);
		if(result.getTimeTemperatureMap().isEmpty())
			throw new WeatherDataNotAvailableException("Data Not Found for zip code - "+zipCode);
		return result;
	}
	
	@GetMapping(path="/temperatures/{zipCode}")
	public String getPredictedTemperaturesByZipCodel(@PathVariable(name="zipCode") String zipCode) {
		TimeAndTemperature timeAndTemp = weatherForcastService.getPredictedTemperatureByZipCode(zipCode);
		if(timeAndTemp.getTimeTemperatureMap().isEmpty())
			throw new WeatherDataNotAvailableException("Data Not Found for zip code - "+zipCode);
		return timeAndTemp.toString();
	}

}
