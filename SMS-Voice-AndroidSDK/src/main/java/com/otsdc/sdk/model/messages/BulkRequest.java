package com.otsdc.sdk.model.messages;

import com.otsdc.sdk.constant.ParamConstant;
import com.otsdc.sdk.model.ARequest;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright (C) 2015 OTS | Digital Communication Platform
 * <p/>
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * <p/>
 * Created by alhareth, June 2015
 */
public class BulkRequest extends ARequest {

    /**
     * @param recipient Multi Recipients numbers separated by commas
     * @param body
     */
    public BulkRequest(String recipient, String body) {
        setRecipients(recipient);
        setBody(body);
    }

    /**
     * @param recipient Multi Recipients numbers separated by commas
     * @param body
     * @param senderID
     */
    public BulkRequest(String recipient, String body, String senderID) {
        setRecipients(recipient);
        setBody(body);
        setSenderID(senderID);
    }

    public BulkRequest(List<String> recipients, String body) {
        setRecipients(recipients);
        setBody(body);
    }

    public BulkRequest(List<String> recipients, String body, String senderID) {
        setRecipients(recipients);
        setBody(body);
        setSenderID(senderID);
    }

    public BulkRequest(String[] recipients, String body) {
        setRecipients(recipients);
        setBody(body);
    }

    public BulkRequest(String[] recipients, String body, String senderID) {
        setRecipients(recipients);
        setBody(body);
        setSenderID(senderID);
    }

    public String getBody() {
        return get(ParamConstant.BODY);
    }

    public void setBody(String body) {
        put(ParamConstant.BODY, body);
    }

    public void setRecipients(List<String> recipient) {
        StringBuilder builder = new StringBuilder();
        for (String string : recipient) {
            builder.append(string);
            builder.append(',');
        }
        String data = "";
        if (!recipient.isEmpty()) {
            data = builder.substring(0, builder.length() - 1);
        }
        setRecipients(data);
    }

    public void setRecipients(String[] recipient) {
        StringBuilder builder = new StringBuilder();
        for (String string : recipient) {
            builder.append(string);
            builder.append(',');
        }
        String data = "";
        if (recipient.length != 0) {
            data = builder.substring(0, builder.length() - 1);
        }
        setRecipients(data);
    }

    /**
     * @param recipients Multi recipients numbers seperated by commas
     */
    public void setRecipients(String recipients) {
        put(ParamConstant.RECIPIENT, recipients);
    }

    public List<Integer> getRecipientList() {
        String recipients = getRecipients();
        if (recipients != null) {
            String[] split = recipients.split(",");
            List<Integer> list = new ArrayList<>();
            for (String string : split) {
                list.add(Integer.valueOf(string));
            }
            return list;
        }
        return null;
    }

    /**
     * @return Multi recipients numbers seperated by commas
     */
    public String getRecipients() {
        return get(ParamConstant.RECIPIENT);
    }

    public void setSenderID(String senderID) {
        put(ParamConstant.SENDERID, senderID);
    }

    public String getSenderID() {
        return get(ParamConstant.SENDERID);
    }
}