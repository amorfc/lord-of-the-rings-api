package com.example.lord_of_the_rings_api.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.lord_of_the_rings_api.R
import com.example.lord_of_the_rings_api.databinding.MoviesRecyclerViewItemBinding
import com.example.lord_of_the_rings_api.service.model.Movie
import kotlinx.android.synthetic.main.movies_recycler_view_item.view.*

class MoviesAdapter(private val moviesList: List<Movie> ) : RecyclerView.Adapter<MoviesAdapter.MoviesViewHolder>() {

    inner class MoviesViewHolder (
            val moviesRecyclerViewItemBinding: MoviesRecyclerViewItemBinding
    ):RecyclerView.ViewHolder(moviesRecyclerViewItemBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup,viewType: Int) =
        MoviesViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.movies_recycler_view_item,
                parent,
                false
            )
        )



    override fun onBindViewHolder(holder: MoviesAdapter.MoviesViewHolder, position: Int) {
        holder.moviesRecyclerViewItemBinding.movie = moviesList[position]
    }
    override fun getItemCount() = moviesList.size
}
