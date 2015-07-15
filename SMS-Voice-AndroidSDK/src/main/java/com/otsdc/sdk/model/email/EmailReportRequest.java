package com.otsdc.sdk.model.email;

import com.otsdc.sdk.constant.EmailStatusConstant;
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
public class EmailReportRequest extends ARequest implements EmailStatusConstant {

    private SimpleDateFormat simpleDateFormat;
    private String dateFormat = DEFAULT_DATE_FORMAT;

    public EmailReportRequest() {
        simpleDateFormat = new SimpleDateFormat(dateFormat);
    }

    public String getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
        simpleDateFormat = new SimpleDateFormat(dateFormat);
    }

    public String getEmailStatus() {
        return get(ParamConstant.EMAIL_STATUS);
    }

    public void setEmailStatus(String emailStatus) {
        put(ParamConstant.EMAIL_STATUS, emailStatus);
    }

    public String getSubject() {
        return get(ParamConstant.SUBJECT);
    }

    public void setSubject(String subject) {
        put(ParamConstant.SUBJECT, subject);
    }

    public Date getDateCreated() throws ParseException {
        String get = get(ParamConstant.DATE_CREATED);
        if (get != null) {
            return simpleDateFormat.parse(get);
        }
        return null;
    }

    public void setDateCreated(Date dateCreated) {
        String format = simpleDateFormat.format(dateCreated);
        put(ParamConstant.DATE_CREATED, format);
    }

    public String getFrom() {
        return get(ParamConstant.FROM);
    }

    public void setFrom(String from) {
        put(ParamConstant.FROM, from);
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
        put(ParamConstant.DATE_CREATED, format);
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
        put(ParamConstant.DATE_CREATED, format);
    }

}