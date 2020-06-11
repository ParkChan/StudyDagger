package com.chan

import android.app.Application
import com.chan.common.di.DaggerHomeComponent
import com.chan.common.di.HomeComponent
import com.orhanobut.logger.AndroidLogAdapter
import com.orhanobut.logger.Logger

open class MyApplication : Application() {

    val homeComponent: HomeComponent by lazy {
        DaggerHomeComponent.factory().create(applicationContext)
    }

    override fun onCreate() {
        super.onCreate()
        Logger.addLogAdapter(object : AndroidLogAdapter() {
            override fun isLoggable(priority: Int, tag: String?): Boolean {
                return BuildConfig.DEBUG
            }
        })
    }
}