package com.otsdc.sdk.resources.http;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.otsdc.sdk.OTSRestResponse;
import com.otsdc.sdk.constant.ParamConstant;
import com.otsdc.sdk.model.ResponseModel;
import com.otsdc.sdk.model.messages.BulkRequest;
import com.otsdc.sdk.model.messages.BulkResponse;
import com.otsdc.sdk.model.messages.MessageIDStatus;
import com.otsdc.sdk.model.messages.MessageRequest;
import com.otsdc.sdk.model.messages.MessageResponse;
import com.otsdc.sdk.model.messages.MessagesDetailsRequest;
import com.otsdc.sdk.model.messages.MessagesDetailsResponse;
import com.otsdc.sdk.model.messages.MessagesReportRequest;
import com.otsdc.sdk.model.messages.MessagesReportResponse;
import com.otsdc.sdk.resources.AResource;
import com.otsdc.sdk.resources.IMessageResource;
import com.otsdc.sdk.resources.url.IMessageUrl;
import com.otsdc.sdk.serialize.DateConverter;

import org.apache.http.NameValuePair;
import org.apache.http.client.HttpResponseException;
import org.apache.http.message.BasicNameValuePair;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
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
public class MessagesResourceImpl extends AResource implements IMessageResource {

    private Gson GSON;
    private IMessageUrl messageUrl;
    public MessagesResourceImpl(String appSid, IMessageUrl messageUrl) {
        super(appSid);
        this.messageUrl = messageUrl;
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(Date.class, new DateConverter());
        GSON = gsonBuilder.create();
    }

    @Override
    public MessageResponse send(MessageRequest param) throws IOException {
        return send(param.getData());
    }

    @Override
    public MessageResponse send(Map<String, String> param) throws IOException {
        OTSRestResponse response = sendRequest(messageUrl.urlSend(), param);


        if (response.getStatusCode() < 400) {
            Type type = new TypeToken<ResponseModel<MessageResponse>>() {
            }.getType();
            ResponseModel<MessageResponse> respData = GSON.fromJson(response.getData(), type);
            return respData.create();
        } else {
            throw new HttpResponseException(response.getStatusCode(), response.getReasonPhrase());
        }
    }

    @Override
    public BulkResponse sendBulk(BulkRequest param) throws IOException {
        return sendBulk(param.getData());
    }

    @Override
    public BulkResponse sendBulk(Map<String, String> param) throws IOException {
        OTSRestResponse response = sendRequest(messageUrl.urlSendBulk(), param);
        if (response.getStatusCode() < 400) {
            Type type = new TypeToken<ResponseModel<BulkResponse>>() {
            }.getType();
            ResponseModel<BulkResponse> respData = GSON.fromJson(response.getData(), type);
            return respData.create();
        } else {
            throw new HttpResponseException(response.getStatusCode(), response.getReasonPhrase());
        }
    }

    @Override
    public MessageIDStatus getMessageIDStatus(String messageID) throws IOException {
        ArrayList<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair(ParamConstant.MESSAGEID, messageID));
        OTSRestResponse response = sendRequest(messageUrl.urlGetMessageIDStatus(), params);
        if (response.getStatusCode() < 400) {
            Type type = new TypeToken<ResponseModel<MessageIDStatus>>() {
            }.getType();
            ResponseModel<MessageIDStatus> respData = GSON.fromJson(response.getData(), type);
            return respData.create();
        } else {
            throw new HttpResponseException(response.getStatusCode(), response.getReasonPhrase());
        }
    }

    @Override
    public MessagesReportResponse getMessagesReport(Map<String, String> param) throws IOException {
        OTSRestResponse response = sendRequest(messageUrl.urlGetMessageReport(), param);
        if (response.getStatusCode() < 400) {
            Type type = new TypeToken<ResponseModel<MessagesReportResponse>>() {
            }.getType();
            ResponseModel<MessagesReportResponse> respData = GSON.fromJson(response.getData(), type);
            return respData.create();
        } else {
            throw new HttpResponseException(response.getStatusCode(), response.getReasonPhrase());
        }
    }

    @Override
    public MessagesDetailsResponse getMessagesDetails(Map<String, String> param) throws IOException {
        OTSRestResponse response = sendRequest(messageUrl.urlGetMessageDetails(), param);
        if (response.getStatusCode() < 400) {
            Type type = new TypeToken<ResponseModel<MessagesDetailsResponse>>() {
            }.getType();
            ResponseModel<MessagesDetailsResponse> respData = GSON.fromJson(response.getData(), type);
            return respData.create();
        } else {
            throw new HttpResponseException(response.getStatusCode(), response.getReasonPhrase());
        }
    }

    @Override
    public MessagesReportResponse getMessagesReport() throws IOException {
        return getMessagesReport(new HashMap<String, String>());
    }

    @Override
    public MessagesReportResponse getMessagesReport(MessagesReportRequest mrr) throws IOException {
        return getMessagesReport(mrr.getData());
    }

    @Override
    public MessagesDetailsResponse getMessagesDetails(MessagesDetailsRequest request) throws IOException {
        return getMessagesDetails(request.getData());
    }

    @Override
    public MessagesDetailsResponse getMessagesDetails() throws IOException {
        return getMessagesDetails(new HashMap<String, String>());
    }

}
