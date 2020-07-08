package com.example.lord_of_the_rings_api.repository

import com.example.lord_of_the_rings_api.model.ApiRes
import com.example.lord_of_the_rings_api.network.LotrApi
import com.example.lord_of_the_rings_api.network.SafeApiRequest

class LotrRepository(
        private val api: LotrApi
    ):SafeApiRequest(){

    suspend fun getAllBooks(): ApiRes = apiRequest { api.getAllBooksFromApi() }

}