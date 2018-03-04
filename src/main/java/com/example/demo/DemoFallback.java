package com.example.demo;

import org.springframework.stereotype.Component;

/**
 * Created by jugalkishorsahu on Mar, 2018
 */
@Component
public class DemoFallback implements DemoClient {

  @Override
  public String demo() {
    return "fallback";
  }

  @Override
  public String fallback() {
    return "fallback";
  }
}
