package com.example.lord_of_the_rings_api.service.repository

import android.annotation.SuppressLint
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.lord_of_the_rings_api.service.model.MovieModel.ApiResMovie
import com.example.lord_of_the_rings_api.service.model.MovieModel.Movie
import com.example.lord_of_the_rings_api.utils.Constants
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MoviesRepository : BaseRepository() {

    fun getMoviesList():LiveData<List<Movie>>{
        var data = MutableLiveData<List<Movie>>()
        webService.getAllMoviesFromApi().enqueue(object : Callback<ApiResMovie>{
            @SuppressLint("LongLogTag")
            override fun onFailure(call: Call<ApiResMovie>, t: Throwable) {
                Log.e("MoviesList Fetching Something went wrong",t.toString())
            }

            override fun onResponse(call: Call<ApiResMovie>, response: Response<ApiResMovie>) {
                if (response.isSuccessful){
                    Log.e("Success Fetch Api",response.body().toString())
                }
            }
        })
        return  data
    }
}