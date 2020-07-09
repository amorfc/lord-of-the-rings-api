package com.example.lord_of_the_rings_api.service.repository.LotrApiService

import com.example.lord_of_the_rings_api.service.model.Book
import com.example.lord_of_the_rings_api.service.model.ApiRes
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface WebServiceLotrApi {

    @GET("book")
    fun getAllBooksFromApi():Call<ApiRes>

    @GET("book/{book_id}")
    fun getSpecificBook(@Path("book_id") book_id:String):Call<Book>

}