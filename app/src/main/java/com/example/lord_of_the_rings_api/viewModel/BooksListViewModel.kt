package com.example.lord_of_the_rings_api.viewModel

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.lord_of_the_rings_api.service.model.Book
import com.example.lord_of_the_rings_api.service.repository.BooksRepository
import timber.log.Timber


class BooksListViewModel() : BaseViewModel() {

        private var books  : LiveData<List<Book>> = BooksRepository().getBooksList()
        private var selectedBook = MutableLiveData<Book>()

        fun getBooksListObservable(): LiveData<List<Book>>{
                return books
        }

        fun getBookObservable(): LiveData<Book>{
                return selectedBook
        }

        fun selectABook(_selectedBook: Book){
                selectedBook.value =  _selectedBook
        }

        override fun onCleared() {
                super.onCleared()
                Log.i("BooksListViewModel", "BooksListViewModel destroyed!")
        }
        init {
            Log.i("Info","BooksListViewModel Created")
        }
}