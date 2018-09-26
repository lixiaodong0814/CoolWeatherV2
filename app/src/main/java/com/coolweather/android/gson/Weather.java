package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Weather {

    public Basic basic;

    public Update update;

    public String status;

    public AQI aqi;

    public Now now;

    @SerializedName("hourly")
    public List<Hourly> hourlyList;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;

}
