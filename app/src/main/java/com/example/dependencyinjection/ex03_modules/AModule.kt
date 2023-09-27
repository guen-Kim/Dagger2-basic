package com.example.dependencyinjection.ex03_modules

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent


@Module
@InstallIn(ActivityComponent::class)
class AModule {

    @Provides
    fun provideCString(): String {
        return "c String"
    } // String 인스턴스를 생성하는 방법

    @Provides
    fun testProvides(cString: String) : AInterface {
        return ClassB(cString)
    } // AInterface 인스턴스를 구현하는 방법

}