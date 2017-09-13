package com.bwie.busapp.eventbus;

/**
 * Created by liqy on 2017/9/13.
 */

public class HomeMessageEvent {

    public String vCode;

    public HomeMessageEvent() {
    }

    public HomeMessageEvent(String vCode) {
        this.vCode = vCode;
    }
}
