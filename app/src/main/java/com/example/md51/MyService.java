package com.example.md51;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {

    final String TAG = "New_Log";

    @Override
    public void onCreate() {
        Log.d(TAG, "MyService onCreate()");
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d(TAG, "MyService onStartCommand()");
        return super.onStartCommand(intent, flags, startId);
    }
    @Override
    public void onDestroy() {
        Log.d(TAG, "MyService onDestroy()");
        super.onDestroy();
    }

    @Override
    public IBinder onBind(Intent intent) {
        Log.d(TAG, "MyService onBind()");
        return null;
    }

    public boolean onUnbind(Intent intent) {
        Log.d(TAG, "MyService onUnbind()");
        return super.onUnbind(intent);
    }

}