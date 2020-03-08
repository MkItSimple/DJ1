package com.example.dj1.di;

import com.example.dj1.di.auth.AuthModule;
import com.example.dj1.di.auth.AuthViewModelsModule;
import com.example.dj1.di.main.MainScope;
import com.example.dj1.ui.AuthActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {

    @MainScope
    @ContributesAndroidInjector(modules = {AuthViewModelsModule.class, AuthModule.class})
    abstract AuthActivity contributeMainActivity();
}
