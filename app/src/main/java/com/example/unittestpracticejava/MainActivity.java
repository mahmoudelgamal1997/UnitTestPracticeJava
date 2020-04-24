package com.example.unittestpracticejava;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;

import com.example.unittestpracticejava.dagg.AppComponent;
import com.example.unittestpracticejava.dagg.BaseApplication;
import com.example.unittestpracticejava.dagg.CoffeComponent;
import com.example.unittestpracticejava.dagg.Coffee;
import com.example.unittestpracticejava.dagg.DaggerCoffeComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {


    @Inject
    Coffee coffee,coffee2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppComponent component =((BaseApplication)getApplication()).getAppComponent();


        CoffeComponent coffeComponent = DaggerCoffeComponent.builder().Sugar(2).milk(3).appComponent(component).Build();
        coffeComponent.inject(this);

        Log.e("Mahmoudelgaml",coffee.river+"...."+coffee2.river);
        Log.e("Mahmoudelgaml",coffee+"...."+coffee2);



    }



}
