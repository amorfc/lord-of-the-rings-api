package com.example.lord_of_the_rings_api.service.repository

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
            override fun onFailure(call: Call<ApiResCharacter>, t: Throwable) {
                TODO("Not yet implemented")
            }

            override fun onResponse(
                call: Call<ApiResCharacter>,
                response: Response<ApiResCharacter>
            ) {
                if (response.isSuccessful){
                    data.value = response.body()?.docs
                    Log.e("Response Of CharApi",response.toString())
                }
            }
        })
            return data
    }
}