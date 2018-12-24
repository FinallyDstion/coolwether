package com.coolweather.app.db;

public class County {
    private int id;
    private String conutyName;
    private String weatherId;
    private int cityId;
    public int getId(){
        return id;
    }
    public void setId(int id) {
        this.id=id;
    }
    public  String getConutyName (){
        return conutyName;
    }
    public void setConutyName (String conutyName ){
        this.conutyName =conutyName;
    }
    public String getWeatherId (){
        return weatherId;
    }
    private void setWeatherId (String weatherId ){
        this.weatherId  =weatherId ;
    }
    public int getCityId (){
        return cityId ;
    }
    public void setCityId (int cityId ){
        this.cityId = cityId ;
    }

}
