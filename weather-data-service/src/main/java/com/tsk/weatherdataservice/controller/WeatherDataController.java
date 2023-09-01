package com.tsk.weatherdataservice.controller;

import com.tsk.weatherdataservice.model.Weather;
import com.tsk.weatherdataservice.service.WeatherDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherDataController {

    @Autowired
    WeatherDataService weatherDataService;

    @GetMapping("/currentWeather/{location}")
    public Weather currentWeather(@PathVariable("location") String location) {
        System.out.println(location);
        return weatherDataService.getCurrentWeather(location);
    }
}

