package com.example.liaoruochen.myeyes.ui.fragment.home.category.daily

import com.example.liaoruochen.myeyes.ui.base.IBaseView
import com.example.liaoruochen.myeyes.ui.base.IPresenter

interface DailyContract {

    interface View : IBaseView {


    }

    interface Presenter : IPresenter<View> {

        fun getCategoryContentById(
            id: Int,
            startIndex: Int,
            num: Int
        )
    }

}