package com.example.fintest.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FinancialModelDataDTO {

  @JsonProperty("symbol")
  private String symbol;

  @JsonProperty("date")
  private String date;

  @JsonProperty("calendarYear")
  private String calendarYear;

  @JsonProperty("period")
  private String period;

  @JsonProperty("currentRatio")
  private double currentRatio;

  @JsonProperty("quickRatio")
  private double quickRatio;

  @JsonProperty("cashRatio")
  private double cashRatio;

  @JsonProperty("daysOfSalesOutstanding")
  private double daysOfSalesOutstanding;

  @JsonProperty("daysOfInventoryOutstanding")
  private double daysOfInventoryOutstanding;

  @JsonProperty("operatingCycle")
  private double operatingCycle;

  @JsonProperty("daysOfPayablesOutstanding")
  private double daysOfPayablesOutstanding;

  @JsonProperty("cashConversionCycle")
  private double cashConversionCycle;

  @JsonProperty("grossProfitMargin")
  private double grossProfitMargin;

  @JsonProperty("operatingProfitMargin")
  private double operatingProfitMargin;

  @JsonProperty("pretaxProfitMargin")
  private double pretaxProfitMargin;

  @JsonProperty("netProfitMargin")
  private double netProfitMargin;

  @JsonProperty("effectiveTaxRate")
  private double effectiveTaxRate;

  @JsonProperty("returnOnAssets")
  private double returnOnAssets;

  @JsonProperty("returnOnEquity")
  private double returnOnEquity;

  @JsonProperty("returnOnCapitalEmployed")
  private double returnOnCapitalEmployed;

  @JsonProperty("netIncomePerEBT")
  private double netIncomePerEBT;

  @JsonProperty("ebtPerEbit")
  private double ebtPerEbit;

  @JsonProperty("ebitPerRevenue")
  private double ebitPerRevenue;

  @JsonProperty("debtRatio")
  private double debtRatio;

  @JsonProperty("debtEquityRatio")
  private double debtEquityRatio;

  @JsonProperty("longTermDebtToCapitalization")
  private double longTermDebtToCapitalization;

  @JsonProperty("totalDebtToCapitalization")
  private double totalDebtToCapitalization;

  @JsonProperty("interestCoverage")
  private double interestCoverage;

  @JsonProperty("cashFlowToDebtRatio")
  private double cashFlowToDebtRatio;

  @JsonProperty("companyEquityMultiplier")
  private double companyEquityMultiplier;

  @JsonProperty("receivablesTurnover")
  private double receivablesTurnover;

  @JsonProperty("payablesTurnover")
  private double payablesTurnover;

  @JsonProperty("inventoryTurnover")
  private double inventoryTurnover;

  @JsonProperty("fixedAssetTurnover")
  private double fixedAssetTurnover;

  @JsonProperty("assetTurnover")
  private double assetTurnover;

  @JsonProperty("operatingCashFlowPerShare")
  private double operatingCashFlowPerShare;

  @JsonProperty("freeCashFlowPerShare")
  private double freeCashFlowPerShare;

  @JsonProperty("cashPerShare")
  private double cashPerShare;

  @JsonProperty("payoutRatio")
  private double payoutRatio;

  @JsonProperty("operatingCashFlowSalesRatio")
  private double operatingCashFlowSalesRatio;

  @JsonProperty("freeCashFlowOperatingCashFlowRatio")
  private double freeCashFlowOperatingCashFlowRatio;

  @JsonProperty("cashFlowCoverageRatios")
  private double cashFlowCoverageRatios;

  @JsonProperty("shortTermCoverageRatios")
  private double shortTermCoverageRatios;

  @JsonProperty("capitalExpenditureCoverageRatio")
  private double capitalExpenditureCoverageRatio;

  @JsonProperty("dividendPaidAndCapexCoverageRatio")
  private double dividendPaidAndCapexCoverageRatio;

  @JsonProperty("dividendPayoutRatio")
  private double dividendPayoutRatio;

  @JsonProperty("priceBookValueRatio")
  private double priceBookValueRatio;

  @JsonProperty("priceToBookRatio")
  private double priceToBookRatio;

  @JsonProperty("priceToSalesRatio")
  private double priceToSalesRatio;

  @JsonProperty("priceEarningsRatio")
  private double priceEarningsRatio;

  @JsonProperty("priceToFreeCashFlowsRatio")
  private double priceToFreeCashFlowsRatio;

  @JsonProperty("priceToOperatingCashFlowsRatio")
  private double priceToOperatingCashFlowsRatio;

  @JsonProperty("priceCashFlowRatio")
  private double priceCashFlowRatio;

  @JsonProperty("priceEarningsToGrowthRatio")
  private double priceEarningsToGrowthRatio;

  @JsonProperty("priceSalesRatio")
  private double priceSalesRatio;

  @JsonProperty("dividendYield")
  private double dividendYield;

  @JsonProperty("enterpriseValueMultiple")
  private double enterpriseValueMultiple;

  @JsonProperty("priceFairValue")
  private double priceFairValue;

  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public String getCalendarYear() {
    return calendarYear;
  }

  public void setCalendarYear(String calendarYear) {
    this.calendarYear = calendarYear;
  }

  public String getPeriod() {
    return period;
  }

  public void setPeriod(String period) {
    this.period = period;
  }

  public double getCurrentRatio() {
    return currentRatio;
  }

  public void setCurrentRatio(double currentRatio) {
    this.currentRatio = currentRatio;
  }

  public double getQuickRatio() {
    return quickRatio;
  }

  public void setQuickRatio(double quickRatio) {
    this.quickRatio = quickRatio;
  }

  public double getCashRatio() {
    return cashRatio;
  }

  public void setCashRatio(double cashRatio) {
    this.cashRatio = cashRatio;
  }

  public double getDaysOfSalesOutstanding() {
    return daysOfSalesOutstanding;
  }

  public void setDaysOfSalesOutstanding(double daysOfSalesOutstanding) {
    this.daysOfSalesOutstanding = daysOfSalesOutstanding;
  }

  public double getDaysOfInventoryOutstanding() {
    return daysOfInventoryOutstanding;
  }

  public void setDaysOfInventoryOutstanding(double daysOfInventoryOutstanding) {
    this.daysOfInventoryOutstanding = daysOfInventoryOutstanding;
  }

  public double getOperatingCycle() {
    return operatingCycle;
  }

  public void setOperatingCycle(double operatingCycle) {
    this.operatingCycle = operatingCycle;
  }

  public double getDaysOfPayablesOutstanding() {
    return daysOfPayablesOutstanding;
  }

  public void setDaysOfPayablesOutstanding(double daysOfPayablesOutstanding) {
    this.daysOfPayablesOutstanding = daysOfPayablesOutstanding;
  }

  public double getCashConversionCycle() {
    return cashConversionCycle;
  }

  public void setCashConversionCycle(double cashConversionCycle) {
    this.cashConversionCycle = cashConversionCycle;
  }

  public double getGrossProfitMargin() {
    return grossProfitMargin;
  }

  public void setGrossProfitMargin(double grossProfitMargin) {
    this.grossProfitMargin = grossProfitMargin;
  }

  public double getOperatingProfitMargin() {
    return operatingProfitMargin;
  }

  public void setOperatingProfitMargin(double operatingProfitMargin) {
    this.operatingProfitMargin = operatingProfitMargin;
  }

  public double getPretaxProfitMargin() {
    return pretaxProfitMargin;
  }

  public void setPretaxProfitMargin(double pretaxProfitMargin) {
    this.pretaxProfitMargin = pretaxProfitMargin;
  }

  public double getNetProfitMargin() {
    return netProfitMargin;
  }

  public void setNetProfitMargin(double netProfitMargin) {
    this.netProfitMargin = netProfitMargin;
  }

  public double getEffectiveTaxRate() {
    return effectiveTaxRate;
  }

  public void setEffectiveTaxRate(double effectiveTaxRate) {
    this.effectiveTaxRate = effectiveTaxRate;
  }

  public double getReturnOnAssets() {
    return returnOnAssets;
  }

  public void setReturnOnAssets(double returnOnAssets) {
    this.returnOnAssets = returnOnAssets;
  }

  public double getReturnOnEquity() {
    return returnOnEquity;
  }

  public void setReturnOnEquity(double returnOnEquity) {
    this.returnOnEquity = returnOnEquity;
  }

  public double getReturnOnCapitalEmployed() {
    return returnOnCapitalEmployed;
  }

  public void setReturnOnCapitalEmployed(double returnOnCapitalEmployed) {
    this.returnOnCapitalEmployed = returnOnCapitalEmployed;
  }

  public double getNetIncomePerEBT() {
    return netIncomePerEBT;
  }

  public void setNetIncomePerEBT(double netIncomePerEBT) {
    this.netIncomePerEBT = netIncomePerEBT;
  }

  public double getEbtPerEbit() {
    return ebtPerEbit;
  }

  public void setEbtPerEbit(double ebtPerEbit) {
    this.ebtPerEbit = ebtPerEbit;
  }

  public double getEbitPerRevenue() {
    return ebitPerRevenue;
  }

  public void setEbitPerRevenue(double ebitPerRevenue) {
    this.ebitPerRevenue = ebitPerRevenue;
  }

  public double getDebtRatio() {
    return debtRatio;
  }

  public void setDebtRatio(double debtRatio) {
    this.debtRatio = debtRatio;
  }

  public double getDebtEquityRatio() {
    return debtEquityRatio;
  }

  public void setDebtEquityRatio(double debtEquityRatio) {
    this.debtEquityRatio = debtEquityRatio;
  }

  public double getLongTermDebtToCapitalization() {
    return longTermDebtToCapitalization;
  }

  public void setLongTermDebtToCapitalization(double longTermDebtToCapitalization) {
    this.longTermDebtToCapitalization = longTermDebtToCapitalization;
  }

  public double getTotalDebtToCapitalization() {
    return totalDebtToCapitalization;
  }

  public void setTotalDebtToCapitalization(double totalDebtToCapitalization) {
    this.totalDebtToCapitalization = totalDebtToCapitalization;
  }

  public double getInterestCoverage() {
    return interestCoverage;
  }

  public void setInterestCoverage(double interestCoverage) {
    this.interestCoverage = interestCoverage;
  }

  public double getCashFlowToDebtRatio() {
    return cashFlowToDebtRatio;
  }

  public void setCashFlowToDebtRatio(double cashFlowToDebtRatio) {
    this.cashFlowToDebtRatio = cashFlowToDebtRatio;
  }

  public double getCompanyEquityMultiplier() {
    return companyEquityMultiplier;
  }

  public void setCompanyEquityMultiplier(double companyEquityMultiplier) {
    this.companyEquityMultiplier = companyEquityMultiplier;
  }

  public double getReceivablesTurnover() {
    return receivablesTurnover;
  }

  public void setReceivablesTurnover(double receivablesTurnover) {
    this.receivablesTurnover = receivablesTurnover;
  }

  public double getPayablesTurnover() {
    return payablesTurnover;
  }

  public void setPayablesTurnover(double payablesTurnover) {
    this.payablesTurnover = payablesTurnover;
  }

  public double getInventoryTurnover() {
    return inventoryTurnover;
  }

  public void setInventoryTurnover(double inventoryTurnover) {
    this.inventoryTurnover = inventoryTurnover;
  }

  public double getFixedAssetTurnover() {
    return fixedAssetTurnover;
  }

  public void setFixedAssetTurnover(double fixedAssetTurnover) {
    this.fixedAssetTurnover = fixedAssetTurnover;
  }

  public double getAssetTurnover() {
    return assetTurnover;
  }

  public void setAssetTurnover(double assetTurnover) {
    this.assetTurnover = assetTurnover;
  }

  public double getOperatingCashFlowPerShare() {
    return operatingCashFlowPerShare;
  }

  public void setOperatingCashFlowPerShare(double operatingCashFlowPerShare) {
    this.operatingCashFlowPerShare = operatingCashFlowPerShare;
  }

  public double getFreeCashFlowPerShare() {
    return freeCashFlowPerShare;
  }

  public void setFreeCashFlowPerShare(double freeCashFlowPerShare) {
    this.freeCashFlowPerShare = freeCashFlowPerShare;
  }

  public double getCashPerShare() {
    return cashPerShare;
  }

  public void setCashPerShare(double cashPerShare) {
    this.cashPerShare = cashPerShare;
  }

  public double getPayoutRatio() {
    return payoutRatio;
  }

  public void setPayoutRatio(double payoutRatio) {
    this.payoutRatio = payoutRatio;
  }

  public double getOperatingCashFlowSalesRatio() {
    return operatingCashFlowSalesRatio;
  }

  public void setOperatingCashFlowSalesRatio(double operatingCashFlowSalesRatio) {
    this.operatingCashFlowSalesRatio = operatingCashFlowSalesRatio;
  }

  public double getFreeCashFlowOperatingCashFlowRatio() {
    return freeCashFlowOperatingCashFlowRatio;
  }

  public void setFreeCashFlowOperatingCashFlowRatio(double freeCashFlowOperatingCashFlowRatio) {
    this.freeCashFlowOperatingCashFlowRatio = freeCashFlowOperatingCashFlowRatio;
  }

  public double getCashFlowCoverageRatios() {
    return cashFlowCoverageRatios;
  }

  public void setCashFlowCoverageRatios(double cashFlowCoverageRatios) {
    this.cashFlowCoverageRatios = cashFlowCoverageRatios;
  }

  public double getShortTermCoverageRatios() {
    return shortTermCoverageRatios;
  }

  public void setShortTermCoverageRatios(double shortTermCoverageRatios) {
    this.shortTermCoverageRatios = shortTermCoverageRatios;
  }

  public double getCapitalExpenditureCoverageRatio() {
    return capitalExpenditureCoverageRatio;
  }

  public void setCapitalExpenditureCoverageRatio(double capitalExpenditureCoverageRatio) {
    this.capitalExpenditureCoverageRatio = capitalExpenditureCoverageRatio;
  }

  public double getDividendPaidAndCapexCoverageRatio() {
    return dividendPaidAndCapexCoverageRatio;
  }

  public void setDividendPaidAndCapexCoverageRatio(double dividendPaidAndCapexCoverageRatio) {
    this.dividendPaidAndCapexCoverageRatio = dividendPaidAndCapexCoverageRatio;
  }

  public double getDividendPayoutRatio() {
    return dividendPayoutRatio;
  }

  public void setDividendPayoutRatio(double dividendPayoutRatio) {
    this.dividendPayoutRatio = dividendPayoutRatio;
  }

  public double getPriceBookValueRatio() {
    return priceBookValueRatio;
  }

  public void setPriceBookValueRatio(double priceBookValueRatio) {
    this.priceBookValueRatio = priceBookValueRatio;
  }

  public double getPriceToBookRatio() {
    return priceToBookRatio;
  }

  public void setPriceToBookRatio(double priceToBookRatio) {
    this.priceToBookRatio = priceToBookRatio;
  }

  public double getPriceToSalesRatio() {
    return priceToSalesRatio;
  }

  public void setPriceToSalesRatio(double priceToSalesRatio) {
    this.priceToSalesRatio = priceToSalesRatio;
  }

  public double getPriceEarningsRatio() {
    return priceEarningsRatio;
  }

  public void setPriceEarningsRatio(double priceEarningsRatio) {
    this.priceEarningsRatio = priceEarningsRatio;
  }

  public double getPriceToFreeCashFlowsRatio() {
    return priceToFreeCashFlowsRatio;
  }

  public void setPriceToFreeCashFlowsRatio(double priceToFreeCashFlowsRatio) {
    this.priceToFreeCashFlowsRatio = priceToFreeCashFlowsRatio;
  }

  public double getPriceToOperatingCashFlowsRatio() {
    return priceToOperatingCashFlowsRatio;
  }

  public void setPriceToOperatingCashFlowsRatio(double priceToOperatingCashFlowsRatio) {
    this.priceToOperatingCashFlowsRatio = priceToOperatingCashFlowsRatio;
  }

  public double getPriceCashFlowRatio() {
    return priceCashFlowRatio;
  }

  public void setPriceCashFlowRatio(double priceCashFlowRatio) {
    this.priceCashFlowRatio = priceCashFlowRatio;
  }

  public double getPriceEarningsToGrowthRatio() {
    return priceEarningsToGrowthRatio;
  }

  public void setPriceEarningsToGrowthRatio(double priceEarningsToGrowthRatio) {
    this.priceEarningsToGrowthRatio = priceEarningsToGrowthRatio;
  }

  public double getPriceSalesRatio() {
    return priceSalesRatio;
  }

  public void setPriceSalesRatio(double priceSalesRatio) {
    this.priceSalesRatio = priceSalesRatio;
  }

  public double getDividendYield() {
    return dividendYield;
  }

  public void setDividendYield(double dividendYield) {
    this.dividendYield = dividendYield;
  }

  public double getEnterpriseValueMultiple() {
    return enterpriseValueMultiple;
  }

  public void setEnterpriseValueMultiple(double enterpriseValueMultiple) {
    this.enterpriseValueMultiple = enterpriseValueMultiple;
  }

  public double getPriceFairValue() {
    return priceFairValue;
  }

  public void setPriceFairValue(double priceFairValue) {
    this.priceFairValue = priceFairValue;
  }

  // Override toString() for debugging purposes (optional)
  @Override
  public String toString() {
    return "CompanyFinancialsDTO{" +
        "symbol='" + symbol + '\'' +
        ", date='" + date + '\'' +
        ", calendarYear='" + calendarYear + '\'' +
        ", period='" + period + '\'' +
        ", currentRatio=" + currentRatio +
        ", quickRatio=" + quickRatio +
        ", cashRatio=" + cashRatio +
        ", daysOfSalesOutstanding=" + daysOfSalesOutstanding +
        ", daysOfInventoryOutstanding=" + daysOfInventoryOutstanding +
        ", operatingCycle=" + operatingCycle +
        ", daysOfPayablesOutstanding=" + daysOfPayablesOutstanding +
        ", cashConversionCycle=" + cashConversionCycle +
        ", grossProfitMargin=" + grossProfitMargin +
        ", operatingProfitMargin=" + operatingProfitMargin +
        ", pretaxProfitMargin=" + pretaxProfitMargin +
        ", netProfitMargin=" + netProfitMargin +
        ", effectiveTaxRate=" + effectiveTaxRate +
        ", returnOnAssets=" + returnOnAssets +
        ", returnOnEquity=" + returnOnEquity +
        ", returnOnCapitalEmployed=" + returnOnCapitalEmployed +
        ", netIncomePerEBT=" + netIncomePerEBT +
        ", ebtPerEbit=" + ebtPerEbit +
        ", ebitPerRevenue=" + ebitPerRevenue +
        ", debtRatio=" + debtRatio +
        ", debtEquityRatio=" + debtEquityRatio +
        ", longTermDebtToCapitalization=" + longTermDebtToCapitalization +
        ", totalDebtToCapitalization=" + totalDebtToCapitalization +
        ", interestCoverage=" + interestCoverage +
        ", cashFlowToDebtRatio=" + cashFlowToDebtRatio +
        ", companyEquityMultiplier=" + companyEquityMultiplier +
        ", receivablesTurnover=" + receivablesTurnover +
        ", payablesTurnover=" + payablesTurnover +
        ", inventoryTurnover=" + inventoryTurnover +
        ", fixedAssetTurnover=" + fixedAssetTurnover +
        ", assetTurnover=" + assetTurnover +
        ", operatingCashFlowPerShare=" + operatingCashFlowPerShare +
        ", freeCashFlowPerShare=" + freeCashFlowPerShare +
        ", cashPerShare=" + cashPerShare +
        ", payoutRatio=" + payoutRatio +
        ", operatingCashFlowSalesRatio=" + operatingCashFlowSalesRatio +
        ", freeCashFlowOperatingCashFlowRatio=" + freeCashFlowOperatingCashFlowRatio +
        ", cashFlowCoverageRatios=" + cashFlowCoverageRatios +
        ", shortTermCoverageRatios=" + shortTermCoverageRatios +
        ", capitalExpenditureCoverageRatio=" + capitalExpenditureCoverageRatio +
        ", dividendPaidAndCapexCoverageRatio=" + dividendPaidAndCapexCoverageRatio +
        ", dividendPayoutRatio=" + dividendPayoutRatio +
        ", priceBookValueRatio=" + priceBookValueRatio +
        ", priceToBookRatio=" + priceToBookRatio +
        ", priceToSalesRatio=" + priceToSalesRatio +
        ", priceEarningsRatio=" + priceEarningsRatio +
        ", priceToFreeCashFlowsRatio=" + priceToFreeCashFlowsRatio +
        ", priceToOperatingCashFlowsRatio=" + priceToOperatingCashFlowsRatio +
        ", priceCashFlowRatio=" + priceCashFlowRatio +
        ", priceEarningsToGrowthRatio=" + priceEarningsToGrowthRatio +
        ", priceSalesRatio=" + priceSalesRatio +
        ", dividendYield=" + dividendYield +
        ", enterpriseValueMultiple=" + enterpriseValueMultiple +
        ", priceFairValue=" + priceFairValue +
        '}';
  }
}

