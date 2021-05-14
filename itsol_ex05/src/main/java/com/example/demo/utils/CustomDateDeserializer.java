package com.example.demo.utils;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CustomDateDeserializer extends StdDeserializer<Date> {
    private static SimpleDateFormat formatter
            = new SimpleDateFormat("dd-MM-yyyy");
    public CustomDateDeserializer() {
        this(null);
    }

    public CustomDateDeserializer(Class<Date> t) {
        super(t);
    }
    @Override
    public Date deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        String dateStr = p.getText();
        try {
            return formatter.parse(dateStr);
        }catch (Exception e){
            return null;
        }
    }
}
