package com.weather.forcast.entity;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Holder class for day's temperature data
 * 
 * @author Deepak Lamba
 *
 */
public class TemperatureList {

	private String zipCode;
	private List<Temperature> temperatures;
	
	public TemperatureList() {
		super();
	}
	
	public TemperatureList(String zipCode) {
		super();
		this.zipCode = zipCode;
		this.temperatures = new ArrayList<>();
	}


	public String getZipCode() {
		return zipCode;
	}

	public List<Temperature> getTemperatures() {
		return Collections.unmodifiableList(temperatures);
	}

	public void addTemperature(LocalTime time, Integer temperature) {
		temperatures.add(new Temperature(time, temperature));
	}
	
	@Override
	public String toString() {
				
		String result = "Time (hh:mm)  -  Temperature \n"
						+"=========================\n"
						+temperatures.stream()
						.map(t -> t.toString())
						.collect(Collectors.joining("\n"));
		return result;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((temperatures == null) ? 0 : temperatures.hashCode());
		result = prime * result + ((zipCode == null) ? 0 : zipCode.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TemperatureList other = (TemperatureList) obj;
		if (temperatures == null) {
			if (other.temperatures != null)
				return false;
		} else if (!temperatures.equals(other.temperatures))
			return false;
		if (zipCode == null) {
			if (other.zipCode != null)
				return false;
		} else if (!zipCode.equals(other.zipCode))
			return false;
		return true;
	}
	
	

	
}
