package com.otsdc.sdk.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Copyright (C) 2015 OTS | Digital Communication Platform
 * <p/>
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * <p/>
 * Created by jafar, June 2015
 */
public abstract class ARequest {

    public static final String DEFAULT_DATE_FORMAT = "yyyy-MM-dd";
    private Map<String, String> data = new HashMap<>();

    public Map<String, String> getData() {
        return data;
    }

    public void setData(Map<String, String> data) {
        this.data = data;
    }

    public String put(String key, String value) {
        return data.put(key, value);
    }

    public String get(String key) {
        return data.get(key);
    }
}

