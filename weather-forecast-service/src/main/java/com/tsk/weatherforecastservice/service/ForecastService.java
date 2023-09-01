package com.tsk.weatherforecastservice.service;


import com.tsk.weatherforecastservice.model.WeatherForecast;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ForecastService {
	
	@Autowired
	public RestTemplate restTemplate;
	
	
	public WeatherForecast getForecastWeather(String location, String day) {
		return restTemplate.getForObject("http://api.weatherapi.com/v1/current.json?key=670a21e77fee4bafa65125550232908&q="
				+location+"&days="
			+day+ "&aqi=no&alerts=no", WeatherForecast.class);
	}

}
