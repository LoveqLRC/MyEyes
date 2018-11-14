package com.example.liaoruochen.myeyes.ui.base

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity


abstract class BaseActivity :AppCompatActivity(){


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())
        initData()
        initView(savedInstanceState)
        requestData()
    }


    @LayoutRes abstract fun getLayoutId():  Int

    open fun initData(){}

    abstract fun initView(savedInstanceState: Bundle?)

    abstract fun requestData()






}