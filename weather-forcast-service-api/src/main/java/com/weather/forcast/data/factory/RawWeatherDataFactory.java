package com.weather.forcast.data.factory;

import java.time.LocalTime;

import com.weather.forcast.data.RawWeatherData;

/**
 * This is a factory to generate weather data
 * @author Deepak Lamba
 *
 */
public class RawWeatherDataFactory {

	public static RawWeatherData getData(String zipCode) {
		RawWeatherData rawWeatherData = new RawWeatherData();
		
		if(zipCode.equals("33124")) {
			rawWeatherData.addData(LocalTime.parse("00:00"), 2);
			rawWeatherData.addData(LocalTime.parse("01:00"), 3);
			rawWeatherData.addData(LocalTime.parse("02:00"), 3);
			rawWeatherData.addData(LocalTime.parse("03:00"), 4);
			rawWeatherData.addData(LocalTime.parse("04:00"), 5);
			rawWeatherData.addData(LocalTime.parse("05:00"), 6);
			rawWeatherData.addData(LocalTime.parse("06:00"), 7);
			rawWeatherData.addData(LocalTime.parse("07:00"), 8);
			rawWeatherData.addData(LocalTime.parse("08:00"), 12);
			rawWeatherData.addData(LocalTime.parse("09:00"), 14);
			rawWeatherData.addData(LocalTime.parse("10:00"), 14);
			rawWeatherData.addData(LocalTime.parse("11:00"), 20);
			rawWeatherData.addData(LocalTime.parse("12:00"), 22);
			rawWeatherData.addData(LocalTime.parse("13:00"), 23);
			rawWeatherData.addData(LocalTime.parse("14:00"), 24);
			rawWeatherData.addData(LocalTime.parse("15:00"), 25);
			rawWeatherData.addData(LocalTime.parse("16:00"), 26);
			rawWeatherData.addData(LocalTime.parse("17:00"), 17);
			rawWeatherData.addData(LocalTime.parse("18:00"), 15);
			rawWeatherData.addData(LocalTime.parse("19:00"), 14);
			rawWeatherData.addData(LocalTime.parse("20:00"), 12);
			rawWeatherData.addData(LocalTime.parse("21:00"), 10);
			rawWeatherData.addData(LocalTime.parse("22:00"), 9);
			rawWeatherData.addData(LocalTime.parse("23:00"), 2);
		}
		
		if(zipCode.equals("78705")) {
			rawWeatherData.addData(LocalTime.parse("00:00"), 2);
			rawWeatherData.addData(LocalTime.parse("01:00"), 3);
			rawWeatherData.addData(LocalTime.parse("02:00"), 3);
			rawWeatherData.addData(LocalTime.parse("03:00"), 4);
			rawWeatherData.addData(LocalTime.parse("04:00"), 5);
			rawWeatherData.addData(LocalTime.parse("05:00"), 6);
			rawWeatherData.addData(LocalTime.parse("06:00"), 7);
			rawWeatherData.addData(LocalTime.parse("07:00"), null);
			rawWeatherData.addData(LocalTime.parse("08:00"), 12);
			rawWeatherData.addData(LocalTime.parse("09:00"), 14);
			rawWeatherData.addData(LocalTime.parse("10:00"), 14);
			rawWeatherData.addData(LocalTime.parse("11:00"), 20);
			rawWeatherData.addData(LocalTime.parse("12:00"), 22);
			rawWeatherData.addData(LocalTime.parse("13:00"), 23);
			rawWeatherData.addData(LocalTime.parse("14:00"), null);
			rawWeatherData.addData(LocalTime.parse("15:00"), 25);
			rawWeatherData.addData(LocalTime.parse("16:00"), 26);
			rawWeatherData.addData(LocalTime.parse("17:00"), 17);
			rawWeatherData.addData(LocalTime.parse("18:00"), 15);
			rawWeatherData.addData(LocalTime.parse("19:00"), 14);
			rawWeatherData.addData(LocalTime.parse("20:00"), 12);
			rawWeatherData.addData(LocalTime.parse("21:00"), 10);
			rawWeatherData.addData(LocalTime.parse("22:00"), null);
			rawWeatherData.addData(LocalTime.parse("23:00"), 2);
		}
		
		//Data for test case
		if(zipCode.equals("90213")) {
			rawWeatherData.addData(LocalTime.parse("02:00"), 3);
			rawWeatherData.addData(LocalTime.parse("03:00"), 4);
		}
		
		return rawWeatherData;
	}
}
