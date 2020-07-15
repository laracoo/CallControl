package com.example.callcontrol;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Test {
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    public static void main(String[] args) {
        Json json = new Json("456", "24/04/2020", "7583937", true, "23442");

        String firstJSON= GSON.toJson(json);
        System.out.println(firstJSON);
    }
}
