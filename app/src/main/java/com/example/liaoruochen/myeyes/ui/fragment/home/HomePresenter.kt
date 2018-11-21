package com.example.liaoruochen.myeyes.ui.fragment.home

import com.example.liaoruochen.myeyes.net.BaseSubscriber
import com.example.liaoruochen.myeyes.net.bean.Category
import com.example.liaoruochen.myeyes.net.callback.RequestCallback
import com.example.liaoruochen.myeyes.ui.base.BasePresenter
import com.example.liaoruochen.myeyes.ui.fragment.home.model.HomeModel
import java.util.*

class HomePresenter : BasePresenter<HomeContract.View>(), HomeContract.Presenter {

    private val homeModel: HomeModel by lazy {
        HomeModel()
    }

    override fun requestCategories() {
        checkViewAttached()
        mRootView?.showLoading()

        val disposable = homeModel.requestCategories(object : BaseSubscriber<List<Category>>(mRootView!!) {
            override fun requestSuccess(t: List<Category>) {
                super.requestSuccess(t)
                mRootView?.setTabTitle(t)
            }

            override fun requestError(e: Throwable?) {
                super.requestError(e)
            }

        })

        addSubscription(disposable)
    }


}