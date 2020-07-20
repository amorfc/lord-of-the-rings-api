package com.example.lord_of_the_rings_api.viewModel.books

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.lord_of_the_rings_api.service.model.Book

class BookDetailsViewModelFactory(private val selectedBook: Book) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(BookDetailsViewModel::class.java)){
            return BookDetailsViewModel(selectedBook) as T
        }
        throw IllegalAccessException("Unkknow Model Class")
    }
}