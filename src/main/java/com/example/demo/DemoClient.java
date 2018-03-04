package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by jugalkishorsahu on Mar, 2018
 */
@FeignClient(name = "demo", url = "http://localhost:8080/demo", fallback = DemoFallback.class)
public interface DemoClient {

  @GetMapping(value = "/demo")
  String demo();


  @GetMapping(value = "/fallback")
  String fallback();
}
