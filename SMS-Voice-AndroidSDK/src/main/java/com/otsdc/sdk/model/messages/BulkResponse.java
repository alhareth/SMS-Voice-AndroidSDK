package com.otsdc.sdk.model.messages;

import com.google.gson.annotations.SerializedName;
import com.otsdc.sdk.model.ResponseModel;

import java.util.Date;
import java.util.List;


/**
 * Copyright (C) 2015 OTS | Digital Communication Platform
 * <p/>
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * <p/>
 * Created by alhareth, June 2015
 */
public class BulkResponse extends ResponseModel<BulkResponse> {

    @SerializedName("Messages")
    private List<BulkMessageStatus> messages;
    @SerializedName("NumberOfUnits")
    private Integer numberOfUnits;
    @SerializedName("Cost")
    private Double cost;
    @SerializedName("Balance")
    private Double balance;
    @SerializedName("TimeCreated")
    private Date timeCreated;
    @SerializedName("CurrencyCode")
    private String currencyCode;

    public List<BulkMessageStatus> getMessages() {
        return messages;
    }

    public void setMessages(List<BulkMessageStatus> messages) {
        this.messages = messages;
    }

    public Integer getNumberOfUnits() {
        return numberOfUnits;
    }

    public void setNumberOfUnits(Integer numberOfUnits) {
        this.numberOfUnits = numberOfUnits;
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

    public Date getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(Date timeCreated) {
        this.timeCreated = timeCreated;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    @Override
    public String toString() {
        return "BulkResponse{" + "messages=" + messages + ", numberOfUnits=" + numberOfUnits + ", cost=" + cost + ", balance=" + balance + ", timeCreated=" + timeCreated + ", currencyCode=" + currencyCode + '}';
    }

    public class BulkMessageStatus {

        @SerializedName("MessageID")
        private String messageID;
        @SerializedName("Recipient")
        private String recipient;
        @SerializedName("Status")
        private String status;

        public String getMessageID() {
            return messageID;
        }

        public void setMessageID(String messageID) {
            this.messageID = messageID;
        }

        public String getRecipient() {
            return recipient;
        }

        public void setRecipient(String recipient) {
            this.recipient = recipient;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        @Override
        public String toString() {
            return "BulkMessageStatus{" + "messageID=" + messageID + ", recipient=" + recipient + ", status=" + status + '}';
        }

    }
}