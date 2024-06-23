package com.example.fintest.service.stocks;

import com.example.fintest.model.VantageCompanyDataDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

/* This service uses a custom implementation of the Alpha vantage API.
*
 */
@Service
public class GetCustomAlphaVantageStockService {

  private final RestTemplate restTemplate;
  private final ObjectMapper objectMapper;

  public GetCustomAlphaVantageStockService(RestTemplate restTemplate, ObjectMapper objectMapper) {
    this.restTemplate = restTemplate;
    this.objectMapper = objectMapper;
  }

  public CompletableFuture<VantageCompanyDataDTO> getStockOverviewData(String symbol, String apiKey) {
    String url = "https://www.alphavantage.co/query";
    URI uri = UriComponentsBuilder.fromHttpUrl(url)
        .queryParam("function", "OVERVIEW")
        .queryParam("symbol", symbol)
        .queryParam("apikey", apiKey)
        .build()
        .toUri();

    return CompletableFuture.supplyAsync(() -> {
      Map<String, Object> response = restTemplate.getForObject(uri, Map.class);
      // Use the mapper to edit the result

      return objectMapper.convertValue(response, VantageCompanyDataDTO.class);
    });
  }
}
