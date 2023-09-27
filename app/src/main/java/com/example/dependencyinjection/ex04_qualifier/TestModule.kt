package com.example.dependencyinjection.ex04_qualifier

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Qualifier

@InstallIn(SingletonComponent::class)
@Module

object TestModule {
    @Qualifier
    @Retention(AnnotationRetention.BINARY)
    annotation class TestType1

    @Qualifier
    @Retention(AnnotationRetention.BINARY)
    annotation class TestType2


    @TestType1
    @Provides
     fun testProvides1(): AInterface {
        return ClassC()
    }

    @TestType2
    @Provides
    fun testProvides2(): AInterface {
        return ClassB()
    }

}