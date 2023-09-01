package com.tsk.weatherforecastservice.model;


public class Astro {
	
	String sunrise;
    String  sunset;
    String moonrise;
     String moonset;
	public String getSunrise() {
		return sunrise;
	}
	public void setSunrise(String sunrise) {
		this.sunrise = sunrise;
	}
	public String getSunset() {
		return sunset;
	}
	public void setSunset(String sunset) {
		this.sunset = sunset;
	}
	public String getMoonrise() {
		return moonrise;
	}
	public void setMoonrise(String moonrise) {
		this.moonrise = moonrise;
	}
	public String getMoonset() {
		return moonset;
	}
	public void setMoonset(String moonset) {
		this.moonset = moonset;
	}
	public Astro(String sunrise, String sunset, String moonrise, String moonset) {
		super();
		this.sunrise = sunrise;
		this.sunset = sunset;
		this.moonrise = moonrise;
		this.moonset = moonset;
	}
	public Astro() {
		super();
		// TODO Auto-generated constructor stub
	}
     
   
}
