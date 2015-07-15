package com.otsdc.sdk.model.email;

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
public class EmailReportResponse extends ResponseModel<EmailReportResponse> {

    @SerializedName("Cost")
    private Double cost;
    @SerializedName("TotalEmails")
    private Integer totalEmails;
    @SerializedName("CurrencyCode")
    private String currencyCode;

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Integer getTotalEmails() {
        return totalEmails;
    }

    public void setTotalEmails(Integer totalEmails) {
        this.totalEmails = totalEmails;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    @Override
    public String toString() {
        return "EmailReportResponse{" + "cost=" + cost + ", totalEmails=" + totalEmails + ", currencyCode=" + currencyCode + '}';
    }

}