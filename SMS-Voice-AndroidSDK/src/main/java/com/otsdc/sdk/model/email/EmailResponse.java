package com.otsdc.sdk.model.email;

import com.google.gson.annotations.SerializedName;
import com.otsdc.sdk.model.ResponseModel;

import java.util.Date;

/**
 * Copyright (C) 2015 OTS | Digital Communication Platform
 * <p/>
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * <p/>
 * Created by alhareth, June 2015
 */
public class EmailResponse extends ResponseModel<EmailResponse> {

    @SerializedName("EmailID")
    private String emailID;
    @SerializedName("EmailStatus")
    private String emailStatus;
    @SerializedName("Cost")
    private Double cost;
    @SerializedName("Balance")
    private Double balance;
    @SerializedName("Recipient")
    private String recipient;
    @SerializedName("TimeCreated")
    private Date timeCreated;

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getEmailStatus() {
        return emailStatus;
    }

    public void setEmailStatus(String emailStatus) {
        this.emailStatus = emailStatus;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public Date getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(Date timeCreated) {
        this.timeCreated = timeCreated;
    }

    @Override
    public String toString() {
        return "EmailResponse{" + "emailID=" + emailID + ", emailStatus=" + emailStatus + ", cost=" + cost + ", balance=" + balance + ", recipient=" + recipient + ", timeCreated=" + timeCreated + '}';
    }

}