package com.otsdc.sdk.model;

/**
 * Copyright (C) 2015 OTS | Digital Communication Platform
 * <p/>
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * <p/>
 * Created by alhareth, June 2015
 */
public class ResponseModel <T extends ResponseModel> {

    private boolean success;
    private String message;
    private String errorCode;
    private T data;

    protected T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public T create() {
        T data1 = getData();
        copy(data1);
        return data1;
    }

    public T copy(T data1) {
        data1.setSuccess(isSuccess());
        data1.setErrorCode(getErrorCode());
        data1.setMessage(getMessage());
        return data1;
    }

    @Override
    public String toString() {
        return "ResponseModel{" + "success=" + success + ", message=" + message + ", errorCode=" + errorCode + '}';
    }

}