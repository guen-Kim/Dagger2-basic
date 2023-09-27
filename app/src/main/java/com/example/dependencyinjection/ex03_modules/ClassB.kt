package com.example.dependencyinjection.ex03_modules

import javax.inject.Inject

class ClassB
@Inject
constructor(private val cDependency: String): AInterface{
    override fun showString(): String {
        return "get Go ${cDependency}"
    }

}