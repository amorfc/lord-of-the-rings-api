package com.example.lord_of_the_rings_api.service.repository

import android.annotation.SuppressLint
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.lord_of_the_rings_api.service.model.ApiResBook
import com.example.lord_of_the_rings_api.service.model.Book
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class BooksRepository : BaseRepository() {

    private lateinit var selectedBooks: Book

    fun getBooksList(): LiveData<List<Book>> {
        var data = MutableLiveData<List<Book>>()

        webService.getAllBooksFromApi().enqueue(object : Callback<ApiResBook> {
            @SuppressLint("LongLogTag")
            override fun onFailure(call: Call<ApiResBook>, t: Throwable) {
                Log.e("BooksListSomething Went Wrong", t.toString())
            }

            override fun onResponse(call: Call<ApiResBook>, response: Response<ApiResBook>) {
                if (response.isSuccessful) {
                    data.value = response.body()?.docs
                    Log.i("Response of BooksApi", response.toString())
                }
            }

        })
        return data
    }

    fun selectBook(currentSelectedBook: Book) {

        selectedBooks = currentSelectedBook
    }

    fun getSelectedBooks(): LiveData<Book> {
        var data = MutableLiveData<Book>()

        data.value = selectedBooks

        return data
    }
}