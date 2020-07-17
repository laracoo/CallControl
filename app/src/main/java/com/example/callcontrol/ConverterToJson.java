package com.example.callcontrol;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Map;

public class ConverterToJson {
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    public ConverterToJson() {}

    public String converterToJson(Map<String, String> map) {
        String JSON = GSON.toJson(map);
        return JSON;
    }
}