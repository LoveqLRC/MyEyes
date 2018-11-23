package com.example.liaoruochen.myeyes.ui.fragment.home.category

import com.example.liaoruochen.myeyes.net.BaseSubscriber
import com.example.liaoruochen.myeyes.net.bean.Result
import com.example.liaoruochen.myeyes.ui.base.BasePresenter
import com.example.liaoruochen.myeyes.ui.fragment.home.category.model.CategoryModel

class CategotryPresenter : BasePresenter<CategoryContract.View>(), CategoryContract.Presenter {

    private val categoryModel: CategoryModel by lazy {
        CategoryModel()
    }

    override fun getCategoryContentById(id: Int, startIndex: Int, num: Int) {
        checkViewAttached()
        mRootView?.showLoading()
        val disposable =
            categoryModel.getCategoryContentById(id, startIndex, num, object : BaseSubscriber<Result>(mRootView!!) {


            })

        addSubscription(disposable)


    }

}