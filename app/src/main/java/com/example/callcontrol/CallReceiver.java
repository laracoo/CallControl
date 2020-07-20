package com.example.callcontrol;

import android.Manifest;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.provider.CallLog;
import android.telephony.TelephonyManager;

import androidx.core.app.ActivityCompat;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class CallReceiver {
    private Map<String, String> getCallDetails(Context context) {

        if (ActivityCompat.checkSelfPermission(context, Manifest.permission.READ_CALL_LOG) != PackageManager.PERMISSION_GRANTED) {
        }
        Cursor managedCursor = context.getContentResolver().query(CallLog.Calls.CONTENT_URI, null, null, null, CallLog.Calls.DATE + " DESC");
        int id = managedCursor.getColumnIndex(CallLog.Calls.PHONE_ACCOUNT_ID);
        int number = managedCursor.getColumnIndex(CallLog.Calls.NUMBER);
        int type = managedCursor.getColumnIndex(CallLog.Calls.TYPE);
        int date = managedCursor.getColumnIndex(CallLog.Calls.DATE);
        int duration = managedCursor.getColumnIndex(CallLog.Calls.DURATION);

        Map<String, String> map = new HashMap<>();
//            String phNumber = managedCursor.getString(number);
//            String callType = managedCursor.getString(type);
//            String callDate = managedCursor.getString(date);
//            String callDayTime = new Date(Long.valueOf(callDate)).toString();
//            String callDuration = managedCursor.getString(duration);
        return map;
    }
}
