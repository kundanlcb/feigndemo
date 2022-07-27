package com.bootninza.feigndemo.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class Current implements Serializable {

    @JsonProperty("last_updated")
    private String lastUpdated;

    @JsonProperty("temp_c")
    private String tempC;
    @JsonProperty("temp_f")
    private String tempF;
    @JsonProperty("is_day")
    private String isDay;

    @JsonProperty("last_updated")
    public String getLastUpdated() {
        return lastUpdated;
    }

    @JsonProperty("last_updated")
    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @JsonProperty("temp_c")
    public String getTempC() {
        return tempC;
    }

    @JsonProperty("temp_c")
    public void setTempC(String tempC) {
        this.tempC = tempC;
    }

    @JsonProperty("temp_f")
    public String getTempF() {
        return tempF;
    }

    @JsonProperty("temp_f")
    public void setTempF(String tempF) {
        this.tempF = tempF;
    }

    @JsonProperty("is_day")
    public String getIsDay() {
        return isDay;
    }

    @JsonProperty("is_day")
    public void setIsDay(String isDay) {
        this.isDay = isDay;
    }
}
