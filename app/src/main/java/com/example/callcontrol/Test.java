package com.example.callcontrol;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        Map<String,String> map = new HashMap();
        map.put("id","456789");
        map.put("name", "Vasya");
        map.put("number", "45637829");

        ConverterToJson tryJson = new ConverterToJson();

        System.out.println(tryJson.converterToJson(map));
    }
}
