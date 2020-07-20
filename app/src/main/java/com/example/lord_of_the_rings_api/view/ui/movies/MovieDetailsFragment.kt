package com.example.lord_of_the_rings_api.view.ui.movies

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.lord_of_the_rings_api.R
import com.example.lord_of_the_rings_api.databinding.MovieDetailsFragmentBinding
import com.example.lord_of_the_rings_api.viewModel.movie.MovieDetailsViewModel
import com.example.lord_of_the_rings_api.viewModel.movie.MovieDetailsViewModelFactory
import kotlinx.android.synthetic.main.movie_details_fragment.*

class MovieDetailsFragment : Fragment() {

    private lateinit var detailsViewModel: MovieDetailsViewModel
    private lateinit var movieDetailsFragmentBinding: MovieDetailsFragmentBinding
    private lateinit var movieDetailsViewModelFactory: MovieDetailsViewModelFactory

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        movieDetailsFragmentBinding = MovieDetailsFragmentBinding.inflate(inflater,container,false)
        return movieDetailsFragmentBinding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        movieDetailsViewModelFactory = MovieDetailsViewModelFactory(MoviesListFragmentArgs.fromBundle(requireArguments()).selectedMovie)

        detailsViewModel = ViewModelProvider(this,movieDetailsViewModelFactory).get(MovieDetailsViewModel::class.java)
        setPhoto(detailsViewModel.selectedMovie.name)
        movieDetailsFragmentBinding.movieDetailsViewModel = detailsViewModel
    }

    private fun setPhoto(name:String){
        with(name){
            when{
                contains("Lord")-> imageView.setImageResource(R.drawable.rings_series)
                contains("Hobbit")-> imageView.setImageResource(R.drawable.return_of_the_king)
                contains("Unexpected")-> imageView.setImageResource(R.drawable.unexpected)
                contains("Desolation")-> imageView.setImageResource(R.drawable.smaug)
                contains("Battle")-> imageView.setImageResource(R.drawable.fivearmies)
                contains("Two")-> imageView.setImageResource(R.drawable.twotowers)
                contains("Fellowship")-> imageView.setImageResource(R.drawable.fellowship)
                contains("Return")-> imageView.setImageResource(R.drawable.return_of_the_king)
            }

        }
    }

}