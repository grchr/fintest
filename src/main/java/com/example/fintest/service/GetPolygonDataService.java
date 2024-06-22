package com.example.fintest.service;

import io.polygon.kotlin.sdk.rest.PolygonRestApiCallback;
import io.polygon.kotlin.sdk.rest.PolygonRestClient;
import io.polygon.kotlin.sdk.rest.reference.TickerDetailsParameters;
import io.polygon.kotlin.sdk.rest.reference.TickerDetailsResponse;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

@Service
@Deprecated
public class GetPolygonDataService {

  private final PolygonRestClient client;

  public GetPolygonDataService(PolygonRestClient client) {
    this.client = client;
  }

  public void getPolygonData(String symbol) {
    TickerDetailsParameters params = new TickerDetailsParameters();
    // Set parameters as needed

    // Define callback for handling response
    PolygonRestApiCallback<TickerDetailsResponse> callback = new PolygonRestApiCallback<TickerDetailsResponse>() {
      @Override
      public void onError(@NonNull Throwable throwable) {

      }

      @Override
      public void onSuccess(TickerDetailsResponse response) {
        // Handle successful response
        System.out.println("Success: " + response);
      }
    };
    //client.getStocksClient().get
    //client.getReferenceClient().get

    //client.getReferenceClient().getTickerDetailsV3(symbol, new TickerDetailsParameters(), callback);
  }


}
