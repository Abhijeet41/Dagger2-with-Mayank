package com.abhi41.dagger2withmayank;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.abhi41.dagger2withmayank.component.DaggerMobileComponent;
import com.abhi41.dagger2withmayank.component.MobileComponent;
import com.abhi41.dagger2withmayank.model.Mobile;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileComponent component = DaggerMobileComponent.create();
        Mobile mobile = component.getMobile();
        mobile.run();
    }


}