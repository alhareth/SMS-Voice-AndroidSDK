package com.otsdc.sdk.model.call;

import com.otsdc.sdk.constant.CallStatusConstant;
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
public class CallsDetailsRequest extends ARequest implements CallStatusConstant {

    private SimpleDateFormat simpleDateFormat;
    private String dateFormat = DEFAULT_DATE_FORMAT;

    public CallsDetailsRequest() {
        simpleDateFormat = new SimpleDateFormat(dateFormat);
    }

    public String getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
        simpleDateFormat = new SimpleDateFormat(dateFormat);
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

    public String getCallID() {
        return get(ParamConstant.CALLID);
    }

    public void setCallID(String callID) {
        put(ParamConstant.CALLID, callID);
    }

    public String getStatus() {
        return get(ParamConstant.STATUS);
    }

    public void setStatus(String status) {
        put(ParamConstant.STATUS, status);
    }

    public String getCountry() {
        return get(ParamConstant.COUNTRY);
    }

    public void setCountry(String country) {
        put(ParamConstant.COUNTRY, country);
    }

}