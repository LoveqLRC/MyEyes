package com.example.liaoruochen.myeyes.ui.fragment.home.model

import com.example.liaoruochen.myeyes.net.EyesRetrofitManager
import com.example.liaoruochen.myeyes.net.bean.Category
import com.example.liaoruochen.myeyes.net.callback.RequestCallback
import com.example.liaoruochen.myeyes.utilities.SchedulerUtils
import io.reactivex.Observable
import io.reactivex.disposables.Disposable

class HomeModel {
    /**
     * 请求分类
     */
    fun requestCategories(callback: RequestCallback<List<Category>>):Disposable{

        return EyesRetrofitManager.service.getcategories()
            .compose(SchedulerUtils.ioToMain())
            .subscribe(
                {it -> callback.requestSuccess(it)},
                {it ->callback.requestError(it)},{callback.requestComplete()})
    }
}