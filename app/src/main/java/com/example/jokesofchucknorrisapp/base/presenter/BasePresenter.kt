package com.example.jokesofchucknorrisapp.base.presenter

import moxy.MvpPresenter
import moxy.MvpView

abstract class BasePresenter<V: MvpView>: MvpPresenter<V>() {
}