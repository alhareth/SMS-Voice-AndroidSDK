package com.otsdc.sdk;

import android.os.AsyncTask;
import android.util.Log;

import com.otsdc.sdk.stream.InputStreamUtil;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.IOException;
import java.util.List;

/**
 * Copyright (C) 2015 OTS | Digital Communication Platform
 * <p/>
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * <p/>
 * Created by alhareth, June 2015
 */
public class HttpSender {

    private static final HttpClient httpClient = new DefaultHttpClient();

    public OTSRestResponse request(String url, String data) throws IOException {
        return requestDefault(url, new StringEntity(data));
    }

    public OTSRestResponse request(String url, List<NameValuePair> data) throws IOException {
        Log.d("URL:", "" + url);
        Log.d("DATA:", "" + data);
         return requestDefault(url, new UrlEncodedFormEntity(data));
    }

    public OTSRestResponse requestDefault(String url, HttpEntity data) throws IOException {
        HttpPost post = new HttpPost(url);
        post.setEntity(data);

        ResponseHandler<OTSRestResponse> rh = new ResponseHandler<OTSRestResponse>() {
            @Override
            public OTSRestResponse handleResponse(HttpResponse response) throws ClientProtocolException, IOException {
                HttpEntity entity = response.getEntity();
                if (entity == null) {
                    throw new ClientProtocolException("Response contains no content");
                }
                OTSRestResponse orr = new OTSRestResponse();
                orr.setStatusCode(response.getStatusLine().getStatusCode());
                orr.setReasonPhrase(response.getStatusLine().getReasonPhrase());
                String respContent = InputStreamUtil.readString(entity.getContent());
                Log.e("Response:" + orr.getStatusCode() + ":", orr.getReasonPhrase() + ":" + respContent);
                if (orr.getStatusCode() == 400) {
                    respContent = respContent.replace(",\"data\":[]", "");
                }
                orr.setData(respContent);
                return orr;
            }
        };
        OTSRestResponse execute = httpClient.execute(post, rh);
        return execute;
    }

}
