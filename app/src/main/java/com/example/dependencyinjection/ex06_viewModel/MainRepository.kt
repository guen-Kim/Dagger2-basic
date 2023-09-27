package com.example.dependencyinjection.ex06_viewModel

import javax.inject.Inject

class MainRepository {
   @Inject
    constructor(){
        print("Repository")
    }
}