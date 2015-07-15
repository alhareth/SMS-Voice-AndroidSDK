package com.otsdc.sdk.resources.url.impl;


import com.otsdc.sdk.resources.url.IAccountUrl;
import com.otsdc.sdk.resources.url.IEmailUrl;
import com.otsdc.sdk.resources.url.IMessageUrl;
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
public class DefaultOTSUrl extends AOTSUrl {

    public DefaultOTSUrl(String urlBase) {
        super(urlBase);
    }

    @Override
    IAccountUrl createAccountUrl() {
        return new AccountUrlImpl(getUrlBase());
    }

    @Override
    IMessageUrl createMessageUrl() {
        return new MessageUrlImpl(getUrlBase());
    }

    @Override
    IVoiceUrl createVoiceUrl() {
        return new VoiceUrlImpl(getUrlBase());
    }

    @Override
    IEmailUrl createEmailUrl() {
        return new EmailUrlImpl(getUrlBase());
    }

    @Override
    IVerifyUrl createVerifyUrl() {
        return new VerifyUrl(getUrlBase());
    }

}
