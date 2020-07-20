package com.example.lord_of_the_rings_api.viewModel.books

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.lord_of_the_rings_api.service.model.Book
import com.example.lord_of_the_rings_api.service.repository.BooksRepository
import com.example.lord_of_the_rings_api.viewModel.BaseViewModel


class BooksListViewModel() : BaseViewModel() {

        private var books  : LiveData<List<Book>> = BooksRepository().getBooksList()
        private var selectedBook = MutableLiveData<Book>()

        fun getBooksListObservable(): LiveData<List<Book>>{
                return books
        }

        fun getBookObservable(): LiveData<Book>{
                return selectedBook
        }

        override fun onCleared() {
                super.onCleared()
                Log.i("BooksListViewModel", "BooksListViewModel destroyed!")
        }
        init {
            Log.i("Info","BooksListViewModel Created")
        }
}