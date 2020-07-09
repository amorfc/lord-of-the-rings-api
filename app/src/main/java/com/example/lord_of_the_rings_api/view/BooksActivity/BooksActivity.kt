package com.example.lord_of_the_rings_api.view.BooksActivity

import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.lord_of_the_rings_api.R
import com.example.lord_of_the_rings_api.model.Book
import com.example.lord_of_the_rings_api.repository.BooksRepository
import com.example.lord_of_the_rings_api.view.BaseActivity
import com.example.lord_of_the_rings_api.viewModel.BooksListViewModel

class BooksActivity : BaseActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_books)

        val booksViewModel = ViewModelProvider(this).get(BooksListViewModel::class.java)
        observeViewModel(booksViewModel)
    }
    private fun observeViewModel(viewModel: BooksListViewModel){
        viewModel.getBooksListObservable().observe(this, object : Observer<List<Book>>{
            override fun onChanged(books: List<Book>?) {
                books?.let{
                    Log.e("Results",it.toString())
                }
            }

        })
    }
}
