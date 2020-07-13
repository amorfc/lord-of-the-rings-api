package com.example.lord_of_the_rings_api.viewModel

import android.app.Application
import androidx.lifecycle.LiveData
import com.example.lord_of_the_rings_api.service.model.Character
import com.example.lord_of_the_rings_api.service.repository.CharactersRepository

class CharsListViewModel(application: Application) : BaseViewModel(application) {

    private var characters : LiveData<List<Character>> = CharactersRepository().getCharactersList()

    fun getMovieListObserver():LiveData<List<Character>>{
        return characters
    }
}