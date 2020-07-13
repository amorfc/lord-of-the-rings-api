package com.example.lord_of_the_rings_api.viewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.example.lord_of_the_rings_api.service.model.Movie
import com.example.lord_of_the_rings_api.service.repository.MoviesRepository
import com.example.lord_of_the_rings_api.view.BaseActivity

class MoviesListViewModel(application: Application) : BaseViewModel(application) {
        var movies : LiveData<List<Movie>>
        init {
            movies = MoviesRepository().getMoviesList()
        }
        fun getMovieListObservable():LiveData<List<Movie>>{
            return movies
        }
}