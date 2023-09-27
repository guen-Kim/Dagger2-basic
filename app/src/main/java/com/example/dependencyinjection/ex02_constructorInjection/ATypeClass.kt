package com.example.dependencyinjection.ex02_constructorInjection

import javax.inject.Inject

class ATypeClass
@Inject
constructor(private val bTypeClass: BTypeClass) {
    fun doBtypeTest(): String {
        return bTypeClass.test()
    }
}