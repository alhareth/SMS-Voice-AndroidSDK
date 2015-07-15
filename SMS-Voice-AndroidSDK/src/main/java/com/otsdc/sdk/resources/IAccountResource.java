package com.otsdc.sdk.resources;

import com.otsdc.sdk.model.ResponseModel;
import com.otsdc.sdk.model.Voids;
import com.otsdc.sdk.model.account.Balance;
import com.otsdc.sdk.model.account.SenderID;
import com.otsdc.sdk.model.account.SenderList;

import java.io.IOException;


/**
 * Copyright (C) 2015 OTS | Digital Communication Platform
 * <p/>
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * <p/>
 * Created by alhareth, June 2015
 */
public interface IAccountResource extends IResource {

    public static final String PARAM_SENDER_ID = "SenderID";

    public Balance getBalance() throws IOException;

    public SenderID addSenderId(String senderID) throws IOException;

    public SenderID getSenderIDStatus(String senderID) throws IOException;

    public SenderList getSenderIDS() throws IOException;

    public ResponseModel<Voids> deleteSenderID(String senderID) throws IOException;

    public SenderID getAppDefaultSenderID() throws IOException;

    public ResponseModel<Voids> changeAppDefaultSenderID(String senderID) throws IOException;
}
