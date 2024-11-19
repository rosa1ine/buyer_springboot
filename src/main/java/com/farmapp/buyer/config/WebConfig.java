package com.farmapp.buyer.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // Allows all endpoints
                .allowedOrigins("*") // Allows requests from any domain
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS"); // Allows these HTTP methods
    }
}
