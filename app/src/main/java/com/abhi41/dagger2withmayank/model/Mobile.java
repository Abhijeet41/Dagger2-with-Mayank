package com.abhi41.dagger2withmayank.model;

import android.util.Log;

import javax.inject.Inject;

public class Mobile {

    Battery battery;
    private Proccessor proccessor;

    private static final String TAG = "Mobile";

   @Inject
    public Mobile(Battery battery, Proccessor proccessor) {
        this.battery = battery;
        this.proccessor = proccessor;
       Log.d(TAG, "Mobile: ");
    }

    public void run(){
        Log.d(TAG, "run: ");
    }
}
