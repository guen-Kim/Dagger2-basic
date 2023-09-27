package com.example.dependencyinjection.ex04_qualifier

import javax.inject.Inject

class ClassB
@Inject
constructor() : AInterface{
    override fun showString(): String {
        return "First Implementation"
    }

}