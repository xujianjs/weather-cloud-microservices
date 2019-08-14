package com.xujian.spring.cloud.microweatherbasic.controller;

import com.xujian.spring.cloud.microweatherbasic.service.WeatherDataService;
import com.xujian.spring.cloud.microweatherbasic.vo.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 天气API.
 */
@RestController
@RequestMapping("/weather")
public class WeatherController {

	@Autowired
	private WeatherDataService weatherDataService;

	/**
	 * Gets report by city id.
	 *
	 * @param cityId the city id
	 * @return the report by city id
	 */
	@GetMapping("/cityId/{cityId}")
	public WeatherResponse getReportByCityId(@PathVariable("cityId") String cityId) {
		return weatherDataService.getDataByCityId(cityId);
	}

	/**
	 * Gets report by city name.
	 *
	 * @param cityName the city name
	 * @return the report by city name
	 */
	@GetMapping("/cityName/{cityName}")
	public WeatherResponse getReportByCityName(@PathVariable("cityName") String cityName) {
		return weatherDataService.getDataByCityName(cityName);
	}

}
