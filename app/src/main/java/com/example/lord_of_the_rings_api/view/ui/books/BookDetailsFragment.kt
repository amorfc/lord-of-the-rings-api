package com.example.lord_of_the_rings_api.view.ui.books

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.lord_of_the_rings_api.R
import com.example.lord_of_the_rings_api.service.model.Book
import com.example.lord_of_the_rings_api.viewModel.books.BookDetailsViewModel
import com.example.lord_of_the_rings_api.viewModel.books.BookDetailsViewModelFactory

class BookDetailsFragment : Fragment(){

    private lateinit var viewModel: BookDetailsViewModel
    private lateinit var viewModelFactory: BookDetailsViewModelFactory

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_book_details, container, false)

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val arg:Book? = arguments?.getParcelable("selectedBook")
        viewModelFactory = BookDetailsViewModelFactory(arg!!)
        viewModel = ViewModelProvider(this,viewModelFactory).get(BookDetailsViewModel::class.java)



    }
}