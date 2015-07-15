package com.otsdc.sdk.model.messages;

import com.google.gson.annotations.SerializedName;
import com.otsdc.sdk.model.ResponseModel;

/**
 * Copyright (C) 2015 OTS | Digital Communication Platform
 * <p/>
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * <p/>
 * Created by alhareth, June 2015
 */
public class MessagesReportResponse extends ResponseModel<MessagesReportResponse> {

    @SerializedName("Cost")
    private Double cost;
    @SerializedName("TotalTextMessages")
    private Integer totalTextMessages;
    @SerializedName("NumberOfUnits")
    private Integer numberOfUnits;
    @SerializedName("CurrencyCode")
    private String currencyCode;

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Integer getTotalTextMessages() {
        return totalTextMessages;
    }

    public void setTotalTextMessages(Integer totalTextMessages) {
        this.totalTextMessages = totalTextMessages;
    }

    public Integer getNumberOfUnits() {
        return numberOfUnits;
    }

    public void setNumberOfUnits(Integer numberOfUnits) {
        this.numberOfUnits = numberOfUnits;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    @Override
    public String toString() {
        return "MessagesReportResponse{" + "cost=" + cost + ", totalTextMessages=" + totalTextMessages + ", numberOfUnits=" + numberOfUnits + ", currencyCode=" + currencyCode + '}';
    }

}
