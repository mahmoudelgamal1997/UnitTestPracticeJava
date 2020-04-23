package com.example.unittestpracticejava;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import com.example.unittestpracticejava.dagg.BaseApplication;
import com.example.unittestpracticejava.dagg.CoffeComponent;
import com.example.unittestpracticejava.dagg.Coffee;
import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {


    @Inject
    Coffee coffee,coffee2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CoffeComponent component =((BaseApplication)getApplication()).getCoffeComponent();

        component.inject(this);
        Log.e("Mahmoudelgaml",coffee.river+"...."+coffee2.river);




    }



}
