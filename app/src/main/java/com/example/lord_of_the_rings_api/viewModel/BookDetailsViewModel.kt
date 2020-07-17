package com.example.lord_of_the_rings_api.viewModel

import android.app.Application
import androidx.lifecycle.LiveData
import com.example.lord_of_the_rings_api.service.model.Book
import com.example.lord_of_the_rings_api.service.repository.BooksRepository

class BookDetailsViewModel :BaseViewModel() {

    private var selectedBook : LiveData<Book> = BooksRepository().getSelectedBooks()

    fun getSelectedBook():LiveData<Book>{
        return selectedBook
    }
}