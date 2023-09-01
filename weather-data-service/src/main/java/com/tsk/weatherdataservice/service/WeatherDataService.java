package com.tsk.weatherdataservice.service;


import com.tsk.weatherdataservice.model.Weather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherDataService {

    @Autowired
    public RestTemplate restTemplate;

    //@HystrixCommand(fallbackMethod = "getFallBack")
    public Weather getCurrentWeather(String location) {
        return restTemplate.getForObject("http://api.weatherapi.com/v1/current.json?key=670a21e77fee4bafa65125550232908&q=sangareddi&aqi="
                + location + "&aqi=yes", Weather.class);
    }

//    public WeatherData getFallBack(String location) {
//        // Create a fallback Weather object or return appropriate data when the API call fails.
//        // You should handle the fallback scenario according to your application's requirements.
//        return new WeatherData();
//    }
}


