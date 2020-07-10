package com.example.lord_of_the_rings_api.service.network

import com.example.lord_of_the_rings_api.service.model.Book
import com.example.lord_of_the_rings_api.service.model.ApiResBook
import com.example.lord_of_the_rings_api.service.model.ApiResMovie
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface WebServiceLotrApi {

    @GET("book")
    fun getAllBooksFromApi():Call<ApiResBook>

    @GET("book/{book_id}")
    fun getSpecificBook(@Path("book_id") book_id:String):Call<Book>

    @GET("movie")
    fun getAllMoviesFromApi():Call<ApiResMovie>

}