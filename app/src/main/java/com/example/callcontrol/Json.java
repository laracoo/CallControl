package com.example.callcontrol;

public class Json {
    private String id;
    private String date;
    private String abonent;
    private String incoming;
    private String time;

    public Json(String id, String date, String abonent, Boolean incoming, String time) {
        this.id = id;
        this.date = date;
        this.abonent = abonent;
        this.incoming = incoming.toString();
        this.time = time;
    }
}