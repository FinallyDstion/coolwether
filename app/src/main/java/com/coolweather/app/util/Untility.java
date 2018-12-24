package com.coolweather.app.util;

import android.text.TextUtils;

import com.coolweather.app.db.City;
import com.coolweather.app.db.County;
import com.coolweather.app.db.Province;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Untility {
    public static boolean handleProvinceResponse(String response) {
        if(!TextUtils.isEmpty(response ) ){
            try{
                JSONArray allProvinces = new JSONArray(response);
                for (int i = 0;i<allProvinces.length();i++){
                    JSONObject provinceObject = allProvinces .getJSONObject(i);
                    Province province =new Province();
                    province.setProvinceName(provinceObject.getString("name"));
                    province.setProvinceCode(provinceObject.getInt("id"));
                    province.save();
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
    public static boolean handleCityResponse(String response, int provinceId) {
        if(!TextUtils.isEmpty(response ) ){
            try{
                JSONArray allCities = new JSONArray(response);
                for (int i = 0;i<allCities.length();i++){
                    JSONObject provinceObject = allCities .getJSONObject(i);
                    City city=new City();
                    city.setCityName(provinceObject.getString("name"));
                    city.setCityCode(provinceObject.getInt("id"));
                    city.setProvinceID(provinceId);
                    city.save();
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
    public static boolean handleCountyResponse(String response, int cityId) {
        if (!TextUtils .isEmpty(response ) ) {
            try{
                JSONArray allCounties = new JSONArray(response );
                for (int i = 0;i<allCounties.length();i++){
                    JSONObject countObjet = allCounties.getJSONObject(i);
                    County county = new County();
                    county.setConutyName(countObjet.getString("name") );
                    county.getWeatherId(countObjet.getString("weather_id") );
                    county.setCityId(cityId );
                    county.save();
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}
