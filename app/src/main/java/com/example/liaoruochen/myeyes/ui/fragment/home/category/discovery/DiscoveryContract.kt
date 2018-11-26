package com.example.liaoruochen.myeyes.ui.fragment.home.category.discovery

import com.example.liaoruochen.myeyes.ui.base.IBaseView
import com.example.liaoruochen.myeyes.ui.base.IPresenter

interface DiscoveryContract {
    interface View : IBaseView {

    }


    interface Presenter : IPresenter<View> {

        fun getDiscoveryContent()
    }
}