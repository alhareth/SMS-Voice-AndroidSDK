package com.otsdc.sdk.resources;


import com.otsdc.sdk.model.ResponseModel;
import com.otsdc.sdk.model.Voids;
import com.otsdc.sdk.model.verify.GetCodeRequest;
import com.otsdc.sdk.model.verify.GetCodeResponse;

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
public interface IVerifyResource extends IResource {

    /**
     * Provide a user number to be verified and the GetCode method will send the
     * passcode via text message number to the provided number
     *
     * @param request
     * @return
     * @throws IOException
     */
    public GetCodeResponse getCode(GetCodeRequest request) throws IOException;

    /**
     * Provide a user number to be verified and the GetCode method will send the
     * passcode via text message number to the provided number
     *
     * @param map
     * @return
     * @throws IOException
     */
    public GetCodeResponse getCode(Map<String, String> map) throws IOException;

    /**
     * Provide the pass code obtained from your user along with the mobile
     * number, VerifyNumber API will verify if the pass code matches the number
     * and authenticate or unauthenticated the user mobile number
     *
     * @param recipient
     * @param passCode
     * @return
     * @throws IOException
     */
    public ResponseModel<Voids> verifyNumber(String recipient, String passCode) throws IOException;

    /**
     * Provide the pass code obtained from your user along with the mobile
     * number, VerifyNumber API will verify if the pass code matches the number
     * and authenticate or unauthenticated the user mobile number
     *
     * @param map
     * @return
     * @throws IOException
     */
    public ResponseModel<Voids> verifyNumber(Map<String, String> map) throws IOException;

}
