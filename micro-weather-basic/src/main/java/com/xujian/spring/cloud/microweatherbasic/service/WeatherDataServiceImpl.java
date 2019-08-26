/**
 * 
 */
package com.xujian.spring.cloud.microweatherbasic.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.xujian.spring.cloud.microweatherbasic.vo.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

/**
 * 天气数据服务.
 * 
 * @since 1.0.0 2017年10月18日
 * @author <a href="xujianjian.top">Way Lau</a>
 */
@Service
public class WeatherDataServiceImpl implements WeatherDataService {

	/**
	 * restTemplate是spring用来简化http连接的 当然也可以用第三方的 Apache HttpComponents, Netty, and OkHttp
	 *
	 * 这里的组件通过配置的方式注入容器  需要在应用启动的时候利用Configuration注解 中配置一个RestTemplate组件
	 *
 	 */
	@Autowired
	private RestTemplate restTemplate;

	private final String WEATHER_API = "http://wthrcdn.etouch.cn/weather_mini";

	@Override
	public WeatherResponse getDataByCityId(String cityId) {
		String uri = WEATHER_API + "?citykey=" + cityId;
		return this.doGetWeatherData(uri);
	}

	@Override
	public WeatherResponse getDataByCityName(String cityName) {
		String uri = WEATHER_API + "?city=" + cityName;
		return this.doGetWeatherData(uri);
	}

	private WeatherResponse doGetWeatherData(String uri) {
		ResponseEntity<String> response = restTemplate.getForEntity(uri, String.class);
		String strBody = null;

		if (response.getStatusCodeValue() == 200) {
			strBody = response.getBody();
		}

		ObjectMapper mapper = new ObjectMapper();
		WeatherResponse weather = null;

		try {
			//通过json进行反序列化  使其成为WeatherResponse对象（因此很自然想到WeatherResponse需要实现序列化接口Serializable）
			weather = mapper.readValue(strBody, WeatherResponse.class);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return weather;
	}

}
