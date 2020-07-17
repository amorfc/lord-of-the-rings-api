package com.example.lord_of_the_rings_api.service.repository

import com.example.lord_of_the_rings_api.service.network.ApiServiceBuilder
import com.example.lord_of_the_rings_api.service.network.WebServiceLotrApi

open class BaseRepository {

    protected val  webService: WebServiceLotrApi = ApiServiceBuilder.buildService(
        WebServiceLotrApi::class.java)
}