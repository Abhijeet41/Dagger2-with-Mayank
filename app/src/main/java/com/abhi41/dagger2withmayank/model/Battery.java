package com.abhi41.dagger2withmayank.model;

import android.util.Log;

import javax.inject.Inject;

public class Battery {

    private static final String TAG = "Battery";


    @Inject
    public Battery() {
        Log.d(TAG, "Battery: ");
    }
    
}
