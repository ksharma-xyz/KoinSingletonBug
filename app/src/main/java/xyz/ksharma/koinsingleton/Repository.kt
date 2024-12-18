package xyz.ksharma.koinsingleton

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

interface Repository {
    fun doWork(screenName: String)
}

@Singleton
class RealRepository @Inject constructor() : Repository {

    init {
        Log.d("RealRepository", "instance: $this")
    }

    override fun doWork(screenName: String) {
        Log.d("RealRepository", "$this is doing work for $screenName")
    }
}
