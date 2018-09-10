package com.android.componentsofandroid;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.widget.Toast;

public class standUpAlarm extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "inside Reciever", Toast.LENGTH_SHORT).show();
        NotificationManagerCompat mymanager = NotificationManagerCompat.from(context);
        NotificationCompat.Builder mynoti = new NotificationCompat.Builder(context);
        mynoti.setSmallIcon(android.R.drawable.ic_btn_speak_now);
        mynoti.setContentTitle("StandUp Notification");
        mynoti.setContentText("AlarmStarted Please Stand up");

        Intent i = new Intent(context,BR_Activity.class);
        PendingIntent pd = PendingIntent.getActivity(context,0,i,0);

        mynoti.setContentIntent(pd);
        mynoti.setAutoCancel(true);
        mymanager.notify(0,mynoti.build());
    }
}
