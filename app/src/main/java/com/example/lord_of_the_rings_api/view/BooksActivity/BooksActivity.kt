package com.example.lord_of_the_rings_api.view.BooksActivity

import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.example.lord_of_the_rings_api.R
import com.example.lord_of_the_rings_api.network.LotrApi
import com.example.lord_of_the_rings_api.repository.LotrRepository
import com.example.lord_of_the_rings_api.view.BaseActivity
import com.example.lord_of_the_rings_api.viewModel.BooksViewModel
import kotlinx.android.synthetic.main.activity_books.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class BooksActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_books)

        val repository = LotrRepository(LotrApi())
        GlobalScope.launch(Dispatchers.Main){
            val books = repository.getAllBooks().docs
            Toast.makeText(this@BooksActivity,books.toString(),Toast.LENGTH_SHORT).show()
        }

        var booksViewModel = ViewModelProvider(this).get(BooksViewModel::class.java)

    }
}
