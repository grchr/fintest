package com.example.fintest.config;

import com.crazzyghost.alphavantage.AlphaVantage;
import com.crazzyghost.alphavantage.Config;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AlphaVantageConfig {

  @Value("${alphavantage.api.key}")
  private String apiKey;

  @PostConstruct
  public void init() {
    Config cfg = Config.builder()
        .key(apiKey)
        .timeOut(10)
        .build();

    AlphaVantage.api().init(cfg);
  }
}

