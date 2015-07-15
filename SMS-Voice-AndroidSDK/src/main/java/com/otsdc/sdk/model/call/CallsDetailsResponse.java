package com.otsdc.sdk.model.call;

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
 * Created by jafar, June 2015
 */
public class CallsDetailsResponse extends ResponseModel<CallsDetailsResponse> {

    @SerializedName("calls")
    private List<CallsDetails> calls;
    @SerializedName("CurrencyCode")
    private String currencyCode;
    @SerializedName("TotalVoiceMessages")
    private Integer totalVoiceMessages;
    @SerializedName("Page")
    private Integer page;

    public List<CallsDetails> getCalls() {
        return calls;
    }

    public void setCalls(List<CallsDetails> calls) {
        this.calls = calls;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public Integer getTotalVoiceMessages() {
        return totalVoiceMessages;
    }

    public void setTotalVoiceMessages(Integer totalVoiceMessages) {
        this.totalVoiceMessages = totalVoiceMessages;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public class CallsDetails {

        @SerializedName("CallID")
        private String callID;
        @SerializedName("AudioURL")
        private String audioURL;
        @SerializedName("RecipientNumber")
        private String recipientNumber;
        @SerializedName("Country")
        private String country;
        @SerializedName("CallStatus")
        private String callStatus;
        @SerializedName("TimeCreated")
        private Date timeCreated;
        @SerializedName("TimeSent")
        private Date timeSent;
        @SerializedName("TimeAnswered")
        private Date timeAnswered;
        @SerializedName("TimeEnded")
        private Date timeEnded;
        @SerializedName("CallDuration")
        private Integer callDuration;
        @SerializedName("Cost")
        private Double cost;

        public String getCallID() {
            return callID;
        }

        public void setCallID(String callID) {
            this.callID = callID;
        }

        public String getAudioURL() {
            return audioURL;
        }

        public void setAudioURL(String audioURL) {
            this.audioURL = audioURL;
        }

        public String getRecipientNumber() {
            return recipientNumber;
        }

        public void setRecipientNumber(String recipientNumber) {
            this.recipientNumber = recipientNumber;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getCallStatus() {
            return callStatus;
        }

        public void setCallStatus(String callStatus) {
            this.callStatus = callStatus;
        }

        public Date getTimeCreated() {
            return timeCreated;
        }

        public void setTimeCreated(Date timeCreated) {
            this.timeCreated = timeCreated;
        }

        public Date getTimeSent() {
            return timeSent;
        }

        public void setTimeSent(Date timeSent) {
            this.timeSent = timeSent;
        }

        public Date getTimeAnswered() {
            return timeAnswered;
        }

        public void setTimeAnswered(Date timeAnswered) {
            this.timeAnswered = timeAnswered;
        }

        public Date getTimeEnded() {
            return timeEnded;
        }

        public void setTimeEnded(Date timeEnded) {
            this.timeEnded = timeEnded;
        }

        public Integer getCallDuration() {
            return callDuration;
        }

        public void setCallDuration(Integer callDuration) {
            this.callDuration = callDuration;
        }

        public Double getCost() {
            return cost;
        }

        public void setCost(Double cost) {
            this.cost = cost;
        }

        @Override
        public String toString() {
            return "CallsDetails{" + "callID=" + callID + ", audioURL=" + audioURL + ", recipientNumber=" + recipientNumber + ", country=" + country + ", callStatus=" + callStatus + ", timeCreated=" + timeCreated + ", timeSent=" + timeSent + ", timeAnswered=" + timeAnswered + ", timeEnded=" + timeEnded + ", callDuration=" + callDuration + ", cost=" + cost + '}';
        }

    }

    @Override
    public String toString() {
        return "CallsDetailsResponse{" + "calls=" + calls + ", currencyCode=" + currencyCode + ", totalVoiceMessages=" + totalVoiceMessages + ", page=" + page + '}';
    }

}