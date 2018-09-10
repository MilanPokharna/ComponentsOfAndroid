package com.android.componentsofandroid;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BR_Activity extends AppCompatActivity {
    AlarmManager alarmManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_br_);
    }

    public void click(View view) {
        Intent i = new Intent();
        i.setAction("com.milan.ownreciever");
        i.addCategory("android.intent.category.DEFAULT");
        sendBroadcast(i);
    }

    public void startservice(View view) {
        Intent i = new Intent(this,MyService.class);
        startService(i);
    }

    public void stopservice(View view) {
        Intent i = new Intent(this,MyService.class);
        stopService(i);
    }

    public void openNotification(View view) {
        NotificationManagerCompat myManager = NotificationManagerCompat.from(this);
        NotificationCompat.Builder noti = new NotificationCompat.Builder(this);
        noti.setAutoCancel(true);
        noti.setContentTitle("1 new message");
        noti.setContentText("hey how are you?");
        noti.setSmallIcon(android.R.drawable.ic_btn_speak_now);

        Intent i = new Intent(this,BR_Activity.class);
        PendingIntent pd = PendingIntent.getActivity(this,1,i,0);

        noti.setContentIntent(pd);
        myManager.notify(1,noti.build());
    }

    public void startAlarm(View view) {

    }

    public void stopAlarm(View view) {

    }
}
