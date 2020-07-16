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

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startService(new Intent(this, MyService.class));

    }

    public void onStartService(View view) {
        Intent serviceIntent = new Intent(this, MyService.class);
        serviceIntent.putExtra("inputextra", "App is running");

        ContextCompat.startForegroundService(this, serviceIntent);
    }

    public void onStopService(View view) {
        Intent serviceIntent = new Intent(this, MyService.class);
        stopService(serviceIntent);
    }
}