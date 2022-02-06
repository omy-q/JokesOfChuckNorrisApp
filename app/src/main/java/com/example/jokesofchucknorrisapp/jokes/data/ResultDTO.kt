package com.example.jokesofchucknorrisapp.jokes.data

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class ResultDTO(
    @Expose
    @SerializedName("value")
    val jokes: List<Joke>,
)
