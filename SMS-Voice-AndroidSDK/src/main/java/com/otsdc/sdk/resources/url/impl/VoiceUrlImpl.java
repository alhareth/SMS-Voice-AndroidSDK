package com.otsdc.sdk.resources.url.impl;


import com.otsdc.sdk.resources.url.IVoiceUrl;

/**
 * Copyright (C) 2015 OTS | Digital Communication Platform
 * <p/>
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * <p/>
 * Created by alhareth, July 2015
 */
public class VoiceUrlImpl implements IVoiceUrl {

    private String urlCall;
    private String urlGetCallIDStatus;
    private String urlGetCallsDetails;
    private String urlTTSCall;

    public VoiceUrlImpl(String urlBase) {
        String urlVoice = urlBase + PATH_VOICE;
        urlCall = urlVoice + "Call";
        urlGetCallIDStatus = urlVoice + "GetCallIDStatus";
        urlGetCallsDetails = urlVoice + "GetCallsDetails";
        urlTTSCall = urlVoice + "TTSCall";
    }

    @Override
    public String urlCall() {
        return urlCall;
    }

    @Override
    public String urlGetCallIDStatus() {
        return urlGetCallIDStatus;
    }

    @Override
    public String urlGetCallsDetails() {
        return urlGetCallsDetails;
    }

    @Override
    public String urlTTSCall() {
        return urlTTSCall;
    }

}
