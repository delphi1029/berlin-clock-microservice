package com.weather.forcast.controller;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.weather.forcast.exception.WeatherDataNotAvailableException;

@Order(Ordered.HIGHEST_PRECEDENCE)
@ControllerAdvice
public class WeatherForcastServiceExceptionController  {
	   @ExceptionHandler(value = WeatherDataNotAvailableException.class)
	   public ResponseEntity<Object> exception(WeatherDataNotAvailableException exception) {
	      return new ResponseEntity<>("Weather data not found", HttpStatus.NOT_FOUND);
	   }
}
