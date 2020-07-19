package com.example.lord_of_the_rings_api.viewModel

import android.util.Log
import androidx.lifecycle.LiveData
import com.example.lord_of_the_rings_api.service.model.Movie
import com.example.lord_of_the_rings_api.service.repository.MoviesRepository

class MoviesListViewModel() : BaseViewModel() {

    private var movies : LiveData<List<Movie>> = MoviesRepository().getMoviesList()

    fun getMovieListObservable():LiveData<List<Movie>>{
            return movies
        }

    override fun onCleared() {
        super.onCleared()
        Log.i("MoviesListViewModel", "MoviesListViewModel destroyed!")
    }
    init {
        Log.i("Info","MoviesListViewModel Created")
    }
}