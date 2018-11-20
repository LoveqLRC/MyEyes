package com.example.liaoruochen.myeyes.ui.fragment.home

import android.util.Log
import com.example.liaoruochen.myeyes.ui.base.BasePresenter
import com.example.liaoruochen.myeyes.ui.fragment.home.model.HomeModel
import io.reactivex.functions.Consumer

class HomePresenter : BasePresenter<HomeContract.View>(), HomeContract.Presenter {

    private val homeModel:HomeModel by lazy {
        HomeModel()
    }

    override fun requestCategories() {
        checkViewAttached()
        mRootView?.showLoading()
        var disposable = homeModel.requestCategories()
            .subscribe({ it ->
                mRootView?.setTabTitle(it)
            })
        addSubscription(disposable)
    }




}