package com.bwie.busapp.rxbus;

import com.hwangjr.rxbus.Bus;

public final class RxBus {
    private static Bus sBus;

    public static Bus get() {
        if (sBus == null) {
            synchronized (RxBus.class) {
                if (sBus == null) {
                    sBus = new Bus();
                }
            }
        }
        return sBus;
    }
}
