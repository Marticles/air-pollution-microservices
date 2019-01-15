package com.marticles.microservice.airpollution.forecast.service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author Marticles
 * @description restTemplateConfig
 * @date 2019/1/13
 */
@Configuration
public class restTemplateConfig {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
