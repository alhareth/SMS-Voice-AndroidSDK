package com.otsdc.sdk.model.call;

import com.otsdc.sdk.constant.CallLangConstant;
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
public class TTSCallRequest extends ARequest implements CallLangConstant {

    public TTSCallRequest(String recipient, String content, String language) {
        setRecipient(recipient);
        setContent(content);
        setLanguage(language);
    }
    /**
     * Default Lang English
     * @param recipient
     * @param content
     */
    public TTSCallRequest(String recipient, String content) {
        setRecipient(recipient);
        setContent(content);
        setLanguage(LANG_ENGLISH);
    }

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

    public String getLanguage() {
        return get(ParamConstant.LANGUAGE);
    }

    public void setLanguage(String language) {
        put(ParamConstant.LANGUAGE, language);
    }

}