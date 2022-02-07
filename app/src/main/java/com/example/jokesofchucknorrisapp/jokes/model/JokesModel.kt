package com.example.jokesofchucknorrisapp.jokes.model

import com.example.jokesofchucknorrisapp.jokes.data.Joke
import io.reactivex.rxjava3.core.Single

interface JokesModel {
    fun getJokes(count:Int): Single<List<Joke>>
}