package com.android.cocoweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Administrator on 2017/1/20.
 */

public class Weather {

    public String status;       //地点
    public  Basic basic;        //基本
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;//建议

    @SerializedName("daily_forecast")//每日预报
    public List<Forecast> forecastList;
}
