package com.example.fintest.controller;

import com.example.fintest.service.stocks.GetYahooDataService;
import com.example.fintest.service.stocks.YahooFullStockData;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("controller")
@Tag(name = "Simple Stock API", description = "Simple API, demanding fundamental data for stocks")
public class StockDataController {
  private final Logger LOGGER = LoggerFactory.getLogger(StockDataController.class);

  private final GetYahooDataService yahooDataService;

  public StockDataController(GetYahooDataService yahooDataService) {
    this.yahooDataService = yahooDataService;
  }

  @Operation(summary = "Get stock data", description = "Get stock data using the custom made yf-project")
  @GetMapping("/yahoo/2/{symbol}")
  YahooFullStockData stockBySymbolV2(@PathVariable String symbol) throws IOException {
    return yahooDataService.getStock(symbol);
  }
}
