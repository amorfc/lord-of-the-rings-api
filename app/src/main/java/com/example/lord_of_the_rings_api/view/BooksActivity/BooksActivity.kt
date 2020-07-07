package com.example.lord_of_the_rings_api.view.BooksActivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lord_of_the_rings_api.R
import com.example.lord_of_the_rings_api.view.BaseActivity
import com.example.lord_of_the_rings_api.viewModel.BooksViewModel

class BooksActivity : BaseActivity() {
    private lateinit var bookViewModel : BooksViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_books)

        bookViewModel = BooksViewModel()
        
    }
}
