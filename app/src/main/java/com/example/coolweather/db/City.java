package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Jacky Fu on 2018/3/28.
 */

public class City extends DataSupport {
    private int id;
    private String CityName;
    private int cityCode;
    private int provinceId;

    public int getId() {
        return id;
    }

    public String getCityName() {
        return CityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCityName(String cityName) {
        CityName = cityName;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
