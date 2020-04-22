package com.example.unittestpracticejava.dagg;

import androidx.lifecycle.ViewModelProvider;

import com.example.unittestpracticejava.viewmodels.ViewModelProviderFactory;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class ViewModelFactoryModule {

    @Binds
    public abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelProviderFactory viewModelProviderFactory);





}
