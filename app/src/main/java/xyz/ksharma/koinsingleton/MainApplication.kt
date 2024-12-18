package xyz.ksharma.koinsingleton

import android.app.Application

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        instance = this
    }

    companion object {
        var instance: Application? = null
    }
}
