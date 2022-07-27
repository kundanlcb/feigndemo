package com.bootninza.feigndemo.component;

import com.bootninza.feigndemo.response.Weather;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(name = "weather", url ="https://api.weatherapi.com")
public interface ApiClient {

    @GetMapping("/v1/current.json")
    Weather getCurrentWeather(@RequestParam String key,@RequestParam String q,@RequestParam String aqi);

}
