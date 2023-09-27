package com.example.dependencyinjection.ex01_fieldInjection

import javax.inject.Inject


class AnalyticsAdapter {

    val a = "ok"
    @Inject
    constructor(){
        print("Ddddddddddd")
    }



}