package com.weather.forcast.data;

import org.springframework.stereotype.Component;

import com.weather.forcast.data.factory.RawWeatherDataFactory;

@Component
public class USWeatherDataService implements WeatherDataService {

	@Override
	public RawWeatherData getWeatherData(String zipCode) {
		return RawWeatherDataFactory.getData(zipCode);
	}

}
