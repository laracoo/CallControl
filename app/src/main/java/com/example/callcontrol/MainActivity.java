package com.example.callcontrol;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import android.widget.Chronometer;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private DatabaseReference databaseReference;
    private final String CALL_KEY = "Calls";

    Map<String, String> map = new HashMap<>(); // Checking the JSON method


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startService(new Intent(this, MyService.class));


        map.put("id","456789");
        map.put("name", "Vasya");
        map.put("number", "45637829");
    }

    public void onStartService(View view) {
        //String id = databaseReference.getKey();
        //CallReceiver callReceiver = new CallReceiver();
        databaseReference = FirebaseDatabase.getInstance().getReference(CALL_KEY);

        ConverterToJson converterToJson = new ConverterToJson();
       // converterToJson.converterToJson(callReceiver.getCallDetails(this)); // Must to be -->
        databaseReference.push().setValue(converterToJson.converterToJson(map));
    }

    public void onStopService(View view) { // Stop Service
        Intent serviceIntent = new Intent(this, MyService.class);
        stopService(serviceIntent);
    }
}