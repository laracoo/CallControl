package com.example.callcontrol;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

public class Test {

    public static ArrayList<Integer> usersId = new ArrayList<>(); // List of already added phones from contact list

    public static void main(String[] args) {

        ConverterToJson tryJson = new ConverterToJson();

        Timer timer = new Timer(); //Time duration
        TimerTask timerTask = new TimerTask()
        {
            @Override
            public void run()
            {
                //Тут идёт запрос в сеть FireBase
            }
        };
        timer.schedule(timerTask, 0, 10000); // 10 seconds between each  iteration

//        CallReceiver callReceiver = new CallReceiver();
//        System.out.println(tryJson.converterToJson(callReceiver.getCallDetails(????));

        Map map = new HashMap(); // Checking the JSON method
        map.put("id",456789);
        map.put("name", "Vasya");
        map.put("number", 45637829);

        System.out.println(tryJson.converterToJson(map));
    }
}
