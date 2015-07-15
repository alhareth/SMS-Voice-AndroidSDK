package com.otsdc.sdk.model.account;

import com.otsdc.sdk.model.ResponseModel;

import java.util.List;


/**
 * Copyright (C) 2015 OTS | Digital Communication Platform
 * <p/>
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * <p/>
 * Created by alhareth, June 2015
 */
public class SenderList extends ResponseModel<SenderList> {

    private List<SenderID> senderNames;

    public List<SenderID> getSenderNames() {
        return senderNames;
    }

    public void setSenderNames(List<SenderID> senderNames) {
        this.senderNames = senderNames;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("SenderList{");
        builder.append("senderNames=");
        for (SenderID senderID : senderNames) {
            builder.append(senderID);
        }
        builder.append("}");
        return builder.toString();
    }

}