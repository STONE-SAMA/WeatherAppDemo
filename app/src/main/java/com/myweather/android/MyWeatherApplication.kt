package com.myweather.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class MyWeatherApplication: Application() {
    companion object{
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context

        const val TOKEN = "bTD5sBCww2K9UTe0"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}