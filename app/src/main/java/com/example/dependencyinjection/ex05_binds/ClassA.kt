package com.example.dependencyinjection.ex05_binds

import javax.inject.Inject

class ClassA
@Inject
constructor(private val classB: AInterface){
    fun doTestA(): String {
        return classB.showString()
    }
}