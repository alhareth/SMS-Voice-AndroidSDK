package com.otsdc.sdk.model.messages;

import com.otsdc.sdk.constant.DLRConstant;
import com.otsdc.sdk.constant.MessageStatusConstant;
import com.otsdc.sdk.constant.ParamConstant;
import com.otsdc.sdk.model.ARequest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Copyright (C) 2015 OTS | Digital Communication Platform
 * <p/>
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * <p/>
 * Created by alhareth, June 2015
 */
public class MessagesDetailsRequest extends ARequest implements MessageStatusConstant, DLRConstant {

    private SimpleDateFormat simpleDateFormat;
    private String dateFormat = DEFAULT_DATE_FORMAT;

    public MessagesDetailsRequest() {
        simpleDateFormat = new SimpleDateFormat(dateFormat);
    }

    public String getDateFormat() {
        return dateFormat;
    }

    /**
     * @return The Message ID
     */
    public String getMessageID() {
        return get(ParamConstant.MESSAGEID);
    }

    /**
     * @param messageID The Message ID
     */
    public void setMessageID(String messageID) {
        put(ParamConstant.MESSAGEID, messageID);
    }

    /**
     * @return Filter messages report according to a specific message status.
     * "Sent", "Queued", "Rejected" or "Failed"
     */
    public String getStatus() {
        return get(ParamConstant.STATUS);
    }

    /**
     * @param status Filter messages report according to a specific message
     *               status. "Sent", "Queued", "Rejected" or "Failed"
     */
    public void setStatus(String status) {
        put(ParamConstant.STATUS, status);
    }

    public String getSenderID() {
        return get(ParamConstant.SENDERID);
    }

    /**
     * @param senderID Filter messages report according to a specific sender ID
     */
    public void setSenderID(String senderID) {
        put(ParamConstant.SENDERID, senderID);
    }

    /**
     * @return The end date for the report time interval
     * @throws ParseException
     */
    public Date getDateTo() throws ParseException {
        String get = get(ParamConstant.DATE_TO);
        if (get != null) {
            return simpleDateFormat.parse(get);
        }
        return null;
    }

    /**
     * @param dateTo The end date for the report time interval
     */
    public void setDateTo(Date dateTo) {
        String format = simpleDateFormat.format(dateTo);
        put(ParamConstant.DATE_TO, format);
    }

    /**
     * @return The start date for the report time interval
     * @throws ParseException
     */
    public Date getDateFrom() throws ParseException {
        String get = get(ParamConstant.DATE_FROM);
        if (get != null) {
            return simpleDateFormat.parse(get);
        }
        return null;
    }

    /**
     * @param dateFrom The start date for the report time interval
     */
    public void setDateFrom(Date dateFrom) {
        String format = simpleDateFormat.format(dateFrom);
        put(ParamConstant.DATE_FROM, format);
    }

    /**
     * @return Number of messages to return in the report, where the limit
     * maximum is 10,000 and messages are sorted by sending date
     */
    public Integer getLimit() {
        String get = get(ParamConstant.LIMIT);
        if (get != null) {
            return Integer.valueOf(get);
        }
        return null;
    }

    /**
     * @param limit Number of messages to return in the report, where the limit
     *              maximum is 10,000 and messages are sorted by sending date
     */
    public void setLimit(Integer limit) {
        put(ParamConstant.LIMIT, limit.toString());
    }

    public Integer getPage() {
        String get = get(ParamConstant.PAGE);
        if (get != null) {
            return Integer.valueOf(get);
        }
        return null;
    }

    public void setPage(Integer page) {
        put(ParamConstant.PAGE, page.toString());
    }

    /**
     * @param country Filter messages report according to a specific destination
     *                country
     */
    public void setCountry(String country) {
        put(ParamConstant.COUNTRY, country);
    }

    public String getCountry() {
        return get(ParamConstant.COUNTRY);
    }

    /**
     * @param dlr Message delivery status returned by networks, the possible
     *            values are "Delivered" or "Undeliverable", and are available for advanced
     *            plans
     */
    public void setDLR(String dlr) {
        put(ParamConstant.DLR, dlr);
    }

    public String getDLR() {
        return get(ParamConstant.DLR);
    }
}