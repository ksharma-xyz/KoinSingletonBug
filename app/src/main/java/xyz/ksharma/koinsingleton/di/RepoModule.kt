package xyz.ksharma.koinsingleton.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import xyz.ksharma.koinsingleton.RealRepository
import xyz.ksharma.koinsingleton.Repository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepoModule {

    @Singleton
    @Binds
    abstract fun bindRepository(impl: RealRepository): Repository
}
