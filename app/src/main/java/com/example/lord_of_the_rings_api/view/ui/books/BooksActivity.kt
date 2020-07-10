package com.example.lord_of_the_rings_api.view.ui.books

import android.os.Bundle
import com.example.lord_of_the_rings_api.R
import com.example.lord_of_the_rings_api.view.BaseActivity

class BooksActivity : BaseActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_books)

        //val booksListViewModel = ViewModelProvider(this).get(BooksListViewModel::class.java)
        //observeViewModel(booksListViewModel)
    }
    /*
       private fun observeViewModel(viewModel: BooksListViewModel){
        viewModel.getBooksListObservable().observe(this, object : Observer<List<Book>>{
            override fun onChanged(books: List<Book>?) {
                books?.let{
                    Log.e("Results",it.toString())
                   booksRcy.also {
                       it.layoutManager = LinearLayoutManager(baseContext)
                       it.setHasFixedSize(true)
                       it.adapter = BooksAdapter(books)
                   }
                }
            }

        })
    }
    * */


}
