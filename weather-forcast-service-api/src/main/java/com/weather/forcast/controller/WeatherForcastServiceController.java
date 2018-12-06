package com.weather.forcast.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.weather.forcast.entity.TemperatureList;
import com.weather.forcast.exception.WeatherDataNotAvailableException;
import com.weather.forcast.service.WeatherForcastService;

/**
 * Weather forcast controller class.
 * This class exposes following endpoints - 
 * 1) Predicted temperatures for a zip code in json format for api/service consumption.
 * 2) Predicted temperatures for a zip code in text format for  CLI.
 * 
 * @author Deepak Lamba
 *
 */

@RestController
public class WeatherForcastServiceController {
	
	@Autowired
	WeatherForcastService weatherForcastService;
	
	@GetMapping(path="/temperatures/json/{zipCode}")
	public TemperatureList getPredictedTemperaturesByZipCodeJson(@PathVariable(name="zipCode") String zipCode) {
		TemperatureList result = weatherForcastService.getPredictedTemperatureByZipCode(zipCode);
		if(result.getTemperatures().isEmpty())
			throw new WeatherDataNotAvailableException("Data Not Found for zip code - "+zipCode);
		return result;
	}
	
	@GetMapping(path="/temperatures/{zipCode}")
	public String getPredictedTemperaturesByZipCodel(@PathVariable(name="zipCode") String zipCode) {
		TemperatureList timeAndTemp = weatherForcastService.getPredictedTemperatureByZipCode(zipCode);
		if(timeAndTemp.getTemperatures().isEmpty())
			throw new WeatherDataNotAvailableException("Data Not Found for zip code - "+zipCode);
		return timeAndTemp.toString();
	}

}
