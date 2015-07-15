package com.otsdc.sdk.resources.url;

/**
 * Copyright (C) 2015 OTS | Digital Communication Platform
 * <p/>
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * <p/>
 * Created by alhareth, June 2015
 */
public interface IEmailUrl {
    public static final String PATH_EMAIL = "Email/";

    public String urlSend();

    public String urlGetEmailReport();
}
