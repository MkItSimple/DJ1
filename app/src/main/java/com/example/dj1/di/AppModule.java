package com.example.dj1.di;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    @Singleton
    @Provides
    @Named("get_first_name")
    String getFirstName(){
        return "Choreyn";
    }
}
