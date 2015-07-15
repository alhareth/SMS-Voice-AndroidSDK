package com.otsdc.sdk.resources.http;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.otsdc.sdk.OTSRestResponse;
import com.otsdc.sdk.model.ResponseModel;
import com.otsdc.sdk.model.Voids;
import com.otsdc.sdk.model.account.Balance;
import com.otsdc.sdk.model.account.SenderID;
import com.otsdc.sdk.model.account.SenderList;
import com.otsdc.sdk.resources.AResource;
import com.otsdc.sdk.resources.IAccountResource;
import com.otsdc.sdk.resources.url.IAccountUrl;
import com.otsdc.sdk.serialize.BooleanConverter;
import com.otsdc.sdk.serialize.DateConverter;

import org.apache.http.NameValuePair;
import org.apache.http.client.HttpResponseException;
import org.apache.http.message.BasicNameValuePair;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Date;

/**
 * Copyright (C) 2015 OTS | Digital Communication Platform
 * <p/>
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * <p/>
 * Created by alhareth, June 2015
 */
public class AccountResourceImpl extends AResource implements IAccountResource {

    private Gson GSON;
    private IAccountUrl accountUrl;

    public AccountResourceImpl(String appSid,IAccountUrl accountUrl) {
        super(appSid);
        this.accountUrl = accountUrl;
        GsonBuilder gsonBuilder = new GsonBuilder();
        BooleanConverter booleanConverter = new BooleanConverter();
        gsonBuilder.registerTypeAdapter(Boolean.class, booleanConverter);
        gsonBuilder.registerTypeAdapter(boolean.class, booleanConverter);
        gsonBuilder.registerTypeAdapter(Date.class, new DateConverter());
        GSON = gsonBuilder.create();
    }

    @Override
    public Balance getBalance() throws IOException {
        ArrayList<NameValuePair> param = new ArrayList<NameValuePair>();
        OTSRestResponse response = sendRequest(accountUrl.urlGetBalance(), param);
        if (response.getStatusCode() < 400) {
            Type type = new TypeToken<ResponseModel<Balance>>() {
            }.getType();
            ResponseModel<Balance> respData = GSON.fromJson(response.getData(), type);
            return respData.create();
        } else if (response.getStatusCode() == 400) {
            Balance resp = GSON.fromJson(response.getData(), Balance.class);
            return resp;
        } else {
            throw new HttpResponseException(response.getStatusCode(), response.getReasonPhrase());
        }
    }

    @Override
    public SenderID addSenderId(String senderID) throws IOException {
        ArrayList<NameValuePair> param = new ArrayList<NameValuePair>();
        param.add(new BasicNameValuePair(PARAM_SENDER_ID, senderID));

        OTSRestResponse response = sendRequest(accountUrl.urlAddSenderID(), param);
        if (response.getStatusCode() < 400) {
            Type type = new TypeToken<ResponseModel<SenderID>>() {
            }.getType();
            ResponseModel<SenderID> respData = GSON.fromJson(response.getData(), type);
            SenderID sender = respData.create();
            sender.setSenderID(senderID);
            return sender;
        } else if (response.getStatusCode() == 400) {
            SenderID resp = GSON.fromJson(response.getData(), SenderID.class);
            return resp;
        } else {
            throw new HttpResponseException(response.getStatusCode(), response.getReasonPhrase());
        }
    }

    @Override
    public SenderID getSenderIDStatus(String senderID) throws IOException {
        ArrayList<NameValuePair> param = new ArrayList<NameValuePair>();
        param.add(new BasicNameValuePair(PARAM_SENDER_ID, senderID));
        OTSRestResponse response = sendRequest(accountUrl.urlGetSenderIDStatus(), param);
        if (response.getStatusCode() < 400) {
            Type type = new TypeToken<ResponseModel<SenderID>>() {
            }.getType();
            ResponseModel<SenderID> respData = GSON.fromJson(response.getData(), type);
            SenderID sender = respData.create();
            sender.setSenderID(senderID);
            return sender;
        } else if (response.getStatusCode() == 400) {
            SenderID resp = GSON.fromJson(response.getData(), SenderID.class);
            return resp;
        } else {
            throw new HttpResponseException(response.getStatusCode(), response.getReasonPhrase());
        }
    }

    @Override
    public SenderList getSenderIDS() throws IOException {
        ArrayList<NameValuePair> param = new ArrayList<NameValuePair>();
        OTSRestResponse response = sendRequest(accountUrl.urlGetSenderIDs(), param);
        if (response.getStatusCode() < 400) {
            Type type = new TypeToken<ResponseModel<SenderList>>() {
            }.getType();
            ResponseModel<SenderList> respData = GSON.fromJson(response.getData(), type);
            SenderList senderList = respData.create();
            return senderList;
        } else if (response.getStatusCode() == 400) {
            SenderList resp = GSON.fromJson(response.getData(), SenderList.class);
            return resp;
        } else {
            throw new HttpResponseException(response.getStatusCode(), response.getReasonPhrase());
        }
    }

    @Override
    public ResponseModel<Voids> deleteSenderID(String senderID) throws IOException {
        ArrayList<NameValuePair> param = new ArrayList<NameValuePair>();
        param.add(new BasicNameValuePair(PARAM_SENDER_ID, senderID));
        OTSRestResponse response = sendRequest(accountUrl.urlDeleteSenderID(), param);
        if (response.getStatusCode() < 400) {
            Type type = new TypeToken<ResponseModel<Voids>>() {
            }.getType();
            ResponseModel<Voids> respData = GSON.fromJson(response.getData(), type);
            return respData;
        } else if (response.getStatusCode() == 400) {
            ResponseModel<Voids> respData = GSON.fromJson(response.getData(), ResponseModel.class);
            return respData;
        } else {
            throw new HttpResponseException(response.getStatusCode(), response.getReasonPhrase());
        }
    }

    @Override
    public SenderID getAppDefaultSenderID() throws IOException {
        ArrayList<NameValuePair> param = new ArrayList<NameValuePair>();
        OTSRestResponse response = sendRequest(accountUrl.urlGetAppDefaultSenderID(), param);
        if (response.getStatusCode() < 400) {
            Type type = new TypeToken<ResponseModel<SenderID>>() {
            }.getType();
            ResponseModel<SenderID> respData = GSON.fromJson(response.getData(), type);
            SenderID sender = respData.create();
            return sender;
        } else if (response.getStatusCode() == 400) {
            SenderID resp = GSON.fromJson(response.getData(), SenderID.class);
            return resp;
        } else {
            throw new HttpResponseException(response.getStatusCode(), response.getReasonPhrase());
        }
    }

    @Override
    public ResponseModel<Voids> changeAppDefaultSenderID(String senderID) throws IOException {
        ArrayList<NameValuePair> param = new ArrayList<NameValuePair>();
        param.add(new BasicNameValuePair(PARAM_SENDER_ID, senderID));
        OTSRestResponse response = sendRequest(accountUrl.urlChangeDefaultSenderID(), param);
        if (response.getStatusCode() < 400) {
            Type type = new TypeToken<ResponseModel<Voids>>() {
            }.getType();
            ResponseModel<Voids> respData = GSON.fromJson(response.getData(), type);
            return respData;
        } else if (response.getStatusCode() == 400) {
            ResponseModel<Voids> respData = GSON.fromJson(response.getData(), ResponseModel.class);
            return respData;
        } else {
            throw new HttpResponseException(response.getStatusCode(), response.getReasonPhrase());
        }
    }
}
