package com.example.dagger3.dependencyInjection

import com.example.dagger3.userInterface.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface ApplicationModule {

    @ContributesAndroidInjector
    fun contributeMainActivity(): MainActivity

}