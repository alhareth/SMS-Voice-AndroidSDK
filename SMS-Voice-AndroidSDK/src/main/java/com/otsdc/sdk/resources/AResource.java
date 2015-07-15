package com.otsdc.sdk.resources;


import com.otsdc.sdk.HttpSender;
import com.otsdc.sdk.OTSRestResponse;
import com.otsdc.sdk.constant.ParamConstant;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
/**
 * Copyright (C) 2015 OTS | Digital Communication Platform
 * <p/>
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * <p/>
 * Created by alhareth, June 2015
 */
public abstract class AResource implements IResource {

    private static final HttpSender HTTP_SENDER = new HttpSender();
    private String appSid;

    public AResource(String appSid) {
        this.appSid = appSid;
    }

    @Override
    public String getAppSid() {
        return appSid;
    }

    @Override
    public void setAppSid(String appSid) {
        this.appSid = appSid;
    }

    public OTSRestResponse sendRequest(String url, List<NameValuePair> params) throws IOException {
        params.add(new BasicNameValuePair(ParamConstant.APPSID, getAppSid()));
        OTSRestResponse response = HTTP_SENDER.request(url, params);
        return response;
    }

    public OTSRestResponse sendRequest(String url, Map<String, String> param) throws IOException {
        ArrayList<NameValuePair> params = new ArrayList<NameValuePair>();
        Set<Map.Entry<String, String>> entrySet = param.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            params.add(new BasicNameValuePair(entry.getKey(), String.valueOf(entry.getValue())));
        }
        return sendRequest(url, params);
    }
}
