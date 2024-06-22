package com.example.fintest.service;

import com.crazzyghost.alphavantage.AlphaVantage;
import com.crazzyghost.alphavantage.Config;
import com.crazzyghost.alphavantage.fundamentaldata.response.CompanyOverview;
import com.crazzyghost.alphavantage.fundamentaldata.response.CompanyOverviewResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

@Service
public class GetAlphaVantageDataService {

  private final Logger LOGGER = LoggerFactory.getLogger(GetAlphaVantageDataService.class);

  public CompanyOverviewResponse getFundanentalData(String symbol){
        return AlphaVantage.api().fundamentalData().companyOverview().forSymbol("symbol").fetchSync();
  }

  public CompanyOverview getFundanentalDataAsync(String symbol){
    CompletableFuture<CompanyOverview> future = new CompletableFuture<>();

    AlphaVantage.api().fundamentalData().companyOverview().forSymbol(symbol).onSuccess(response ->
    {
      CompanyOverview companyOverview = ((CompanyOverviewResponse) response).getOverview();
      future.complete(companyOverview);
    }).onFailure(respnse -> {
      LOGGER.warn("Failure to get data");
    }).fetch();

    try {
      return future.get();
    } catch (InterruptedException | ExecutionException e) {
      LOGGER.error("Failure to return data");
      return new CompanyOverview();
    }
  }

  public CompanyOverview getFundanentalDataAsync(String symbol, String key){
    CompletableFuture<CompanyOverview> future = new CompletableFuture<>();
    AlphaVantage.api().init(initApi(key));
    AlphaVantage.api().fundamentalData().companyOverview().forSymbol(symbol).onSuccess(response ->
    {
      CompanyOverview companyOverview = ((CompanyOverviewResponse) response).getOverview();
      future.complete(companyOverview);
    }).onFailure(respnse -> {
      LOGGER.warn("Failure to get data");
    }).fetch();

    try {
      return future.get();
    } catch (InterruptedException | ExecutionException e) {
      LOGGER.error("Failure to return data");
      return new CompanyOverview();
    }
  }

  private Config initApi(String key) {
    return Config.builder()
        .key(key)
        .timeOut(10)
        .build();
  }

}
