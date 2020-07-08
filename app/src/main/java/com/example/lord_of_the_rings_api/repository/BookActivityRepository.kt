package com.example.lord_of_the_rings_api.repository

import com.example.lord_of_the_rings_api.network.LotrApi
import com.example.lord_of_the_rings_api.network.SafeApiRequest

class BookActivityRepository(
    private val api:LotrApi
):SafeApiRequest(){
    suspend fun getMovies()= apiRequest { api.getBooks() }
}