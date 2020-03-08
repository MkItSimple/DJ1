package com.example.dj1.di;

import com.example.dj1.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {

    @MainScope
    @ContributesAndroidInjector
    abstract MainActivity contributeMainActivity();
}
