package com.example.dependencyinjection.ex04_qualifier

import javax.inject.Inject

class ClassC
@Inject
constructor(): AInterface{
    override fun showString(): String {
        return "Second Implementation"
    }
}