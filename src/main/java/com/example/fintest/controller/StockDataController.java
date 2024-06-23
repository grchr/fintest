package com.example.fintest.controller;

import com.crazzyghost.alphavantage.fundamentaldata.response.CompanyOverview;
import com.example.fintest.model.FinancialModelDataDTO;
import com.example.fintest.model.VantageCompanyDataDTO;
import com.example.fintest.service.stocks.GetAlphaVantageDataService;
import com.example.fintest.service.stocks.GetFinancialModelingStockData;
import com.example.fintest.service.stocks.GetYahooDataService;
import com.example.fintest.service.stocks.GetCustomAlphaVantageStockService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import yahoofinance.Stock;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("controller")
@Tag(name = "Simple Stock API", description = "Simple API, demanding fundamental data for stocks")
public class StockDataController {
  private final Logger LOGGER = LoggerFactory.getLogger(StockDataController.class);

  private final GetYahooDataService yahooDataService;
  private final GetAlphaVantageDataService alphaVantageDataService;
  private final GetCustomAlphaVantageStockService customAlphaVantageStockService;
  private final GetFinancialModelingStockData financialModelingStockData;

  public StockDataController(GetYahooDataService yahooDataService, GetAlphaVantageDataService alphaVantageDataService,
                             GetCustomAlphaVantageStockService customAlphaVantageStockService,
                             GetFinancialModelingStockData financialModelingStockData) {
    this.yahooDataService = yahooDataService;
    this.alphaVantageDataService = alphaVantageDataService;
    this.customAlphaVantageStockService = customAlphaVantageStockService;
    this.financialModelingStockData = financialModelingStockData;
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

  @Operation(summary = "Get stock data", description = "Get stock data using the Alpha Vantage API. Mandatory key value")
  @GetMapping("/alpha/{symbol}")
  CompanyOverview stockBySymbolAlpha(@RequestParam() String symbol,@RequestParam() String key) {
    return alphaVantageDataService.getFundanentalDataAsync(symbol, key);
  }

  @Operation(summary = "Get stock data", description = "Get stock data using the Alpha Vantage API. Mandatory key value")
  @GetMapping("/alpha/v2")
  VantageCompanyDataDTO stockBySymbolAlphaV2(@RequestParam() String symbol,@RequestParam() String key) {
    try {
      LOGGER.info("Reading Data");
      return customAlphaVantageStockService.getStockOverviewData(symbol, key).get();
    } catch (InterruptedException | ExecutionException e) {
      LOGGER.error("Failed to return Data");
      return new VantageCompanyDataDTO();
    }
  }

  @Operation(summary = "Get stock data", description = "Get stock data using the financial modeling prep API. Mandatory key value")
  @GetMapping("/findata")
  FinancialModelDataDTO stockBySymbolFinancialDataAPI(@RequestParam() String symbol, @RequestParam() String key) {
    try {
      LOGGER.info("Reading Data");
      return financialModelingStockData.getStockOverviewData(symbol, key).get();
    } catch (InterruptedException | ExecutionException e) {
      LOGGER.error("Failed to return Data");
      return new FinancialModelDataDTO();
    }
  }
}
