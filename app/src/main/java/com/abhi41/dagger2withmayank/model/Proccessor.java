package com.abhi41.dagger2withmayank.model;

import android.util.Log;

import javax.inject.Inject;

public class Proccessor {
    private static final String TAG = "Proccessor";


    @Inject
    public Proccessor() {
        Log.d(TAG, "Proccessor: ");
    }
}
