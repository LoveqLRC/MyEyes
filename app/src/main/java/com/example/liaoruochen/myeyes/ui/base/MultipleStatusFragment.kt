package com.example.liaoruochen.myeyes.ui.base

import android.os.Bundle
import android.view.View
import com.classic.common.MultipleStatusView

abstract class MultipleStatusFragment :BaseFragment(){
    open var  mLayoutStatus: MultipleStatusView?=null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
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