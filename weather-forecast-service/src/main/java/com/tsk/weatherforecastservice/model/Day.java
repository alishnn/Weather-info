package com.tsk.weatherforecastservice.model;

public class Day {
	
	float maxtemp_c;
	float mintemp_c;
	float avgtemp_c;
	float maxwind_mph;
	float maxWind_kph;
	public float getMaxtemp_c() {
		return maxtemp_c;
	}
	public void setMaxtemp_c(float maxtemp_c) {
		this.maxtemp_c = maxtemp_c;
	}
	public float getMintemp_c() {
		return mintemp_c;
	}
	public void setMintemp_c(float mintemp_c) {
		this.mintemp_c = mintemp_c;
	}
	public float getAvgtemp_c() {
		return avgtemp_c;
	}
	public void setAvgtemp_c(float avgtemp_c) {
		this.avgtemp_c = avgtemp_c;
	}
	public float getMaxwind_mph() {
		return maxwind_mph;
	}
	public void setMaxwind_mph(float maxwind_mph) {
		this.maxwind_mph = maxwind_mph;
	}
	public float getMaxWind_kph() {
		return maxWind_kph;
	}
	public void setMaxWind_kph(float maxWind_kph) {
		this.maxWind_kph = maxWind_kph;
	}
	public Day(float maxtemp_c, float mintemp_c, float avgtemp_c, float maxwind_mph, float maxWind_kph) {
		super();
		this.maxtemp_c = maxtemp_c;
		this.mintemp_c = mintemp_c;
		this.avgtemp_c = avgtemp_c;
		this.maxwind_mph = maxwind_mph;
		this.maxWind_kph = maxWind_kph;
	}
	public Day() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
