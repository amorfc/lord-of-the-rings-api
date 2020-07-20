package com.example.lord_of_the_rings_api.view.ui.movies

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lord_of_the_rings_api.R
import com.example.lord_of_the_rings_api.service.model.Movie
import com.example.lord_of_the_rings_api.view.adapter.MoviesAdapter
import com.example.lord_of_the_rings_api.viewModel.movie.MoviesListViewModel
import kotlinx.android.synthetic.main.movies_list_fragment.*

class MoviesListFragment : Fragment() {

    companion object {
        fun newInstance() = MoviesListFragment()
    }

    private lateinit var moviesListViewModel: MoviesListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.movies_list_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        moviesListViewModel = ViewModelProvider(this).get(MoviesListViewModel::class.java)
        observeViewModel(moviesListViewModel)
    }

    fun observeViewModel(moviesListViewModel: MoviesListViewModel) {

        moviesListViewModel.getMovieListObservable().observe(viewLifecycleOwner,object :Observer<List<Movie>> {

            override fun onChanged(moviesList: List<Movie>?) {
                moviesList?.let {
                    moviesRecyclerView.also {
                        it.layoutManager = LinearLayoutManager(context)
                        it.setHasFixedSize(true)
                        it.adapter = MoviesAdapter(moviesList)
                    }
                }
            }
        })
    }
}