package com.example.lord_of_the_rings_api.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.lord_of_the_rings_api.model.Book
import com.example.lord_of_the_rings_api.repository.LotrRepository


class BooksViewModel(private val repository: LotrRepository): ViewModel() {

    private var _books = MutableLiveData<List<Book>>()

    val books:LiveData<List<Book>>
        get() = _books

    suspend fun getAllBooks(){

        val books = repository.getAllBooks().docs
        _books.value = books
    }

}