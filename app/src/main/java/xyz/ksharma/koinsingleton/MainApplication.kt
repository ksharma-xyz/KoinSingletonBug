package xyz.ksharma.koinsingleton

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(
                repoModule,
                viewModelsModule,
            )
            androidContext(this@MainApplication)
        }
    }
}
