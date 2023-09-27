package com.example.dependencyinjection.ex04_qualifier

import javax.inject.Inject

class ClassA
@Inject
constructor( @TestModule.TestType1 private val bTypeVal1: AInterface,
    @TestModule.TestType2 private val bTypeVal2: AInterface,){

    fun doTest1() : String {
        return bTypeVal1.showString()
    }

    fun doTest2() : String {
        return bTypeVal2.showString()
    }

}