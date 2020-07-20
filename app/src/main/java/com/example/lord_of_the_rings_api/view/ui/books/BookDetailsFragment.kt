package com.example.lord_of_the_rings_api.view.ui.books

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.lord_of_the_rings_api.databinding.FragmentBookDetailsBinding
import com.example.lord_of_the_rings_api.service.model.Book
import com.example.lord_of_the_rings_api.viewModel.books.BookDetailsViewModel
import com.example.lord_of_the_rings_api.viewModel.books.BookDetailsViewModelFactory

class BookDetailsFragment : Fragment(){

    private lateinit var bookDetailsBinding : FragmentBookDetailsBinding
    private lateinit var detailsViewModel: BookDetailsViewModel
    private lateinit var bookDetailsViewModelFactory: BookDetailsViewModelFactory

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        bookDetailsBinding = FragmentBookDetailsBinding.inflate(inflater, container, false)

        return bookDetailsBinding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        bookDetailsViewModelFactory = BookDetailsViewModelFactory(BooksListFragmentArgs.fromBundle(requireArguments()).selectedBook)
        detailsViewModel = ViewModelProvider(this,bookDetailsViewModelFactory).get(BookDetailsViewModel::class.java)
        bookDetailsBinding.bookDetailsViewModel = detailsViewModel


    }
}