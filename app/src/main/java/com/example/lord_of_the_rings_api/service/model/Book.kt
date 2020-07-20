package com.example.lord_of_the_rings_api.service.model

import android.os.Parcelable
import androidx.annotation.Keep
import kotlinx.android.parcel.Parcelize


@Parcelize @Keep data class Book(

    val _id: String,
    val name: String
) : Parcelable