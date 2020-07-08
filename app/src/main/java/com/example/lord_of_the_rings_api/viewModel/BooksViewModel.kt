package com.example.lord_of_the_rings_api.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.lord_of_the_rings_api.model.Book
import com.example.lord_of_the_rings_api.repository.BooksRepository


class BooksViewModel (booksRepository: BooksRepository): ViewModel() {

        val books : LiveData<List<Book>> = booksRepository.getAllBooksRes()
        
}