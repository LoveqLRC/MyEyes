package com.example.liaoruochen.myeyes.ui.fragment.home.category

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.liaoruochen.myeyes.R
import com.example.liaoruochen.myeyes.ui.base.MultipleStatusFragment
import com.example.liaoruochen.myeyes.ui.fragment.home.category.adapter.MultiTypeAdapter
import kotlinx.android.synthetic.main.fragment_home_detail.*

class CategoryFragment : MultipleStatusFragment(), CategoryContract.View {
    override fun showLoading() {

    }

    override fun dimissLoading() {

    }

    override fun showError(msg: String) {

    }

    companion object {
        private const val CATEGORY_ID = "CATEGORY_ID"
        fun newInstance(categoryId: Int): CategoryFragment {
            return CategoryFragment().apply {
                arguments = Bundle().apply {
                    putInt(CATEGORY_ID, categoryId)
                }
            }
        }
    }

    private val mCategoryPresenter by lazy {
        CategotryPresenter()
    }


    override fun retry() {

    }

    override fun getLayoutId(): Int {
        return R.layout.fragment_home_detail
    }

    override fun initView() {
        mCategoryPresenter.attachView(this)
    }

    override fun lazyLoad() {
        val categoryId = arguments?.getInt(CATEGORY_ID)
        mCategoryPresenter.getCategoryContentById(categoryId!!, 0, 10)


        val mDataList = ArrayList<String>()
        for (i in 1..100) {
            mDataList.add("第${i}个")
        }
        recyclerview.layoutManager = LinearLayoutManager(context)
        recyclerview.adapter = MultiTypeAdapter(mDataList, context!!)


    }


    override fun onDestroy() {
        super.onDestroy()
        mCategoryPresenter.detachView()
    }
}