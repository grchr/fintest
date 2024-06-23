package com.example.fintest.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class VantageCompanyDataDTO {

  @JsonProperty("Symbol2")
  private String symbol2;

  @JsonProperty("AssetType")
  private String assetType;

  @JsonProperty("Name")
  private String name;

  @JsonProperty("Description")
  private String description;

  @JsonProperty("CIK")
  private String cik;

  @JsonProperty("Exchange")
  private String exchange;

  @JsonProperty("Currency")
  private String currency;

  @JsonProperty("Country")
  private String country;

  @JsonProperty("Sector")
  private String sector;

  @JsonProperty("Industry")
  private String industry;

  @JsonProperty("Address")
  private String address;

  @JsonProperty("FiscalYearEnd")
  private String fiscalYearEnd;

  @JsonProperty("LatestQuarter")
  private String latestQuarter;

  @JsonProperty("MarketCapitalization")
  private String marketCapitalization;

  @JsonProperty("EBITDA")
  private String ebitda;

  @JsonProperty("PERatio")
  private String peRatio;

  @JsonProperty("PEGRatio")
  private String pegRatio;

  @JsonProperty("BookValue")
  private String bookValue;

  @JsonProperty("DividendPerShare")
  private String dividendPerShare;

  @JsonProperty("DividendYield")
  private String dividendYield;

  @JsonProperty("EPS")
  private String eps;

  @JsonProperty("RevenuePerShareTTM")
  private String revenuePerShareTTM;

  @JsonProperty("ProfitMargin")
  private String profitMargin;

  @JsonProperty("OperatingMarginTTM")
  private String operatingMarginTTM;

  @JsonProperty("ReturnOnAssetsTTM")
  private String returnOnAssetsTTM;

  @JsonProperty("ReturnOnEquityTTM")
  private String returnOnEquityTTM;

  @JsonProperty("RevenueTTM")
  private String revenueTTM;

  @JsonProperty("GrossProfitTTM")
  private String grossProfitTTM;

  @JsonProperty("DilutedEPSTTM")
  private String dilutedEPSTTM;

  @JsonProperty("QuarterlyEarningsGrowthYOY")
  private String quarterlyEarningsGrowthYOY;

  @JsonProperty("QuarterlyRevenueGrowthYOY")
  private String quarterlyRevenueGrowthYOY;

  @JsonProperty("AnalystTargetPrice")
  private String analystTargetPrice;

  @JsonProperty("AnalystRatingStrongBuy")
  private String analystRatingStrongBuy;

  @JsonProperty("AnalystRatingBuy")
  private String analystRatingBuy;

  @JsonProperty("AnalystRatingHold")
  private String analystRatingHold;

  @JsonProperty("AnalystRatingSell")
  private String analystRatingSell;

  @JsonProperty("AnalystRatingStrongSell")
  private String analystRatingStrongSell;

  @JsonProperty("TrailingPE")
  private String trailingPE;

  @JsonProperty("ForwardPE")
  private String forwardPE;

  @JsonProperty("PriceToSalesRatioTTM")
  private String priceToSalesRatioTTM;

  @JsonProperty("PriceToBookRatio")
  private String priceToBookRatio;

  @JsonProperty("EVToRevenue")
  private String evToRevenue;

  @JsonProperty("EVToEBITDA")
  private String evToEBITDA;

  @JsonProperty("Beta")
  private String beta;

  @JsonProperty("52WeekHigh")
  private String week52High;

  @JsonProperty("52WeekLow")
  private String week52Low;

  @JsonProperty("50DayMovingAverage")
  private String day50MovingAverage;

  @JsonProperty("200DayMovingAverage")
  private String day200MovingAverage;

  @JsonProperty("SharesOutstanding")
  private String sharesOutstanding;

  @JsonProperty("DividendDate")
  private String dividendDate;

  @JsonProperty("ExDividendDate")
  private String exDividendDate;

  // Getters and Setters

  // Add getters and setters for all fields

  public String getSymbol2() {
    return symbol2;
  }

  public void setSymbol2(String symbol2) {
    this.symbol2 = symbol2;
  }

  public String getAssetType() {
    return assetType;
  }

  public void setAssetType(String assetType) {
    this.assetType = assetType;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getCik() {
    return cik;
  }

  public void setCik(String cik) {
    this.cik = cik;
  }

  public String getExchange() {
    return exchange;
  }

  public void setExchange(String exchange) {
    this.exchange = exchange;
  }

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getSector() {
    return sector;
  }

  public void setSector(String sector) {
    this.sector = sector;
  }

  public String getIndustry() {
    return industry;
  }

  public void setIndustry(String industry) {
    this.industry = industry;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getFiscalYearEnd() {
    return fiscalYearEnd;
  }

  public void setFiscalYearEnd(String fiscalYearEnd) {
    this.fiscalYearEnd = fiscalYearEnd;
  }

  public String getLatestQuarter() {
    return latestQuarter;
  }

  public void setLatestQuarter(String latestQuarter) {
    this.latestQuarter = latestQuarter;
  }

  public String getMarketCapitalization() {
    return marketCapitalization;
  }

  public void setMarketCapitalization(String marketCapitalization) {
    this.marketCapitalization = marketCapitalization;
  }

  public String getEbitda() {
    return ebitda;
  }

  public void setEbitda(String ebitda) {
    this.ebitda = ebitda;
  }

  public String getPeRatio() {
    return peRatio;
  }

  public void setPeRatio(String peRatio) {
    this.peRatio = peRatio;
  }

  public String getPegRatio() {
    return pegRatio;
  }

  public void setPegRatio(String pegRatio) {
    this.pegRatio = pegRatio;
  }

  public String getBookValue() {
    return bookValue;
  }

  public void setBookValue(String bookValue) {
    this.bookValue = bookValue;
  }

  public String getDividendPerShare() {
    return dividendPerShare;
  }

  public void setDividendPerShare(String dividendPerShare) {
    this.dividendPerShare = dividendPerShare;
  }

  public String getDividendYield() {
    return dividendYield;
  }

  public void setDividendYield(String dividendYield) {
    this.dividendYield = dividendYield;
  }

  public String getEps() {
    return eps;
  }

  public void setEps(String eps) {
    this.eps = eps;
  }

  public String getRevenuePerShareTTM() {
    return revenuePerShareTTM;
  }

  public void setRevenuePerShareTTM(String revenuePerShareTTM) {
    this.revenuePerShareTTM = revenuePerShareTTM;
  }

  public String getProfitMargin() {
    return profitMargin;
  }

  public void setProfitMargin(String profitMargin) {
    this.profitMargin = profitMargin;
  }

  public String getOperatingMarginTTM() {
    return operatingMarginTTM;
  }

  public void setOperatingMarginTTM(String operatingMarginTTM) {
    this.operatingMarginTTM = operatingMarginTTM;
  }

  public String getReturnOnAssetsTTM() {
    return returnOnAssetsTTM;
  }

  public void setReturnOnAssetsTTM(String returnOnAssetsTTM) {
    this.returnOnAssetsTTM = returnOnAssetsTTM;
  }

  public String getReturnOnEquityTTM() {
    return returnOnEquityTTM;
  }

  public void setReturnOnEquityTTM(String returnOnEquityTTM) {
    this.returnOnEquityTTM = returnOnEquityTTM;
  }

  public String getRevenueTTM() {
    return revenueTTM;
  }

  public void setRevenueTTM(String revenueTTM) {
    this.revenueTTM = revenueTTM;
  }

  public String getGrossProfitTTM() {
    return grossProfitTTM;
  }

  public void setGrossProfitTTM(String grossProfitTTM) {
    this.grossProfitTTM = grossProfitTTM;
  }

  public String getDilutedEPSTTM() {
    return dilutedEPSTTM;
  }

  public void setDilutedEPSTTM(String dilutedEPSTTM) {
    this.dilutedEPSTTM = dilutedEPSTTM;
  }

  public String getQuarterlyEarningsGrowthYOY() {
    return quarterlyEarningsGrowthYOY;
  }

  public void setQuarterlyEarningsGrowthYOY(String quarterlyEarningsGrowthYOY) {
    this.quarterlyEarningsGrowthYOY = quarterlyEarningsGrowthYOY;
  }

  public String getQuarterlyRevenueGrowthYOY() {
    return quarterlyRevenueGrowthYOY;
  }

  public void setQuarterlyRevenueGrowthYOY(String quarterlyRevenueGrowthYOY) {
    this.quarterlyRevenueGrowthYOY = quarterlyRevenueGrowthYOY;
  }

  public String getAnalystTargetPrice() {
    return analystTargetPrice;
  }

  public void setAnalystTargetPrice(String analystTargetPrice) {
    this.analystTargetPrice = analystTargetPrice;
  }

  public String getAnalystRatingStrongBuy() {
    return analystRatingStrongBuy;
  }

  public void setAnalystRatingStrongBuy(String analystRatingStrongBuy) {
    this.analystRatingStrongBuy = analystRatingStrongBuy;
  }

  public String getAnalystRatingBuy() {
    return analystRatingBuy;
  }

  public void setAnalystRatingBuy(String analystRatingBuy) {
    this.analystRatingBuy = analystRatingBuy;
  }

  public String getAnalystRatingHold() {
    return analystRatingHold;
  }

  public void setAnalystRatingHold(String analystRatingHold) {
    this.analystRatingHold = analystRatingHold;
  }

  public String getAnalystRatingSell() {
    return analystRatingSell;
  }

  public void setAnalystRatingSell(String analystRatingSell) {
    this.analystRatingSell = analystRatingSell;
  }

  public String getAnalystRatingStrongSell() {
    return analystRatingStrongSell;
  }

  public void setAnalystRatingStrongSell(String analystRatingStrongSell) {
    this.analystRatingStrongSell = analystRatingStrongSell;
  }

  public String getTrailingPE() {
    return trailingPE;
  }

  public void setTrailingPE(String trailingPE) {
    this.trailingPE = trailingPE;
  }

  public String getForwardPE() {
    return forwardPE;
  }

  public void setForwardPE(String forwardPE) {
    this.forwardPE = forwardPE;
  }

  public String getPriceToSalesRatioTTM() {
    return priceToSalesRatioTTM;
  }

  public void setPriceToSalesRatioTTM(String priceToSalesRatioTTM) {
    this.priceToSalesRatioTTM = priceToSalesRatioTTM;
  }

  public String getPriceToBookRatio() {
    return priceToBookRatio;
  }

  public void setPriceToBookRatio(String priceToBookRatio) {
    this.priceToBookRatio = priceToBookRatio;
  }

  public String getEvToRevenue() {
    return evToRevenue;
  }

  public void setEvToRevenue(String evToRevenue) {
    this.evToRevenue = evToRevenue;
  }

  public String getEvToEBITDA() {
    return evToEBITDA;
  }

  public void setEvToEBITDA(String evToEBITDA) {
    this.evToEBITDA = evToEBITDA;
  }

  public String getBeta() {
    return beta;
  }

  public void setBeta(String beta) {
    this.beta = beta;
  }

  public String getWeek52High() {
    return week52High;
  }

  public void setWeek52High(String week52High) {
    this.week52High = week52High;
  }

  public String getWeek52Low() {
    return week52Low;
  }

  public void setWeek52Low(String week52Low) {
    this.week52Low = week52Low;
  }

  public String getDay50MovingAverage() {
    return day50MovingAverage;
  }

  public void setDay50MovingAverage(String day50MovingAverage) {
    this.day50MovingAverage = day50MovingAverage;
  }

  public String getDay200MovingAverage() {
    return day200MovingAverage;
  }

  public void setDay200MovingAverage(String day200MovingAverage) {
    this.day200MovingAverage = day200MovingAverage;
  }

  public String getSharesOutstanding() {
    return sharesOutstanding;
  }

  public void setSharesOutstanding(String sharesOutstanding) {
    this.sharesOutstanding = sharesOutstanding;
  }

  public String getDividendDate() {
    return dividendDate;
  }

  public void setDividendDate(String dividendDate) {
    this.dividendDate = dividendDate;
  }

  public String getExDividendDate() {
    return exDividendDate;
  }

  public void setExDividendDate(String exDividendDate) {
    this.exDividendDate = exDividendDate;
  }
}


