package com.andylang.restapi;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/v1/students")
                .allowedOrigins("http://localhost:8080")  // Salli pyynnöt omasta alkuperästä
                .allowedMethods("GET", "POST", "PUT", "DELETE");
    }
}
