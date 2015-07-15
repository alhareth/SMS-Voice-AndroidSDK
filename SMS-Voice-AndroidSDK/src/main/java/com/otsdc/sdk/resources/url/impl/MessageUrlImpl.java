package com.otsdc.sdk.resources.url.impl;


import com.otsdc.sdk.resources.url.IMessageUrl;

/**
 * Copyright (C) 2015 OTS | Digital Communication Platform
 * <p/>
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * <p/>
 * Created by alhareth, July 2015
 */
public class MessageUrlImpl implements IMessageUrl {

    private String urlSend;
    private String urlSendBulk;
    private String urlGetMessageIDStatus;
    private String urlGetMessageReport;
    private String urlGetMessageDetails;

    public MessageUrlImpl(String urlBase) {
        String urlMessage = urlBase + PATH_MESSAGE;
        urlSend = urlMessage + "Send";
        urlSendBulk = urlMessage + "SendBulk";
        urlGetMessageIDStatus = urlMessage + "GetMessageIDStatus";
        urlGetMessageReport = urlMessage + "GetMessagesReport";
        urlGetMessageDetails = urlMessage + "GetMessagesDetails";
    }

    @Override
    public String urlSend() {
        return urlSend;
    }

    @Override
    public String urlSendBulk() {
        return urlSendBulk;
    }

    @Override
    public String urlGetMessageIDStatus() {
        return urlGetMessageIDStatus;
    }

    @Override
    public String urlGetMessageReport() {
        return urlGetMessageReport;
    }

    @Override
    public String urlGetMessageDetails() {
        return urlGetMessageDetails;
    }

}
