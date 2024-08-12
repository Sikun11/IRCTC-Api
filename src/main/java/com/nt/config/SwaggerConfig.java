package com.nt.config;


import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class SwaggerConfig {

@Bean
public GroupedOpenApi apiDoc() {
	return GroupedOpenApi.builder()
			.group("com.nt.rest")
			.pathsToMatch("/**")
			.packagesToScan("com.nt.rest")
			.build();
}
}
