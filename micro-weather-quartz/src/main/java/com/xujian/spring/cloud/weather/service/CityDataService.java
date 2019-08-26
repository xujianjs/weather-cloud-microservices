package com.xujian.spring.cloud.weather.service;

import java.util.List;

import com.xujian.spring.cloud.weather.vo.City;

/**
 * 城市数据服务接口.
 * 
 * @since 1.0.0 2017年10月23日
 * @author <a href="xujianjian.top">xujianjian</a>
 */
public interface CityDataService {

	/**
	 * 获取城市列表.
	 * 
	 * @return
	 * @throws Exception
	 */
	List<City> listCity() throws Exception;
}
