package com.abhi41.dagger2withmayank.component;

import com.abhi41.dagger2withmayank.MainActivity;
import com.abhi41.dagger2withmayank.model.Mobile;

import javax.inject.Inject;

import dagger.Component;

@Component
public interface MobileComponent {


    Mobile getMobile();

    //void inject(MainActivity mainActivity);

}
