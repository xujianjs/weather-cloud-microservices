package com.xujian.spring.cloud.microweatherbasic.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * REST 配置类.
 */
@Configuration
public class RestConfiguration {

    /**
     * Builder that can be used to configure and create a {@link RestTemplate}. Provides
     * convenience methods to register {@link #messageConverters(HttpMessageConverter...)
     * converters}, {@link #errorHandler(ResponseErrorHandler) error handlers} and
     * {@link #uriTemplateHandler(UriTemplateHandler) UriTemplateHandlers}.
     * By default the built {@link RestTemplate} will attempt to use the most suitable
     * {@link ClientHttpRequestFactory}, call {@link #detectRequestFactory(boolean)
     * *detectRequestFactory(false)} if you prefer to keep the default. In a typical
     * auto-configured Spring Boot application this builder is available as a bean and can be
     * injected whenever a {@link RestTemplate} is needed.
     */
    @Autowired
    private RestTemplateBuilder builder;

    /**
     * Rest template rest template.
     *
     * @return the rest template
     */
    @Bean
    public RestTemplate restTemplate() {
        return builder.build();
    }

}
