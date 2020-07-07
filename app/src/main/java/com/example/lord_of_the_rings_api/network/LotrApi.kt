package com.example.lord_of_the_rings_api.network

import com.example.lord_of_the_rings_api.network.models.Book
import com.example.lord_of_the_rings_api.network.models.BookModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface LotrApi {
    @GET("book")
    fun getBooks():Call<BookModel>

    @GET("book/{book_id}")
    fun getSpecificBook(@Path("book_id") book_id:String):Call<Book>
}