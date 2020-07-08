package com.example.lord_of_the_rings_api.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Book(

    @SerializedName("_id")
    val _id: String,

    @SerializedName("name")
    val name: String

)