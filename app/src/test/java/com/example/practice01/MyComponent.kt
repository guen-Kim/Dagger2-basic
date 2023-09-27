package com.example.practice01

import dagger.Component
import dagger.Provides

@Component(modules = [MyModule::class])
interface MyComponent {
    fun getString(): String
}