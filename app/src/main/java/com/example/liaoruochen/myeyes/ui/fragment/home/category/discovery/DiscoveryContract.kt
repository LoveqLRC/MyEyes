package com.example.liaoruochen.myeyes.ui.fragment.home.category.discovery

import com.example.liaoruochen.myeyes.net.bean.Result
import com.example.liaoruochen.myeyes.ui.base.IBaseView
import com.example.liaoruochen.myeyes.ui.base.IPresenter

interface DiscoveryContract {
    interface View : IBaseView {
        fun requestSuccess(result: Result)
    }


    interface Presenter : IPresenter<View> {

        fun getDiscoveryContent()
    }
}