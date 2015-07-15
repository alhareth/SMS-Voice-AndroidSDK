package com.otsdc.sdk.resources.url.impl;

/**
 * Copyright (C) 2015 OTS | Digital Communication Platform
 * <p/>
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * <p/>
 * Created by alhareth, July 2015
 */
public class HttpOTSUrl extends DefaultOTSUrl {
    public static final String DEFAULT_URLBASE = "http://api.otsdc.com/rest/";

    private HttpOTSUrl(String urlBase) {
        super(urlBase);
    }

    public HttpOTSUrl() {
        this(DEFAULT_URLBASE);
    }
}
