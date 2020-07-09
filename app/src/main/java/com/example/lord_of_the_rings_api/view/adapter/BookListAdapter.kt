package com.example.lord_of_the_rings_api.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.lord_of_the_rings_api.R
import com.example.lord_of_the_rings_api.databinding.BooksRecyclerViewItemBinding
import com.example.lord_of_the_rings_api.service.model.Book

class BookListAdapter (
    private val books : List<Book>
):RecyclerView.Adapter<BookListAdapter.BookListAdapterViewHolder>(){

    inner class BookListAdapterViewHolder (
        val recyclerViewdenemeBinding : BooksRecyclerViewItemBinding
    ):RecyclerView.ViewHolder(recyclerViewdenemeBinding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        BookListAdapterViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.books_recycler_view_item,
                parent,
                false
            )
        )

    override fun getItemCount() = books.size

    override fun onBindViewHolder(holder: BookListAdapterViewHolder, position: Int) {
        holder.recyclerViewdenemeBinding.book = books[position]
    }
}