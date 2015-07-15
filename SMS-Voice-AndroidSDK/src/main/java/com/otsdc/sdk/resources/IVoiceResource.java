package com.otsdc.sdk.resources;

import com.otsdc.sdk.model.call.CallRequest;
import com.otsdc.sdk.model.call.CallResponse;
import com.otsdc.sdk.model.call.CallStatusResponse;
import com.otsdc.sdk.model.call.CallsDetailsRequest;
import com.otsdc.sdk.model.call.CallsDetailsResponse;
import com.otsdc.sdk.model.call.TTSCallRequest;
import com.otsdc.sdk.model.call.TTSCallResponse;

import java.io.IOException;
import java.util.Map;


/**
 * Copyright (C) 2015 OTS | Digital Communication Platform
 * <p/>
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * <p/>
 * Created by alhareth, June 2015
 */
public interface IVoiceResource  extends IResource {

    public CallResponse call(CallRequest request) throws IOException;

    public CallResponse call(Map<String, String> param) throws IOException;

    public CallStatusResponse getCallIDStatus(String callID) throws IOException;

    public CallStatusResponse getCallIDStatus(Map<String, String> param) throws IOException;

    public CallsDetailsResponse getCallsDetails() throws IOException;

    public CallsDetailsResponse getCallsDetails(CallsDetailsRequest request) throws IOException;

    public CallsDetailsResponse getCallsDetails(Map<String, String> param) throws IOException;

    public TTSCallResponse ttsCall(TTSCallRequest request) throws IOException;

    public TTSCallResponse ttsCall(Map<String, String> param) throws IOException;
}
