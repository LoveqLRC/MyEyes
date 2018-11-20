package com.example.liaoruochen.myeyes.ui.fragment.home

import com.example.liaoruochen.myeyes.net.bean.Category
import com.example.liaoruochen.myeyes.ui.base.IBaseView
import com.example.liaoruochen.myeyes.ui.base.IPresenter

interface HomeContract {
    interface View : IBaseView {

        fun setTabTitle(categories:List<Category>)


    }

    interface Presenter : IPresenter<View> {

        /**
         * 请求分类
         */
        fun requestCategories()

    }
}