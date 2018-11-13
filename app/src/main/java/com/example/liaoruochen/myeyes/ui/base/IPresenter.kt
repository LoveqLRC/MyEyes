package com.example.liaoruochen.myeyes.ui.base

interface IPresenter <in V :IBaseView> {

    fun attachView(mRootView :V)

    fun detachView()
}