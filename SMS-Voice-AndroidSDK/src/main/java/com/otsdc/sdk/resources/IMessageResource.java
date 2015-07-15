package com.otsdc.sdk.resources;

import com.otsdc.sdk.model.messages.BulkRequest;
import com.otsdc.sdk.model.messages.BulkResponse;
import com.otsdc.sdk.model.messages.MessageIDStatus;
import com.otsdc.sdk.model.messages.MessageRequest;
import com.otsdc.sdk.model.messages.MessageResponse;
import com.otsdc.sdk.model.messages.MessagesDetailsRequest;
import com.otsdc.sdk.model.messages.MessagesDetailsResponse;
import com.otsdc.sdk.model.messages.MessagesReportRequest;
import com.otsdc.sdk.model.messages.MessagesReportResponse;

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
public interface IMessageResource extends IResource {

    /**
     * Send enables API to send a message for only one recipient; you must have
     * sufficient balance or an active package to send to your desired
     * destination.
     *
     * @param param
     * @return
     * @throws IOException
     */
    public MessageResponse send(MessageRequest param) throws IOException;

    /**
     * Send enables API to send a message for only one recipient; you must have
     * sufficient balance or an active package to send to your desired
     * destination.
     *
     * @param param
     * @return
     * @throws IOException
     */
    public MessageResponse send(Map<String, String> param) throws IOException;

    /**
     * SendBulk enables API to send bulk messages for multi recipiencts
     * seperated by commas, Using SendBulk API requieres authorized API Access,
     * to get your authurized access contact us.
     *
     * @param param
     * @return
     * @throws IOException
     */
    public BulkResponse sendBulk(BulkRequest param) throws IOException;

    /**
     * SendBulk enables API to send bulk messages for multi recipiencts
     * seperated by commas, Using SendBulk API requieres authorized API Access,
     * to get your authurized access contact us.
     *
     * @param param
     * @return
     * @throws IOException
     */
    public BulkResponse sendBulk(Map<String, String> param) throws IOException;

    public MessageIDStatus getMessageIDStatus(String messageID) throws IOException;

    public MessagesReportResponse getMessagesReport() throws IOException;

    public MessagesReportResponse getMessagesReport(Map<String, String> param) throws IOException;

    public MessagesReportResponse getMessagesReport(MessagesReportRequest request) throws IOException;

    public MessagesDetailsResponse getMessagesDetails(MessagesDetailsRequest request) throws IOException;

    public MessagesDetailsResponse getMessagesDetails(Map<String, String> param) throws IOException;

    public MessagesDetailsResponse getMessagesDetails() throws IOException;
}
