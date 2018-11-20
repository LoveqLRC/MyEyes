package com.example.liaoruochen.myeyes.ui.fragment.home

import com.example.liaoruochen.myeyes.ui.base.BasePresenter

class HomePresenter : BasePresenter<HomeContract.View>(), HomeContract.Presenter {


    override fun requestCategories() {
        checkViewAttached()
        mRootView?.showLoading()
    }


}