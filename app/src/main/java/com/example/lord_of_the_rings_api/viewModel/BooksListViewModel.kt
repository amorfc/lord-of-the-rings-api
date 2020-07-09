package com.example.lord_of_the_rings_api.viewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.example.lord_of_the_rings_api.model.Book
import com.example.lord_of_the_rings_api.repository.BooksRepository


class BooksListViewModel(application: Application) : AndroidViewModel(application) {

        var _books  : LiveData<List<Book>> = BooksRepository().getBooksList()
        fun getBooksListObservable(): LiveData<List<Book>>{
                return _books
        }
}