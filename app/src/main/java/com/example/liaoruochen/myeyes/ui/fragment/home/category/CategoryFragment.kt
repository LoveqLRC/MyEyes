package com.example.liaoruochen.myeyes.ui.fragment.home.category

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.liaoruochen.myeyes.R
import com.example.liaoruochen.myeyes.ui.base.MultipleStatusFragment
import com.example.liaoruochen.myeyes.ui.fragment.home.category.adapter.MultiTypeAdapter
import kotlinx.android.synthetic.main.fragment_home_detail.*

class CategoryFragment : MultipleStatusFragment() {
    companion object {
        private const val CATEGORY_ID = "CATEGORY_ID"
        fun newInstance(categoryId: String): CategoryFragment {
            val categoryFragment = CategoryFragment()
            val bundle = Bundle()
            bundle.putString(CATEGORY_ID, categoryId)
            categoryFragment.arguments = bundle

            return categoryFragment
        }
    }


    override fun retry() {

    }

    override fun getLayoutId(): Int {
        return R.layout.fragment_home_detail
    }

    override fun initView() {

    }

    override fun lazyLoad() {
        val mDataList = ArrayList<String>()
        for (i in 1..100) {
            mDataList.add("第${i}个")
        }
        recyclerview.layoutManager = LinearLayoutManager(context)
        recyclerview.adapter = MultiTypeAdapter(mDataList, context!!)


    }
}