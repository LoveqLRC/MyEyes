package com.example.liaoruochen.myeyes.ui.fragment.home.category.discovery

import android.os.Bundle
import com.example.liaoruochen.myeyes.R
import com.example.liaoruochen.myeyes.ui.base.MultipleStatusFragment
import com.example.liaoruochen.myeyes.ui.fragment.home.category.recommend.RecommendFragment

class DiscoveryFragment : MultipleStatusFragment(), DiscoveryContract.View {
    override fun showLoading() {

    }

    override fun dimissLoading() {

    }

    override fun showError(msg: String) {

    }

    companion object {
        private const val DISCOVERY_ID = "DISCOVERY_ID"
        fun newInstance(discoveryId: Int): DiscoveryFragment {
            val discoveryFragment = DiscoveryFragment()
            val bundle = Bundle()
            bundle.putInt(DISCOVERY_ID, discoveryId)
            discoveryFragment.arguments = bundle

            return discoveryFragment
        }
    }

    private val mPresenter by lazy {
        DiscoveryPresenter()
    }

    override fun retry() {

    }

    override fun getLayoutId(): Int {
        return R.layout.fragment_discovery
    }

    override fun initView() {
        mPresenter.attachView(this)
    }

    override fun lazyLoad() {
        mPresenter.getDiscoveryContent()
    }


    override fun onDestroy() {
        super.onDestroy()
        mPresenter.detachView()
    }
}