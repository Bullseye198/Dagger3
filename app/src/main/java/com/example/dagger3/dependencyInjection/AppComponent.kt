package com.example.dagger3.dependencyInjection

import android.content.Context
import com.example.dagger3.MyApplication
import com.example.data.injection.DataModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        ApplicationModule::class,
        ViewModelModule::class,
        AndroidInjectionModule::class,
        DataModule::class
    ]
)

interface AppComponent: AndroidInjector<MyApplication> {
    @Component.Factory
    interface Factory {
        fun create(@BindsInstance applicationContext: Context): AppComponent
    }
}