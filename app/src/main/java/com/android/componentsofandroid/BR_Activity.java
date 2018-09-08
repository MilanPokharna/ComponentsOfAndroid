package com.android.componentsofandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BR_Activity extends AppCompatActivity {

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

    public void doSomething(View view) {

    }
}
