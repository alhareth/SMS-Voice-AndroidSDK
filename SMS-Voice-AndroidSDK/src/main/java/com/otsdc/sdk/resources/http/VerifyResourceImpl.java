package com.otsdc.sdk.resources.http;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.otsdc.sdk.OTSRestResponse;
import com.otsdc.sdk.constant.ParamConstant;
import com.otsdc.sdk.model.ResponseModel;
import com.otsdc.sdk.model.Voids;
import com.otsdc.sdk.model.verify.GetCodeRequest;
import com.otsdc.sdk.model.verify.GetCodeResponse;
import com.otsdc.sdk.resources.AResource;
import com.otsdc.sdk.resources.IVerifyResource;
import com.otsdc.sdk.resources.url.IVerifyUrl;
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

public class VerifyResourceImpl extends AResource implements IVerifyResource {

    private Gson GSON;
    private IVerifyUrl verifyUrl;

    public VerifyResourceImpl(String appSid, IVerifyUrl verifyUrl) {
        super(appSid);
        this.verifyUrl = verifyUrl;
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(Date.class, new DateConverter());
        GSON = gsonBuilder.create();
    }

    @Override
    public GetCodeResponse getCode(GetCodeRequest request) throws IOException {
        return getCode(request.getData());
    }

    @Override
    public GetCodeResponse getCode(Map<String, String> map) throws IOException {
        OTSRestResponse response = sendRequest(verifyUrl.urlGetCode(), map);
        if (response.getStatusCode() < 400) {
            Type type = new TypeToken<ResponseModel<GetCodeResponse>>() {
            }.getType();
            ResponseModel<GetCodeResponse> respData = GSON.fromJson(response.getData(), type);
            return respData.create();
        } else if (response.getStatusCode() == 400) {
            GetCodeResponse resp = GSON.fromJson(response.getData(), GetCodeResponse.class);
            return resp;
        } else {
            throw new HttpResponseException(response.getStatusCode(), response.getReasonPhrase());
        }
    }

    @Override
    public ResponseModel<Voids> verifyNumber(String recipient, String passCode) throws IOException {
        if (recipient == null || passCode == null) {
            throw new NullPointerException("Recipient and PassCode cannot Null");
        }
        Map<String, String> map = new HashMap<>();
        map.put(ParamConstant.RECIPIENT, recipient);
        map.put(ParamConstant.PASSCODE, passCode);
        return verifyNumber(map);
    }

    @Override
    public ResponseModel<Voids> verifyNumber(Map<String, String> map) throws IOException {
        OTSRestResponse otsResponse = sendRequest(verifyUrl.urlVerifyNumber(), map);
        if (otsResponse.getStatusCode() < 400) {
            Type type = new TypeToken<ResponseModel<Voids>>() {
            }.getType();
            ResponseModel<Voids> respData = GSON.fromJson(otsResponse.getData(), type);
            return respData;
        } else if (otsResponse.getStatusCode() == 400) {
            ResponseModel<Voids> respData = GSON.fromJson(otsResponse.getData(), ResponseModel.class);
            return respData;
        } else {
            throw new HttpResponseException(otsResponse.getStatusCode(), otsResponse.getReasonPhrase());
        }
    }
}
