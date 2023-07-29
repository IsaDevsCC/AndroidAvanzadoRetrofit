package com.example.androidavanzadoretrofit

import android.app.Application
import di.modules.appModule
import org.koin.android.BuildConfig
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level
import org.koin.dsl.module

class ListApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin{
            androidLogger(
                if(BuildConfig.DEBUG) {
                    Level.INFO
                } else {
                    Level.NONE
                }
            )
            androidContext( this@ListApplication )
            modules(appModule)
        }
    }
}