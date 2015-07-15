package com.otsdc.sdk.model.account;

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
public class Balance extends ResponseModel<Balance> {

    @SerializedName("Balance")
    private Double balance;
    @SerializedName("CurrencyCode")
    private String currencyCode;
    @SerializedName("SharedBalance")
    private Double sharedBalance;

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public Double getSharedBalance() {
        return sharedBalance;
    }

    public void setSharedBalance(Double sharedBalance) {
        this.sharedBalance = sharedBalance;
    }

    @Override
    public String toString() {
        return "Balance{" + "balance=" + balance + ", currencyCode=" + currencyCode + ", sharedBalance=" + sharedBalance + '}';
    }

}