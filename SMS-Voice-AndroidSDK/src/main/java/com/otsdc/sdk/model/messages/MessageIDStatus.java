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
public class MessageIDStatus extends ResponseModel<MessageIDStatus> {

    @SerializedName("Status")
    private String status;
    @SerializedName("DLR")
    private String dlr;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDlr() {
        return dlr;
    }

    public void setDlr(String dlr) {
        this.dlr = dlr;
    }

    @Override
    public String toString() {
        return "MessageIDStatus{" + "status=" + status + ", dlr=" + dlr + '}';
    }

}