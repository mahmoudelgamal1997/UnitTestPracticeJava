package com.example.unittestpracticejava;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.example.unittestpracticejava.dagg.CoffeComponent;
import com.example.unittestpracticejava.dagg.Coffee;
import com.example.unittestpracticejava.dagg.DaggerAppComponent;
import com.example.unittestpracticejava.dagg.DaggerCoffeComponent;
import com.example.unittestpracticejava.ui.auth.MainViewModel;

import javax.inject.Inject;
import dagger.android.support.DaggerAppCompatActivity;

public class MainActivity extends AppCompatActivity {

   /*
    @Inject
    ViewModelProviderFactory providerFactory;


    @Inject
    RequestManager requestManager;

    @Inject
    Drawable logo;
    */
   @Inject
   Coffee coffee;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CoffeComponent component= DaggerCoffeComponent.create();
        component.inject(this);
        Log.e("Mahmoudelgaml",coffee.getCofeeCup());

//        mainViewModel= ViewModelProviders.of(this,providerFactory).get(MainViewModel.class);

      //  CoffeComponent coffeMaker= DaggerAppComponent.builder().



     //   setImage();

    }


    public void setImage(){
  //      requestManager.load(logo).into((ImageView)findViewById(R.id.login_logo));
    }
}
