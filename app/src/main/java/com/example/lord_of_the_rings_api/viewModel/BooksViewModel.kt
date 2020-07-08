package com.example.lord_of_the_rings_api.viewModel

import android.util.Log
import androidx.databinding.CallbackRegistry
import com.example.lord_of_the_rings_api.model.ApiRes
import com.example.lord_of_the_rings_api.network.LotrApi
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class BooksViewModel: BaseViewModel() {

    var osman :String = "Osman Name"
    fun changeOsman(name:String){
        osman = name
    }
    fun getBooks(){

        Companion.ApiServiceBuilder
            .buildService(LotrApi::class.java)
            .getBooksFromApi()
            .enqueue(object :Callback<ApiRes>{
                override fun onFailure(call: Call<ApiRes>, t: Throwable) {

                    Log.d("Response",t.toString())
                }

                override fun onResponse(call: Call<ApiRes>, response: Response<ApiRes>) {

                    if (response.isSuccessful){
                        Log.d("Response",response.body().toString())
                    }
                }
            })
    }



}