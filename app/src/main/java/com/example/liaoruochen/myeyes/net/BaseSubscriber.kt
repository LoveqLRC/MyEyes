package com.example.liaoruochen.myeyes.net

import android.content.IntentFilter
import com.example.liaoruochen.myeyes.MyApplication
import com.example.liaoruochen.myeyes.R
import com.example.liaoruochen.myeyes.net.callback.RequestCallback
import com.example.liaoruochen.myeyes.ui.base.IBaseView
import com.example.liaoruochen.myeyes.utilities.NetUtils
import io.reactivex.Scheduler
import org.reactivestreams.Subscriber
import org.reactivestreams.Subscription
import retrofit2.HttpException
import java.net.SocketTimeoutException
import java.net.UnknownHostException

open class BaseSubscriber<T>(view: IBaseView) : RequestCallback<T> {

    private val mView = view


    override fun requestComplete() {
        mView.dimissLoading()
    }


    override fun requestError(e: Throwable?) {
        mView.showError(onError(e))
    }


    override fun requestSuccess(t: T) {


    }


    private fun onError(t: Throwable?): String {
        var errorMsg: String = MyApplication.context.getString(R.string.UNKNOW_HOST)
        if (!NetUtils.isConnected(MyApplication.context)) {
            return MyApplication.context.getString(R.string.FIVE_ZERO_FOUR_ERROR_NO_NETWORK)
        }
        when (t) {
            is HttpException -> when (t.code()) {
                403 -> {
                    errorMsg = MyApplication.context.getString(R.string.FOUR_ZERO_THREE_ERROR)
                }
                504 -> {
                    errorMsg = if (!NetUtils.isConnected(MyApplication.context)) {
                        MyApplication.context.getString(R.string.FIVE_ZERO_FOUR_ERROR_NO_NETWORK)
                    } else {
                        MyApplication.context.getString(R.string.FIVE_ZERO_FOUR_ERROR_TIME_OUT)
                    }
                }
            }
            is UnknownHostException -> errorMsg = MyApplication.context.getString(R.string.UNKNOW_HOST)
            is SocketTimeoutException -> errorMsg =
                    MyApplication.context.getString(R.string.FIVE_ZERO_FOUR_ERROR_TIME_OUT)
            else -> errorMsg = MyApplication.context.getString(R.string.UNKNOW_HOST)
        }
        return errorMsg
    }
}