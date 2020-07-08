package com.example.lord_of_the_rings_api.network

import com.example.lord_of_the_rings_api.model.Book
import com.example.lord_of_the_rings_api.model.ApiRes
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface LotrApi {

    @GET("book")
    fun getBooksFromApi():Call<ApiRes>

    @GET("book/{book_id}")
    fun getSpecificBook(@Path("book_id") book_id:String):Call<Book>

}