package com.example.lord_of_the_rings_api.service.repository

import android.annotation.SuppressLint
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.lord_of_the_rings_api.service.model.ApiResCharacter
import com.example.lord_of_the_rings_api.service.model.Character
import com.example.lord_of_the_rings_api.service.network.WebServiceLotrApi
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CharactersRepository :BaseRepository(){

    fun getCharactersList():LiveData<List<Character>> {
         var data = MutableLiveData<List<Character>>()

        webService.getAllCharacterFromApi().enqueue(object : Callback<ApiResCharacter> {
            @SuppressLint("LongLogTag")
            override fun onFailure(call: Call<ApiResCharacter>, t: Throwable) {
                Log.e("CharsList Fetching Something Went Wrong",t.toString())            }

            override fun onResponse(
                call: Call<ApiResCharacter>,
                response: Response<ApiResCharacter>
            ) {
                if (response.isSuccessful){
                    data.value = response.body()?.docs
                    Log.i("Response Of CharApi",response.toString())
                }
            }
        })
            return data
    }
}