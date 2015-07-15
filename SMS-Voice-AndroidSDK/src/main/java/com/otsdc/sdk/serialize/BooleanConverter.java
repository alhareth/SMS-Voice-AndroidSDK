package com.otsdc.sdk.serialize;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;

/**
 * Copyright (C) 2015 OTS | Digital Communication Platform
 * <p/>
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * <p/>
 * Created by alhareth, June 2015
 */
public class BooleanConverter implements JsonDeserializer<Boolean> {

    @Override
    public Boolean deserialize(JsonElement je, Type type, JsonDeserializationContext jdc) throws JsonParseException {
        String asString = je.getAsString();
        if ("true".equals(asString)) {
            return true;
        } else if ("1".equals(asString)) {
            return true;
        } else {
            return false;
        }
    }

}
