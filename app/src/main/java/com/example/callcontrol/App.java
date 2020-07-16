package com.example.callcontrol;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;

import androidx.annotation.RequiresApi;

public class App extends Application {
    public static final String CHANNEL_ID = "Channel";

    @Override
    public void onCreate() {
        super.onCreate();


    }
    @RequiresApi(api = Build.VERSION_CODES.O) //API upper than 26
    private void createNotificationChannel() {
        if(Build.VERSION.SDK_INT >+ Build.VERSION_CODES.O) {
            NotificationChannel serviceChannel = new NotificationChannel(
                    CHANNEL_ID,
                    "My Service Channel",
                    NotificationManager.IMPORTANCE_DEFAULT
            );

            NotificationManager manager = getSystemService(NotificationManager.class);
            manager.createNotificationChannel(serviceChannel);
        }
    }
}
