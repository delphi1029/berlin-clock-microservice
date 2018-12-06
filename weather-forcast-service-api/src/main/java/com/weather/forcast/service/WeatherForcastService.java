package com.weather.forcast.service;

import com.weather.forcast.entity.TemperatureList;

/**
 * Weather-forcast service to get predicted temperatures
 * 
 * @author Deepak Lamba
 *
 */
public interface WeatherForcastService {
	
	/**
	 * This method is used to get predicted temperature for a zipcode
	 * @param zipCode
	 * @return TemperatureList
	 * 
	 */
	public TemperatureList getPredictedTemperatureByZipCode(String zipCode);
	
	

}
