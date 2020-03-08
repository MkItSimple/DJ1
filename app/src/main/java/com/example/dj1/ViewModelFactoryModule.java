package com.example.dj1;

import androidx.lifecycle.ViewModelProvider;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;


@Module
public abstract class ViewModelFactoryModule {

    @Singleton
    @Binds
    public abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelProviderFactory viewModelFactory);

}
