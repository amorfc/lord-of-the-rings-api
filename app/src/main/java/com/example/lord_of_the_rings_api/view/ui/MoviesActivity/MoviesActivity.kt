package com.example.lord_of_the_rings_api.view.ui.MoviesActivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.lord_of_the_rings_api.R
import com.example.lord_of_the_rings_api.service.repository.MoviesRepository
import com.example.lord_of_the_rings_api.viewModel.MoviesListViewModel

class MoviesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movies)

        var moviesListViewModel = ViewModelProvider(this).get(MoviesListViewModel::class.java)

//observeViewModel(moviesListViewModel)
    }
    fun observeViewModel(){

    }
}