package com.example.lord_of_the_rings_api.viewModel.chars

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.lord_of_the_rings_api.service.model.Character

class CharDetailsViewModelFactory(private val selectedChar: Character):ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(CharDetailsViewModel::class.java)){
            return CharDetailsViewModel(selectedChar) as T
        }
        throw IllegalAccessException("Unknown Model Class")
    }
}