package com.android.cocoweather.gson;

/**
 * Created by Administrator on 2017/1/20.
 */

public class AQI {
    public AQIcity city;

    public class AQIcity {
        public String aqi;
        public String pm25;
    }
}
