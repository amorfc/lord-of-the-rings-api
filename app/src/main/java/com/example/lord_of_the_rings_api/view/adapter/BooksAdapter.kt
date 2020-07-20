package com.example.lord_of_the_rings_api.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.lord_of_the_rings_api.R
import com.example.lord_of_the_rings_api.databinding.BooksRecyclerViewItemBinding
import com.example.lord_of_the_rings_api.service.model.Book
import com.example.lord_of_the_rings_api.view.ui.books.BookDetailsFragment
import com.example.lord_of_the_rings_api.viewModel.books.BooksListViewModel

class BooksAdapter (
    private val booksList : List<Book>
):RecyclerView.Adapter<BooksAdapter.BooksViewHolder>(){



    inner class BooksViewHolder (
        val booksRecyclerViewItemBinding : BooksRecyclerViewItemBinding
    ):RecyclerView.ViewHolder(booksRecyclerViewItemBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BooksViewHolder {

        val holder = BooksViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.books_recycler_view_item,
                parent,
                false
            )
        )

        return holder
    }


    override fun getItemCount() = booksList.size

    override fun onBindViewHolder(holder: BooksViewHolder, position: Int) {
        holder.booksRecyclerViewItemBinding.book = booksList[position]
        holder.itemView.setOnClickListener {

            val bundle = bundleOf("selectedBook" to booksList[position])
            it.findNavController().navigate(R.id.action_booksListFragmentNav_to_bookDetailsFragment,bundle)

        }
    }
}