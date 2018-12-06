package com.weather.forcast;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.weather.forcast.controller.TestWeatherForcastServiceController;
import com.weather.forcast.service.TestWeatherForcastService;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	TestWeatherForcastService.class,
    TestWeatherForcastServiceController.class   
})
public class WeatherForcastTestSuite {

}
