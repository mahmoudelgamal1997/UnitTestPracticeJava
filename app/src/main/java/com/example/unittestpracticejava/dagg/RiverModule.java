package com.example.unittestpracticejava.dagg;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class RiverModule {

    @Singleton
    @Provides
    public River provideRiver(){
        return new River();

    }


}
