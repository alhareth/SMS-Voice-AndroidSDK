package com.otsdc.sdk.resources.http;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.otsdc.sdk.OTSRestResponse;
import com.otsdc.sdk.model.ResponseModel;
import com.otsdc.sdk.model.email.EmailReportRequest;
import com.otsdc.sdk.model.email.EmailReportResponse;
import com.otsdc.sdk.model.email.EmailRequest;
import com.otsdc.sdk.model.email.EmailResponse;
import com.otsdc.sdk.resources.AResource;
import com.otsdc.sdk.resources.IEmailResource;
import com.otsdc.sdk.resources.url.IEmailUrl;
import com.otsdc.sdk.serialize.DateConverter;

import org.apache.http.client.HttpResponseException;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


/**
 * Copyright (C) 2015 OTS | Digital Communication Platform
 * <p/>
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * <p/>
 * Created by alhareth, June 2015
 */
public class EmailResourceImpl extends AResource implements IEmailResource {

    private Gson GSON;
    private IEmailUrl emailUrl;

    public EmailResourceImpl(String appSid,IEmailUrl emailUrl) {
        super(appSid);
        this.emailUrl = emailUrl;
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(Date.class, new DateConverter());
        GSON = gsonBuilder.create();
    }

    @Override
    public EmailResponse send(EmailRequest request) throws IOException {
        return send(request.getData());
    }

    @Override
    public EmailResponse send(Map<String, String> param) throws IOException {
        OTSRestResponse response = sendRequest(emailUrl.urlSend(), param);
        if (response.getStatusCode() < 400) {
            Type type = new TypeToken<ResponseModel<EmailResponse>>() {
            }.getType();
            ResponseModel<EmailResponse> respData = GSON.fromJson(response.getData(), type);
            return respData.create();
        } else if (response.getStatusCode() == 400) {
            EmailResponse resp = GSON.fromJson(response.getData(), EmailResponse.class);
            return resp;
        } else {
            throw new HttpResponseException(response.getStatusCode(), response.getReasonPhrase());
        }
    }

    @Override
    public EmailReportResponse getEmailsReport() throws IOException {
        return getEmailsReport(new HashMap<String, String>(0));
    }

    @Override
    public EmailReportResponse getEmailsReport(EmailReportRequest request) throws IOException {
        return getEmailsReport(request.getData());
    }

    @Override
    public EmailReportResponse getEmailsReport(Map<String, String> param) throws IOException {
        OTSRestResponse response = sendRequest(emailUrl.urlGetEmailReport(), param);
        if (response.getStatusCode() < 400) {
            Type type = new TypeToken<ResponseModel<EmailReportResponse>>() {
            }.getType();
            ResponseModel<EmailReportResponse> respData = GSON.fromJson(response.getData(), type);
            return respData.create();
        } else if (response.getStatusCode() == 400) {
            EmailReportResponse resp = GSON.fromJson(response.getData(), EmailReportResponse.class);
            return resp;
        } else {
            throw new HttpResponseException(response.getStatusCode(), response.getReasonPhrase());
        }
    }
}
