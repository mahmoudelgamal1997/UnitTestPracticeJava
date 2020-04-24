package com.example.unittestpracticejava.dagg;

import android.app.Application;

public class BaseApplication extends Application {
   private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

         appComponent=DaggerAppComponent.create();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
