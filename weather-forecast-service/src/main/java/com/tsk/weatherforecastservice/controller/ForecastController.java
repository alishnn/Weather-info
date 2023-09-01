package com.tsk.weatherforecastservice.controller;



import com.tsk.weatherforecastservice.model.WeatherForecast;
import com.tsk.weatherforecastservice.service.ForecastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ForecastController {
	
	
	@Autowired
	public ForecastService forecastService;
	
	@GetMapping("/forecast/{location}/{days}")
	public WeatherForecast forecast(@PathVariable("location") String location , @PathVariable("days") String days){
		
		return forecastService.getForecastWeather(location,days);
		
	}

}
