package com.example.liaoruochen.myeyes.ui.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.example.liaoruochen.myeyes.R
import com.example.liaoruochen.myeyes.ui.base.BaseActivity
import com.example.liaoruochen.myeyes.ui.base.BaseFragment
import com.example.liaoruochen.myeyes.ui.fragment.follow.FollowFragment
import com.example.liaoruochen.myeyes.ui.fragment.home.HomeFragment
import com.example.liaoruochen.myeyes.ui.fragment.notification.NotificationFragment
import com.example.liaoruochen.myeyes.utilities.consume
import com.example.liaoruochen.myeyes.utilities.inTransaction
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.IllegalStateException


class MainActivity : BaseActivity() {


    companion object {

        private const  val FRAGMENT_ID =R.id.fragment_container;

        fun startMainActivity(context: Context) {
            val intent = Intent(context, MainActivity::class.java)
            context.startActivity(intent)
        }
    }

    private lateinit var currentFragment: BaseFragment

    override fun getLayoutId(): Int {
        return R.layout.activity_main
    }

    override fun initView(savedInstanceState: Bundle?) {
        initNavigation(savedInstanceState)
    }


    override fun requestData() {

    }


    private fun initNavigation(savedInstanceState: Bundle?) {
        navigation.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.navigation_home ->
                    consume {replaceFragment(HomeFragment()) }
                R.id.navigation_follow -> consume { replaceFragment(FollowFragment()) }
                R.id.navigation_notification -> consume { replaceFragment(NotificationFragment()) }
                else -> false
            }
        }

        navigation.setOnNavigationItemReselectedListener {  }


        if (savedInstanceState ==null) {
            navigation.selectedItemId = R.id.navigation_follow
        }else{
            currentFragment = supportFragmentManager.findFragmentById(FRAGMENT_ID) as? BaseFragment
                    ?:
                    throw  IllegalStateException("Activity recreated, but no fragment found!")
        }
    }


    private fun <F> replaceFragment(fragment: F) where F : BaseFragment {
        supportFragmentManager.inTransaction {
            currentFragment = fragment;
            replace(FRAGMENT_ID,fragment)
        }
    }


    override fun onBackPressed() {
        if (!currentFragment.onBackPressed()) {
            super.onBackPressed()
        }

    }


}
