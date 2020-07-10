package com.example.lord_of_the_rings_api.view.ui

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lord_of_the_rings_api.R

class BooksListFragment : Fragment() {

    companion object {
        fun newInstance() = BooksListFragment()
    }

    private lateinit var viewModel: BooksListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.books_list_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(BooksListViewModel::class.java)
        // TODO: Use the ViewModel
    }

}