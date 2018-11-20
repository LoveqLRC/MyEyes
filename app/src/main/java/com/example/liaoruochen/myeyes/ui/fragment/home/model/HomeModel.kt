package com.example.liaoruochen.myeyes.ui.fragment.home.model

import com.example.liaoruochen.myeyes.net.EyesRetrofitManager
import com.example.liaoruochen.myeyes.net.bean.Category
import com.example.liaoruochen.myeyes.utilities.SchedulerUtils
import io.reactivex.Observable

class HomeModel {
    /**
     * 请求分类
     */
    fun requestCategories():Observable<List<Category>>{

        return EyesRetrofitManager.service.getcategories()
            .compose(SchedulerUtils.ioToMain())
    }
}