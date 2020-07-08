package com.example.lord_of_the_rings_api.repository

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.lord_of_the_rings_api.model.ApiRes
import com.example.lord_of_the_rings_api.model.Book
import com.example.lord_of_the_rings_api.network.ApiServiceBuilder
import com.example.lord_of_the_rings_api.network.WebServiceLotrApi
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class BooksRepository {
    private val  webService: WebServiceLotrApi = ApiServiceBuilder.buildService(WebServiceLotrApi::class.java)

    fun getAllBooksRes():LiveData<List<Book>>{
        val data = MutableLiveData<List<Book>>()
        webService.getAllBooksFromApi().enqueue(object :Callback<ApiRes>{
            override fun onFailure(call: Call<ApiRes>, t: Throwable) {

                Log.e("Something Went Wrong",t.toString())
            }

            override fun onResponse(call: Call<ApiRes>, response: Response<ApiRes>) {
                if (response.isSuccessful){
                    data.value = response.body()!!.docs
                }
            }

        })
        return data
    }
}