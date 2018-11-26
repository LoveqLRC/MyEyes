package com.example.liaoruochen.myeyes.ui.fragment.home.category.discovery.model

import com.example.liaoruochen.myeyes.net.EyesRetrofitManager
import com.example.liaoruochen.myeyes.net.bean.Result
import com.example.liaoruochen.myeyes.net.callback.RequestCallback
import com.example.liaoruochen.myeyes.utilities.SchedulerUtils
import io.reactivex.disposables.Disposable

class DiscoveryModel {



    fun getDiscoveryContent(callback: RequestCallback<Result>): Disposable {

        return EyesRetrofitManager.service.getDisoveryContent()
            .compose(SchedulerUtils.ioToMain())
            .subscribe (
                { it -> callback.requestSuccess(it) },
                { it -> callback.requestError(it) },
                { callback.requestComplete() })

    }
}