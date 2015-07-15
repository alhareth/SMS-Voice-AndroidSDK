package com.otsdc.sdk.resources.url.impl;


import com.otsdc.sdk.resources.url.IAccountUrl;

/**
 * Copyright (C) 2015 OTS | Digital Communication Platform
 * <p/>
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * <p/>
 * Created by alhareth, July 2015
 */
public class AccountUrlImpl implements IAccountUrl {

    private String urlGetBalance;
    private String urlAddSenderID;
    private String urlGetSenderIDStatus;
    private String urlGetSenderIDs;
    private String urlDeleteSenderID;
    private String urlGetDefaultSenderID;
    private String urlChangeDefaultSenderID;

    public AccountUrlImpl(String urlBase) {
        String urlAccount = urlBase + PATH_ACCOUNT;
        urlGetBalance = urlAccount + "GetBalance";
        urlAddSenderID = urlAccount + "addSenderID";
        urlGetSenderIDStatus = urlAccount + "getSenderIDStatus";
        urlGetSenderIDs = urlAccount + "getSenderIDs";
        urlDeleteSenderID = urlAccount + "DeleteSenderID";
        urlGetDefaultSenderID = urlAccount + "GetAppDefaultSenderID";
        urlChangeDefaultSenderID = urlAccount + "changeAppDefaultSenderID";
    }

    @Override
    public String urlGetBalance() {
        return urlGetBalance;
    }

    @Override
    public String urlAddSenderID() {
        return urlAddSenderID;
    }

    @Override
    public String urlGetSenderIDStatus() {
        return urlGetSenderIDStatus;
    }

    @Override
    public String urlGetSenderIDs() {
        return urlGetSenderIDs;
    }

    @Override
    public String urlDeleteSenderID() {
        return urlDeleteSenderID;
    }

    @Override
    public String urlGetAppDefaultSenderID() {
        return urlGetDefaultSenderID;
    }

    @Override
    public String urlChangeDefaultSenderID() {
        return urlChangeDefaultSenderID;
    }

}
