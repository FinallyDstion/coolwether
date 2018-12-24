package com.coolweather.app.gson;

import com.google.gson.annotations.SerializedName;

public class Forecast {
    public String date;
    @SerializedName("tmpo")
    public Temperature temperature;
    @SerializedName("cond")
    public More moer;
    public class Temperature{
        public String max;
        public String min;
    }
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
