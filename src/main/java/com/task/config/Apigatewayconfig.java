package com.task.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Apigatewayconfig {
	@Bean
	public RouteLocator gatewayRout(RouteLocatorBuilder builder) {
		return builder.routes()
			    .route("Customer_service",p -> p.path("/api/customer/**")
                        .uri("http://localhost:9093"))
                .route("Cart_service",p -> p.path("/api/cart/**")
                        .uri("http://localhost:9091"))
                .route("Catalog_service",p -> p.path("/api/products/**")
                        .uri("http://localhost:9092"))
                .route("Inventory_service-1",p -> p.path("/api/inventory/**")
                        .uri("http://localhost:9094"))
                .route("Order_service",p -> p.path("/api/orders/**")
                        .uri("http://localhost:9095"))
                .build();
		
	}

}
