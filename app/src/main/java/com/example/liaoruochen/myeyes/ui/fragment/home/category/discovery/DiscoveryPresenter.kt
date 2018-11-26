package com.example.liaoruochen.myeyes.ui.fragment.home.category.discovery

import com.example.liaoruochen.myeyes.net.BaseSubscriber
import com.example.liaoruochen.myeyes.net.bean.Result
import com.example.liaoruochen.myeyes.ui.base.BasePresenter
import com.example.liaoruochen.myeyes.ui.fragment.home.category.discovery.model.DiscoveryModel

class DiscoveryPresenter : BasePresenter<DiscoveryContract.View>(), DiscoveryContract.Presenter {

    private val mDiscoveryModel: DiscoveryModel by lazy {
        DiscoveryModel()
    }

    override fun getDiscoveryContent() {
        checkViewAttached()
        mRootView?.showLoading()

        mDiscoveryModel.getDiscoveryContent(object : BaseSubscriber<Result>(mRootView!!) {

            override fun requestSuccess(t: Result) {

            }

        })

    }
}