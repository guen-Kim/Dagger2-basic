package com.example.dependencyinjection.ex07_ApplicationContext

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class TestModule {
    @Singleton
    @Provides
    fun provideTest(@ApplicationContext appContext: Context) : Test {
        return Test(appContext)
    }

}