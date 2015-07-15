package com.otsdc.sdk.model.email;

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
public class EmailRequest extends ARequest {

    public EmailRequest() {
    }

    public EmailRequest(String from, String recipient, String body) {
        setFrom(from);
        setRecipient(recipient);
        setBody(body);
    }

    public EmailRequest(String from, String recipient, String body, String subject) {
        setFrom(from);
        setRecipient(recipient);
        setBody(body);
        setSubject(subject);
    }

    public String getRecipient() {
        return get(ParamConstant.RECIPIENT);
    }

    public void setRecipient(String recipient) {
        put(ParamConstant.RECIPIENT, recipient);
    }

    public String getFrom() {
        return get(ParamConstant.FROM);
    }

    public void setFrom(String from) {
        put(ParamConstant.FROM, from);
    }

    public String getBody() {
        return get(ParamConstant.BODY);
    }

    public void setBody(String body) {
        put(ParamConstant.BODY, body);
    }

    public String getSubject() {
        return get(ParamConstant.SUBJECT);
    }

    public void setSubject(String subject) {
        put(ParamConstant.SUBJECT, subject);
    }

}