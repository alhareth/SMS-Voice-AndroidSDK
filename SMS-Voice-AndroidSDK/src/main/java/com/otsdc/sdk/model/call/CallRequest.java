package com.otsdc.sdk.model.call;


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
public class CallRequest extends ARequest {

    public String getRecipient() {
        return get(ParamConstant.RECIPIENT);
    }

    public void setRecipient(String recipient) {
        put(ParamConstant.RECIPIENT, recipient);
    }

    public String getContent() {
        return get(ParamConstant.CONTENT);
    }

    public void setContent(String content) {
        put(ParamConstant.CONTENT, content);
    }

}