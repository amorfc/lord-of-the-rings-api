package com.example.lord_of_the_rings_api.viewModel.chars

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.lord_of_the_rings_api.service.model.Character
import com.example.lord_of_the_rings_api.viewModel.BaseViewModel

class CharDetailsViewModel(character: Character) :BaseViewModel(){

    var selectedCharacter = character

    init {
        Log.i("Info","CharDetailsViewModelCreated")
    }
}