package com.example.liaoruochen.myeyes.ui.activity

import android.Manifest
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.liaoruochen.myeyes.R
import com.example.liaoruochen.myeyes.ui.base.BaseActivity
import com.example.liaoruochen.myeyes.ui.base.MultipleStatusActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : BaseActivity() {
    companion object {
        fun startMainActivity(context: Context) {
            val intent = Intent(context, MainActivity::class.java)
            context.startActivity(intent)
        }
    }

    override fun getLayoutId(): Int {
        return R.layout.activity_main
    }

    override fun initData() {

    }

    override fun initView() {

    }

    override fun requestData() {

    }


}
