package com.example.dependencyinjection.ex03_modules

import javax.inject.Inject

class ClassA
@Inject
constructor(private val classB: AInterface){
    fun doTestA(): String {
        return classB.showString()
    }
}