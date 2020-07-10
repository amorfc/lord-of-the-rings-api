package com.example.lord_of_the_rings_api.view.ui.MoviesActivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lord_of_the_rings_api.R
import com.example.lord_of_the_rings_api.service.model.Movie
import com.example.lord_of_the_rings_api.view.BaseActivity
import com.example.lord_of_the_rings_api.view.adapter.MoviesAdapter
import com.example.lord_of_the_rings_api.viewModel.MoviesListViewModel
import kotlinx.android.synthetic.main.activity_movies.*

class MoviesActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movies)

        var moviesListViewModel = ViewModelProvider(this).get(MoviesListViewModel::class.java)
        observeViewModel(moviesListViewModel)
    }
    fun observeViewModel(moviesListViewModel: MoviesListViewModel) {
        moviesListViewModel.getMovieListObservable().observe(this,object : Observer<List<Movie>>{
            override fun onChanged(movies: List<Movie>?) {
                movies?.let {
                    moviesRcy.also {
                        it.layoutManager = LinearLayoutManager(baseContext)
                        it.setHasFixedSize(true)
                        it.adapter = MoviesAdapter(movies)
                    }
                }
            }
        })
    }
}
