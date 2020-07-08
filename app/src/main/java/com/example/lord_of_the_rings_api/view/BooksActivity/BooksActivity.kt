package com.example.lord_of_the_rings_api.view.BooksActivity

import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.example.lord_of_the_rings_api.R
import com.example.lord_of_the_rings_api.view.BaseActivity
import com.example.lord_of_the_rings_api.viewModel.BooksViewModel

class BooksActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_books)

        var booksViewModel = ViewModelProvider(this).get(BooksViewModel::class.java)


    }
}
