package com.example.liaoruochen.myeyes.ui.fragment.home

import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.liaoruochen.myeyes.R
import com.example.liaoruochen.myeyes.net.bean.Category
import com.example.liaoruochen.myeyes.ui.base.MultipleStatusFragment
import com.example.liaoruochen.myeyes.ui.fragment.home.category.CategoryFragment
import com.example.liaoruochen.myeyes.ui.fragment.home.category.daily.DailyFragment
import com.example.liaoruochen.myeyes.ui.fragment.home.category.discovery.DiscoveryFragment
import com.example.liaoruochen.myeyes.ui.fragment.home.category.recommend.RecommendFragment
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : MultipleStatusFragment(), HomeContract.View {
    override fun showError(msg: String) {

    }

    private val DISCOVERY_ID = 10001
    private val RECOMMEND_ID = 10002
    private val DAILY_ID = 10003

    private var mCategories: List<Category> = arrayListOf(
        Category(DISCOVERY_ID, "发现"),
        Category(RECOMMEND_ID, "推荐"),
        Category(DAILY_ID, "日报")
    )

    private var isRefresh = false


    override fun setTabTitle(categories: List<Category>) {
        mCategories += categories
        mLayoutStatus?.showContent()
        viewPager.adapter = HomeAdapter(childFragmentManager)
        tabs.setupWithViewPager(viewPager)

    }

    override fun showLoading() {
        if (!isRefresh) {
            isRefresh = false
            mLayoutStatus?.showLoading()
        }
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
        mLayoutStatus = layout_status
    }

    override fun lazyLoad() {
        mPresenter.requestCategories()
    }


    override fun onDestroy() {
        super.onDestroy()
        mPresenter.detachView()
    }

    inner class HomeAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm) {
        override fun getItem(position: Int): Fragment {
            return when (mCategories[position].id!!) {
                DISCOVERY_ID -> {
                    DiscoveryFragment.newInstance(DISCOVERY_ID)
                }
                RECOMMEND_ID -> {
                    RecommendFragment.newInstance(RECOMMEND_ID)
                }
                DAILY_ID -> {
                    DailyFragment.newInstance(DAILY_ID)
                }
                else -> {
                    CategoryFragment.newInstance(mCategories[position].id!!)
                }
            }

        }

        override fun getCount(): Int {
            return mCategories.size
        }

        override fun getPageTitle(position: Int): CharSequence? {
            return mCategories[position].name
        }

    }

}