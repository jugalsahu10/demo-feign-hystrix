package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jugalkishorsahu on Mar, 2018
 */
@RestController
public class DemoController {

  @Autowired
  private DemoClient demoClient;

  @GetMapping("/demo")
  public String demo() {
    return "demo";
  }

  @GetMapping("/demo/feign")
  public String demoFeign() {
    return demoClient.demo();
  }


  @GetMapping("/demo/fallback")
  public String demoFallback() {
    return demoClient.fallback();
  }
}
