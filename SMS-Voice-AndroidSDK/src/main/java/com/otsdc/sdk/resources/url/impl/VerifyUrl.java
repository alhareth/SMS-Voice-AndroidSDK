package com.otsdc.sdk.resources.url.impl;


import com.otsdc.sdk.resources.url.IVerifyUrl;

/**
 * Copyright (C) 2015 OTS | Digital Communication Platform
 * <p/>
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * <p/>
 * Created by alhareth, July 2015
 */
public class VerifyUrl implements IVerifyUrl {
    private String urlGetCode;
    private String urlVerifyNumber;

    public VerifyUrl(String urlBase) {
        String urlVerify = urlBase + PATH_VERIFY;
        urlGetCode = urlVerify + "GetCode";
        urlVerifyNumber = urlVerify + "VerifyNumber";
    }

    @Override
    public String urlGetCode() {
        return urlGetCode;
    }

    @Override
    public String urlVerifyNumber() {
        return urlVerifyNumber;
    }

}
