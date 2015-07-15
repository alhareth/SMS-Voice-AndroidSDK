package com.otsdc.sdk.resources.url.impl;

import com.otsdc.sdk.resources.url.IEmailUrl;


/**
 * Copyright (C) 2015 OTS | Digital Communication Platform
 * <p/>
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * <p/>
 * Created by alhareth, July 2015
 */
public class EmailUrlImpl  implements IEmailUrl {
    private String urlSend;
    private String urlGetEmailReport;

    public EmailUrlImpl(String urlBase) {
        String urlEmail = urlBase + PATH_EMAIL;
        urlSend = urlEmail + "Send";
        urlGetEmailReport = urlEmail + "GetEmailsReport";
    }

    @Override
    public String urlSend() {
        return urlSend;
    }

    @Override
    public String urlGetEmailReport() {
        return urlGetEmailReport;
    }
}
