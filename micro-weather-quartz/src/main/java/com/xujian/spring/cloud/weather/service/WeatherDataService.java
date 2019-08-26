package com.xujian.spring.cloud.weather.service;

import com.xujian.spring.cloud.weather.vo.WeatherResponse;

/**
 * 天气数据服务.
 * 
 * @since 1.0.0 2017年10月18日
 * @author <a href="xujianjian.top">xujianjian</a>
 */
public interface WeatherDataService {

	/**
	 * 根据城市ID查询天气数据
	 * 
	 * @param cityId
	 * @return
	 */
	WeatherResponse getDataByCityId(String cityId);

	/**
	 * 根据城市名称查询天气数据
	 * 
	 * @param cityId
	 * @return
	 */
	WeatherResponse getDataByCityName(String cityName);
	
	/**
	 * 根据城市ID同步天气数据
	 * 
	 * @param cityId
	 * @return
	 */
	void syncDataByCityId(String cityId);

}
