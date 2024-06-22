package com.example.fintest.controller;

import com.crazzyghost.alphavantage.fundamentaldata.response.CompanyOverview;
import com.crazzyghost.alphavantage.fundamentaldata.response.CompanyOverviewResponse;
import com.example.fintest.service.GetAlphaVantageDataService;
import com.example.fintest.service.GetYahooDataService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import yahoofinance.Stock;

import java.io.IOException;

@RestController
@RequestMapping("controller")
@Tag(name = "Simple Stock API", description = "Simple API, demanding fundamental data for stocks")
public class StockDataController {
  private final Logger LOGGER = LoggerFactory.getLogger(StockDataController.class);

  private GetYahooDataService yahooDataService;
  private GetAlphaVantageDataService alphaVantageDataService;

  public StockDataController(GetYahooDataService yahooDataService, GetAlphaVantageDataService alphaVantageDataService) {
    this.yahooDataService = yahooDataService;
    this.alphaVantageDataService = alphaVantageDataService;
  }

  @Deprecated
  @GetMapping("/yahoo/{symbol}")
  ResponseEntity<?> stockBySymbol(@PathVariable String symbol) throws IOException {
    return ResponseEntity.ok().body(yahooDataService.getStock(symbol));
  }

  @Deprecated
  @GetMapping("/yahoo/2/{symbol}")
  Stock stockBySymbolV2(@PathVariable String symbol) throws IOException {
    return yahooDataService.getStock(symbol);
  }

  @Operation(summary = "Get stock data", description = "Get stock data using the Alpha Vantage API. Optional key value")
  @GetMapping("/alpha/{symbol}")
  CompanyOverview stockBySymbolAlpha(@PathVariable String symbol,@RequestParam(required = false) String key) {
    if (StringUtils.isEmpty(key)) {
      return alphaVantageDataService.getFundanentalDataAsync(symbol);
    } else {
      return alphaVantageDataService.getFundanentalDataAsync(symbol, key);
    }
  }
}
