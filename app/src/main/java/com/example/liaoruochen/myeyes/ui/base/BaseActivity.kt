package com.example.liaoruochen.myeyes.ui.base

import android.os.Bundle
import android.support.annotation.LayoutRes
import android.support.v7.app.AppCompatActivity


abstract class BaseActivity :AppCompatActivity(){


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())
        initData()
        initView()
        requestData()
    }


    abstract fun initData()

    abstract fun initView()

    abstract fun requestData()



    @LayoutRes abstract fun getLayoutId():  Int


}