package com.example.fintest.config;

import io.polygon.kotlin.sdk.rest.PolygonRestClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PolygonIOConfig {

  @Value("${polygon.io.api.key}")
  private String apiKey;

  @Bean
  public PolygonRestClient polygonRestClient() {
    return new PolygonRestClient(apiKey);
  }
}
