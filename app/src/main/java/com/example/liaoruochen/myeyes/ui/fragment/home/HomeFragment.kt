package com.example.liaoruochen.myeyes.ui.fragment.home

import com.example.liaoruochen.myeyes.R
import com.example.liaoruochen.myeyes.ui.base.MultipleStatusFragment
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : MultipleStatusFragment() {
    override fun retry() {

    }

    override fun getLayoutId(): Int {
       return R.layout.fragment_home
    }

    override fun initView() {
        viewPager.pageMargin = 8
        viewPager.setPageMarginDrawable(R.drawable.page_margin)
    }

    override fun lazyLoad() {



    }
}