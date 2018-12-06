package com.weather.forcast.data;

import java.time.LocalTime;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * This class holds the data that is returned from weather data api / service
 * @author Deepak Lamba
 *
 */

public class RawWeatherData {
	
	private Map<LocalTime, Integer> data = null;
	
	public RawWeatherData() {
		data = new LinkedHashMap<>();
	}

	public Map<LocalTime, Integer> getData() {
		return data;
	}
	
	public void addData(LocalTime time, Integer temperature) {
		data.put(time, temperature);
	}
}
