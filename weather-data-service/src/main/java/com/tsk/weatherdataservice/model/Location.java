package com.tsk.weatherdataservice.model;




public class Location {

    String name;
    String region;
    String country;
    float lat;
    float lon;
    String tz_id;
    long localtime_epoch;

    public Location(String name, String region, String country, float lat, float lon, String tz_id, long localtime_epoch, String localtime) {
        this.name = name;
        this.region = region;
        this.country = country;
        this.lat = lat;
        this.lon = lon;
        this.tz_id = tz_id;
        this.localtime_epoch = localtime_epoch;
        this.localtime = localtime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public float getLat() {
        return lat;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public float getLon() {
        return lon;
    }

    public void setLon(float lon) {
        this.lon = lon;
    }

    public String getTz_id() {
        return tz_id;
    }

    public void setTz_id(String tz_id) {
        this.tz_id = tz_id;
    }

    public long getLocaltime_epoch() {
        return localtime_epoch;
    }

    public void setLocaltime_epoch(long localtime_epoch) {
        this.localtime_epoch = localtime_epoch;
    }

    public String getLocaltime() {
        return localtime;
    }

    public void setLocaltime(String localtime) {
        this.localtime = localtime;
    }

    String localtime;
}
