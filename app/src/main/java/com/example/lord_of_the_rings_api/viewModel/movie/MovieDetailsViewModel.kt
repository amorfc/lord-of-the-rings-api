package com.example.lord_of_the_rings_api.viewModel.movie

import android.util.Log
import com.example.lord_of_the_rings_api.service.model.Movie
import com.example.lord_of_the_rings_api.viewModel.BaseViewModel

class MovieDetailsViewModel(movie: Movie) :BaseViewModel(){

    var selectedMovie :Movie = movie

    init {
        Log.i("Info","MoviesDetailsViewModelCreated")
    }
}