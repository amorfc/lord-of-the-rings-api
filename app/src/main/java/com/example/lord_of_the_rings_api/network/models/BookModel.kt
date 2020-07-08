package com.example.lord_of_the_rings_api.network.models

data class BookModel(
    val docs: List<Book>,
    val items: İtems,
    val pages: Pages
)


data class Book(
    val _id: String,
    val name: String
)


data class İtems(
    val begin: Any,
    val end: Any,
    val total: Int
)


data class Pages(
    val current: Int,
    val hasNext: Boolean,
    val hasPrev: Boolean,
    val next: Int,
    val prev: Int,
    val total: Any
)