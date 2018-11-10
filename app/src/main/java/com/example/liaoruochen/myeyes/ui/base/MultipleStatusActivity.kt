package com.example.liaoruochen.myeyes.ui.base

import android.os.Bundle
import android.view.View
import com.classic.common.MultipleStatusView

abstract class MultipleStatusActivity : BaseActivity() {

    open var mLayoutStatus: MultipleStatusView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindMultipleStatusListener()
    }

    private fun bindMultipleStatusListener() {
        mLayoutStatus?.setOnRetryClickListener(mRetryClickListener)
    }

    open val mRetryClickListener =View.OnClickListener {
        retry()
    }



    abstract fun retry()

}