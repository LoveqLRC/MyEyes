package com.example.liaoruochen.myeyes.ui.activity

import android.Manifest
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.liaoruochen.myeyes.R
import com.example.liaoruochen.myeyes.ui.base.BaseActivity
import com.example.liaoruochen.myeyes.ui.base.BaseFragment
import com.example.liaoruochen.myeyes.ui.base.MultipleStatusActivity
import com.example.liaoruochen.myeyes.utilities.consume
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : BaseActivity() {
    companion object {
        fun startMainActivity(context: Context) {
            val intent = Intent(context, MainActivity::class.java)
            context.startActivity(intent)
        }
    }

    private lateinit var currentFragment: BaseFragment

    override fun getLayoutId(): Int {
        return R.layout.activity_main
    }

    override fun initView() {
        initNavigation()
    }


    override fun requestData() {

    }


    private fun initNavigation() {
        navigation.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.navigation_home -> {
                    consume { }
                }
                else -> {
                    false
                }
            }
        }

    }


    private fun <F> replaceFragment(fragment: F) where F : BaseFragment {

    }


    override fun onBackPressed() {
        if (!currentFragment.onBackPressed()) {
            super.onBackPressed()
        }

    }


}
