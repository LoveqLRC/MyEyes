package com.example.liaoruochen.myeyes.ui.base

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity


abstract class BaseActivity :AppCompatActivity(){


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())
        initData()
        initView()
        requestData()
    }


    @LayoutRes abstract fun getLayoutId():  Int

    abstract fun initData()

    abstract fun initView()

    abstract fun requestData()






}