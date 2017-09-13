package com.bwie.busapp;

import android.app.Application;

import org.greenrobot.eventbus.EventBus;

/**
 * Created by liqy on 2017/9/13.
 */

public class App extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        EventBus.builder().addIndex(new MyEventBusIndex()).installDefaultEventBus();
        EventBus eventBus = EventBus.getDefault();
    }
}
