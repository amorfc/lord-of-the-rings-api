package com.example.lord_of_the_rings_api

import android.app.Application
import timber.log.Timber

class LotrAppApplication: Application() {
    override fun onCreate() {
        super.onCreate()

        Timber.plant(Timber.DebugTree())
    }
}