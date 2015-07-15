package com.otsdc.sdk.model.call;

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
public class TTSCallResponse extends ResponseModel<TTSCallResponse> {

    @SerializedName("CallID")
    private String callID;
    @SerializedName("CallStatus")
    private String callStatus;
    @SerializedName("CallDuration")
    private Integer callDuration;
    @SerializedName("Price")
    private Double price;
    @SerializedName("Balance")
    private Double balance;
    @SerializedName("Recipient")
    private String recipient;
    @SerializedName("DateCreated")
    private Date dateCreated;

    public String getCallID() {
        return callID;
    }

    public void setCallID(String callID) {
        this.callID = callID;
    }

    public String getCallStatus() {
        return callStatus;
    }

    public void setCallStatus(String callStatus) {
        this.callStatus = callStatus;
    }

    public Integer getCallDuration() {
        return callDuration;
    }

    public void setCallDuration(Integer callDuration) {
        this.callDuration = callDuration;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
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

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public String toString() {
        return "TTSCallResponse{" + "callID=" + callID + ", callStatus=" + callStatus + ", callDuration=" + callDuration + ", price=" + price + ", balance=" + balance + ", recipient=" + recipient + ", dateCreated=" + dateCreated + '}';
    }

}
