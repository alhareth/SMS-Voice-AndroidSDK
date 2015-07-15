package com.otsdc.sdk.resources.url.impl;

import com.otsdc.sdk.resources.url.IAccountUrl;
import com.otsdc.sdk.resources.url.IEmailUrl;
import com.otsdc.sdk.resources.url.IMessageUrl;
import com.otsdc.sdk.resources.url.IOTSUrl;
import com.otsdc.sdk.resources.url.IVerifyUrl;
import com.otsdc.sdk.resources.url.IVoiceUrl;
/**
 * Copyright (C) 2015 OTS | Digital Communication Platform
 * <p/>
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * <p/>
 * Created by alhareth, July 2015
 */
public abstract class AOTSUrl implements IOTSUrl {
    private String urlBase;
    private IAccountUrl accountURL;
    private IMessageUrl messageURL;
    private IVoiceUrl voiceURL;
    private IEmailUrl emailURL;
    private IVerifyUrl verifyURL;

    public AOTSUrl(String urlBase) {
        this.urlBase = urlBase;
        accountURL = createAccountUrl();
        messageURL = createMessageUrl();
        voiceURL = createVoiceUrl();
        emailURL = createEmailUrl();
        verifyURL = createVerifyUrl();
    }

    abstract IAccountUrl createAccountUrl();

    abstract IMessageUrl createMessageUrl();

    abstract IVoiceUrl createVoiceUrl();

    abstract IEmailUrl createEmailUrl();

    abstract IVerifyUrl createVerifyUrl();

    public String getUrlBase() {
        return urlBase;
    }

    @Override
    public IAccountUrl getAccountUrl() {
        return accountURL;
    }

    @Override
    public IMessageUrl getMessageUrl() {
        return messageURL;
    }

    @Override
    public IVoiceUrl getVoiceUrl() {
        return voiceURL;
    }

    @Override
    public IEmailUrl getEmailUrl() {
        return emailURL;
    }

    @Override
    public IVerifyUrl getVerifyUrl() {
        return verifyURL;
    }

}
