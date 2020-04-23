package com.example.unittestpracticejava.dagg;

import android.util.Log;

import javax.inject.Inject;

import dagger.Provides;


public class River {

    public River()
    {
        Log.e("mahmoud","River");
    }

    public String getWater(){
        return "Water" ;
    }
}
