package com.xujian.spring.cloud.weather.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * REST 配置类.
 * 
 * @since 1.0.0 2017年10月18日
 * @author <a href="xujianjian.top">xujianjian</a>
 */
@Configuration
public class RestConfiguration {

	@Autowired
	private RestTemplateBuilder builder;

	@Bean
	public RestTemplate restTemplate() {
		return builder.build();
	}

}
