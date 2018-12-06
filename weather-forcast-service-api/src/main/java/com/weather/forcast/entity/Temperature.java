package com.weather.forcast.entity;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Deepak Lamba
 *
 */
public class Temperature {
	
	private LocalTime time;
	private Integer temperature;
	
	public Temperature(LocalTime time, Integer temperature) {
		super();
		this.time = time;
		this.temperature = temperature;
	}

	public LocalTime getTime() {
		return time;
	}

	public Integer getTemperature() {
		return temperature;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((temperature == null) ? 0 : temperature.hashCode());
		result = prime * result + ((time == null) ? 0 : time.hashCode());
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
		Temperature other = (Temperature) obj;
		if (temperature == null) {
			if (other.temperature != null)
				return false;
		} else if (!temperature.equals(other.temperature))
			return false;
		if (time == null) {
			if (other.time != null)
				return false;
		} else if (!time.equals(other.time))
			return false;
		return true;
	}

	@Override
	public String toString() {
		 String str = time.format(DateTimeFormatter.ofPattern("hh:mm a"))+"     -       "+(temperature== null ? "NA":temperature.toString());
		 return str;
	}
	
	
}
