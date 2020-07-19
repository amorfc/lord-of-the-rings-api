package com.example.lord_of_the_rings_api.view.ui.books

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.lord_of_the_rings_api.R
import com.example.lord_of_the_rings_api.service.model.Book
import com.example.lord_of_the_rings_api.viewModel.BookDetailsViewModel
import com.example.lord_of_the_rings_api.viewModel.BooksListViewModel
import kotlinx.android.synthetic.main.fragment_book_details.*

class BookDetailsFragment : Fragment(){

    private lateinit var booksListViewModel: BooksListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_book_details, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        booksListViewModel = ViewModelProvider(this).get(BooksListViewModel::class.java)
        booksListViewModel.getBookObservable().observe(viewLifecycleOwner, object : Observer<Book>{
            override fun onChanged(book: Book?) {
                book?.let{
                    bookDetailsName.text = it.name
                }
            }
        }
        )
    }
}