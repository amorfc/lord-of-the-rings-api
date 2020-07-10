package com.example.lord_of_the_rings_api.view.ui.movies

import android.os.Bundle
import com.example.lord_of_the_rings_api.R
import com.example.lord_of_the_rings_api.view.BaseActivity

class MoviesActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movies)

        //var moviesListViewModel = ViewModelProvider(this).get(MoviesListViewModel::class.java)
        //observeViewModel(moviesListViewModel)
    }
    /*

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
    * */

}
