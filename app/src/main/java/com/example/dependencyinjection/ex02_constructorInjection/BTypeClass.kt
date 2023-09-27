package com.example.dependencyinjection.ex02_constructorInjection

import javax.inject.Inject

class BTypeClass
@Inject
constructor() {
    fun test(): String {
        return "test is done"
    }
}