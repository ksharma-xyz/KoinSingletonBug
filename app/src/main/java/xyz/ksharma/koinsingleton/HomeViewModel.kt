package xyz.ksharma.koinsingleton

import androidx.lifecycle.ViewModel

class HomeViewModel(private val repository: Repository) : ViewModel() {
    init {
        repository.doWork()
    }
}

class DetailViewModel(private val repository: Repository): ViewModel() {
    init {
        repository.doWork()
    }
}
