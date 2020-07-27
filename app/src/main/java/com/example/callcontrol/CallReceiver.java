package com.example.callcontrol;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.CallLog;
import java.util.HashMap;
import java.util.Map;

import static com.example.callcontrol.Test.usersId;

public class CallReceiver {
    public CallReceiver() {}

    public Map<String, String> getCallDetails(Context context) {

        Uri allCalls = Uri.parse("content://call_log/calls");
        //Retrieving all contact details
        Cursor managedCursor = context.getContentResolver().query(allCalls, null, null, null, CallLog.Calls.DATE + " DESC");
        int id = managedCursor.getColumnIndex(CallLog.Calls.PHONE_ACCOUNT_ID);
        int number = managedCursor.getColumnIndex(CallLog.Calls.NUMBER);
        int workNumber = managedCursor.getColumnIndex(CallLog.Calls.VIA_NUMBER);
        int type = managedCursor.getColumnIndex(CallLog.Calls.TYPE);
        int date = managedCursor.getColumnIndex(CallLog.Calls.DATE);
        int duration = managedCursor.getColumnIndex(CallLog.Calls.DURATION);

            if (!usersId.contains(id)) { // Checking the content of the same ID in the list
                usersId.add(id);
        }

        Map map = new HashMap<>();

        Boolean isIncoming = managedCursor.getString(type).equals("incoming");
        // Forming a Map for translation into JSON
            map.put("id", id);
            map.put("data", date);
            map.put("phone", number);
            map.put("abonent", workNumber);
            map.put("type", isIncoming);
            map.put("time", duration);

        return map;
    }
}
