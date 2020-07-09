package com.example.lord_of_the_rings_api.service.network

import com.example.lord_of_the_rings_api.utils.Constants
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiServiceBuilder {
    
    private val client = OkHttpClient.Builder().build()

    private val retrofit = Retrofit
        .Builder()
        .baseUrl(Constants.base_Url)
        .addConverterFactory(GsonConverterFactory.create())
        .client(client)
        .build()
    fun<T> buildService(service:Class<T>):T { return retrofit.create(service) }
}