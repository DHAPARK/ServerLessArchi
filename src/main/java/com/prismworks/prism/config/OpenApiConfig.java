package com.prismworks.prism.config;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public GroupedOpenApi groupedAllApi() {
        String[] packagesToScan = {"com.prismworks.prism.domain"};

        return GroupedOpenApi.builder()
                .group("all")
                .packagesToScan(packagesToScan)
                .build();
    }
}
