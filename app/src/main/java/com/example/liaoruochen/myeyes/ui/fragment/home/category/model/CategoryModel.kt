package com.example.liaoruochen.myeyes.ui.fragment.home.category.model

import com.example.liaoruochen.myeyes.net.EyesRetrofitManager
import com.example.liaoruochen.myeyes.net.bean.Category
import com.example.liaoruochen.myeyes.net.bean.Result
import com.example.liaoruochen.myeyes.net.callback.RequestCallback
import com.example.liaoruochen.myeyes.utilities.SchedulerUtils
import io.reactivex.disposables.Disposable

class CategoryModel {


    fun getCategoryContentById(id: Int, startIndex: Int, num: Int, callback: RequestCallback<Result>): Disposable {
        return EyesRetrofitManager.service.getCategoryContentById(id, startIndex, num, parmaMap())
            .compose(SchedulerUtils.ioToMain())
            .subscribe(
                { it -> callback.requestSuccess(it) },
                { it -> callback.requestError(it) },
                { callback.requestComplete() })
    }

    fun parmaMap(): HashMap<String, String> {
        val map = HashMap<String, String>()
        map.put("udid", "1dad62050ee54c10965021ed1bff209cdee1f09e")
        map.put("vc", "256")
        map.put("vn", "3.14")
        map.put("deviceModel", "MIX%202")
        map.put("first_channel", "eyepetizer_yingyongbao_market")
        map.put("last_channel", "eyepetizer_yingyongbao_market")
        map.put("system_version_code", "25")
        return map
    }
}