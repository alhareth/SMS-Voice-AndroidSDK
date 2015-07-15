package com.otsdc.sdk.serialize;


import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Copyright (C) 2015 OTS | Digital Communication Platform
 * <p/>
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * <p/>
 * Created by jafar, June 2015
 */
public class DateConverter implements JsonDeserializer<Date> {

//    private static final Log log = Logf.getLog(DateConverter.class);

    @Override
    public Date deserialize(JsonElement je, Type type, JsonDeserializationContext jdc) throws JsonParseException {
        try {
            String strDt = je.getAsString();
            String dateFormat;
            if (strDt.contains("-") && strDt.contains(":")) {
                dateFormat = "yyyy-MM-dd HH:mm:ss";
            } else if (strDt.contains("-")) {
                dateFormat = "yyyy-MM-dd";
            } else if (strDt.contains(":")) {
                dateFormat = "HH:mm:ss";
            } else {
                return null;
            }
            SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
            return sdf.parse(strDt);
        } catch (ParseException ex) {
//            log.error("Failed to parse Date:" + je.getAsString(), ex);
            System.out.print("Failed to parse Date:" + je.getAsString() + ex);
            return null;
        }
    }
}
