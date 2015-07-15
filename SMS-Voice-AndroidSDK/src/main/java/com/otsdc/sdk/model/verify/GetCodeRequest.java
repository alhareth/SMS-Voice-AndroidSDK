package com.otsdc.sdk.model.verify;

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
public class GetCodeRequest extends ARequest {

    public GetCodeRequest(String recipient, String body) {
        setRecipient(recipient);
        setBody(body);
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

    public String getSecurityType() {
        return get(ParamConstant.SECURITY_TYPE);
    }

    public void setSecurityType(String securityType) {
        put(ParamConstant.SECURITY_TYPE, securityType);
    }

    public String getExpiry() {
        return get(ParamConstant.EXPIRY);
    }

    public void setExpiry(String expiry) {
        put(ParamConstant.EXPIRY, expiry);
    }

    public String getSenderID() {
        return get(ParamConstant.SENDERID);
    }

    public void setSenderID(String senderID) {
        put(ParamConstant.SENDERID, senderID);
    }

}
