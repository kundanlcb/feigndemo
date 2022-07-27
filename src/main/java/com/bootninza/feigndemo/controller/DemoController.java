package com.bootninza.feigndemo.controller;

import com.bootninza.feigndemo.component.ApiClient;
import com.bootninza.feigndemo.response.Weather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Value("${open.weather.apiKey}")
    String apikey;

    @Autowired
    ApiClient apiClient;

    @GetMapping("weather")
    Weather getWeather(@RequestParam String location) {
        return apiClient.getCurrentWeather(apikey, location, "no");
    }

}
