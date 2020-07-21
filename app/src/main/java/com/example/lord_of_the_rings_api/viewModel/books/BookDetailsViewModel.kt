package com.example.lord_of_the_rings_api.viewModel.books

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.lord_of_the_rings_api.service.model.Book
import com.example.lord_of_the_rings_api.viewModel.BaseViewModel

class BookDetailsViewModel(book: Book) :BaseViewModel() {

    var selectedBook :Book = book


    init {
        Log.i("Info","BookDetailsViewModelCreated")
    }

}