package com.example.lord_of_the_rings_api.viewModel.movie

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.lord_of_the_rings_api.service.model.Movie

class MovieDetailsViewModelFactory(private val selectedMovie : Movie) :ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MovieDetailsViewModel::class.java)){
            return MovieDetailsViewModel(selectedMovie) as T
        }
        throw IllegalAccessException("Unknown Class Model")
    }
}