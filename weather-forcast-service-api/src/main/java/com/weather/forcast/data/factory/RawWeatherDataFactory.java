package com.weather.forcast.data.factory;

import com.weather.forcast.data.RawWeatherData;

public class RawWeatherDataFactory {

	public static RawWeatherData getData(String zipCode) {
		RawWeatherData rawWeatherData = new RawWeatherData();
		
		if(zipCode.equals("33124")) {
			rawWeatherData.addData("00:00", 2);
			rawWeatherData.addData("01:00", 3);
			rawWeatherData.addData("02:00", 3);
			rawWeatherData.addData("03:00", 4);
			rawWeatherData.addData("04:00", 5);
			rawWeatherData.addData("05:00", 6);
			rawWeatherData.addData("06:00", 7);
			rawWeatherData.addData("07:00", 8);
			rawWeatherData.addData("08:00", 12);
			rawWeatherData.addData("09:00", 14);
			rawWeatherData.addData("10:00", 14);
			rawWeatherData.addData("11:00", 20);
			rawWeatherData.addData("12:00", 22);
			rawWeatherData.addData("13:00", 23);
			rawWeatherData.addData("14:00", 24);
			rawWeatherData.addData("15:00", 25);
			rawWeatherData.addData("16:00", 26);
			rawWeatherData.addData("17:00", 17);
			rawWeatherData.addData("18:00", 15);
			rawWeatherData.addData("19:00", 14);
			rawWeatherData.addData("20:00", 12);
			rawWeatherData.addData("21:00", 10);
			rawWeatherData.addData("22:00", 9);
			rawWeatherData.addData("23:00", 2);
		}
		
		if(zipCode.equals("78705")) {
			rawWeatherData.addData("00:00", 2);
			rawWeatherData.addData("01:00", 3);
			rawWeatherData.addData("02:00", 3);
			rawWeatherData.addData("03:00", 4);
			rawWeatherData.addData("04:00", 5);
			rawWeatherData.addData("05:00", 6);
			rawWeatherData.addData("06:00", 7);
			rawWeatherData.addData("07:00", 8);
			rawWeatherData.addData("08:00", 12);
			rawWeatherData.addData("09:00", 14);
			rawWeatherData.addData("10:00", 14);
			rawWeatherData.addData("11:00", 20);
			rawWeatherData.addData("12:00", 22);
			rawWeatherData.addData("13:00", 23);
			rawWeatherData.addData("14:00", 24);
			rawWeatherData.addData("15:00", 25);
			rawWeatherData.addData("16:00", 26);
			rawWeatherData.addData("17:00", 17);
			rawWeatherData.addData("18:00", 15);
			rawWeatherData.addData("19:00", 14);
			rawWeatherData.addData("20:00", 12);
			rawWeatherData.addData("21:00", 10);
			rawWeatherData.addData("22:00", 9);
			rawWeatherData.addData("23:00", 2);
		}
		
		return rawWeatherData;
	}
}
