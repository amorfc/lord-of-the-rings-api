package com.example.lord_of_the_rings_api.network

import retrofit2.Response
import java.io.IOException


abstract class SafeApiRequest{

     fun <T:Any> apiRequest(call: () -> Response<T>):T{
        val response = call.invoke()
        if(response.isSuccessful){
            return response.body()!!
        }else{
            throw ApiException(response.code().toString())
        }
    }
}

class ApiException(message : String):IOException(message)