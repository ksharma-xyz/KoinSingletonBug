package xyz.ksharma.koinsingleton

import android.util.Log
import org.koin.dsl.module

interface Repository {
    fun doWork()
}

class RealRepository : Repository {

    init {
        Log.d("RealRepository", "instance: $this")
    }

    override fun doWork() {
        Log.d("RealRepository", "Doing work")
    }
}

val repoModule = module {
    single<Repository> { RealRepository() }
}
