package com.example.cleanarchitecture.di

import androidx.lifecycle.ViewModelProvider
import com.example.cleanarchitecture.viewmodel.ViewModelProviderFactory
import dagger.Binds
import dagger.Module

@Module
abstract class ViewModelFactoryModule {

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelProviderFactory): ViewModelProvider.Factory
}