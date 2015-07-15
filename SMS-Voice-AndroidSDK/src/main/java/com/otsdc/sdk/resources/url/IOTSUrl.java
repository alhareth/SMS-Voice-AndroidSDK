package com.otsdc.sdk.resources.url;

/**
 * Copyright (C) 2015 OTS | Digital Communication Platform
 * <p/>
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * <p/>
 * Created by alhareth, July 2015
 */
public interface IOTSUrl {
    public IAccountUrl getAccountUrl();

    public IMessageUrl getMessageUrl();

    public IVoiceUrl getVoiceUrl();

    public IEmailUrl getEmailUrl();

    public IVerifyUrl getVerifyUrl();
}
