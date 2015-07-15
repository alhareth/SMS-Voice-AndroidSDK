package com.otsdc.sdk.resources.http;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.otsdc.sdk.OTSRestResponse;
import com.otsdc.sdk.constant.ParamConstant;
import com.otsdc.sdk.model.ResponseModel;
import com.otsdc.sdk.model.call.CallRequest;
import com.otsdc.sdk.model.call.CallResponse;
import com.otsdc.sdk.model.call.CallStatusResponse;
import com.otsdc.sdk.model.call.CallsDetailsRequest;
import com.otsdc.sdk.model.call.CallsDetailsResponse;
import com.otsdc.sdk.model.call.TTSCallRequest;
import com.otsdc.sdk.model.call.TTSCallResponse;
import com.otsdc.sdk.resources.AResource;
import com.otsdc.sdk.resources.IVoiceResource;
import com.otsdc.sdk.resources.url.IVoiceUrl;
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
public class VoiceResourceImpl extends AResource implements IVoiceResource {

    private Gson GSON;
    private IVoiceUrl voiceUrl;

    public VoiceResourceImpl(String appSid, IVoiceUrl voiceUrl) {
        super(appSid);
        this.voiceUrl = voiceUrl;
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(Date.class, new DateConverter());
        GSON = gsonBuilder.create();
    }

    @Override
    public CallResponse call(CallRequest request) throws IOException {
        return call(request.getData());
    }

    @Override
    public CallResponse call(Map<String, String> param) throws IOException {
        OTSRestResponse response = sendRequest(voiceUrl.urlCall(), param);
        if (response.getStatusCode() < 400) {
            Type type = new TypeToken<ResponseModel<CallResponse>>() {
            }.getType();
            ResponseModel<CallResponse> respData = GSON.fromJson(response.getData(), type);
            return respData.create();
        } else if (response.getStatusCode() == 400) {
            CallResponse resp = GSON.fromJson(response.getData(), CallResponse.class);
            return resp;
        } else {
            throw new HttpResponseException(response.getStatusCode(), response.getReasonPhrase());
        }
    }

    @Override
    public CallStatusResponse getCallIDStatus(String callID) throws IOException {
        Map<String, String> map = new HashMap<String, String>(2);
        map.put(ParamConstant.CALLID, callID);
        return getCallIDStatus(map);
    }

    @Override
    public CallStatusResponse getCallIDStatus(Map<String, String> param) throws IOException {
        OTSRestResponse response = sendRequest(voiceUrl.urlGetCallIDStatus(), param);
        if (response.getStatusCode() < 400) {
            Type type = new TypeToken<ResponseModel<CallStatusResponse>>() {
            }.getType();
            ResponseModel<CallStatusResponse> respData = GSON.fromJson(response.getData(), type);
            return respData.create();
        } else if (response.getStatusCode() == 400) {
            CallStatusResponse resp = GSON.fromJson(response.getData(), CallStatusResponse.class);
            return resp;
        } else {
            throw new HttpResponseException(response.getStatusCode(), response.getReasonPhrase());
        }
    }

    @Override
    public CallsDetailsResponse getCallsDetails(CallsDetailsRequest request) throws IOException {
        return getCallsDetails(request.getData());
    }

    @Override
    public CallsDetailsResponse getCallsDetails(Map<String, String> param) throws IOException {
        OTSRestResponse response = sendRequest(voiceUrl.urlGetCallsDetails(), param);
        if (response.getStatusCode() < 400) {
            Type type = new TypeToken<ResponseModel<CallsDetailsResponse>>() {
            }.getType();
            ResponseModel<CallsDetailsResponse> respData = GSON.fromJson(response.getData(), type);
            return respData.create();
        } else if (response.getStatusCode() == 400) {
            CallsDetailsResponse resp = GSON.fromJson(response.getData(), CallsDetailsResponse.class);
            return resp;
        } else {
            throw new HttpResponseException(response.getStatusCode(), response.getReasonPhrase());
        }
    }

    @Override
    public TTSCallResponse ttsCall(TTSCallRequest request) throws IOException {
        return ttsCall(request.getData());
    }

    @Override
    public TTSCallResponse ttsCall(Map<String, String> param) throws IOException {
        OTSRestResponse response = sendRequest(voiceUrl.urlTTSCall(), param);
        if (response.getStatusCode() < 400) {
            Type type = new TypeToken<ResponseModel<TTSCallResponse>>() {
            }.getType();
            ResponseModel<TTSCallResponse> respData = GSON.fromJson(response.getData(), type);
            return respData.create();
        } else if (response.getStatusCode() == 400) {
            TTSCallResponse resp = GSON.fromJson(response.getData(), TTSCallResponse.class);
            return resp;
        } else {
            throw new HttpResponseException(response.getStatusCode(), response.getReasonPhrase());
        }
    }

    @Override
    public CallsDetailsResponse getCallsDetails() throws IOException {
        return getCallsDetails(new HashMap<String, String>());
    }
}
