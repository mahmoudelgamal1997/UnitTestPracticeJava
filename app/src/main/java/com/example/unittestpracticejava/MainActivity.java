package com.example.unittestpracticejava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import com.bumptech.glide.RequestManager;
import com.example.unittestpracticejava.ui.auth.MainViewModel;
import com.example.unittestpracticejava.viewmodels.ViewModelProviderFactory;

import javax.inject.Inject;
import dagger.android.support.DaggerAppCompatActivity;

public class MainActivity extends DaggerAppCompatActivity {

    private MainViewModel mainViewModel;
    @Inject
    ViewModelProviderFactory providerFactory;


    @Inject
    RequestManager requestManager;

    @Inject
    Drawable logo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mainViewModel= ViewModelProviders.of(this,providerFactory).get(MainViewModel.class);

        setImage();

    }


    public void setImage(){
        requestManager.load(logo).into((ImageView)findViewById(R.id.login_logo));
    }
}
