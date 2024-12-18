package xyz.ksharma.koinsingleton

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val repository: Repository) : ViewModel() {

    fun doWork() {
        repository.doWork("Home")
    }
}

@HiltViewModel
class DetailViewModel @Inject constructor(private val repository: Repository) : ViewModel() {
    fun doWork() {
        repository.doWork("Detail")
    }
}
