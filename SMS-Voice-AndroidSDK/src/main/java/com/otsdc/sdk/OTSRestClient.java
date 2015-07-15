package com.otsdc.sdk;

import com.otsdc.sdk.resources.IAccountResource;
import com.otsdc.sdk.resources.IEmailResource;
import com.otsdc.sdk.resources.IMessageResource;
import com.otsdc.sdk.resources.IVerifyResource;
import com.otsdc.sdk.resources.IVoiceResource;
import com.otsdc.sdk.resources.url.IOTSUrl;
import com.otsdc.sdk.resources.url.impl.AOTSUrl;
import com.otsdc.sdk.resources.url.impl.HttpOTSUrl;
import com.otsdc.sdk.resources.url.impl.HttpsOTSUrl;

/**
 * Copyright (C) 2015 OTS | Digital Communication Platform
 * <p/>
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * <p/>
 * Created by alhareth, July 2015
 */
public class OTSRestClient {
    public static final AOTSUrl HTTP_URL = new HttpOTSUrl();
    public static final AOTSUrl HTTPS_URL = new HttpsOTSUrl();

    private String appSid;
    private IOTSUrl otsUrl;
    private IAccountResource accountResource;
    private IMessageResource messageResource;
    private IVoiceResource voiceResource;
    private IEmailResource emailResource;
    private IVerifyResource verifyResource;
    /**
     *
     * @param appSid The AppSid
     * @param otsUrl The Url.
     */
    public OTSRestClient(String appSid, IOTSUrl otsUrl) {
        this.appSid = appSid;
        this.otsUrl = otsUrl;
        ResourceFactory resourceFactory = new ResourceFactory(otsUrl);
        accountResource = resourceFactory.makeAccountResource(appSid);
        messageResource = resourceFactory.makeMessageResource(appSid);
        voiceResource = resourceFactory.makeVoiceResource(appSid);
        emailResource = resourceFactory.makeEmailResource(appSid);
        verifyResource = resourceFactory.makeVerifyResource(appSid);
    }
    /**
     * Default connection using HTTPS. this method same as new OTSRestClient(appSid,OTSRestClient.HTTPS_URL)
     * @param appSid the AppSid
     */
    public OTSRestClient(String appSid){
        this(appSid, HTTP_URL);
    }

    public IOTSUrl getOtsUrl() {
        return otsUrl;
    }
    public String getAppSid() {
        return appSid;
    }

    public IAccountResource getAccountResource() {
        return accountResource;
    }

    public IMessageResource getMessageResource() {
        return messageResource;
    }

    public IVoiceResource getVoiceResource() {
        return voiceResource;
    }

    public IEmailResource getEmailResource() {
        return emailResource;
    }

    public IVerifyResource getVerifyResource() {
        return verifyResource;
    }

}
