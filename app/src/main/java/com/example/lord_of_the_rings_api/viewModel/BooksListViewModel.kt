package com.example.lord_of_the_rings_api.viewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.lord_of_the_rings_api.service.model.Book
import com.example.lord_of_the_rings_api.service.repository.BooksRepository


class BooksListViewModel() : BaseViewModel() {

        var books  : LiveData<List<Book>> = BooksRepository().getBooksList()

        private val selected = MutableLiveData<Book>()

        fun select(book: Book) {
                selected.value = book
        }

        fun getSelectedObservable(): LiveData<Book>{
                return selected
        }

        fun getBooksListObservable(): LiveData<List<Book>>{
                return books
        }
}