package com.example.lord_of_the_rings_api.viewModel

import android.util.Log
import androidx.lifecycle.LiveData
import com.example.lord_of_the_rings_api.service.model.Character
import com.example.lord_of_the_rings_api.service.repository.CharactersRepository

class CharsListViewModel() : BaseViewModel() {

    private var characters : LiveData<List<Character>> = CharactersRepository().getCharactersList()

    fun getMovieListObserver():LiveData<List<Character>>{
        return characters
    }

    override fun onCleared() {
        super.onCleared()
        Log.i("CharsListViewModel", "CharsListViewModel destroyed!")
    }
    init {
        Log.i("Info","CharsListViewModel Created")
    }
}