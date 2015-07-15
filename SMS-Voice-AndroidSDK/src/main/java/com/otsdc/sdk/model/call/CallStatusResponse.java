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
public class CallStatusResponse extends ResponseModel<CallStatusResponse> {

    @SerializedName("callStatus")
    private String callStatus;
    @SerializedName("CallDuration")
    private Integer callDuration;
    @SerializedName("Price")
    private Double price;
    @SerializedName("DateCreated")
    private Date dateCreated;
    @SerializedName("DateStarted")
    private Date dateStarted;
    @SerializedName("DateEnded")
    private Date dateEnded;

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

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateStarted() {
        return dateStarted;
    }

    public void setDateStarted(Date dateStarted) {
        this.dateStarted = dateStarted;
    }

    public Date getDateEnded() {
        return dateEnded;
    }

    public void setDateEnded(Date dateEnded) {
        this.dateEnded = dateEnded;
    }

    @Override
    public String toString() {
        return "CallStatusResponse{" + "callStatus=" + callStatus + ", callDuration=" + callDuration + ", price=" + price + ", dateCreated=" + dateCreated + ", dateStarted=" + dateStarted + ", dateEnded=" + dateEnded + '}';
    }

}