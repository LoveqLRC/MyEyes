package com.example.liaoruochen.myeyes.ui.base

import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable


open class BasePresenter<T :IBaseView> :IPresenter<T>{

    var mRootView : T ?= null
         private set

    private var compositeDisposable = CompositeDisposable()



    override fun attachView(mRootView: T) {
        this.mRootView = mRootView
    }

    override fun detachView() {
            mRootView =null
        if (!compositeDisposable.isDisposed) {
            compositeDisposable.clear()
        }
    }

    private val isViewAttached :Boolean
            get() = mRootView !=null


    fun addSubscription(disposable: Disposable){
        compositeDisposable.add(disposable)
    }


}