package com.tsk.weatherforecastservice.model;

public class WeatherForecast {
	
	Location location;
	Forecast forecast;
	
	
	public WeatherForecast() {
		super();
		// TODO Auto-generated constructor stub
	}
	public WeatherForecast(Location location, Forecast forecast) {
		super();
		this.location = location;
		this.forecast = forecast;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public Forecast getForecast() {
		return forecast;
	}
	public void setForecast(Forecast forecast) {
		this.forecast = forecast;
	}
	
	

}
