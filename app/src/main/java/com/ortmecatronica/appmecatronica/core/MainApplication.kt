package com.ortmecatronica.appmecatronica.core

import android.app.Application
import com.ortmecatronica.appmecatronica.areasFeature.di.areaModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

//@HiltAndroidApp
class MainApplication : Application(){

    override fun onCreate() {
        super.onCreate()
        // Start Koin
        startKoin{
            androidLogger()
            androidContext(this@MainApplication)
            modules(areaModule)
        }
    }
}