package com.example.fintest.service.stocks;

import com.example.fintest.model.FinancialModelDataDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@Service
public class GetFinancialModelingStockData {

  private final RestTemplate restTemplate;
  private final ObjectMapper objectMapper;

  public GetFinancialModelingStockData(RestTemplate restTemplate, ObjectMapper objectMapper) {
    this.restTemplate = restTemplate;
    this.objectMapper = objectMapper;
  }

  public CompletableFuture<FinancialModelDataDTO> getStockOverviewData(String symbol, String apiKey) {
    URI uri = UriComponentsBuilder.fromHttpUrl("https://financialmodelingprep.com/api/v3/ratios/" + symbol)
        .queryParam("period", "annual")
        .queryParam("symbol", symbol)
        .queryParam("limit",1)
        .queryParam("apikey", apiKey)
        .build()
        .toUri();

    return CompletableFuture.supplyAsync(() -> {
      Map[] response = restTemplate.getForObject(uri, Map[].class);
      // Use the mapper to edit the result

      if (response != null) {
        return objectMapper.convertValue(response[0], FinancialModelDataDTO.class);
      } else {
        return new FinancialModelDataDTO();
      }
    });
  }
}
