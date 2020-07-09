package com.example.lord_of_the_rings_api.service.network

import okhttp3.Interceptor
import okhttp3.Response

class AuthInterceptor (private val token:String):Interceptor{
    override fun intercept(chain: Interceptor.Chain): Response {
        var request = chain.request()
        request = request.newBuilder().header("Authorization","Bearer $token").build()
        return chain.proceed(request)
    }
}