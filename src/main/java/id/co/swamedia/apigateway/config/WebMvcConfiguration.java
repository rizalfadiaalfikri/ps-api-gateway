package id.co.swamedia.apigateway.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class WebMvcConfiguration {
    @Value("${access.allow.origin}")
    private String accessControlAllowOrigin;

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/v1/**")
                        .allowedOrigins(accessControlAllowOrigin)
                        .allowedMethods("POST, GET, OPTIONS, DELETE, PUT")
                        .allowedHeaders("accept, authorization, x-requested-with, content-type");
            }
        };
    }
}
