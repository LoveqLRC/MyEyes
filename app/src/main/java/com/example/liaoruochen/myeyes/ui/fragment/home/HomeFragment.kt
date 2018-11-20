package com.example.liaoruochen.myeyes.ui.fragment.home

import com.example.liaoruochen.myeyes.R
import com.example.liaoruochen.myeyes.ui.base.MultipleStatusFragment
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : MultipleStatusFragment() ,HomeContract.View{
    override fun showLoading() {

    }

    override fun dimissLoading() {

    }

    private val mPresenter by lazy {
        HomePresenter()
    }

    override fun retry() {

    }

    override fun getLayoutId(): Int {
        return R.layout.fragment_home
    }

    override fun initView() {
        mPresenter.attachView(this)
        viewPager.pageMargin = 8
        viewPager.setPageMarginDrawable(R.drawable.page_margin)
    }

    override fun lazyLoad() {
        mPresenter.requestCategories()

    }


    override fun onDestroy() {
        super.onDestroy()
        mPresenter.detachView()
    }
}