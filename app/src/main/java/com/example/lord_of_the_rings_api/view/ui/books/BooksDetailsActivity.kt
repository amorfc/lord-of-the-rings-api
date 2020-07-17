package com.example.lord_of_the_rings_api.view.ui.books

import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.lord_of_the_rings_api.R
import com.example.lord_of_the_rings_api.view.BaseActivity
import com.example.lord_of_the_rings_api.viewModel.BookDetailsViewModel
import kotlinx.android.synthetic.main.activity_books.*

class BooksDetailsActivity : BaseActivity() {

    private lateinit var bookDetailsViewModel: BookDetailsViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_books)

    }

}
