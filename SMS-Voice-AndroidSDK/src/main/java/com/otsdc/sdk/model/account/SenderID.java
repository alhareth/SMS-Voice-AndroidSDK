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
public class SenderID extends ResponseModel<SenderID> {

    @SerializedName("SenderID")
    private String senderID;
    @SerializedName("IsDefault")
    private Boolean defaultt;
    @SerializedName("Status")
    private String status;
    @SerializedName("DateCreated")
    private String dateCreated;

    public String getSenderID() {
        return senderID;
    }

    public void setSenderID(String senderID) {
        this.senderID = senderID;
    }

    public Boolean isDefaultt() {
        return defaultt;
    }

    public void setDefaultt(Boolean defaultt) {
        this.defaultt = defaultt;
    }

    public void setDefaultt(String defaultt) {
        this.defaultt = "1".equals(defaultt);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public String toString() {
        return "SenderID{" + "senderID=" + senderID + ", defaultt=" + defaultt + ", status=" + status + ", dateCreated=" + dateCreated + '}';
    }

}