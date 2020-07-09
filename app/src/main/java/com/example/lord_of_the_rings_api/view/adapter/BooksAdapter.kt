package com.example.lord_of_the_rings_api.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.lord_of_the_rings_api.R
import com.example.lord_of_the_rings_api.model.Book

class BooksAdapter(var booksList:List<Book>):RecyclerView.Adapter<BooksAdapter.ViewHolder>(){

    var data = listOf<Book>()
        set(value) {
            field = booksList
        }


    override fun getItemCount() = data.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            return ViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val item = data[position]
        holder.bind(item)
    }

    class ViewHolder private constructor(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val booksname :TextView = itemView.findViewById(R.id.books_name_tv)

        fun bind(item : Book){
            booksname.text = item.name
        }

        companion object {
            fun from(parent: ViewGroup): ViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val view = layoutInflater
                    .inflate(R.layout.books_recycler_view_item, parent, false)

                return ViewHolder(view)
            }
        }
    }
}