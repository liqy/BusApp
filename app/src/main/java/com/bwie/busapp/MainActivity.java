package com.bwie.busapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.bwie.busapp.eventbus.HomeMessageEvent;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

public class MainActivity extends BaseActivity {

    TextView hello;
    TextView sendHello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hello = (TextView) findViewById(R.id.hello);
        sendHello = (TextView) findViewById(R.id.sendHello);

        hello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EventBus.getDefault().postSticky(new HomeMessageEvent("2.0.1"));
                EventBus.getDefault().postSticky(new HomeMessageEvent("2.0.2"));
            }
        });

        sendHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Main2Activity.class));
            }
        });
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onUpdateEvent(HomeMessageEvent event) {
        /* Do something */
        if (event != null) {
            Toast.makeText(this, event.vCode, Toast.LENGTH_SHORT).show();
        }
    }

    ;


}
