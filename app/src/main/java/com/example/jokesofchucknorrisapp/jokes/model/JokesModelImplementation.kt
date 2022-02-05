package com.example.jokesofchucknorrisapp.jokes.model

import com.example.jokesofchucknorrisapp.jokes.data.Joke
import com.example.jokesofchucknorrisapp.remote.RemoteService
import io.reactivex.rxjava3.core.Single

class JokesModelImplementation(
    private val remoteService: RemoteService
): JokesModel {
    override fun getJokes(count: Int): Single<List<Joke>> {
        return remoteService.loadJokes(count)
    }
}