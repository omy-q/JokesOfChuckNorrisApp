package com.example.jokesofchucknorrisapp.jokes.view

import com.example.jokesofchucknorrisapp.jokes.data.Joke
import moxy.MvpView
import moxy.viewstate.strategy.alias.AddToEndSingle

interface JokesView: MvpView {

    @AddToEndSingle
    fun showJokes(jokes: List<Joke>)
    @AddToEndSingle
    fun showLoading()
    @AddToEndSingle
    fun hideLoading()
    @AddToEndSingle
    fun showError(error: String)
}