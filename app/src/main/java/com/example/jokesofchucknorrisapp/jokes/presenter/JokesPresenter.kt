package com.example.jokesofchucknorrisapp.jokes.presenter

import com.example.jokesofchucknorrisapp.base.presenter.BasePresenter
import com.example.jokesofchucknorrisapp.jokes.model.JokesModel
import com.example.jokesofchucknorrisapp.jokes.view.JokesView
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.schedulers.Schedulers

class JokesPresenter(
    private val model: JokesModel
) : BasePresenter<JokesView>() {

    fun getData(count: Int) {
        model.getJokes(count)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe {
                viewState.showLoading()
            }
            .subscribe({ jokes ->
                viewState.showJokes(jokes)
                viewState.hideLoading()
            }, {
                viewState.hideLoading()
                viewState.showError(it.stackTrace.toString())
            })
    }
}