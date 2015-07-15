package com.otsdc.sdk.resources.url;

/**
 * Copyright (C) 2015 OTS | Digital Communication Platform
 * <p/>
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * <p/>
 * Created by jafar, June 2015
 */
public interface IAccountUrl {
    public static final String PATH_ACCOUNT = "Account/";
    public String urlGetBalance();

    public String urlAddSenderID();

    public String urlGetSenderIDStatus();

    public String urlGetSenderIDs();

    public String urlDeleteSenderID();

    public String urlGetAppDefaultSenderID();

    public String urlChangeDefaultSenderID();
}
