package com.tsk.weatherforecastservice.model;

import java.util.List;


public class Forecast {
	
	
	List<ForecastDay> forecastday;

	public List<ForecastDay> getForecastday() {
		return forecastday;
	}

	public void setForecastday(List<ForecastDay> forecastday) {
		this.forecastday = forecastday;
	}

	public Forecast(List<ForecastDay> forecastday) {
		super();
		this.forecastday = forecastday;
	}

	public Forecast() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
