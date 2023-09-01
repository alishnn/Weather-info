package com.tsk.weatherforecastservice.model;


public class ForecastDay {
	
	String date;
	Day day;
	Astro astro;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Day getDay() {
		return day;
	}
	public void setDay(Day day) {
		this.day = day;
	}
	public Astro getAstro() {
		return astro;
	}
	public void setAstro(Astro astro) {
		this.astro = astro;
	}
	public ForecastDay(String date, Day day, Astro astro) {
		super();
		this.date = date;
		this.day = day;
		this.astro = astro;
	}
	public ForecastDay() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
