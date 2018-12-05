package com.weather.forcast.entity;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TimeAndTemperature {

	private String zipCode;
	private Map<String, Integer> timeTemperatureMap;
	
	public TimeAndTemperature() {
		super();
	}
	
	public TimeAndTemperature(String zipCode, Map<String, Integer> timeTemperatureMap) {
		super();
		this.zipCode = zipCode;
		this.timeTemperatureMap = timeTemperatureMap;
	}

	@JsonProperty("Zip Code")
	public String getZipCode() {
		return zipCode;
	}

	@JsonProperty("Time_temperature")
	public Map<String, Integer> getTimeTemperatureMap() {
		return new HashMap<>(timeTemperatureMap);
	}

	@Override
	public String toString() {
				
		String result = "Time (hh:mm)  -  Temperature \n"
						+"=========================\n"
						+timeTemperatureMap.entrySet().stream()
									.sorted(Entry.comparingByKey())
									.map(e -> "   "+e.getKey()+"    -    "+(e.getValue() == null ? "NA":e.getValue()))
									.collect(Collectors.joining("\n"))
									.toString();
		return result;
	}
	
	

	
}
