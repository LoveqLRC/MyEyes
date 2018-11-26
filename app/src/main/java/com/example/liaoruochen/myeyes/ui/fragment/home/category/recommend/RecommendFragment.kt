package com.example.liaoruochen.myeyes.ui.fragment.home.category.recommend

import android.os.Bundle
import com.example.liaoruochen.myeyes.R
import com.example.liaoruochen.myeyes.ui.base.MultipleStatusFragment

class RecommendFragment:MultipleStatusFragment() {


    companion object {
        private const val RECOMMEND_ID = "RECOMMEND_ID"
        fun newInstance(recommendId: Int): RecommendFragment {
            return RecommendFragment().apply {
                arguments = Bundle().apply {
                    putInt(RECOMMEND_ID,recommendId)
                }
            }
        }
    }
    override fun retry() {

    }

    override fun getLayoutId(): Int {
        return R.layout.fragment_recommend
    }

    override fun initView() {

    }

    override fun lazyLoad() {

    }
}