package com.xujian.spring.cloud.microweatherbasic.service;


import com.xujian.spring.cloud.microweatherbasic.vo.WeatherResponse;

/**
 * 天气数据服务接口.（方便业务的扩展  具体业务具体实现）
 *
 */
public interface WeatherDataService {

	/**
	 * 根据城市ID查询天气数据
	 *
	 * @param cityId the city id
	 * @return data by city id
	 */
	WeatherResponse getDataByCityId(String cityId);

	/**
	 * 根据城市名称查询天气数据
	 *
	 * @param cityName the city name
	 * @return data by city name
	 */
	WeatherResponse getDataByCityName(String cityName);
}
