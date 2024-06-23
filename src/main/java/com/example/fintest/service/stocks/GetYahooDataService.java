package com.example.fintest.service.stocks;

import org.springframework.stereotype.Service;
import yahoofinance.Stock;
import yahoofinance.YahooFinance;

import java.io.IOException;
import java.util.Map;

@Service
public class GetYahooDataService {

  public Stock getStock(String symbol) throws IOException {
    return YahooFinance.get(symbol);
  }

  public Map<String,Stock> getStocks(String[] symbols) throws IOException {
    return YahooFinance.get(symbols);
  }
}
