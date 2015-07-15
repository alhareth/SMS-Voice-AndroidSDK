package com.otsdc.sdk.resources;

import com.otsdc.sdk.model.email.EmailReportRequest;
import com.otsdc.sdk.model.email.EmailReportResponse;
import com.otsdc.sdk.model.email.EmailRequest;
import com.otsdc.sdk.model.email.EmailResponse;

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
public interface IEmailResource extends IResource {

    public EmailResponse send(EmailRequest request) throws IOException;

    public EmailResponse send(Map<String, String> param) throws IOException;

    public EmailReportResponse getEmailsReport() throws IOException;

    public EmailReportResponse getEmailsReport(EmailReportRequest request) throws IOException;

    public EmailReportResponse getEmailsReport(Map<String, String> param) throws IOException;
}
