package com.otsdc.sdk.model.messages;


import com.otsdc.sdk.constant.ParamConstant;
import com.otsdc.sdk.model.ARequest;

/**
 * Copyright (C) 2015 OTS | Digital Communication Platform
 * <p/>
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * <p/>
 * Created by alhareth, June 2015
 */
public class MessageRequest  extends ARequest {

    public MessageRequest(String recipient, String body) {
        setRecipient(recipient);
        setBody(body);
    }

    public MessageRequest(String recipient, String body, String priority) {
        setRecipient(recipient);
        setBody(body);
        setPriority(priority);
    }

    public MessageRequest(String recipient, String body, String priority, String senderID) {
        setRecipient(recipient);
        setBody(body);
        setPriority(priority);
        setSenderID(senderID);
    }

    public String getRecipient() {
        return get(ParamConstant.RECIPIENT);
    }

    public void setRecipient(String recipient) {
        put(ParamConstant.RECIPIENT, recipient);
    }

    public String getBody() {
        return get(ParamConstant.BODY);
    }

    public void setBody(String body) {
        put(ParamConstant.BODY, body);
    }

    public String getSenderID() {
        return get(ParamConstant.SENDERID);
    }

    public void setSenderID(String senderID) {
        put(ParamConstant.SENDERID, senderID);
    }

    public String getPriority() {
        return get(ParamConstant.PRIORITY);
    }

    public void setPriority(String priority) {
        put(ParamConstant.PRIORITY, priority);
    }


}
