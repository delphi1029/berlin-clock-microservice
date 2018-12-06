package com.weather.forcast.controller;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.weather.forcast.exception.ApplicationError;
import com.weather.forcast.exception.WeatherDataNotAvailableException;

/**
 * Global exception handler for Weather forcast application
 * @author Deepak Lamba
 *
 */

@Order(Ordered.HIGHEST_PRECEDENCE)
@ControllerAdvice
public class WeatherForcastServiceExceptionController  {
	   @ExceptionHandler(value = WeatherDataNotAvailableException.class)
	   public ResponseEntity<Object> exception(WeatherDataNotAvailableException exception) {
	   ApplicationError error =   new ApplicationError(HttpStatus.NOT_FOUND,"Weather data not found");
	      return new ResponseEntity<Object>(
	    		  error, new HttpHeaders(), error.getStatus());
	   }
}
