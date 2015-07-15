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
public class MessagesReportRequest extends ARequest implements MessageStatusConstant, DLRConstant {

    private SimpleDateFormat simpleDateFormat;
    private String dateFormat = DEFAULT_DATE_FORMAT;

    public MessagesReportRequest() {
        simpleDateFormat = new SimpleDateFormat(dateFormat);
    }

    public String getDateFormat() {
        return dateFormat;
    }

    public Date getDateTo() throws ParseException {
        String get = get(ParamConstant.DATE_TO);
        if (get != null) {
            return simpleDateFormat.parse(get);
        }
        return null;
    }

    public void setDateTo(Date dateTo) {
        String format = simpleDateFormat.format(dateTo);
        put(ParamConstant.DATE_TO, format);
    }

    public Date getDateFrom() throws ParseException {
        String get = get(ParamConstant.DATE_FROM);
        if (get != null) {
            return simpleDateFormat.parse(get);
        }
        return null;
    }

    public void setDateFrom(Date dateFrom) {
        String format = simpleDateFormat.format(dateFrom);
        put(ParamConstant.DATE_FROM, format);
    }

    public String getSenderID() {
        return get(ParamConstant.SENDERID);
    }

    public void setSenderID(String senderID) {
        put(ParamConstant.SENDERID, senderID);
    }

    public String getStatus() {
        return get(ParamConstant.STATUS);
    }

    public void setStatus(String status) {
        put(ParamConstant.STATUS, status);
    }

    public String getDlr() {
        return get(ParamConstant.DLR);
    }

    public void setDlr(String dlr) {
        put(ParamConstant.DLR, dlr);
    }

    public String getCountry() {
        return get(ParamConstant.COUNTRY);
    }

    public void setCountry(String country) {
        put(ParamConstant.COUNTRY, country);
    }

}
