package com.example.dependencyinjection.ex06_viewModel

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class MainViewModel @Inject
constructor( private val savedStateHandle: SavedStateHandle,
             private val mainRepository: MainRepository
): ViewModel(){

}