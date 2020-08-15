package com.example.cleanarchitecture.di


import com.example.cleanarchitecture.di.auth.AuthFragmentBuildersModule
import com.example.cleanarchitecture.di.auth.AuthModule
import com.example.cleanarchitecture.di.auth.AuthScope
import com.example.cleanarchitecture.di.auth.AuthViewModelModule
import com.example.cleanarchitecture.ui.auth.AuthActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuildersModule {

    @AuthScope
    @ContributesAndroidInjector(
        modules = [AuthModule::class, AuthFragmentBuildersModule::class, AuthViewModelModule::class]
    )
    abstract fun contributeAuthActivity(): AuthActivity

}