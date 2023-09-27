package com.example.dependencyinjection

import dagger.Component
import dagger.Provides

@Component(modules = [MyModule::class])
interface MyComponent {
    fun getString(): String
}