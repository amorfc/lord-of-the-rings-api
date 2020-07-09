package com.example.lord_of_the_rings_api.network

import com.example.lord_of_the_rings_api.model.Book
import com.example.lord_of_the_rings_api.model.ApiRes
import com.example.lord_of_the_rings_api.utils.Constants
import retrofit2.Call
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import retrofit2.http.GET
import retrofit2.http.Path

interface WebServiceLotrApi {

    @GET("book")
    fun getAllBooksFromApi():Call<ApiRes>

    @GET("book/{book_id}")
    fun getSpecificBook(@Path("book_id") book_id:String):Call<Book>

}