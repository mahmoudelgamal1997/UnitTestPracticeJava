package com.example.unittestpracticejava.dagg;

import android.app.Application;

public class BaseApplication extends Application {
   private CoffeComponent coffeComponent;

    @Override
    public void onCreate() {
        super.onCreate();

         coffeComponent = DaggerCoffeComponent.builder().Sugar(3).milk(5).Build();
    }

    public CoffeComponent getCoffeComponent(){
        return coffeComponent;
    }
}
