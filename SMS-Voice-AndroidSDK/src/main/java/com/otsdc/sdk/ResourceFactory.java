package com.otsdc.sdk;

import com.otsdc.sdk.resources.IAccountResource;
import com.otsdc.sdk.resources.IEmailResource;
import com.otsdc.sdk.resources.IMessageResource;
import com.otsdc.sdk.resources.IVerifyResource;
import com.otsdc.sdk.resources.IVoiceResource;
import com.otsdc.sdk.resources.http.AccountResourceImpl;
import com.otsdc.sdk.resources.http.EmailResourceImpl;
import com.otsdc.sdk.resources.http.MessagesResourceImpl;
import com.otsdc.sdk.resources.http.VerifyResourceImpl;
import com.otsdc.sdk.resources.http.VoiceResourceImpl;
import com.otsdc.sdk.resources.url.IOTSUrl;

/**
 * Copyright (C) 2015 OTS | Digital Communication Platform
 * <p/>
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * <p/>
 * Created by alhareth, July 2015
 */
public class ResourceFactory {
    private IOTSUrl otsUrl;

    public ResourceFactory(IOTSUrl otsUrl) {
        this.otsUrl = otsUrl;
    }

    public IAccountResource makeAccountResource(String appSid) {
        return new AccountResourceImpl(appSid, otsUrl.getAccountUrl());
    }

    public IEmailResource makeEmailResource(String appSid) {
        return new EmailResourceImpl(appSid, otsUrl.getEmailUrl());
    }

    public IVoiceResource makeVoiceResource(String appSid) {
        return new VoiceResourceImpl(appSid, otsUrl.getVoiceUrl());
    }

    public IMessageResource makeMessageResource(String appSid) {
        return new MessagesResourceImpl(appSid, otsUrl.getMessageUrl());
    }

    public IVerifyResource makeVerifyResource(String appSid) {
        return new VerifyResourceImpl(appSid, otsUrl.getVerifyUrl());
    }
}
