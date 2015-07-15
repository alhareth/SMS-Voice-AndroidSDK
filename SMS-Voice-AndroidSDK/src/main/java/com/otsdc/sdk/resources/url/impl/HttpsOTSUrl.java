package com.otsdc.sdk.resources.url.impl;

/**
 * Copyright (C) 2015 OTS | Digital Communication Platform
 * <p/>
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * <p/>
 * Created by alhareth, July 2015
 */
public class HttpsOTSUrl extends DefaultOTSUrl {
    public static final String DEFAULT_URLBASE = "https://api.otsdc.com/rest/";

    private HttpsOTSUrl(String urlBase) {
        super(urlBase);
    }

    public HttpsOTSUrl() {
        this(DEFAULT_URLBASE);
    }
}
