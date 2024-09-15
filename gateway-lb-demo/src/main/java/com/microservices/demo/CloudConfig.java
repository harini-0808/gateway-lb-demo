package com.microservices.demo;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CloudConfig {
	
	@Bean
	public RouteLocator locator(RouteLocatorBuilder builder) {
		return builder.routes()
				.route("lb-service1", r -> r.path("/service1/**")
				.uri("lb://lb-service1"))
				.build();
	}
	

}
