package com.example.jokesofchucknorrisapp.remote

import com.example.jokesofchucknorrisapp.jokes.data.ResultDTO
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import retrofit2.http.Path

interface RemoteService {
    @GET("jokes/random/{count}")
    fun loadJokes(@Path("count") count: Int): Single<ResultDTO>
}