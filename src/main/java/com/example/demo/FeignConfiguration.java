package com.example.demo;

import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

/**
 * Created by jugalkishorsahu on Mar, 2018
 */
@Configuration
@EnableFeignClients
@EnableCircuitBreaker
public class FeignConfiguration {
}
