package com.example.liaoruochen.myeyes.ui.fragment.home.category.discovery

import android.os.Bundle
import com.example.liaoruochen.myeyes.R
import com.example.liaoruochen.myeyes.ui.base.MultipleStatusFragment

class DiscoveryFragment : MultipleStatusFragment() {
    companion object {
        private const val DISCOVERY_ID = "DISCOVERY_ID"

        fun newInstance(discoveryId: Int): DiscoveryFragment {
            return DiscoveryFragment().apply {
                arguments = Bundle().apply {
                    putInt(DISCOVERY_ID, discoveryId)
                }
            }
        }
    }

    override fun retry() {

    }

    override fun getLayoutId(): Int {
        return R.layout.fragment_discovery
    }

    override fun initView() {

    }

    override fun lazyLoad() {

    }
}