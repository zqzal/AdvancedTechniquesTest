package com.xuxi.advancedtechniquestest;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyApplication.getContext();//全局获取Context的机制

        AlarmManager manager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
        long triggerAtTime = SystemClock.elapsedRealtime() + 10*1000;
//        manager.set(AlarmManager.ELAPSED_REALTIME_WAKEUP,triggerAtTime, PendingIntent.readPendingIntentOrNullFromParcel());
    }
}
