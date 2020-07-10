package com.example.lord_of_the_rings_api.service.model

data class Movie(
    val _id: String,
    val academyAwardNominations: Int,
    val academyAwardWins: Int,
    val boxOfficeRevenueInMillions: Double,
    val budgetInMillions: Double,
    val name: String,
    val runtimeInMinutes: Int
)