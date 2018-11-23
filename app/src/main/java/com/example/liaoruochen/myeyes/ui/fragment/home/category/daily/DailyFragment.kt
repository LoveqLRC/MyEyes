package com.example.liaoruochen.myeyes.ui.fragment.home.category.daily

import android.os.Bundle
import com.example.liaoruochen.myeyes.R
import com.example.liaoruochen.myeyes.ui.base.MultipleStatusFragment
import com.example.liaoruochen.myeyes.ui.fragment.home.category.discovery.DiscoveryFragment

class DailyFragment : MultipleStatusFragment() {


    companion object {
        private const val DAILY_ID = "DAILY_ID"
        fun newInstance(dailyId: Int): DailyFragment {
            val dailyFragment = DailyFragment()
            val bundle = Bundle()
            bundle.putInt(DAILY_ID, dailyId)
            dailyFragment.arguments = bundle

            return dailyFragment
        }
    }

    override fun retry() {

    }

    override fun getLayoutId(): Int {
        return R.layout.fragment_daily
    }

    override fun initView() {

    }

    override fun lazyLoad() {

    }
}