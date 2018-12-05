package com.weather.forcast.data;

import java.util.HashMap;
import java.util.Map;

public class RawWeatherData {
	
	private Map<String, Integer> data = null;
	
	public RawWeatherData() {
		data = new HashMap<>();
	}

	public Map<String, Integer> getData() {
		return data;
	}
	
	public void addData(String time, Integer temperature) {
		data.put(time, temperature);
	}
}
