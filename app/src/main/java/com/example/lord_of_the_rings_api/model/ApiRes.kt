package com.example.lord_of_the_rings_api.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class ApiRes(

    @SerializedName("docs")
    val docs: List<Book>

)