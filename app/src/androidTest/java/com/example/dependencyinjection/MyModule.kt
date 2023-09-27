package com.example.dependencyinjection

import dagger.Module
import dagger.Provides


@Module
class MyModule {
    @Provides
    fun  providerHellowerld() : String {
        return "Hello World"
    }
}



