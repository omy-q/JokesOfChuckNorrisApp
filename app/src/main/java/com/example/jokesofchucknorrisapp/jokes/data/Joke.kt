package com.example.jokesofchucknorrisapp.jokes.data

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Joke(
    @Expose
    @SerializedName("id")
    val id: Int,
    @Expose
    @SerializedName("joke")
    val jokeName: String
)